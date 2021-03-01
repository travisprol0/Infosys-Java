// FOR LOOP

public class Tester {
    public static void man(String[] args){
        long[] restaurantContacts = { 9992346725L, 9992346726L, 9992346727L }
        for (int index = 0; index <restaurantContacts.length; index++) {
            System.out.println(restaurantContacts[index]);
        }
    }
}


// FOR EACH LOOP

for(dataType variable: array) {
    //body of loop
}

public class Tester {
	public static void main(String[] args) {
		long[] restaurantContacts = { 9992346725L, 9992346726L, 9992346727L };
		for (long contactNumber : restaurantContacts) {
			System.out.println(contactNumber);
		}
	}
}
