package behavioral.patterns.memento;

/**
 * The Memento class is used to store the behavioral.patterns.state of the Originator and stored by the care taker.
 * The class does not have any setter methods, it is only used to get the behavioral.patterns.state of the object.
 */

public class Memento {

    private double x;
    private double y;

    public Memento(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
