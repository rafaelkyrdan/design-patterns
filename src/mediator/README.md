# Mediator

## What's it?
The Mediator Pattern defines an object that encapsulates how a set of objects interact.
Mediator promotes loose coupling by keeping objects from referring to each other explicitly,
and it lets you vary their interaction independently.
Rather than interacting directly with each other, objects ask the Mediator to interact
on their behalf.

## How it works?
Let's start from `ExampleMediator.java`, in the example,
we created different mediators (or we can say different wash programs),
then we set the wash programs to the ServiceUnit's and vice-versa.
We can have different mediators for different washing programs
without changing the existing ServiceUnit classes and thus providing loose coupling and re-usability.
There are 2 mediators in the example `CottonMediator.java` and `DenimMediator.java` each set
parameters such as temperature drum spinning speed, level of soil removal etc..
The washingMachineMediator class just calls the method of a ServiceUnit object on behalf of another colleague object in order to achieve result.
No one ServiceUnit(`Button.java`, `Heater.java`, `Valve.java`) calls methods of each other, they invoke methods of the mediators.


## When to use The Mediator?
1. A set of objects communicate in well-defined but complex ways. The resulting dependencies are unstructured and difficult to understand.
2. Reusing an object is difficult because it refers to and communicates with many other objects.