// Let us consider the scenario of SwiftFood. We have a Customer class which consists of private member variables customerId, customerName, setter and getter methods to set and access the private member variables and displayCustomerDetails() method to display the customer details.

class Customer {
	private String customerId;
	private String customerName;
	public Customer(String customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}
	public Customer() {
		System.out.println("Parent Default Constructor");
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***************************");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println();
	}
}



class RegularCustomer extends Customer {
	private float discount;
	public RegularCustomer(String custId, String custName) {
		this.setCustomerId(custId);
		this.setCustomerName(custName);
		this.discount = 5.0f;
		System.out.println("Child Constructor");
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
		RegularCustomer regularCustomer = new RegularCustomer("C1010",
				"Johns Kora");
		regularCustomer.displayCustomerDetails();
	}
}