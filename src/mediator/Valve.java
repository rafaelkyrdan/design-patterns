package mediator;

/**
 * The Valve is implementation of ServiceUnit interface.
 */


public class Valve implements ServiceUnit {

    private WashingMachineMediator washingMachineMediator;

    public void setWashingMachineMediator(WashingMachineMediator washingMachineMediator) {
        this.washingMachineMediator = washingMachineMediator;
    }

    /**
     * Method is called by mediator to open the valve
     * and when water is filled it called the `closed` method.
     * Note, that it is not calling the `closed` method directly.
     * It calls teh closed method of the mediator which invokes the method of this class.
     */

    public void open() {
        System.out.println("Valve is opened...");
        System.out.println("Filling water...");
        washingMachineMediator.closed();
    }

    public void closed() {
        System.out.println("Valve is closed...");
        washingMachineMediator.on();
    }

}
