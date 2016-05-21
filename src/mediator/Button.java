package mediator;

/**
 * The above Button class is a ServiceUnit class which holds a reference to a washingMachineMediator.
 *
 */


public class Button implements ServiceUnit {

    private WashingMachineMediator washingMachineMediator;

    public void setWashingMachineMediator(WashingMachineMediator washingMachineMediator) {
        this.washingMachineMediator = washingMachineMediator;
    }

    /**
     * The user press the button which calls the press() which in turn,
     * calls the start() method of the concrete implementation of the mediator.
     * This start() method of the mediator calls the start() method of
     * machine class on behalf of the Button class.
     */

    public void press() {
        System.out.println("Button pressed.");
        washingMachineMediator.start();
    }
}
