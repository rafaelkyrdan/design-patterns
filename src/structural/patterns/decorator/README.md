# Decorator

## What's it?
The intent of the Decorator Design Pattern is to attach additional responsibilities to an object dynamically.
The Decorator object is designed to have the same *interface* as the underlying object. 
We can achieve this by implementing the same interface or extending the same abstract class.
This allows a client object to interact with the Decorator object in exactly the same manner as it would with the underlying actual object.
The Decorator object contains a reference to the actual object.
The Decorator object receives all requests (calls) from a client.
In turn, it forwards these calls to the underlying object.
The Decorator object adds some additional functionality before or after forwarding requests to the underlying object.

## Example
The most famous example of Decorator in java is:
abstract class InputStream and it's different implementations.
The same example for abstract class OutputStream. 

## How to use
In practise we can use chain of decorators.
Task - write an object to the file.
1. Create an output stream for file
`FileOutputStream out = new FileOutputStream(file);`
2. It's too expensive to write bits let's use buffer
`BufferedOutputStream bout = new BufferedOutputStream(out);`
3. We need write an object so let's use ObjectOutputStream
`ObjectOutputStream objOut = new ObjectOutputStream(bout);`
4.Write
`objOut.writeObject(object);`
`objOut.flush();`