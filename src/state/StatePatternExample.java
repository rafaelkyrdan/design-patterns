package state;

/**
 * Example shows that we have seen that by encapsulating the states of an object into different
 * classes makes the code manageable and flexible.
 * Any change in a state will only affect that particular class and we can include a new state
 * without changing much in the existing code.
 */

public class StatePatternExample {

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.walk();
        robot.cook();
        robot.walk();
        robot.off();

        robot.walk();
        robot.off();
        robot.cook();
    }
}
