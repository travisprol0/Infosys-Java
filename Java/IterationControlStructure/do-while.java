do { 
       <statements>; 
    } while (<condition>); 


    //Importing the Scanner class
import java.util.Scanner;
public class Customer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Creating a Scanner object
		int totalCost = 0;
		char wantToAddFoodItem = 'N';
		int unitPrice = 10;
		int quantity = 1;
		do {
			totalCost = totalCost + (quantity * unitPrice);
			System.out.println("Order placed successfully!");
			System.out.println("Total cost: " + totalCost);
			System.out.println("Do you want to add more food items to the order? Y or N");
			String input = sc.next(); // Accepting input from the customer
			// Extracting first character from the input string
			wantToAddFoodItem = input.charAt(0);
		} while (wantToAddFoodItem == 'Y');
		System.out.println("Thank you for ordering the food! It will reach you shortly...");
	}
}