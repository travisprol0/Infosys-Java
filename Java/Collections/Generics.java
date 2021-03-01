// Let us now look at the declaration of the Collection interface.

public interface Collection<E> ... {
}

/* 

You can notice <E> in the declaration which you have not used before.

The <E> syntax tells you that the interface is generic.

When you declare a Collection instance, you should specify the type of object contained in the collection. Specifying the type allows compiler to verify (at compile-time) the type of object you put into the collection, thus reducing the errors at runtime.

Generics makes the code more stable by making more bugs detectable at compile time.

*/

/* 

The variable E used in the above declaration is called as type parameter. Like formal parameters used in method declarations, type parameters provide a way for you to re-use the same code with different inputs.

The difference is that the inputs to formal parameters are values, while the inputs to type parameters are types. The actual type that is substituted for the type parameter is called as a type argument.

E.g.

*/

Collection<String> list = new ArrayList<String>();
list.add("hello");

/* 

Code that uses generics has many benefits over non-generic code:

Stronger type checks at compile time

A Java compiler applies strong type checking to generic code and gives errors if the code violates type safety. This helps in  fixing errors much earlier as they are caught during compile time.

Elimination of casts

The following code snippet without generics requires casting:

*/

List list = new ArrayList();
list.add("hello");
String s = (String) list.get(0);

//When re-written to use generics, the code does not require casting:

List<String> list = new ArrayList<String>();
list.add("hello");
String s = list.get(0); // no typecast required

/*

Enabling programmers to implement generic algorithms

By using generics, programmers can implement a single algorithm for a task that works on collections of different types instead of creating algorithms for each type.

 
*/