/* 

In the previous tryout, we have handled the issue of divide by zero exception by using the try-catch block.

Replace the calculateAverageMarks() in the previous tryout with the below method implementation. Try out the updated code and observe the output. 

*/
public void calculateAverageMarks() {
	int sum = 0;
	int totalSubjects = 0;
	try {
		for (int i = 0; i <= marks.length; i++) {
			++totalSubjects;
			sum += marks[i];
		}
		this.averageMarks = sum / totalSubjects;
		System.out.println("Average Marks: " + this.averageMarks);
	} catch (ArithmeticException e) {
		System.out.println("Divide by Zero exception occurred!");
	}
}

