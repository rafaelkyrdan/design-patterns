# Proxy

## What's it?
The Proxy Pattern provides a placeholder for another object to control access to it.
The Proxy Pattern comes up with many different variations. This pattern is used to create 
a representative object that controls access to another object, which may be remote, expensive to create etc.
In the Proxy Pattern, a client does not directly talk to the original object, it delegates it's calls to 
the proxy object which calls the methods of the original object.


## Kinds of proxies
Plenty of kinds of proxies are possible, but don't afraid it.
All of them implements the same idea - hide the object for some reasons.
CacheProxy, Firewall proxy, Synchronization proxy, Smart Reference proxy,
Counting proxy, Protected proxy, Remote Proxy.

## How to use it?
We start from the `Company.class` which holds the reference to expensive ContactList of Employees(`Employee.class`).
We want to postpone the expensive operation util it is required. Both `ContactListImpl.class` and `ContactListProxyImpl.class`
implements the same interface `ContactList` it allows us use a proxy class.
Check the `ExampleProxy.class` to see how it works. 


