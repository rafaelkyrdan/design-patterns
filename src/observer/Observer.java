package observer;

/**
 * It is interface of listener object.
 * Method `update` is called by the subject(`observable object`)
 * in order to notify it when there is a change in the state of the subject.
 */

public interface Observer {

    public void update(String description);

    public void subscribe();

    public void unSubscribe();
}
