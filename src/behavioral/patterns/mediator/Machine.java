package behavioral.patterns.mediator;

/**
 * The Machine it is another implementation of the ServiceUnit interface.
 */


public class Machine implements ServiceUnit {

    private WashingMachineMediator washingMachineMediator;

    public void setWashingMachineMediator(WashingMachineMediator washingMachineMediator) {
        this.washingMachineMediator = washingMachineMediator;
    }

    /**
     * Method start is called by the behavioral.patterns.mediator,
     * behavioral.patterns.mediator's open method in turn calls the open method
     * of the Valve class in order to open the valve of the machine
     */

    public void start() {
        washingMachineMediator.open();
    }

    public void wash() {
        washingMachineMediator.wash();
    }
}
