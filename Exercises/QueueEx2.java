import java.util.Deque;
import java.util.ArrayDeque;

class Tester {
    
	public static Deque<Integer> changeSmallest(Deque<Integer> inputStack) {
		Deque<Integer> tempStack = new ArrayDeque<Integer>();
		Deque<Integer> newStack = new ArrayDeque<Integer>();
		int smallestNum = 2147483647;
		int smallestNumCount = 0;

		// Get the smallest element
		for (Integer element : inputStack) {
			if (element <= smallestNum) {
				smallestNum = element;
			}
		}

		// Put values that aren't the smallest value into a temp array and pop
		// If the value is the same as the smallest value, pop and do nothing else
		for (Integer element : inputStack) {
			if (element == smallestNum) {
				smallestNumCount += 1;
				inputStack.pop();
			} else {
				tempStack.push(inputStack.pop());
			}
		}

		// Add X number of smallest elements back
		while (smallestNumCount > 0) {
			newStack.push(smallestNum);
			smallestNumCount--;
		}

		// Put back in order they were taken out
		for (Integer element : tempStack) {
			newStack.push(tempStack.pop());
		}

		return newStack;
	}

	public static void main(String[] args) {
		
		Deque<Integer> inputStack = new ArrayDeque<Integer>();
		inputStack.push(10);
		inputStack.push(8);
		inputStack.push(5);
		inputStack.push(12);
		inputStack.push(5);
	
		Deque<Integer> updatedStack = changeSmallest(inputStack);
		
		System.out.println("Stack After Modification:");
		for (Integer value : updatedStack)
			System.out.println(value);
	}
}