# Abstract Factory Design Pattern

## What's it?
The Abstract Factory is a design pattern which provides an interface for 
creating families of related or dependent objects without specifying their 
concrete classes. Each concrete factory implements the interface of the abstract factory.
The Abstract Factory pattern is useful when a client object wants to create 
an instance of one of related classes without having to know which specific concrete class is to be instantiated. 
The abstract factory is useful for plugging in a different group of objects to alter the behavior of the system. 

## How to use it?
1. Step:
Create an interface that will be implemented by all the concrete factories.
See in the `AbstractParserFactory.java` file.
2. Step:
Create concrete parser factories, which AbstractParserFactory interface
and override the getParserInstance method.
3. Create `Parser` interface which will be implemented by the concrete parser classes to parse
See in the `Parser.java` file.
4. Design concrete parsers that are specific to the client.
5. Implement a factory-producer which has a static method and is responsible to provide a desired factory object to the client object.
See in the `ParserFactoryProducer.java` file.
6. Check the example how to use Abstract Factory Pattern. See in the `ExampleAbstractFactoryPattern.java` 


## When to use the Abstract Factory Design Pattern
Use the Abstract Factory pattern when
- A system should be independent of how its products are created, composed, and represented.
- A system should be configured with one of multiple families of products.
- A family of related detail objects is designed to be used together, and you need to enforce this constraint.
- You want to provide a class library of products, and you want to reveal just their interfaces, not their implementations.
