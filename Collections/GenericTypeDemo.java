class Container<T> {

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}

class Tester {

	public static void main(String[] args) {
		
		Container<Integer> integerContainer = new Container<>();
		integerContainer.set(1);
        //integerContainer.set("Jeo");	//Uncomment the code and check if String can be passed to the set() method
		System.out.println("Inside Integer Container : "+integerContainer.get());
		
		Container<String> stringContainer = new Container<>();
        //stringContainer.set(1);	   //Uncomment the code and check if Integer can be passed to the set() method
		stringContainer.set("Jeo");
		System.out.println("Inside String Container : "+stringContainer.get());
		
	}
	
}

/* 

Output:

Inside Integer Container : 1
Inside String Container :Jeo

*/