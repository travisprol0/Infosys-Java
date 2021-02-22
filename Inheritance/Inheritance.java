/* 

You will now have a look at one more relationship type.

Let us consider the scenario of SwiftFood app. The customers of SwiftFood can be divided into three types: Regular, Premium and Guest. Regular and Premium customers are eligible for 5% and 8% discounts respectively on their orders. Also, premium customers are provided with premium cards so that they can redeem points while ordering food. Guests pay delivery charges for their orders.

Though Regular customers, Premium customers and Guests have different billing mechanism, they have some common attributes like customerId, customerName, contactNumber and address.

So, instead of keeping the common attributes in each and every class, we can have a common class called Customer and include the common attributes. 

*/


/* 

Now, let us consider RegularCustomer and Guest classes. Since RegularCustomer and Guest are types of Customers, they must have access to the common attributes also. We can create a Customer class with the common attributes and methods and make these two classes inherit the attributes and behavior from Customer class as shown below. 

SEE PHOTO


The common members that are inherited are represented using blue color. The members specific to RegularCustomer and Guest are represented using green color.

We can say that the RegularCustomer "is-A" Customer and Guest "is-A" Customer. When a class inherits from another class, then those classes are said to have inheritance relationship. The class which is inheriting is called the child/sub/derived class and the class which is getting inherited is called the parent/super/base class. Inheritance is also called as "is-A" relationship. Inheritance (is-a) is denoted by a line with an arrow head. 

In our example, RegularCustomer and Guest classes are inheriting the Customer class. So, Customer is the parent class and RegularCustomer and Guest are child classes. 

*/

/* 

In case of an inheritance relationship, the attributes and behaviors get inherited just like a child inherits certain attributes and behaviors from his/her parent. 

In terms of OOP, a child class inherits all the non-private attributes and methods.

When we say a child class inherits the attributes and methods, we can treat the attributes and methods as if they are owned by the child class itself.

*/