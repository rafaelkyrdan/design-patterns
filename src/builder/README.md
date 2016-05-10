# Builder

## What's it?
The intent of the Builder Pattern is to separate the construction of a complex object 
from its representation. The Builder pattern suggests moving the construction logic out of 
the object class to a separate class referred to as a builder class. There can be more than one such builder classes, 
each with different implementations for the series of steps to construct the object.
The design turns out to be more modular with each implementation contained in a different builder object.
This pattern suggests using a dedicated `Director`, which is responsible for invoking different builder methods 
required for the construction of the final object. Adding a new implementation (i.e., adding a new builder) becomes easier.


## How it works?
Imagine we have a detail and detail has a lot of properties which describe it. Look in the `Product.java` file.
The ProductBuilder is the builder interface contains set of common methods used to build the detail object and its components.
Look in the `ProductBuilder.java` file. The getProduct method is used to return the final detail object to the client after its construction.
Let’s see two implementations of the ProductBuilder interface, one for each type of detail, i.e., for A and B.
Check files `ProductATypeBuilder.java` and `ProductBTypeBuilder.java`. 
Two builders create and construct the detail, according to the specification.
Finally, `Director.java` includes logic for invoking different builder 
methods required for the construction of the final object.
Check the example `ExampleProductBuilder.java`.
P.S. As for me I'd prefer another implementation of this pattern. Read below.

## Another form of The Builder Pattern.
It is another form of the Builder pattern. Look in the `Form.java` file. 
Instead of making the desired object directly, the client calls a constructor with all of the 
mandatory parameters and gets a builder object. Then the client calls setter-like methods on the builder object
to set each optional parameters. Finally, the client calls a `build` method to generate the object.
Check the provided example, look in the `FormExample.java` file. To create the object, 
we invoke the FormBuilder constructor which takes the mandatory fields and then we need to call the set of optional methods on it 
and finally the build method to get the form object.

## When to use The Builder Pattern?
1. You have an complex algorithm for creating an object.
2. You need a flexible process of construction which allow different representations for the object.