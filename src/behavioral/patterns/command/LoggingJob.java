package behavioral.patterns.command;

/**
 * It is a behavioral.patterns.command class which implements the Job interface.
 */

public class LoggingJob implements Job {

    private Logging logging;

    public void setLogging(Logging logging) {
        this.logging = logging;
    }

    @Override
    public void run() {

        System.out.println("Job ID: " + Thread.currentThread().getId() + " executing - logging jobs.");

        if (logging != null) {
            logging.log();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
