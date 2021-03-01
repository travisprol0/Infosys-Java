/* 

Previously in the course, we have used some constant values for mathematical calculations. For example, to calculate the area of circle we use the formula πr2 where π is a constant whose value is 3.14 and r is the radius of the circle.

In programming, we may encounter situations where we may have to create components that must remain constant, i.e., never change. In such cases, the final keyword can be used.

The final keyword can be used with classes, variables and methods. The details are diagrammatically shown below.

Also, observe the identifier naming convention for final fields.

*/

//Let us consider the below example. We have the variable "num" assigned with the value 10. In the method changeNumber(), we are assigning a new value 20. So, the value of "num" will be 20.

class Demo {
	int num = 10;
	public void changeNumber() {
		num = 20;
		System.out.println("The value of num is " + num);
	}
}
public class Tester {
	public static void main(String args[]) {
		Demo demo = new Demo();
		demo.changeNumber();
	}
}

// The value of num is 20


class Demo {
	final int num = 10; // final variable

	public void changeNumber() {
		num = 20;
		System.out.println("The value of num is " + num);
	}
}

class Tester {

	public static void main(String args[]) {
		Demo demo = new Demo();
		demo.changeNumber();
	}
}

//Compilation failed cannot assign a value to final variable num


class A {
	final public void example() {
		System.out.println("A Class Method");
	}
}

class B extends A {
	@Override
	public void example() {
		System.out.println("B Class Method");
	}

}

class Tester {
	public static void main(String[] args) {
		B obj = new B();
		obj.example();
	}

}

// Compilation error cannot override example() in A