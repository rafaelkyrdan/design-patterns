# State

## What's it?
The State Design Pattern allows an object to alter its behavior when its internal state changes.
The State pattern is useful in designing an efficient structure for a class, a typical instance 
of which can exist in many different states and exhibit different behavior depending on the state it is in. 
In other words, in the case of an object, some or all of its behavior is completely influenced by its current state. 
The State pattern suggests moving the state-specific behavior out of the Context class into a set of separate classes 
referred to as State classes. The context acts as a client to the set of State objects in the sense that it makes 
use of different State objects to offer the necessary state-specific behavior to an application object that uses 
the context in a seamless manner.

## How it works?
Let's check our example. File `RoboticState.java` includes interface which contains the behavior of a robot.
The `Robot.java` it is a concrete class implements the RoboticState interface. The class contains the set of 
all possible states a robot can be in. The class initializes all the states and sets the current state as on.
There are 3 concrete states of the Robot: `RoboticOn.java`, `RoboticCook.java`, `RoboticOff.java`.
Now run the `StatePatternExample.java`. Example shows that we have seen that by encapsulating the states of an 
object into different classes makes the code manageable and flexible. Any change in a state will only affect that 
particular class and we can include a new state without changing much in the existing code.

## When to use The State?
1. An object’s behavior depends on its state, and it must change its behavior at run-time depending on that state.
2. Operations have large, multipart conditional statements that depend on the object’s state. 
