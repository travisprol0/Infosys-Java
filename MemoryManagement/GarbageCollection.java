/*

Now that you have learnt how memory allocation happens, it is also important to know the process of deallocating the memory.

Sometimes, even though a resource in a program is unreachable or not in use, the memory used by that resource is not deallocated. This is called Memory leak and is undesirable.

In some languages, it is the programmer's responsibility for deallocating the memory occupied by such resources. Java, on the other hand, has a garbage collector which automatically deallocates the memory used by such resources. This prevents memory leak.

When an object does not have any reference, it becomes eligible for garbage collection.

You might be wondering when does an object not have any reference and become eligible for garbage collection?

Let us look at some of the possibilities.


*/


/* 

Case 1 - When the reference variable pointing to the object is initialez to null, the object will not have any reference

*/

public class Tester {
	public static void main(String[] args) {
		// Object creation
		Customer customerObj = new Customer("C101", "Stephen Abram",
				7856341287L, "D089, St. Louis Street, Springfield, 62729");
		// Reference variable initialized to null
		customerObj = null;
	}
}

// customerObj is eligible for garbage collection

/* 

Case 2 - When the reference variable is initialized to a new object and there is no reference to the previous object

*/

public class Tester {
	public static void main(String[] args) {
		// Object creation
		Customer customerObj = new Customer("C101", "Stephen Abram",
				7856341287L, "D089, St. Louis Street, Springfield, 62729");
		// New object is set to the same reference
		customerObj = new Customer("C102", "James", 7898766723L,
				"D199, St. Louis Street, Springfield, 62729");
	}
}

/* 

Case 3 - When a reference variable is local to some method, it will be removed from the stack as soon as the method finishes execution. The object pointed by the reference variable then becomes eligible for garbage collection.

*/