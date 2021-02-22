/* 

By now, you have learnt that the derived classes inherit from the base class. You will now see how the child class object is created. As you all know, constructors are invoked while creating objects. When a child class object is created, the child class constructor invokes the parent class constructor before executing any statement present in the child constructor.

Observe the below code and understand the sequence of constructor invocation.

*/

class Customer {
    public Customer(){
        // 3: Parent Constructor will be executed
        System.out.println("Creating a customer...")
    }

    class RegularCustomer extends Customer {
        public RegularCustomer() {
            // 2: This constructor will then call the parent constructor
            System.out.println("It is a regular customer!");
            // 5: The flow will finally come here
        }
    }
    public class Tester {
        public static void main(String[] args) {
            RegularCustomer regularCustomer = new RegularCustomer();
            // 1: This line will be executed first and the flow will go to [2]
        }
}