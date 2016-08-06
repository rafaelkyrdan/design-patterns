package behavioral.patterns.observer;

/**
 * This example shows  how the Observer pattern works.
 * During the demo, in runtime, we removed one and added more listeners to existing subject(`observable object`).
 * Then, another user subscribed and starts getting the commentary.
 * All this happens dynamically without changing the existing code.
 * Also, I would like to underling that we can create different type of listeners
 * without making any changes in the observable object.
 */

public class ExampleObserverPattern {

    public static void main(String[] args) {

        Subject subject = new CommentaryObject("Soccer - Match [2014AUG24]");
        Observer observer = new SMSUser(subject, "Adam Warner [New York]");
        subject.subscribeObserver(observer);
        System.out.println();

        Observer observer2 = new SMSUser(subject, "Tim Ronney [London]");
        subject.subscribeObserver(observer2);

        Commentary cObject = ((Commentary) subject);
        cObject.setDescription("Welcome to live Soccer match");
        cObject.setDescription("Current score 0-0");
        System.out.println();

        observer2.unSubscribe();

        cObject.setDescription("It’s a goal!!");
        cObject.setDescription("Current score 1-0");
        System.out.println();

        Observer observer3 = new SMSUser(subject, "Marrie [Paris]");
        subject.subscribeObserver(observer3);

        cObject.setDescription("It’s another goal!!");
        cObject.setDescription("Half-time score 2-0");

    }
}
