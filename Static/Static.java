// if the delivery charge will be the same for every object we can put it in the constructor

public Customer(String customerId, String customerName, long contactNumber,
String address) {
    this.customerId = customerId;
    this.customerName = customerName;
    this.contactNumber = contactNumber;
    this.address = address;
    this.deliveryCharge = 1.5f;
}

/* 

Why do we need static?

Though the delivery charge is same for all the customer objects, but in this case, the value of delivery charge is maintained for each and every customer object.

So, instead of storing the delivery charge separately for each and every customer object, it would have been better if we could have maintained a single copy of the delivery charge which could be accessible by all the customer objects.

Usually, values of member variables can be accessed only by that object. But here, we need a variable whose value could be shared by all the objects of a class, i.e., the entire class.

In, object oriented programming languages like Java, there is a concept of creating a static variable.

A static variable belongs to an entire class and not to a specific object. 

*/