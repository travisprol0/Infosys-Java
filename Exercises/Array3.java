package Exercises;

class Array3 {

    public static int[] findLeapYears(int year) {
        int leapYears[] = new int[15];
        for (int i = 0; i < 15; i++) {
            if (year % 100 == 0 && year % 400 != 0) {
                year += 4;
            }
            if (year % 4 != 0) {
                year += (4 - (year % 4));
            }
            if (year % 4 == 0) {
                leapYears[i] = year;
                year += 4;
            }
        }
        return leapYears;
    }

    public static void main(String[] args) {
        int year = 2003;
        int[] leapYears;
        leapYears = findLeapYears(year);
        for (int index = 0; index < leapYears.length; index++) {
            System.out.println(leapYears[index]);
        }
    }
}
