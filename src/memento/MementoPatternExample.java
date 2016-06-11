package memento;

/**
 * In this example after some more operations, we called the undo method to restore
 * the last state of the object which is clearly shows in the output.
 * Then we applied some operations and again saved the states of the object as “SAVE2, SAVE3, and SAVE4”.
 * Then, we asked the Originator to restore the SAVE2 state and the call the `undoAll`
 * method which set the initial state of the object and deleted all the save-points.
 */

public class MementoPatternExample {

    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator(5, 10, careTaker);
        System.out.println("Default State: " + originator);
        originator.setX(originator.getY() * 51);
        System.out.println("State: " + originator);
        originator.createSavepoint("SAVE1");
        System.out.println();

        originator.setY(originator.getX() / 22);
        System.out.println("State: " + originator);
        originator.undo();
        System.out.println("State after undo: " + originator);
        originator.setX(Math.pow(originator.getX(), 3));
        originator.createSavepoint("SAVE2");
        System.out.println();

        System.out.println("State: " + originator);
        originator.setY(originator.getX() - 30);
        originator.createSavepoint("SAVE3");
        System.out.println();

        System.out.println("State: " + originator);
        originator.setY(originator.getX() / 22);
        originator.createSavepoint("SAVE4");
        System.out.println();

        System.out.println("State: " + originator);
        originator.undo("SAVE2");
        System.out.println("Retrieving at: " + originator);
        originator.undoAll();
        System.out.println("State after undo all: " + originator);
    }
}
