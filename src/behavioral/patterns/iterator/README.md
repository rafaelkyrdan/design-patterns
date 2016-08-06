# Iterator

## What's it?
The intent of the Iterator Design Pattern is to provide a way to access 
the elements of an aggregate object sequentially without exposing its underlying representation.
The Iterator class defines an interface for accessing the list’s elements. 
An iterator object is responsible for keeping track of the current element; 
that is, it knows which elements have been traversed already.
To accomplish this, the Iterator pattern suggests that a Container object 
should be designed to provide a public interface in the form of an Iterator 
object for different client objects to access its contents.

## How it works?
In our example we will traverse the `Shape.java` object. We created the
`ShapeStorage.java` class to store the `Shape` objects. Method `addShape` 
is used to add a Shape object to the array and increment the index by one.
Method `getShapes` returns the array of Shape type. Class `ShapeIterator.java`
is a iterator to the `Shape` class defines all the methods of the Iterator interface.
Now we can run our example: `ExampleIteratorPattern.java`. We have created 
a ShapeStorage object and stores the Shape objects in it. Next, we created 
a ShapeIterator object and assigned it the shapes. We iterated twice, 
first without calling the remove method and then with the remove method.

## Use the Iterator pattern:
1. To access an aggregate object’s contents without exposing its internal representation.
2. To support multiple traversals of aggregate objects.
