package behavioral.patterns.mediator;

/**
 * The ServiceUnit interface has one method to set the behavioral.patterns.mediator for the concrete colleague’s class.
 */


public interface ServiceUnit {
    public void setWashingMachineMediator(WashingMachineMediator washingMachineMediator);
}
