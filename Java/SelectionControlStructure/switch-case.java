/*

Similar to if else statements, switch statement is also a selection control structure.

The switch statement enables to select a block from a set of options. It allows the flow of execution to be switched according to a value.

*/


switch (expression or variable) {
    case value1: <statements>;
                 break;
    case value2: <statements>;
                 break;
    default: <statements>;
 }
 

 /*

During execution, the result of expression or variable written in the switch statement is compared with the constant values of cases one by one. When a match is found, the set of statements present in that case are executed until a break statement is encountered or till the end of switch block, whichever occurs first. In the absence of break statement, the flow of control falls through subsequent cases and executes the statements of all those cases until it reaches a break statement or end of switch block. 

The switch block can have a special case called default. The default case is executed when none of the cases match with the value of expression/variable. default is optional. If none of the cases match and if there is no default statement, the control comes out of switch block without executing any case.

In Java, the switch block works only for the following data types:

char and integral datatypes are supported in switch-case statement, but float or double are not supported.

String datatype is also supported in switch-case statement from Java 7 version onwards.


 */


public class Customer {
	public static void main(String[] args) {
		String orderedFood = "Pizza";
		switch (orderedFood) {
		case "Burger":
			System.out.println("You have ordered Burger. Unit price: $10");
			break;
		case "Pizza":
			System.out.println("You have ordered Pizza. Unit price: $15");
			break;
		case "Sandwich":
			System.out.println("You have ordered Sandwich. Unit price: $8");
			break;
		default:
			System.out.println("Invalid selection");
		}
	}
}