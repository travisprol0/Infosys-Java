/* 

Now that you have understood Generics, we will get into details of Collections framework.

The root of the Collection hierarchy is the java.util.Collection<E> interface.

It specifies the basic operations for manipulating elements in a collection. These operations are inherited and implemented in child interfaces and the classes implementing the interfaces.

Below are some of the important methods provided by the Collection interface:

*/

// The toArray() method converts a collection into an array. If you want to convert an array into a list, you can use the Arrays.asList() method.

/* 

Let us focus on the iterator() method.

iterator() allows traversing a collection.


Here's an example of how iterator works:


*/

Iterator<String> iterator = orders.iterator();   
System.out.println("Elements in the list: ");
while(iterator.hasNext()) {
    System.out.println(iterator.next());
}

/* 

The code above sequentially traverses the list in the forward direction.

The code above can also be simplified and written using the for-each loop as shown below:

*/

System.out.println("Elements in the list: ");
for(String order : orders) {
    System.out.println(order);
}

/* 

This code has a cleaner syntax and internally uses an iterator.

Then why should you explicitly use an iterator?

Modification of a collection inside a for loop throws ConcurrentModificationException. Iterator allows modifying a collection while traversing and hence such an exception can be avoided.

You will know about the iterator() method in details later.

Note: Iterators maintain a cursor to identify the location of elements.

*/