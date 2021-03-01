/*

break statement is used to terminate a loop. After terminating the loop, the next statement following the loop gets executed. In case of break statement written in nested loops, the inner most loop gets terminated and the flow of control continues with the statements of outer loop.  

break statement is also used to terminate the execution of a switch case, as already discussed.


*/

import java.util.Scanner;
public class Customer {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);
		int totalCost = 0;
		int unitPrice = 10;
		System.out.println("Enter the max amount you can pay");
		int maxAmountCustomerCanPay = sc.nextInt();
		System.out.println("Enter the number of food items to be ordered");
		int noFoodItemsToBeOrdered = sc.nextInt();
		for (int counter = 1; counter <= noFoodItemsToBeOrdered; counter++) {
			System.out.println("Enter the food item");
			String foodItem = sc.next();
			System.out.println("Enter the quantity");
			int quantity = sc.nextInt();
			totalCost += unitPrice * quantity;
			if (totalCost > maxAmountCustomerCanPay) {
				System.out.println("Sorry! Total cost is crossing your max amount limit.");
				break;
			}
			System.out.println("You have ordered: " + foodItem);
			System.out.println("Order placed successfully");
			System.out.println("Total cost of the order: " + totalCost);
		}
	}
}