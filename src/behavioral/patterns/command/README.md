# Command Pattern

## What's it?
The Command Design Pattern is a behavioral design pattern and helps to 
decouples the invoker from the receiver of a request. The intent of the Command 
Design Pattern is to encapsulate a request as an object, thereby letting 
the developer to parameterize clients with different requests, queue or 
log requests, and support undoable operations. Using the Command pattern, t
he invoker that issues a request on behalf of the client and the set of 
service-rendering Receiver objects can be decoupled. The Command pattern 
suggests creating an abstraction for the processing to be carried out or 
the action to be taken in response to client requests. A given Command 
object is responsible for offering the functionality required to process 
the request it represents, but it does not contain the actual implementation 
of the functionality. Command objects make use of Receiver objects in 
offering this functionality.

## How it works?
Let's check our example.
The `Job.java` interface is the command interface, contains a single method run, 
which is executed by a thread. There are 4 different jobs: `Email.java`, 
`FileIO.java`, `Logging.java`, `Sms.java`, all of them will be executed by
command object. Then, we have 4 different command classes: `EmailJob.java`,
`FileIOJob.java`, `LoggingJob.java`, `SmsJob.java` which implement the Job interface.
In the file `ThreadPool.java` We create a thread pool with 10 threads.
Then, we set different command objects with different jobs and add these jobs
to the queue using the addJob method of the ThreadPool class. Each worker 
thread will wait for a job in a queue and then execute the job and will 
go back to waiting state. ThreadPool class used to create pool of threads and allow
a thread to fetch and execute the job from the job queue. Each worker thread 
will wait for a job in a queue and then execute the job and will go back 
to waiting state. Now, run the `ExampleCommandPattern.java` file. We have set 
different type of jobs, but by using the Command Design Pattern, we decouple 
the job from the invoker thread. The thread will execute any kind of object 
that implements the Job interface. The different command objects encapsulate
the different object and executed the requested operations on these objects.
 
## When to use The Composite?
1. Parameterize objects by an action to perform.
2. Specify, queue, and execute requests at different times. A Command object can have a lifetime independent of the original request. If the receiver of a request can be represented in an address space-independent way, then you can transfer a command object for the request to a different process and fulfill the request there.

