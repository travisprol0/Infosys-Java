/* 

In the previous code snippet, the member variables were being set in the child class constructor and the parameterized constructor of parent class.

Instead of setting the values of member variables in both the places, it would be better if the parameterized constructor of parent class is invoked from the child class constructor so that code can be reused. 

By now, you know that the parent class parameterless constructor is implicitly invoked by the child class constructors but how are parameterized constructors of parent class invoked? 

This can be done using super as shown in the code given below.

*/

class Customer {
	private String customerId;
	private String customerName;
	public Customer(String customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}
	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***************************");
		System.out.println("Customer Id : " + this.customerId);
		System.out.println("Customer Name : " + this.customerName);
	}
}

class RegularCustomer extends Customer {
	private float discount;
	public RegularCustomer(String custId, String custName) {
		super(custId, custName); // Invoking the parent class parameterized constructor
		this.discount = 5.0f;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
}
public class Tester {
	public static void main(String[] args) {
		RegularCustomer regularCustomer = new RegularCustomer("C1010", "Johns Kora");
		regularCustomer.displayCustomerDetails();
	}
}

/*

Please also note that the call to a super constructor has to be the first statement inside a constructor.

In fact, the parameterless constructor of the parent class gets implicitly called by the child class constructors due to an implicit super() statement. This can also be done explicitly as shown below.

*/


class RegularCustomer extends Customer {
	public RegularCustomer() {
		super(); // Invoking the parent class constructor
		System.out.println("It is a regular customer!");
	}
}

