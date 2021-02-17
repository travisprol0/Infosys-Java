// Consider the below constructor for Customer class

public Customer(String customerId, String customerName, long contactNumber,
		String address) {
	customerId = customerId;
	customerName = customerName;
	contactNumber = contactNumber;
	address = address;
}


/* 

Here, the name of the instance variables of the class and the parameters passed in the constructor are the same. In such a case, the local variables (arguments of the constructor) have more priority and therefore, only the local variables will be referred inside the above constructor. To overcome this problem, we have this keyword which can be used to refer to the class members. 

*/

public class Customer {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
	public Customer(String customerId, String customerName, long contactNumber,
			String address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
}

//The compiler will now be able to differentiate between the instance variables and the local variables in the above code.


// this can also be used to invoke method or constructor of the current object.

public class Customer {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
	public Customer() {
		System.out.println("Parameterless constructor called");
	}
	public Customer(String customerId, String customerName, long contactNumber,
			String address) {
		// this() is used to invoke the constructor of the current class
		// Since no parameters are specified, parameterless constructor will be invoked
		this();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	public void displayCustomerName() {
		System.out.println("Customer Name : " + customerName);
	}
	public void displayCustomerDetails() {
        System.out.println("Displaying customer details \n***********");
		System.out.println("Customer Id : " + customerId);
		this.displayCustomerName();
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
	}
}
