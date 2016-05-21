package mediator;

/**
 * The WashingMachineMediator is an interface which acts as a generic mediator.
 * The interface contains operations call by one object to another.
 */


public interface WashingMachineMediator {
    public void start();

    public void wash();

    public void open();

    public void closed();

    public void on();

    public void off();

    public boolean checkTemperature(int temp);
}
