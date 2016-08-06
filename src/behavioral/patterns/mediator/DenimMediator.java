package behavioral.patterns.mediator;

/**
 * Another behavioral.patterns.mediator that is used as a washing program for denims.
 * Now we just need to create a new behavioral.patterns.mediator and set the rules in it to wash denims:
 * rules like temperature, and the speed at which drum will spin,
 * whether softener is required or not, the level of the soil removal, etc.
 */


public class DenimMediator implements WashingMachineMediator {

    private final Machine machine;
    private final Heater heater;
    private final Motor motor;
    private final Sensor sensor;
    private final SoilRemoval soilRemoval;
    private final Valve valve;

    public DenimMediator(Machine machine,
                         Heater heater,
                         Motor motor,
                         Sensor sensor,
                         SoilRemoval soilRemoval,
                         Valve valve) {

        this.machine = machine;
        this.heater = heater;
        this.motor = motor;
        this.sensor = sensor;
        this.soilRemoval = soilRemoval;
        this.valve = valve;
        System.out.println("Setting up for DENIM program");
    }

    @Override
    public void start() {
        machine.start();
    }

    @Override
    public void wash() {
        motor.startMotor();
        motor.rotateDrum(1400);
        System.out.println("Adding detergent");
        soilRemoval.medium();
        System.out.println("Adding softener");
    }

    @Override
    public void open() {
        valve.open();
    }

    @Override
    public void closed() {
        valve.closed();
    }

    @Override
    public void on() {
        heater.on(30);
    }

    @Override
    public void off() {
        heater.off();
    }

    @Override
    public boolean checkTemperature(int temp) {
        return sensor.checkTemperature(temp);
    }

}


