package memento;

/**
 * Originator class whose object state should be saved in a memento.
 * It takes a reference of a CareTaker. The CareTaker is used to save
 * and retrieve the memento objects which represent the state of the Originator object.
 *
 * @method `createSavepoint` creates a memento object and requests the caretaker to take care of the object.
 * @variable `lastUndoSavepoint` is used to store the key name of
 * last saved memento in order to implement the undo operation.
 * The class provides three types of undo operations.
 * @method `undo` without any parameter restores the last saved state,
 * with the `savepoint` name as a parameter restores the state saved with that particular savepoint name.
 * @method `undoAll` asks the care taker to clear all the save-points and set it to the initial state
 */


public class Originator {

    private double x;
    private double y;
    private String lastUndoSavepoint;
    CareTaker careTaker;

    public Originator(double x, double y, CareTaker careTaker) {
        this.x = x;
        this.y = y;
        this.careTaker = careTaker;
        createSavepoint("INITIAL");
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void createSavepoint(String savepointName) {
        careTaker.saveMemento(new Memento(this.x, this.y), savepointName);
        lastUndoSavepoint = savepointName;
    }

    public void undo() {
        setOriginatorState(lastUndoSavepoint);
    }

    public void undo(String savepointName) {
        setOriginatorState(savepointName);
    }

    public void undoAll() {
        setOriginatorState("INITIAL");
        careTaker.clearSavepoints();
    }

    private void setOriginatorState(String savepointName) {
        Memento mem = careTaker.getMemento(savepointName);
        this.x = mem.getX();
        this.y = mem.getY();
    }

    @Override
    public String toString() {
        return "X: " + x + ", Y: " + y;
    }
}
