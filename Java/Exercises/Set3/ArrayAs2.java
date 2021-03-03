package Exercises;

public class Array2 {
    public static double[] findDetails(double[] salary) {

        double sum = 0;
        for (double value : salary) {
            sum += value;
        }
        double average = sum / salary.length;

        double greater = 0.0;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > average) {
                greater += 1.0;
            }
        }

        double lesser = 0.0;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] < average) {
                lesser += 1.0;
            }
        }

        double[] returnArray = new double[3];
        returnArray[0] = average;
        returnArray[1] = greater;
        returnArray[2] = lesser;
        return returnArray;
    }

    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);

        System.out.println("Average salary: " + details[0]);
        System.out.println("Number of salaries greater than the average salary: " + details[1]);
        System.out.println("Number of salaries lesser than the average salary: " + details[2]);
    }
}
