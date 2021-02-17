while (<condition>) { 
       <statements>; 
    } 


    //Importing the Scanner class
import java.util.Scanner;
public class Customer {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);
		int totalCost = 0;
		char wantToAddFoodItem = 'Y';
		int unitPrice = 10;
		int quantity = 1;
		while (wantToAddFoodItem == 'Y') {
			totalCost = totalCost + (quantity * unitPrice);
			System.out.println("Order placed successfully");
			System.out.println("Total cost: " + totalCost);
			System.out.println("Do you want to add more food items to your order? Y or N");
			String input = sc.next(); // Accepting input from the customer
            // Extracting first character from the input string
			wantToAddFoodItem = input.charAt(0); 
		}
	}
}