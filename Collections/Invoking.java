/* 

To reference the generic Container class from within your code, you must perform a generic type invocation, which replaces T with some concrete value, such as Integer:

*/
Container<Integer> integerContainer;

/* 

Generic type invocation can be considered as being similar to an ordinary method invocation but instead of passing an argument to a method, you are passing a type argument to the Container class itself — Integer in this case.

To instantiate this class, you can use the new keyword as usual, but you need to place <Integer> between the class name and the parenthesis:

*/

Container<Integer> integerContainer = new Container<Integer>();

/* 

In Java SE 7 and later, you can replace the type arguments required to invoke the constructor of a generic class with an empty set of type arguments (<>).

For example, you can create an instance of Container<Integer> with the following statement:

*/

Container<Integer> integerContainer = new Container<>();

/* 

Type parameter Naming Conventions

By convention, type parameter names are single, uppercase letters. 

The most commonly used type parameter names are:

E - Element (used extensively by the Java Collections Framework)

K - Key

N - Number

T - Type

*/

/* 

In addition to generic types, type parameters can also be used to define generic methods.

Generic methods are methods that introduce their own type parameters.

This is similar to declaring a generic type, but the type parameter's scope is limited to the method where it is declared. You can create static and non-static generic methods and generic constructors.

The syntax for a generic method includes a list of type parameters inside angle brackets which appears before the method's return type.

*/

public static <E> void method(){
    
}