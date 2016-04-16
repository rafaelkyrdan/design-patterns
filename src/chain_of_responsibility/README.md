# Builder

## What's it?
The Chain of Responsibility pattern is a behavior pattern. A group of objects is chained together 
in a sequence is provided in order to handle the request by the group. 
If an object in the group can process the particular request, it does so and returns the corresponding response. 
Otherwise, it forwards the request to the subsequent object in the group.


## How it works?
We start from creating the interface for all handlers. Look in the file `Handler.java`.
There are 2 main methods. The setHandler method is used to set the next handler in the chain.
The process method is used to process the request, only if the handler can able process the request.
Then we create as many as possible handlers with specific logic. Look in the files: `DocFileHandler.java`,
`ImageFileHandler.java`, `TextFileHandler.java`. Each handler holds a reference to the next handler in the chain.
Now look in the provided example how to use the pattern chain of responsibility `ExampleChainOfResponsibility.java`
First we set up the chain, last handler doesn't have a reference to the next handler.
All our files we digest throw the our chain we start from the first handler.


## When to use The Builder Pattern?
1. You want to issue a request to one of several objects without specifying the receiver explicitly.
2. More than one objects may handle a request, and the handler isn’t known.