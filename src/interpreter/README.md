# Interpreter

## What's it?
The Interpreter Design Pattern is a heavy-duty pattern. 
It’s all about putting together your own programming language, or handling 
an existing one, by creating an interpreter for that language. The Interpreter 
pattern can be used to design this ability in an application so that other 
applications and users can specify operations using a simple language 
defined by a set of grammar rules. A class hierarchy can be designed to represent 
the set of grammar rules with every class in the hierarchy representing 
a separate grammar rule. An Interpreter module can be designed to interpret 
the sentences constructed using the class hierarchy designed above and 
carries out the necessary operations.

## How it works?
Let's check our example. The interface `Expression.java` is used by all 
different concrete expressions. Classes override it's interpret method to 
define their specific operation on the expression. There are 3 specific
operations: `Add.java`, `Product.java`, `Subtract.java` and `Number.java` class 
which represents number through the expression. `ExpressionUtils.java` 
is the optional utility class that contains different utility methods used 
to execute the expression. Now we can run our `ExampleInterpreterPattern.java`
which tries to interpret and execute given expression. Please note that 
we have used a postfix expression to solve it. A postfix is mathematical 
notation in which every operator follows all of its operands e.g. 34+.

## When to use The Interpreter pattern?
Use the Interpreter pattern when there is a language to interpret, and you 
can represent statements in the language as abstract syntax trees.
