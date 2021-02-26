/* 

Next, we will discuss about LinkedHashSet. LinkedHashSet uses a combination of hash tables and linked lists for storing elements. Elements are returned in the order of their insertion. LinkedHashSet depends on the equals() and hashCode() methods for detecting duplicates and null values are allowed.

The code for creating a LinkedHashSet object is shown below.

*/

import java.util.LinkedHashSet; // Importing the LinkedHashSet class
import java.util.Set;
public class Tester {
	public static void main(String[] args) {
		Set<String> uniqueItems = new LinkedHashSet<String>(); // Creating LinkedHashSet object
	}
}


import java.util.LinkedHashSet;// Importing the LinkedHashSet class
import java.util.Set; 
public class Tester {
	public static void main(String[] args) {
		Set<String> food = new LinkedHashSet<String>(); // Creating LinkedHashSet object
		food.add("Pasta"); // Adding elements to the LinkedHashSet
		food.add("Noodles");
		food.add("Sandwich");
		food.add("Pasta");
		food.add("Burger");
		food.add("Noodles");
		System.out.print("The duplicates are removed and displayed in the order in which the elements are inserted: ");
		System.out.println(food);
	}
}


// "The duplicates are removed and displayed in the order in which the elements are inserted: [Pasta, Noodles, Sandwich, Burger]"