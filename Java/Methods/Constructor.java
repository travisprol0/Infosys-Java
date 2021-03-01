/* 

A constructor in Java is a special method that is used to initialize class variables at the time of object creation. 

Each time an object is created using the new() keyword, a constructor is called. A constructor can be created by the programmer. If the developer does not create any constructor, then, Java provides a default constructor. 

In the previous examples, we had not created any constructor, but Java provided a default constructor for every class.

Constructors have the same name as that of the class and does not have a return type.

*/

<access modifier> <name> (<parameters>){
    //body
}

public Customer(){

}


/* 

A constructor with no arguments is known as a parameterless constructor. If you don’t define a constructor in a class, then Java creates a default parameterless constructor and initializes the default values to the class variables based on the data type. 

*/

class Customer {
    public String customerId;
    public String customerName;
    public long contactNumber;
    public String address;
}

public class Tester {
    public static void main(String args[]){
        Customer customer1 = new Customer();
        System.out.println(customer1.customerId);
        System.out.println(customer1.customerName);
        System.out.println(customer1.contactNumber);
        System.out.println(customer1.address);
    }
}

/* 

RETURNS
null
null
0
null

*/

class Customer {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
	public Customer() {
		System.out.println("Constructor called");
	}
}
public class Tester {
	public static void main(String args[]) {
		Customer customer1 = new Customer();
		System.out.println(customer1.customerId);
		System.out.println(customer1.customerName);
		System.out.println(customer1.contactNumber);
		System.out.println(customer1.address);
		Customer customer2 = new Customer();
	}
}

/* 

RETURNS
Constructor called
null
null
0
null
Constructor called

*/


/*

PARAMETERIZED CONSTRUCTOR

Like any other method, a constructor can also accept parameters. Generally, these are the values that need to be assigned to the instance variables of the class for that object. 

*/

class Customer {
    public String customerId;
    public String customerName;
    public long contactNumber;
    public String address;

    Customer(String cId, String cName, long contact, String add) {
        customerId = cId;
        customerName = cName;
        contactNumber = contact;
        address = add;
    }
}

public class Tester {
    public static void main(String args[]){
        Customer customer1 = new Customer("C103", "Jacob", 5346398670, "13th Street, New York");
        System.out.println(customer1.customerId);
        System.out.println(customer1.customerName);
        System.out.println(customer1.contactNumber);
        System.out.println(customer1.address);
    }
}

/* 

RETURNS
C103
Jacob
5346398670
13th Street, New York

*/

/* 

MULTIPLE CONSTRUCTORS IN A CLASS
 
A class can have multiple constructors to initialize different members. Based on the arguments passed, the respective constructor is called. 

*/

class Customer {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
	public Customer() {
		System.out.println("Parameterless constructor called");
	}
	public Customer(String cId, String cName, long contact, String add) {
		System.out.println("Parameterized constructor called");
		customerId = cId;
		customerName = cName;
		contactNumber = contact;
		address = add;
	}
}

public class Tester {
	public static void main(String args[]) {
		Customer customer1 = new Customer("C103", "Jacob", 5648394590L,
				"13th Street, New York");
		Customer customer2 = new Customer();
	}
}
