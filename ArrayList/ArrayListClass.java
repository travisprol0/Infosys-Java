/* 

In ArrayList, the elements can be added or removed as and when required. Also, there is no need to maintain any index.

The code given below shows how to create an ArrayList object called food for storing strings.

*/

import java.util.ArrayList; // Importing the ArrayList class
import java.util.List;     // Importing List Interface
public class ArrayListExample {
	public static void main(String[] args) {
		List<String> food = new ArrayList<String>(); // Creating a list of String elements
	}
}

// An object of ArrayList can also be created as follows;

ArrayList<String> food = new ArrayList<String>();

// It is considered as a good practice to use interface as reference type because if you declare a collection using an interface type, your code would be more flexible as the implementation can be changed whenever required.

food.add("Noodles"); //adding elements
food.add("Burger");
food.add("Pasta");
food.add("Sandwich");

// The code below shows how to modify a food item present in a specified index of the ArrayList. 

food.set(1, "Pizza"); // modifying the element at a specified index 

food.contains("Pasta") // checking wether the element is present or not returns true or false

foox.remove(2); // removes the elements and shifts elements to get rid of empty index