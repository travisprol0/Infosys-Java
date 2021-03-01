/* 

Consider the parent Customer class. 

All the customers’ need to pay the bill amount calculated for their orders. There is a payBill() in the Customer class for calculating the final amount for bill payment.

You need to also remember that calculation of bill amount differs for each type of customer. Guests needs to pay a delivery charge of $2. Regular customers get a discount of 5%. Premium customers get a discount of 8% and they can use membership card points for paying the bill.

Since the final amount calculation which is done in the payBill() of parent Customer class will not suit for all the customer types, we need to have separate implementation for this method in each of the child classes with respect to each customer type.

So, in this scenario, the payBill() of the child classes will override the implementation of payBill() present in the parent class. This is said to be method overriding.

*/

public class Customer {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private Address address;
	public Customer(String customerId, String customerName, long contactNumber,
			Address address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	public double payBill(double totalPrice) {
		System.out.println("Final bill for the customer is calculated here");
		return totalPrice;
	}
	// displayCustomerDetails()
	// updateDetails() overloaded methods
	// getter and setter methods
}

// In the below code, payBill() is overridden in the RegularCustomer to include the 5% discount.


public class RegularCustomer extends Customer {
	private float discountPercentage;
	public RegularCustomer(String custId, String custName, long mobileNo,
			Address address) {
		super(custId, custName, mobileNo, address);
		this.discountPercentage = 5.0f;
	}
	@Override
	public double payBill(double totalPrice) {
		double priceAfterDiscount = totalPrice
				* (1 - (discountPercentage / 100));
		return priceAfterDiscount;
	}
	// getter and setter methods
}

// We will now see how these overridden methods can be invoked. Consider the Tester class given below:

public class Tester {
	public static void main(String[] args) {
		// Customer object created
		Customer customer = new Customer("C101", "Stephen Abram", 7856341287L,
				new Address("D089", "St. Louis Street", "Springfield", 62729));
		// payBill() is invoked
		double amount = customer.payBill(40.0);
		System.out.println("Final bill amount is $" + (int) (amount * 100)/ 100.0);
	}
}

/*  

Which method do you think will be invoked?

In the above case, payBill() from the parent class Customer will be invoked and the output will be:

Final bill for the customer is calculated here

Final bill amount is $40.0

*/

//Regular Customer object created
RegularCustomer regularCustomer = new RegularCustomer("C101",
		"Stephen Abram", 7856341287L, new Address("D089",
				"St. Louis Street", "Springfield", 62729));
// payBill() is invoked
double amount = regularCustomer.payBill(40.0);
System.out.println("Final bill amount is $" + (int) (amount * 100)/ 100.0);

/*

Which method do you think will be invoked in this case?

In the above case, payBill() of the child class RegularCustomer will be invoked and the output will be:

Final bill amount is $37.99

*/


Customer regularCustomer = new RegularCustomer("C101", "Stephen Abram", 7856341287L, new Address("D089", "St. Louis Street", "Springfield", 62729));
double amount = regularCustomer.payBill(40.0);

/* 

Which method do you think will be invoked in this case?

The answer is payBill() of the child class RegularCustomer.

*/