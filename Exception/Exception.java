/* 

In case of both the errors, the error messages are not user friendly and also technical details are provided in the error messages which could be risky. 

It would be better if user-friendly and meaningful error messages can be shown to the end user.

This can be done by handling the errors properly.

The runtime errors shown previously are called as exceptions and the process of handling the exceptions is known as Exception Handling.

You will now understand how to handle exceptions.

*/

/* 

In order to handle exceptions, the first step is to identify the code which may generate exceptions. The set of statements that may generate an exception are enclosed in a block known as try block. The try block contains a set of statements where an exception can occur.

The second step is to handle those exceptions. In order to handle those exceptions which get raised in the try block, we use the catch block. A catch block is where you handle the exceptions, i.e., the catch block specifies what is to be done when an exception occurs.

A try block is always followed by a catch block.

Syntax:

*/

try
{
     // statements that may cause an exception
}
catch (exceptionType e) ‏
{
     // error handling code
}


public void calculateAverageMarks() {
    int sum=0;
    int totalSubjects=0;
    try {
        for (int i = 0; i <marks.length;i++) {
            sum+=marks[i];
        }
        this.averageMarks=sum/totalSubjects; //Exception will be thrown as the value of totalSubjects is 0 
        System.out.println("Average Marks: "+ this.averageMarks);
    }
    catch(ArithmeticException e) {
        //This block will execute only if any Arithmetic exception is thrown in try block
        System.out.println("Divide by Zero exception occurred!");
    }
}