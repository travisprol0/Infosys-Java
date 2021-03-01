/* 

Polymorphishm is of two types:

Static polymorphism

Dynamic polymorphism

Polymorphism that gets resolved during compile time is known as static polymorphism or compile time polymorphism. This polymorphism is achieved using overloading of the methods in the same class, called as Method overloading.

Method overloading allows the programmer to have multiple methods with the same name in the same class, but differing in their signature.

Signature can differ by

the number of parameters

the data type of parameters

the order of the parameters

Note: We cannot overload methods by their return type, i.e., two or more methods are not overloaded if they differ only in their return type.

*/ 

public class Customer {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private Address address;
	public void updateContact(long mobile) {
		System.out.println("Updating customer contact number...");
		this.setContactNumber(mobile);
	}
	// Constructors and other methods
}


public class Customer {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private Address address;
	public void updateContact(long mobile) {
		System.out.println("Updating customer contact number...");
		this.setContactNumber(mobile);
	}
	public void updateAddress(Address address) {
		System.out.println("Updating customer address...");
		this.setAddress(address);
	}
	// Constructors and other methods
}


// INSTEAD

public class Customer {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private Address address;

	public void updateDetails(long mobile) {
		System.out.println("Updating customer contact number...");
		this.setContactNumber(mobile);
	}

	public void updateDetails(Address address) {
		System.out.println("Updating customer address...");
		this.setAddress(address);
	}
	// Constructors and other methods
}


public class Tester {
	public static void main(String[] args) {
		Customer customer = new Customer("C1016", "Stephen Abram", 7856341287L, custAddress);		
			
		Long newContact = 7890098656L;
		Address newAddress = new Address("D119", "St. Louis Street", "Springfield", 62729);
		
		customer.updateDetails(newContact); //calls the updateDetails(long mobile) - based on the parameter
        customer.updateDetails(newAddress); //calls the updateDetails(Address address) - based on the parameter	
}
