import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

class Student {

	public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {

		Map<String, Double> scores = new HashMap<String, Double>();
		double lowestScore = 100;
		double highestScore = 0;

		for (Map.Entry<String, Double> studentMark : studentMarks.entrySet()) {
			if (studentMark.getValue() <= lowestScore) {
				lowestScore = studentMark.getValue();
			}
			if (studentMark.getValue() >= highestScore) {
				highestScore = studentMark.getValue();
			}
		}
		for (Map.Entry<String, Double> studentMark : studentMarks.entrySet()) {
			if (studentMark.getValue() == lowestScore) {
				scores.put(studentMark.getKey(), studentMark.getValue());
			} else if (studentMark.getValue() == highestScore) {
				scores.put(studentMark.getKey(), studentMark.getValue());
			}
		}
		return scores;
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
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}

	}
}