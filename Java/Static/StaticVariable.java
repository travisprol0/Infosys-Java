/*

When a variable is declared as Static, then a single copy of the variable is created and shared among all objects at the class level. Memory allocation for such variables happen only once when the class is loaded in the memory. These variables are also known as class-level variables.

Since static variables and instance variables are both members of the class, they are often referred to as member variables.

*/

private static float deliveryCharge; //Declaration of static variable 

//Since the static variable gets created only once, now only one deliveryCharge member variable will be created and all the objects of that class will share that member variable. This can be visualized as *check photo*