// The abstract keyword signifies that something is not complete. It can be used with classes and methods.

// An abstract method is a method without any definition, i.e., the body. The signature of an abstract method must be preceded by the abstract keyword.

public abstract double payBill(double totalPrice);

// An abstract class is a class which is incomplete and cannot be instantiated. 

abstract public class Customer {}

/* 

Some points that you should be knowing about abstract class are:

An abstract class encapsulates the common behaviors of all its child classes with the help of abstract methods

Concrete (non-abstract) classes which extend an abstract class must implement all the abstract methods. Otherwise, they should be made abstract as well.

If a class contains at least one abstract method, the class should be abstract.

A class can be made abstract even without any abstract methods.

*/