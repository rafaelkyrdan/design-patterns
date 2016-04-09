package facade;

/**
 * This example shows how Facade works
 * There is no need to call all the lifecycle and destroy methods,
 * just the simple methods and the rest of the process will be performed by the facade class.
 * <p>
 * Notice that, the facade class has provided a simple interface to the complex subsystem,
 * but it has not encapsulated the subsystem.
 * A client can still access the low-level interfaces of the subsystem.
 */

public class FacadeExample {

    public static void main(String[] args) {
        Server server = new Server();
        ServerFacade facadeServer = new ServerFacade(server);

        facadeServer.startServer();

        System.out.println("Start working......");
        System.out.println("After work done.........");

        facadeServer.stopServer();
    }
}
