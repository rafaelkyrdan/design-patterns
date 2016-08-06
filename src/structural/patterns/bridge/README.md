# Bridge

## What's it?
The Bridge Pattern decouples the abstraction and the implementation. As a result, an implementation is not bound permanently
to an interface. The implementation of an abstraction can be configured at run-time.
If you think that sounds like a composition then you are right.
It puts the abstraction and implementation into two different class hierarchies so that both can be extend independently.
The components of the Bridge Pattern comprise of an abstraction, refined abstraction, an implementer, and concrete implementation.
The link between the abstraction and the implementer is called a Bridge.


## How it works?
So we have 2 different hierarchies. First one is `Detail.java` hierarchy.
It has few implementations `FirstDetail.java` and `SecondDetail.java`.
Both have a specific implementation of `produce` method. Second hierarchy is `Product.java`.
It is abstraction which holds a reference of a `Detail`. There are 2 concrete implementations:
`ProductForBrandA.java` and `ProductForBrandB.java`.
Both have a specific implementation of methods assemble and produceProduct. So where is the Bridge?
The reference on a `Detail` from `Product` is the Bridge Pattern.


## When to use The Bridge Pattern
1. You want to avoid a permanent binding between an abstraction and its implementation.
2. Both the abstractions and their implementations should be extensible by sub-classing.
In this case, the Bridge pattern lets you combine the different abstractions and implementations and extend them independently.


