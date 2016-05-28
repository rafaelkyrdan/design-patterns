# Flyweight

## What's it?
The intent of the Flyweight Pattern is to use shared objects to support 
large numbers of fine-grained objects efficiently.
A flyweight is a shared object that can be used in multiple contexts simultaneously.
The flyweight acts as an independent object in each context. 
The shared object operates with 2 different types of state: internal and external. 
Internal state is stored in the flyweight; it consists of information 
that’s independent of the flyweight’s context, thereby making it sharable.
The external state depends on and varies with the flyweight’s context 
and therefore can’t be shared.
Client objects are responsible for passing external state to the flyweight when it needs it.

## How it works?
In our example we use following classes. Check the `Code.java` - is used to set
the code done by the programmer in order to get it executed. A `Platform.java` - is an interface 
is implemented by the language specific platform in order to execute the code. 
It has one method, executes, which takes the `Code` object as its parameter.
A `PlatformFactory.java` - factory class which controls the creation of the Platform objects.
A method `getPlatformInstance` - a static method which has a `platformType` as its parameter.
This platformType is used as the key in the map, it first checks the map whether
a platform object having the key is already exists or not.
If no object found, the appropriate platform object gets created, it is put into the map
and then the method returns the object. There are a few implementations of `platform` 
interface: `CPlatform.java`, `CPPPlatform.java`, `JavaPlatform.java`, `RubyPlatform.java`. 
Now, run the `FlyweightExample.java` the output clearly shows that the platform objects created only the first time
they are requested for; on the next attempts the same object gets returned.
As a result we reduced the amount of instances of heavy-weight objects.


## When to use The Flyweight?
Effectiveness of this pattern depends heavily on how and where it’s used.
So use it when:
1. Group of objects may be replaced by relatively few shared objects once external state is removed.
2. The application doesn't depend on object identity.
3. Storage costs are high because of the sheer quantity of objects.
