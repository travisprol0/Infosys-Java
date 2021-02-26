/* 

We will first discuss about HashSet class.

HashSet uses hash tables for storing the unique elements. There is no guarantee on the iteration order of the set. HashSet depends on the equals() and hashCode() methods for detecting duplicates and null values are allowed. 

The code for creating a HashSet object is shown below.

*/ 

import java.util.HashSet; // Importing the HashSet class
import java.util.Set; 

public class Tester {
	public static void main(String[] args) {
		Set<String> uniqueItems = new HashSet<String>(); // Creating HashSet object
	}
}


import java.util.HashSet;
import java.util.Set;
public class HashSetExample {
	public static void main(String[] args) {
		//Creating HashSet object
		Set<String> food = new HashSet<String>();
		food.add("Pasta"); // Adding elements to the HashSet
		food.add("Noodles");
		food.add("Sandwich");
		food.add("Pasta");
		food.add("Burger");
		food.add("Noodles");
		System.out.print("Set output without the duplicates: ");
		System.out.println(food);
	}
}

// "Set output without the duplicates: [Sandwich, Burger, Pasta, Noodles]"