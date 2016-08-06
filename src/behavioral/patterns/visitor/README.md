# Visitor

## What's it?
The intent of the Visitor Design Pattern is to represent an operation to
be performed on the elements of an object structure. Visitor lets you 
define a new operation without changing the classes of the elements on 
which it operates. The Visitor pattern is useful when designing an operation 
across a heterogeneous collection of objects of a class hierarchy. 
The Visitor pattern allows the operation to be defined without changing 
the class of any of the objects in the collection. To accomplish this, 
the Visitor pattern suggests defining the operation in a separate class 
referred to as a visitor class. This separates the operation from the object 
collection that it operates on. For every new operation to be defined, 
a new visitor class is created. Since the operation is to be performed 
across a set of objects, the visitor needs a way of accessing the public 
members of these objects.

## How to use it?
Let's explore our example. Threre are 2 main interfaces: 
`Element.java` will be implemented by all the classes that need to allow 
visitors to visit them. And `Visitor.java` - interface contains visit methods 
with an argument of a class that implements the Element interface. 
The abstract `HtmlTag.java` class implements the Element interface and its 
main job is to implement the operation method, which in this example is 
the generateHtml method. There are 2 concrete classes `HtmlParentElement.java`
and `HtmlElement.java` override the accept method of the Element interface 
and will call the visit method, and will pass this operator as an argument.
This will allow the visitor method to get all the public members of the object, 
to add new operations on it. There are 2 concrete visitor classes: `CssClassVisitor.java`
and `StyleVisitor.java`. Now run our example: `ExampleVisitorPattern.java`. 
Check the output and note the main advantage of the Visitor Pattern is that
we can add new operations to the objects without changing its classes.

## When to use the Visitor Pattern
1. An object structure contains many classes of objects with differing interfaces, and you want to perform operations on these objects that depend on their concrete classes.
2. Many distinct and unrelated operations need to be performed on objects in an object structure, and you want to avoid "polluting" their classes with these operations.




