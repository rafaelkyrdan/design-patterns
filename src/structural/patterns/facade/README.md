# Facade

## What's it?
The Facade Pattern makes a complex interface easier to use. 
It provides a unified interface to a set of interface in a subsystem. 
The Facade do not encapsulate the subsystem classes or interfaces;

## What's difference between the Facade and an Adapter?
The Facade pattern same as an Adapter can wrap multiple classes, 
but a facade is used to simplify the use of the complex interface, 
whereas, an adapter is used to convert the interface to an interface the client expects.

## How to use it?
In the file `Server.java` we have a class which provides a compex interface to the clients.

### To start the server, the client needs to create an object of the Server class
and then need to call the below methods.

```java
Server server = new Server();
server.startBooting();
server.readSystemConfigFile();
server.init();
server.initializeContext();
server.initializeListeners();
server.createSystemObjects();
```

### To stop the server, the client needs to call the following methods.

```java
server.releaseProcesses();
server.destroy();
server.destroySystemObjects();
server.destroyListeners();
server.destroyContext();
server.shutdown();
```
 
For some clients it's urgent to have such complex API but most of the clients are not interested
in doing all these stuff. So these clients can use `ServerFacade.java` which wraps a server object
and provides simple interfaces. Clients communicate with the subsystem by sending requests to Facade,
which forwards them to the appropriate object. Note that, the facade class has provided a simple interface to the complex subsystem,
but it has not encapsulated the subsystem. A client can still access the low-level interfaces of the subsystem. 
So, a facade provides an extra layer, a simple interface to the complex subsystem, 
but it does not completely hide the direct accessibility to the low-level interfaces of the complex subsystem.
Check the example `FacaceExample.java` it shows how to use the Facade pattern.



