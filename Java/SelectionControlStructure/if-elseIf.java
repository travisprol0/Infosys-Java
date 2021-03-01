/*

You can also have else if statements. As the name suggests, it is a combination of else and if. Like else, it extends an if statement to execute a different set of statements in case the original if expression evaluates to false. Then, the conditions present inside the else if blocks are checked. Once a condition evaluates to true, remaining else if and else statements are skipped.

When all the conditions are false, the else block is executed. Coding the else block is optional.

*/

if (<condition 1>) {
    <statements>;
}
else if (<condition 2>) {
    <statements>;
}
else if (<condition 3>) {
    <statements>;
}
else {
    <statements>;
} 

public class Customer {
	public static void main(String[] args) {
		String customerType = "Regular";
		int quantity = 3;
		int unitPrice = 10;
		int discount = 5;
		int deliveryCharge = 5;
		int totalCost = unitPrice * quantity;
		if (customerType == "Regular") {
			totalCost = totalCost - (totalCost * discount / 100);
			System.out.println("You are a regular customer and eligible for 5% discount");
			System.out.println("The total cost to be paid is " + totalCost);
		} else if (customerType == "Guest") {
			totalCost = totalCost + deliveryCharge;
			System.out.println("You need to pay an additional delivery charge of $5");
			System.out.println("The total cost to be paid is" + totalCost);
		} else // If there is only one statement inside a block, {} is optional
			System.out.println("Invalid customer type");
	}
}