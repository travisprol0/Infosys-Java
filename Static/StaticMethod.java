/* 

How can you access the static variable deliveryCharge in order to display the total bill amount which has to be paid by the customers?

One way of accessing the static variable is with the help of instances of the class as shown below

*/

// Accessing the static variable with the help of instance of the class
System.out.println("Delivery Charge for customer1 is "+ customer1.deliveryCharge);

/* 

Since the static variables are not specific to an object, accessing a static variable using an object is not the correct way.

Instead, static variables should be accessed with the help of class name instead of the instance of the class as shown below:

*/

// Accessing the static variable with the help of class
System.out.println("Delivery Charge for customer1 is "+ Customer.deliveryCharge);

/* 

Static methods are methods prefixed with the static keyword. These methods can be accessed without an object of the class. Similar to static variables, they are accessed using the class name. A static method can be invoked without creating an instance of a class.

A static method can only access static variables and cannot access instance variables.

In case of the delivery charge scenario, you can create static setter and getter methods for deliveryCharge as shown below

*/

public static float getDeliveryCharge() {
	return deliveryCharge;
}
public static void setDeliveryCharge(float deliveryCharge) {
	Customer.deliveryCharge = deliveryCharge;
}

// What happens if you try to access the deliveryCharge in setDeliveryCharge() method with the help of this?

public static void setDeliveryCharge(float deliveryCharge) {
	// Which object's deliveryCharge?
	this.deliveryCharge = deliveryCharge; // This line will throw error 
	}

/* 

Static blocks and static methods cannot access non-static (instance) members directly since static methods do not belong to any object, so it is not possible to know which object's instance variables should be accessed. Trying to do so will result in a compilation error.

However, non-static methods can access static members.

*/