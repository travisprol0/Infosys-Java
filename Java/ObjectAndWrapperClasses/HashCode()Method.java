/* 

Next, you will see the hashCode() method.

hashCode() uses an object's data to generate a hash value, which should be a 32 bit integer

By default, it derives the hash value based on the memory address of the object being used

If two objects are equal according to the equals() method, hashCode() must produce the same integer value for the two objects

It is important to understand that if the hash codes of two objects are same, it doesn't prove that the objects are equal, i.e., it is possible for two unequal objects to have the same hash codes. 

hashCode() uses a formula to generate an integer based on the same attribute

Any formula can be used for generating the hash code as long as it generates the same value for same objects

*/

// hashCode method overridden
public int hashCode() {
	int result = 1;
	result = result + (foodName.hashCode());
	return result;
}

/* 

In the code snippet of equals() and in the code snippet given over here for hashCode(), equals() and hashCode() are applied on String.

The String class is also a subclass of the Object class. It already overrides the equals() and hashCode() methods.

Note: While comparing String objects for equality, equals() method should be used since it is already overridden to compare the values.

*/