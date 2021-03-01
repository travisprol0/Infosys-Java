/* 

Can we predict all the exceptions that can occur in a program?

It is nearly difficult to predict all the possible exceptions and write the corresponding catch blocks. Then how can we catch the exception for which we don’t have corresponding catch block?

Suppose we want to display the length of the student name in calculateAverage() and let us assume that studentName is not yet initialized.

This will result in NullPointerException.

*/
catch(Exception e) {
	//This block can handle all types of exceptions
	System.out.println("Some error occurred");
}


catch(ArithmeticException e) {
	//This block will only execute if any Arithmetic exception occurs in try block
	System.out.println("Divide by Zero exception occurred!");
}
catch(ArrayIndexOutOfBoundsException e) {
	//This block will only execute if any ArrayIndexOutOfBoundsException occurs in try block
	System.out.println("Array index out of range exception occurred!");
}
catch( Exception e) {
	//This block will handle all types of exceptions that occur in try block
	System.out.println("Some error occurred!");
}
