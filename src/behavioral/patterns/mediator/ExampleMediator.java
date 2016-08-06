package behavioral.patterns.mediator;

/**
 * In the example, we created different mediators (or we can say different wash programs),
 * then we set the wash programs to the ServiceUnit's and vice-versa.
 * Please note that just to work with a different wash program, a different behavioral.patterns.mediator
 * is set and the rest remains the same.
 * You can clearly see the differences from the output.
 *
 */


public class ExampleMediator {
    public static void main(String[] args) {
        WashingMachineMediator washingMachineMediator = null;
        Sensor sensor = new Sensor();
        SoilRemoval soilRemoval = new SoilRemoval();
        Motor motor = new Motor();
        Machine machine = new Machine();
        Heater heater = new Heater();
        Valve valve = new Valve();
        Button button = new Button();

        washingMachineMediator = new CottonMediator(machine, heater, motor, sensor, soilRemoval, valve);
        button.setWashingMachineMediator(washingMachineMediator);
        machine.setWashingMachineMediator(washingMachineMediator);
        heater.setWashingMachineMediator(washingMachineMediator);
        valve.setWashingMachineMediator(washingMachineMediator);
        button.press();
        System.out.println();

        washingMachineMediator = new DenimMediator(machine, heater, motor, sensor, soilRemoval, valve);
        button.setWashingMachineMediator(washingMachineMediator);
        machine.setWashingMachineMediator(washingMachineMediator);
        heater.setWashingMachineMediator(washingMachineMediator);
        valve.setWashingMachineMediator(washingMachineMediator);
        button.press();

    }
}
