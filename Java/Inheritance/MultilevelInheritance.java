/* 

The next type of inheritance that we will be discussing is Multilevel inheritance.

In multilevel inheritance, a class extends another class which extends another class.

SwiftFood app has one more category of customers - PremiumCustomers. PremiumCustomers are special type of RegularCustomers who are provided with reward points apart from getting discount.

In this case, the RegularCustomer class extends the Customer class and the PremiumCustomer class extends the RegularCustomer class. This is an example of Multilevel inheritance. 

*/

public class Customer {
    //code	
}
public class RegularCustomer extends Customer {     
     //code   
}
public class PremiumCustomer extends RegularCustomer {  
     //code  
   
}
