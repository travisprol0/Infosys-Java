/* 

Customer class in the SwiftFood app scenario has a payBill method. The implementation of this method completely depends on the type of customer. So, we implemented this method in all our customer types (child classes) by overriding the parent method.

Thus, the parent class method implementation doesn’t actually have any significance but it is necessary for all the child classes to provide a proper implementation for the method.

So, this means the parent class Customer will not have any implementation for the payBill method but we need to enforce that the child classes implement the payBill() method.

This can be enforced with the help of abstract keyword as shown below.

*/

abstract public class Customer {
	// Instance variables and constructor
	public abstract double payBill(double totalPrice);
	// displayCustomerDetails()
	// updateDetails() overloaded methods
	// getter and setter methods
}


/* 

Here, the method payBill doesn’t have any implementation because it depends on the customer type, whether it is a guest, regular customer or premium customer.

Since it cannot have any implementation, it has been marked as abstract.

Since the method payBill is abstract in the Customer class, the class itself becomes incomplete and demands for a child class to complete it.

For marking the class as incomplete, abstract keyword is used with the class also. Any class extending this abstract class must provide the implementation of the abstract methods.

*/