//main try block
try{
    statement 1;
    statement 2;
    //nested try-catch block
    try{
        statement 3;
    }
    catch(Exception ex){
        //exception message
    }
}
catch(Exception ex){
    //exception message
}


public void calculateAverageMarks() {
    int sum=0;
    int totalSubjects=0;
    //outer try block
    try {
        //inner try block
        try {
            for (int i = 0; i <marks.length;i++) {
                sum+=marks[i];
            }
            this.averageMarks=sum/totalSubjects;//Exception will be raised as totalSubjects is 0 
            System.out.println("Average Marks: "+ this.averageMarks);
        }
        //inner catch block
        catch(ArithmeticException e) {
                //This block will only execute if any Arithmetic exception occurs in try block
                System.out.println("Divide by Zero exception occurred!");
            }
        catch(ArrayIndexOutOfBoundsException e) {
            //This block will only execute if any ArrayIndexOutOfBoundsException occurs in try block
            System.out.println("Array index out of range exception occurred!");
        } 
    }
    //outer catch block
    catch(Exception e) {
        //This block will handle all types of exceptions that occur in try block
        System.out.println("Some error occurred!");
    }
   
}
