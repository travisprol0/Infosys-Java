import java.util.ArrayDeque;
import java.util.Deque;

class Tester {

    public static Deque<Character> updateStack(Deque<Character> inputStack) {
		//Implement your logic here and change the return statement accordingly
		Deque<Character> tempQueueBottomThree = new ArrayDeque<Character>();
		Deque<Character> tempQueue = new ArrayDeque<Character>();
		Deque<Character> finalQueue = new ArrayDeque<Character>();
		int size = inputStack.size();
		for(int i = 0; i < size - 3; i++){
		    tempQueue.push(inputStack.pop());
		}
		
		for(int i = 0; i < 3; i++){
		    tempQueueBottomThree.push(inputStack.pop());
		}
		
		for(int i = 0; i < size - 3; i++){
		    finalQueue.push(tempQueue.pop());
		}
		
		for(int i = 0; i < 3; i++){
		    finalQueue.push(tempQueueBottomThree.pop());
		}
		
		
		return finalQueue;
	}
	
	public static void main(String[] args) {
		
		Deque<Character> inputStack = new ArrayDeque<Character>();
		inputStack.push('E');
		inputStack.push('D');
		inputStack.push('C');
		inputStack.push('B');
		inputStack.push('A');
		
		Deque<Character> resultStack = updateStack(inputStack);
		
		System.out.println("The alphabets in updated stack are:");
		for(Character alphabet: resultStack)
		    System.out.println(alphabet);
	}
}