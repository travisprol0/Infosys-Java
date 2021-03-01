// Consider the following container class

public class Container {
    private Object object;

    public void set(Object object){
        this.object = object;
    }

    public Object get(){
        return object;
    }
}

/* 

This non-generic Container class operates on objects of any type. 

Since its methods accept or return an Object, you can pass whatever you want but there is no way to verify at compile time, how the class is being used. Someone may place an Integer in the container and expect to get Integers out of it, while someone else may pass in a String resulting in a runtime error.

Generic version of the Container Class

A generic class is defined with the following format:

*/
class name<T1, T2, ..., Tn> { /* ... */ }

/* 

The type parameter section, delimited by angle brackets (<>), follows the class name. It specifies the type parameters (also called type variables) T1, T2, ... and Tn.

Container class can be updated with Generics as follows:

*/

public class Container<T> {
	// T stands for "Type"
	private T t;
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}

/* 

As you can see, all occurrences of Objects are replaced by T.

A type variable can be any non-primitive type you specify, any class type, any interface type, any array type or even another type variable.

This same technique can be applied to create generic interfaces as well.

*/

