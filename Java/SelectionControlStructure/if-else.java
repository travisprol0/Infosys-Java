/* 

An if statement can be written along with an else statement. The condition/expression given in the if statement is checked and set of statements are executed based on the outcome of the condition. If the condition is true, the statements written in if block get executed. If the condition is false, then the statements inside else block get executed.


*/

if (<condition>) { 
    <statements>; 
} 
else { 
    <statements>; 
} 


public class Customer {
	public static void main(String[] args) {
		String customerType = "Regular";
		int quantity = 2;
		int unitPrice = 10;
		int totalCost = 0;
		int discount = 5;
		int deliveryCharge = 5;
		totalCost = unitPrice * quantity;
		if (customerType == "Regular") {
			totalCost = totalCost - (totalCost * discount / 100);
			System.out.println("You are a regular customer and eligible for 5% discount");
		} else {
			totalCost = totalCost + deliveryCharge;
			System.out.println("You need to pay an additional delivery charge of $5");
		}
		System.out.println("Total cost: " + totalCost);
	}
}