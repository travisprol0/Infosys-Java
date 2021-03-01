if (<condition>) {  // Curly braces are not required if there is only one statement inside the block
    <statements>;
}


// no condition for a false

public class Customer {
	public static void main(String[] args) {
		String customerType = "Regular";
		int quantity = 2;
		int unitPrice = 10;
		int totalCost = 0;
		int discount = 5;
		totalCost = unitPrice * quantity;
		if (customerType == "Regular") {
			totalCost = totalCost - (totalCost * discount / 100);
			System.out.println("You are a regular customer and eligible for 5% discount");
		}
		System.out.println("Total cost: " + totalCost);
	}
}