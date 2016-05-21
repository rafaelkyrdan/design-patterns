package mediator;

/**
 * Class which don't have any role in the mediator example
 */


public class Sensor {

    public boolean checkTemperature(int temp) {
        System.out.println("Temperature reached " + temp + " *C");
        return true;
    }
}
