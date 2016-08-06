package behavioral.patterns.state;

/**
 * RoboticState interface which contains the behavior of a robot.
 */


public interface RoboticState {
    public void walk();

    public void cook();

    public void off();
}
