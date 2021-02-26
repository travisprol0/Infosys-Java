/* 

A map represents a mapping between a key and a value. It is used to store data similar to a dictionary where lookup is performed based on a key and the respective value is returned.

In the case of Tree House book store, the key can be book name and the value can be shelf number as we would search for a book using the book name and try to find the shelf number of it.

In Java, Map is an interface defined as:

        public interface Map<K,V>

Here, K stands for the key type and V stands for the value type which can be any reference type.

The HashMap class implements the Map interface and can also be used to store key value pairs.

*/ 

HashMap<String, Integer> booksMap = new HashMap<String, Integer>();
Map<String, Integer> booksMap = new HashMap<String, Integer>();



import java.util.Map;
import java.util.HashMap;

class Tester {

	public static void main(String args[]) {
		Map<String, Integer> books = new HashMap<String, Integer>();
		
		//Adding key-value pairs to the map
		books.put("Data Structures With Java", 50);
		books.put("Operating System", 80);
		books.put("Let Us C", 70);
		books.put("Java Fundamentals", 40);
		
		//Displaying all the key-value pairs present in the map
		System.out.println(books);
		
		//Traversing the map
		//entrySet() method is used to retrieve all the key value pairs
		 for(Map.Entry<String, Integer> book:books.entrySet())
		       System.out.println(book.getKey()+", "+book.getValue());  
		 
		 //keySet() method returns the keys in the Map
		 for(String name:books.keySet())
		       System.out.println("key: "+name);  
		       
		 //values() method returns the values in the Map
		 for(int quantity:books.values())
		       System.out.println("value: "+quantity);  
		 
		 //Removing element based on key
		 books.remove("Let Us C");
		 
		 //Removing element based on value
		 //Uncomment the code given below, execute and observe the output
		 //books.remove(70);
		 
		 //Removing element based on key and value
		 //Uncomment the code given below, execute and observe the output
		 //books.remove("Let Us C", 70);
		 
		 System.out.println(books);
		 
		 //Replacing key-value pair in the map
		 books.replace("Operating System", 80, 100);
		 System.out.println(books);
		 
		 //Getting a value from the map based on key
		 System.out.println(books.get("Java Fundamentals"));
		 
		 //Printing size of the map
		 System.out.println(books.size());
		 
		 //Removing all the key-value pairs from the map
		 books.clear();
		 
		 //Checking if the map is empty
		 System.out.println(books.isEmpty());
	}

}
