package behavioral.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * It is implementation of observable object(`subject`).
 */

public class CommentaryObject implements Subject, Commentary {

    private final List<Observer> observers = new ArrayList<>();
    private String description;
    private String subjectDetails;


    public CommentaryObject(String description, String subjectDetails) {
        this.description = description;
        this.subjectDetails = subjectDetails;
    }

    public CommentaryObject(String subjectDetails) {
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void setDescription(String desc) {
        this.description = desc;
        notifyObservers();
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        System.out.println();
        for (Observer observer : observers) {
            observer.update(description);
        }
    }

    @Override
    public String getSubjectDetails() {
        return subjectDetails;
    }

}
