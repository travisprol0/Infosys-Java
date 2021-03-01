/* 

You know that the Premium customers are provided with a membership card using which they can redeem points. Such membership cards can be provided by several businesses to their customers and not just by SwiftFood app. This calls for setting a contract which can be followed by all the businesses who want to provide membership cards.

This setting up of contract can be implemented by using Interfaces in object oriented programming.

An interface is used to define a generic template which can be implemented by various classes.

It contains method signatures and constant declarations

The methods declared in an interface are implicitly public and abstract and the data fields are implicitly public, static and final, i.e., constants

An interface can extend more than one interface and a class can implement more than one interface. This can be used to simulate multiple inheritance in Java

A class can extend from only one class but can implement any number of interfaces

The implements keyword is used to implement an interface. The classes implementing an interface must implement all the specified methods. Otherwise, they should be made abstract

An interface creates a type. Hence, its reference can be used to refer to the objects of the classes which implement that interface. This leads to dynamic binding

Since Java 8, an interface can also have default and static methods. This is not discussed in this course

*/

//Observe the below code. The interface specifies the behaviors by declaring methods but does not provide the implementations. Using interface, we specify what is to be done without telling how. 

public interface PremiumCards {
	int WELCOME_POINTS = 100;
	double redeemPoints(double totalPrice);
	void addPoints(double money);
}
