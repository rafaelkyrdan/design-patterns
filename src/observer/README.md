# Observer

## What's it?
The Observer Pattern is a kind of behavior pattern which is concerned with the assignment of responsibilities between objects.
This pattern defines a one-to-many dependency between objects so that when one object changes state,
all its dependents are notified and updated automatically. The key objects in this pattern are subject and observer.
A subject may have any number of dependent observers.
All observers are notified whenever the subject undergoes a change in its state.

## Java’s built-in Observer Pattern
Java has built-in support for the Observer Pattern.
The most general is the Observer interface and the Observable class in the java.util package.

## How to use it?
In this example we build the Observer pattern without using built-in support but it can be easily changed
with minimal effort. So lets start with `Subject.java` interface - it defines interface for subscribing and unsubscribing listeners.
The `Observer.java` interface defines interface of listener. Method `update` is called by the subject(`observable object`)
in order to notify it when there is a change in the state of the subject. Check the file `CommentaryObject.java` it
includes the concrete implementation of observable object(`subject`). `SMSUser.java` it is concrete
listener which implements the Observer interface. Finally, check our example `ExampleObserverPattern.java` -
during the demo, in runtime, we removed one and added more listeners to existing subject(`observable object`).

## When to use the Observer
1. When a change to one object requires changing others, and you don’t know how many objects need to be changed.
2. When an object should be able to notify other objects without making assumptions about who these objects are.


