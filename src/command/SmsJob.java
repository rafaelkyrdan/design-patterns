package command;

/**
 * It is a command class which implements the Job interface.
 */


public class SmsJob implements Job {

    private Sms sms;

    public void setSms(Sms sms) {
        this.sms = sms;
    }

    @Override
    public void run() {
        System.out.println("Job ID: " + Thread.currentThread().getId() + " executing - sms jobs.");
        if (sms != null) {
            sms.sendSms();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }
}
