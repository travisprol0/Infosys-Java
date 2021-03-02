import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Tester {
    
    public static Map<String, Integer> mergeMaps(Map<String, Integer> mapOne, Map<String, Integer> mapTwo){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.putAll(mapOne);
        //Implement your logic here and change the return statement accordingly
        for (Map.Entry<String, Integer> secondMap : mapTwo.entrySet()){
            if (map.containsKey(secondMap.getKey()) && map.get(secondMap.getKey()) != secondMap.getValue()){
                map.put(secondMap.getKey() + "New", secondMap.getValue());
            }
            else{
                map.put(secondMap.getKey(), secondMap.getValue());
            }
        }
		return map;
	}

	public static void main(String args[]) {
		Map<String, Integer> mapOne = new HashMap<String, Integer>();
		mapOne.put("Kelly", 10);
		mapOne.put("Micheal", 20);
		mapOne.put("Ryan", 30);
		
		Map<String, Integer> mapTwo = new HashMap<String, Integer>();
		mapTwo.put("Jim", 15);
		mapTwo.put("Andy", 45);

		Map<String, Integer> mergedMap = mergeMaps(mapOne, mapTwo);

		System.out.println("Merged Map\n===========");
		for (Entry<String, Integer> entry : mergedMap.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
	
	}
}
