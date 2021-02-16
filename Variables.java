import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Or;

class Variables {
    public static void main(String[] args) {
        int discount = 10; // discount is a variable
        double totalPrice = 200; // totalPrice is a variable
        double priceAfterDiscount = totalPrice * (1 - ((double) discount / 100)); // priceAfterDiscount is a variable
        System.out.println("Customer has paid a bill of amount: " + priceAfterDiscount);
    }
}

/* declare variables as follows:

<data type> <variableName>

OR 

<data type> <variableName> = <value> */


int discount = 10 // int is data type, discount is variable name, 10 is the value



/* an Identifier is the name given to a variable

It can contain alphanumeric characters([a-z], [A-Z], [0-9]), dollar sign ($), underscore (_) 

It should not start with a digit ([0-9]) 

It should not have spaces 

It should not be a Java keyword 

It is case-sensitive 

It has no length restrictions 


Examples of valid identifiers

variable, My_variable, Var123, _var, $myvariable

Examples of invalid identifiers

123var, My variable, Var-1 */