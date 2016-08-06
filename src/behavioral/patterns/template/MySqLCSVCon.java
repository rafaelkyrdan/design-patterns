package behavioral.patterns.template;

/**
 * It is example of user's implementation of connection.
 * Class extends `ConnectionTemplate` and implement abstracts methods.
 * The above class is used to connect to a MySQL database and provides data by reading a CSV file.
 */

public class MySqLCSVCon extends ConnectionTemplate {

    @Override
    public void setDBDriver() {
        System.out.println("Setting MySQL DB drivers...");
    }

    @Override
    public void setCredentials() {
        System.out.println("Setting credentials for MySQL DB...");
    }

    @Override
    public void setData() {
        System.out.println("Setting up data from csv file....");
    }
}
