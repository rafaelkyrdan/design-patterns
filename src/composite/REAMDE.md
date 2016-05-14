# Composite Pattern

## What's it?
The composite means “putting together” and this is what this design pattern is all about.
This pattern allows you to compose objects into a tree structure to represent the 
hierarchy which means you can create a tree of objects which can be treated as a one big thing. 
The intention of the `Composite Pattern` treat individual objects and compositions of objects uniformly.
There can be lots of practical examples of the Composite Pattern. 
A file directory system, an html representation in java, an XML parser all are well managed 
composites and all can easily be represented using the Composite Pattern.

## How it works?
The Composite Pattern has four participants:
- Component 
- Leaf
- Composite 
- Client
The Component, look in the file `HtmlComponent.java`, defines an interface for all objects in the composition 
both the composite and the leaf nodes. The Composite’s role is to define the behavior of the components having children 
and to store child components. It implements methods like addChild, removeChild, getChildren which must be implemented 
by a class to become the `composite` of the structure. Look in the `HtmlCompositeElement.java` file. 
The Composite also implements the Leaf related operations. These operations may or may not take any sense; 
it depends on the business functionality. The composite can have many children, but only one parent per child. A Leaf defines the behavior 
for the elements in the composition, look in the `HtmlElement.java` file, its main job is to implement the operation method, 
which in this example is the `generateHtml` method. Leaf also inherits methods, which don’t necessarily make a lot of sense for a leaf node.
Now let's check our example in the file `ExampleCompositePattern.java` which shows how we can treat 
a single object and composition of objects uniformly, because we use the composite pattern.
The Client manipulates objects in the composition through the Component interface.

## When to use The Composite?
- When you want to represent hierarchies of objects.
- When you want clients to be able to ignore the difference between compositions of objects and individual objects.

