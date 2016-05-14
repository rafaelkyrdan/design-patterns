package observer;

/**
 * It is concrete listener which implements the Observer interface.
 */

public class SMSUser implements Observer {


    private final Subject subject;
    private String description;
    private String userInfo;

    public SMSUser(Subject subject, String userInfo) {
        this.userInfo = userInfo;
        this.subject = subject;
    }

    @Override
    public void update(String desc) {
        this.description = desc;
        display();
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribing " + userInfo + " to " + subject.getSubjectDetails() + " ...");
        this.subject.subscribeObserver(this);
        System.out.println("Subscribed successfully.");
    }

    @Override
    public void unSubscribe() {
        System.out.println("Unsubscribing " + userInfo + " to " + subject.getSubjectDetails() + " ...");
        this.subject.unSubscribeObserver(this);
        System.out.println("Unsubscribed successfully.");

    }

    private void display() {
        System.out.println("[" + userInfo + "]: " + description);
    }

}

