/* 

Next, we will discuss about TreeSet. TreeSet uses a tree-based data structure for storing elements. Elements are returned based on natural ordering. For example, in case of String, the order will be alphabetical order. TreeSet depends on compareTo() method for ordering as well as for detecting duplicates.

The code for creating a TreeSet object is shown below.

*/

import java.util.TreeSet;
import java.util.Set; // Importing the TreeSet class
public class Tester {
	public static void main(String[] args) {
		Set<String> uniqueItems = new TreeSet<String>(); // Creating a TreeSet object
	}
}

import java.util.TreeSet; // Importing the TreeSet class
import java.util.Set; 
public class TreeSetExample {
	public static void main(String[] args) {
		Set<String> food = new TreeSet<String>(); // Creating TreeSet object
		food.add("Pasta"); // Adding elements to the TreeSet
		food.add("Noodles");
		food.add("Sandwich");
		food.add("Pasta");
		food.add("Burger");
		food.add("Noodles");
		System.out.print("Set output without the duplicates in the sorted order: ");
		System.out.println(food);
	}
}


// "Set output without the duplicates in the sorted order: [Burger, Noodles, Pasta, Sandwich]"