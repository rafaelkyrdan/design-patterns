package template;

/**
 * It is example of user's implementation of connection.
 * Class extends `ConnectionTemplate` and implement abstracts methods.
 * The above class is used to connect to an Oracle database and provides data by reading a text file.
 */

public class OracleTxtCon extends ConnectionTemplate {

    @Override
    public void setDBDriver() {
        System.out.println("Setting Oracle DB drivers...");
    }

    @Override
    public void setCredentials() {
        System.out.println("Setting credentials for Oracle DB...");
    }

    @Override
    public void setData() {
        System.out.println("Setting up data from txt file....");
    }
}
