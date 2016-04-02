# Adapter

## What's it?

The Adapter pattern lets you to adapt what an object or a class exposes to what another object or class expects.
It lets classes work together that couldn’t otherwise because of incompatible interfaces.
The Adapter converts the interface of a class into another interface the client expects. 
An adapter uses composition to store the object it is supposed to adapt.

## How it works?
There are two types of adapters, the object adapter, and the class adapter.
The class adapter relies on multiple inheritance to adapt one interface to another.
Java doesn't allow multiple inheritance so we will see only the object adapter in this example.
The key terms are: Client, Adapter, Adaptee, Target. Suppose we have a legacy code which includes functionality
which we need but it implements another interface. In this case, we can use adapter. The class Adapter implements new
interface - Target, and store the object which implements old interface - Adaptee, here we use composition.
It allows the object Client uses object Adaptee via Adapter as if it is an instance of Target(new interface).
In our example we have `NewInterface.java` includes new interface. `LegacyInterface.java` includes
interface which legacy code implements. As you can see, the sole purpose of these interfaces 
is very much similar, i.e. to provide the similar functionality. The new interface has a set of different methods 
which need to be implemented in the code. But legacy code is created by most part of the code, 
it’s really hard and risky to change the entire set of classes.
File `LegacyImpl.java` - is a legacy implementation which includes functionality which we want to re-use.
The adapter is in the file `LegacyToNewImplAdapter.java` it implements NewInterface, and store the adaptee - legacy implementation.
So now check the working example `AdapterExample.java`. In this example we successfully re-use legacy code and then proceed with
new functionality.


## When to use The Adapter Pattern
1. There is an existing class, and its interface does not match the one you need.
2. You want to create a reusable class that cooperates with classes that don't have compatible interfaces.

