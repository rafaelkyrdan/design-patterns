# Strategy

## What's it?
The Strategy Design Pattern defines a family of algorithms, encapsulating each one, 
and making them interchangeable. The Strategy pattern is useful when there is 
a set of related algorithms and a client object needs to be able to dynamically 
pick and choose an algorithm from this set that suits its current need. 
Each such algorithm encapsulated in a separate class is referred to as a strategy. 
An object that uses a Strategy object is often referred to as a context object.
With different Strategy objects in place, changing the behavior of a 
Context object is simply a matter of changing its Strategy object to the 
one that implements the required algorithm. Once the group of related algorithms 
is encapsulated in a set of Strategy classes in a class hierarchy, a 
client can choose from among these algorithms by selecting and instantiating an appropriate Strategy class.
The main advantage of the Strategy Design Pattern is that we can enhance 
the code without much trouble. We can add new strategies without disturbing 
the current code. This would make our code maintainable and flexible. 
This design pattern also promotes the "code to interface" design principle.

## How it works?
Let's check our example. File `TextFormatter.java` includes `strategy` interface
which is implemented by all concrete strategies. There are 2 concrete strategies
in our example: `CapTextFormatter.java` and `LowerTextFormatter.java`.
`TextEditor.java` class which holds a reference to the TextFormatter interface.
The class contains the publishText method which forwards the text to the formatter 
in order to publish the text in desired format. Now `run` our example
`ExampleStrategyPattern.java` - the output clearly shows the different 
text format produced by the different text editors due to the different 
text formatter used by it.


## When to use The Strategy Pattern?
1. Many related classes differ only in their behavior.
2. You need different variants of an algorithm. Strategies can be used when these variants are implemented as a class hierarchy of algorithms.
3. A class defines many behaviors, and these appear as multiple conditional statements in its operations. Instead of many conditionals, move related conditional branches into their own Strategy class.
