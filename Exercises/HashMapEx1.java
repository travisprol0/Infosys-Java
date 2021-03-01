import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class Student {
	
    public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {
		Map<String, Double> minMax = new HashMap<String, Double>();
		double minScore = 101;
		double maxScore = 0;
		String minStudent = "";
		String maxStudent = "";
		for(Map.Entry<String, Double> studentMark:studentMarks.entrySet()){
		    if(studentMark.getValue() <= minScore){
		        minScore = studentMark.getValue();
		        minStudent = studentMark.getKey()+"="+studentMark.getValue();
		    }
		    if(studentMark.getValue() >= maxScore){
		        maxScore = studentMark.getValue();
		        maxStudent = studentMark.getKey()+"="+studentMark.getValue();
		    }
		}
		System.out.println(minStudent);
		System.out.println(maxStudent);
// 		minMax.put(maxStudent);
// 		minMax.put(minStudent);
		return minMax;
	}

}

class Tester {

	public static void main(String args[]) {
		Map<String, Double> studentMarks = new HashMap<String, Double>();
	    studentMarks.put("Lily", 90.0);
		studentMarks.put("Robin", 68.0);
		studentMarks.put("Marshall", 76.5);
		studentMarks.put("Neil", 67.0);
		studentMarks.put("Ted", 92.0);
		
		Map<String, Double> maxMinScorers = Student.findMaxMinScorers(studentMarks);
		
		System.out.println("Details of Top Scorers & Low Scorers\n====================================");
		for (Entry<String, Double> entry : maxMinScorers.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
	}
}