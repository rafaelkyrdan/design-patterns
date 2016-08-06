# Template

## What's it?
The Template Design Pattern is a behavior pattern and, as the name suggests, 
it provides a template or a structure of an algorithm which is used by users.
A user provides its own implementation without changing the algorithm’s structure.
The Template Pattern defines the skeleton of an algorithm 
in an operation, deferring some steps to subclasses. Template Method lets 
subclasses to redefine certain steps of an algorithm without changing 
the algorithm’s structure.

## How to use it?
Let's check the `ConnectionTemplate.java` file - it is our implementation
of the Template Pattern. The abstract class provides steps to connect, communicate
and later to close the connections. All these steps are required
in order to get the work done. The class provides default implementation
to some common steps and leaves the specific steps as abstract which force
the client to provide an implementation to them;
@method `run` is used to run the steps in order. The method is set as final
because the steps should be kept safe and should not be change by any user.
There are 2 examples of user's implementation of connection. Check `MySqLCSVCon.java`
and `OracleTxtCon.java` files. Both classes extend `ConnectionTemplate` 
and implement abstracts methods. The output of `TemplatePatternExample.java` 
clearly shows how the template pattern works to connect and communicate 
with the different databases using the similar way. The pattern keeps the 
common code under one class and promotes code re-usability.


## When to use the Template
1. To implement the invariant parts of an algorithm once and leave it up to subclasses to implement the behavior that can vary.
2. When common behavior among subclasses should be localized in a common class to avoid code duplication.




