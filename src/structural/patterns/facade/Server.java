package structural.patterns.facade;

/**
 * <p>
 * To start the server, the client needs to create an object of the Server class
 * and then need to call the below methods.
 * </p>
 *
 * <code>
 * Server server = new Server();
 * server.startBooting();
 * server.readSystemConfigFile();
 * server.init();
 * server.initializeContext();
 * server.initializeListeners();
 * server.createSystemObjects();
 * </code>
 *
 * <p>
 * To stop the server, the client needs to call the following methods.
 * </p>
 *
 * <code>
 * server.releaseProcesses();
 * server.destroy();
 * server.destroySystemObjects();
 * server.destroyListeners();
 * server.destroyContext();
 * server.shutdown();
 * </code>
 */

public class Server {

    //start server
    public void startBooting() {

    }

    public void readSystemConfigFile() {

    }

    public void init() {

    }

    public void initializeContext() {

    }

    public void initializeListeners() {

    }

    public void createSystemObjects() {

    }

    //stop server
    public void releaseProcesses() {

    }

    public void destroy() {

    }

    public void destroySystemObjects() {

    }

    public void destroyListeners() {

    }

    public void destroyContext() {

    }

    public void shutdown() {

    }
}
