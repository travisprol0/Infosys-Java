/* 

Why are the objects in the previous try out code different, even though the values of the member variables are same?

The == operator which is used to compare two Food objects compares the objects with respect to their memory address.

Thus, even though they have the same values of member variables, they are two different objects pointing to two different memory locations.

Whenever two objects are to be compared based on the values of the member variables, equals() method of Object class can be overridden.

equals() compares objects to check for equality

By default, equals() uses memory address to compare objects for equality (just like ==)

To make it work for different requirements, it needs to be overridden in the classes

*/

// equals method of Object class overridden for comparing two Food objects
// based on foodName and foodType
public boolean equals(Object obj) {
	Food otherFood = (Food) obj;
	if (this.foodName.equals(otherFood.foodName)) {
		if (this.foodType.equals(otherFood.foodType))
			return true;
	}
	return false;
}


/* 

In the above scenario,

equals() returns true if the foodName and foodType of two Food objects are same

type casting is done for the received object to cast it to Food object

otherFood represents the second Food object received and is compared with the Food object using which equals() is invoked

*/