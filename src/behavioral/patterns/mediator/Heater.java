package behavioral.patterns.mediator;

/**
 * Heater is implementation of ServiceUnit interface
 */


public class Heater implements ServiceUnit {

    private WashingMachineMediator washingMachineMediator;

    public void setWashingMachineMediator(WashingMachineMediator washingMachineMediator) {
        this.washingMachineMediator = washingMachineMediator;
    }

    /**
     * Method is called by behavioral.patterns.mediator, when valve is closed.
     * Note, that it is not calling the `off` method directly.
     *
     * @param temp
     */

    public void on(int temp) {
        System.out.println("Heater is on...");
        if (washingMachineMediator.checkTemperature(temp)) {
            System.out.println("Temperature is set to " + temp);
            washingMachineMediator.off();
        }
    }

    public void off() {
        System.out.println("Heater is off...");
        washingMachineMediator.wash();
    }

}
