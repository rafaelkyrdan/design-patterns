package facade;

/**
 * A `Facade` class.
 * It provides simple interfaces for the client.
 * These methods internally call the methods on the server object.
 */

public class ServerFacade {

    private final Server server;

    public ServerFacade(Server server) {
        this.server = server;
    }

    public void startServer() {
        server.startBooting();
        server.readSystemConfigFile();
        server.init();
        server.initializeContext();
        server.initializeListeners();
        server.createSystemObjects();
    }

    public void stopServer() {
        server.releaseProcesses();
        server.destroy();
        server.destroySystemObjects();
        server.destroyListeners();
        server.destroyContext();
        server.shutdown();
    }
}
