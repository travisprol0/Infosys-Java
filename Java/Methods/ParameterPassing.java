/*

PASS BY VALUE

Whenever a value of a primitive data type is passed, the values are copied from the actual parameters to the formal parameters. This kind of parameter passing is known as pass by value. In pass by value, both the actual and formal parameters point to different memory locations and the values are copied in both the memory locations.

*/

public class Demo {
	public void changeValue(int value1, int value2) {
		value1 = value1 + value2;
		value2 = value1 - value2;
		System.out.println(value1 + " " + value2);
	}
}

public static void main(String args[]) {
	Demo demo = new Demo();
	int x = 20;
	int y = 10;
	System.out.println(x + " " + y);
	demo.changeValue(x, y);
	System.out.println("After calling changeValue function");
	System.out.println(x + " " + y);
}


/*

PASS BY REFERENCE

When an object is passed as a parameter, the formal and the actual parameters both refer to the same object and hence the same memory location. Therefore, the changes made inside the method to the formal parameters are reflected in the actual parameters also. This kind of parameter passing is known as pass by reference. 

*/

public void updateContact(Customer customer) { 
    customer.contactNumber = 9786758497L; 
}

public static void main(String args[]) { 
	Customer customerOne = new Customer(); 
	customerOne.contactNumber = 7656434567L; 
	System.out.println(customerOne.contactNumber); 
	customerOne.updateContact(customerOne); 
	System.out.println("After calling updateContact method"); 
	System.out.println(customerOne.contactNumber); 
} 