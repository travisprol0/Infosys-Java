import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class Tester {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		// Looping ArrayList using listIterator()
		ListIterator<Integer> item = numbers.listIterator();
		System.out.println("Displaying numbers...");
		while (item.hasNext()) {
			System.out.println(item.next());
		}
		System.out.println("Display numbers in the reverse order");
		while (item.hasPrevious()) {
			System.out.println(item.previous());
		}
	}
}
