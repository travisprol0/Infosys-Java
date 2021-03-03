import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

class Tester {
    
	public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo){
		List<Integer> commonList = new ArrayList<Integer>();
		for (int listOneValue : listOne) {
			if (listTwo.contains(listOneValue)) {
					commonList.add(listOneValue);
			}
		}
		return commonList;
	}

	
	public static void main(String arga[]){

		List<Integer> listOne = new LinkedList<Integer>();
		listOne.add(10);
		listOne.add(12);
		listOne.add(21);
		listOne.add(1);
		listOne.add(53);
		
		List<Integer> listTwo = new LinkedList<Integer>();
		listTwo.add(11);
		listTwo.add(21);
		listTwo.add(25);
		listTwo.add(53);
		listTwo.add(47);

		System.out.println(findCommonElements(listOne, listTwo));
	}
}