package mediator;

/**
 * The Machine it is another implementation of the ServiceUnit interface.
 */


public class Machine implements ServiceUnit {

    private WashingMachineMediator washingMachineMediator;

    public void setWashingMachineMediator(WashingMachineMediator washingMachineMediator) {
        this.washingMachineMediator = washingMachineMediator;
    }

    /**
     * Method start is called by the mediator,
     * mediator's open method in turn calls the open method
     * of the Valve class in order to open the valve of the machine
     */

    public void start() {
        washingMachineMediator.open();
    }

    public void wash() {
        washingMachineMediator.wash();
    }
}
