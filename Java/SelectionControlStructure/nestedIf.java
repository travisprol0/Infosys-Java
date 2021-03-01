/*

When an if statement is written within another if statement, it is known as nested if statement. It enables us to test multiple criteria. The inner if block condition gets executed only when the condition of the outer if block evaluates to true.

*/

if (<condition 1>) {
    if (<condition 2>) {
        <statements>;
    }
    else {
        <statements>;
    }
}

/*

In the below code, the total cost for an order is calculated using nested if blocks. The assumption over here is that each food item costs $10. The Regular customers are provided with a 5% discount for their orders whereas the Guests need to pay an additional delivery charge of $5.  First, the customer type is checked. If the customer type is Regular, then the if block gets executed. If the customer type is Guests, then else if block gets executed. Also, for regular customers, if the total cost exceeds $20, a special gift voucher will be provided to the customers. This condition is checked within the outer if block. If customer type is invalid, then the statements of else block get executed.


*/

public class Customer {
	public static void main(String[] args) {
		String customerType = "Guest";
		int quantity = 2;
		int unitPrice = 10;
		int totalCost = 0;
		int discount = 5;
		int deliveryCharge = 5;
		totalCost = (unitPrice * quantity);
		if (customerType == "Regular") {
			totalCost = totalCost - (totalCost * discount / 100);
			System.out.println("You are a regular customer and have got 5% discount");
			System.out.println("The total cost to be paid is " + totalCost);
			if (totalCost >= 20) {
				System.out.println("You have got a gift voucher!!!!");
			}
		} else if (customerType == "Guest") {
			totalCost = totalCost + deliveryCharge;
			System.out.println("You need to pay an additional delivery charge of $5");
			System.out.println("The total cost to be paid is " + totalCost);
		} else {
			System.out.println("Invalid selection");
		}
	}
}