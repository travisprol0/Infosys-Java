class GenericDemo{

    //Generic Method 
	public static <E> void display(E[] arr) {
		for (E element : arr) {
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) {

		String[] names= { "Luke", "Mia", "Mathew" };
		display(names);

		System.out.println();

		Integer[] numbers = { 1, 2, 3, 4, 5 };
		display(numbers);

	}
   
}

/* 

Output:

Luke
Mia
Matthew

1
2
3
4
5

*/