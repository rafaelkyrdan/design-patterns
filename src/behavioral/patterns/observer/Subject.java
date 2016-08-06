package behavioral.patterns.observer;

/**
 * It is interface of observable object.
 * It defines interface for subscribing and unsubscribing listeners.
 */

public interface Subject {

    public void subscribeObserver(Observer observer);

    public void unSubscribeObserver(Observer observer);

    public void notifyObservers();

    public String getSubjectDetails();

}
