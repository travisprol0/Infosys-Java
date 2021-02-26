/*

Queue is a collection used to hold multiple elements prior to processing.

It is an interface available in java.util package and extends java.util.Collection interface.
Just like List, Queue is a collection of ordered elements (or objects) but it performs insertion and removal operations differently.

Queue represents an ordered list of elements

Queue supports all methods of Collection interface

All queues support insertion at the tail of the queue and removal from the head of the queue, except Deque

Deques are queues but they support element insertion and removal at both ends

Queues typically, but do not necessarily, order elements in a FIFO (first-in-first-out) manner. Among the exceptions are 

Priority queues, which order elements according to a supplied comparator, or the elements' natural ordering

LIFO queues (or stacks) which order the elements according to LIFO (last-in-first-out)

Queue implementations generally do not allow insertion of null elements, although some of them do not prohibit insertion of null. It is advisable not to insert null into a Queue as null is returned by the poll method when the queue contains no elements.

*/

Queue<String> queue1 = new ArrayDeque();
Queue<String> queue2 = new PriorityQueue();
