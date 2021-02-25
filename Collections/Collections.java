/* 

A collection is an object that groups multiple elements into a single unit. Collections are used to store, retrieve and manipulate data.

Collections framework in Java helps us in representing and manipulating collections.

It is a collection of interfaces and classes which helps in storing and processing the data efficiently. Collections Framework standardizes the way we store and access the data from collections and is a part of the java.util package.

The diagram given below represents the hierarchy of the Java Collections framework.

*/

/* 

The following list describes the various interfaces of the collection framework:

Collection - the root of the collection hierarchy

A collection represents a group of objects known as its elements.

Some types of collections allow duplicate elements and others do not. Some are ordered and others are unordered.

Set - a collection that cannot contain duplicate elements

List - an ordered collection

Lists can contain duplicate elements.

A programmer can access elements by their index(position) and has control over where each element is inserted in the list.

Queue and Deque (pronounced as "Deck") - collections used to hold multiple elements prior to processing

Besides basic collection operations, a Queue and a Deque provides additional insertion, extraction, and inspection operations.

Queue

Queues typically, but do not necessarily, order elements in a FIFO (first-in-first-out) manner. Among the exceptions are priority queues.

In a FIFO queue, all new elements are inserted at the tail of the queue. Other kinds of queues may use different placement rules.

Deque 

Deques can be used both as FIFO (first-in-first-out) and LIFO (last-in-first-out).

In a Deque, elements can be inserted, retrieved and removed from both ends.

*/