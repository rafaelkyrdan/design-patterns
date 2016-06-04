# Prototype

## What's it?
The Prototype design pattern is used to specify the kinds of objects 
to create using a prototypical instance, and create new objects by copying this prototype.
The concept is to copy an existing object rather than creating a new 
instance from scratch, something that may include costly operations.
The existing object acts as a prototype and contains the state of the object.
The newly copied object may change same properties only if required. 
This approach saves costly resources and time, especially when the object creation is a heavy process.

## How to use it?
The basement for current implementation of this pattern is the
Cloneable interface. Java provides the `clone` method, which an object 
inherits from the Object class. You need to implement the Cloneable 
interface and override this `clone` method according to your needs.
So let's start form `Prototype.java`- interface extends the Cloneable 
interface and contains a method clone. This interface is implemented by 
classes which want to create a prototype object. Next look in the `AccessControl.java`
file - it is concrete implementation of our `Prototype` interface. There 
are 2 properties: `controlLevel` is used to specific the level of control
this object contains. For example, USER, ADMIN, MANAGER etc; 
`access` contains the access right for the user. `User.java` class has a 
level and a reference to the AccessControl assigned to it.
`AccessControlProvider.java` class that creates and stores the possible 
AccessControl objects in advance. When the there’s a request to an AccessControl object,
it returns a new object created by copying the stored prototypes.
Example `PrototypePatternExample.java` shows that getAccessControlObject is used to get
the new copy of the AccessControl object, and this can be clearly
seen when we change the access right for User B, the access right for User A
is not changed. This confirms that the clone method is working fine,
as it returns the new copy of the object not a reference which points to the same object.

## When to use the Prototype
Use the Prototype pattern when a system should be independent 
of how its products are created, composed, represented and:

1. When the classes to instantiate are specified at run-time, for example, by dynamic loading or;
2. To avoid building a class hierarchy of factories that parallels the class hierarchy of products; or
3. When instances of a class can have one of only a few different combinations of state. It may be more convenient to install a corresponding number of prototypes and clone them rather than instantiating the class manually, each time with the appropriate state.

