# Memento

## What's it?
The Memento Pattern’s intent is to capture and externalize an object’s 
internal state so that the object can be restored to this state later.
Memento pattern has effectively two interfaces. Caretaker sees a narrow interface 
to the Memento - it can only pass the memento to other objects. 
Originator, in contrast, sees a wide interface, one that lets it access 
all the data necessary to restore itself to its previous state. A memento pattern
can be viewed as an object that contains the internal state of another 
object, at a given point of time. When the client wants to restore the originator back 
to its previous state, it simply passes the memento back to the originator. 
The originator uses the state information contained in the memento and 
puts itself back to the state stored in the Memento object.

## How it works?
Let's check the code of our example. First, check the file `Originator.java`.
It is a class whose object state should be saved in a memento.
It takes a reference of a CareTaker. The CareTaker is used to save and 
retrieve the memento objects which represent the state of the Originator object.
@method `createSavepoint` creates a memento object and requests the caretaker to take care of the object.
@variable `lastUndoSavepoint` is used to store the key name of last saved 
memento in order to implement the undo operation. The class provides 
three types of undo operations. @method `undo` without any parameter 
restores the last saved state, with the `savepoint` name as a parameter 
restores the state saved with that particular savepoint name. 
@method `undoAll` asks the care taker to clear all the save-points and 
set it to the initial state. File `Memento.java` includes the class 
is used to store the state of the Originator and stored by the care taker.
The class does not have any setter methods, it is only used to get the 
state of the object. Then, check file `CareTaker.java` is used to store 
and provide the requested memento object. @method `saveMemento` is used 
to save the memento object, @method `getMemento` is used to return the 
request memento object, @method `clearSavepoints` is used to clear all 
the save-points and it deletes all the saved memento objects.
In our example `MementoPatternExample.java` after some more operations, 
we called the undo method to restore the last state of the object which 
is clearly shows in the output. Then we applied some operations and again 
saved the states of the object as “SAVE2, SAVE3, and SAVE4”.
Then, we asked the Originator to restore the SAVE2 state and the call 
the `undoAll` method which set the initial state of the object and deleted all the save-points.


## When to use The Memento?
Use the Memento Pattern in the following cases:
- A snapshot of (some portion of) an object’s state must be saved so that it can be restored to that state later, and
- A direct interface to obtaining the state would expose implementation details and break the object’s encapsulation.
