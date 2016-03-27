# Factory method

## What's it?
The main idea behind of this pattern is encapsulation. The Factory Method Pattern gives 
us a way to encapsulate the instantiations of concrete types, it encapsulates 
the logic of select and instantiate a specific class.
The Factory Method selects an appropriate class from based on the application context, conditions and other influencing factors.

## How to use it?
1. File parser.java consists of abstract class Parser and it's subclasses which represent different types of product.
2. DisplayService shows the parsed methods but subclasses instantiate a specific parsers.
3. Example shows that we can create different instances of parsers at runtime.

## When to use the Factory Method Pattern
When you use several helper subclasses and you want to localize the knowledge of it.
