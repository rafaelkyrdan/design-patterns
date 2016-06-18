package template;

/**
 * The abstract class provides steps to connect, communicate
 * and later to close the connections. All these steps are required
 * in order to get the work done. The class provides default implementation
 * to some common steps and leaves the specific steps as abstract which force
 * the client to provide an implementation to them.
 *
 * @method `run` is used to run the steps in order. The method is set as final
 * because the steps should be kept safe and should not be change by any user.
 */

public abstract class ConnectionTemplate {

    public final void run() {
        setDBDriver();
        setCredentials();
        connect();
        prepareStatement();
        setData();
        insert();
        close();
        destroy();
    }


    public abstract void setDBDriver();

    public abstract void setCredentials();

    public void connect() {
        System.out.println("Setting connection...");
    }

    public void prepareStatement() {
        System.out.println("Preparing insert statement...");
    }

    public abstract void setData();

    public void insert() {
        System.out.println("Inserting data...");
    }

    public void close() {
        System.out.println("Closing connections...");
    }

    public void destroy() {
        System.out.println("Destroying connection objects...");
    }
}
