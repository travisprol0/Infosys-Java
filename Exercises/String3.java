package Exercises;

public class String3 {
    public static String reverseEachWord(String str) {

        String[] a = str.split(" ");
        System.out.print(a);
        // Implement your code here and change the return value accordingly
        return null;
    }

    public static void main(String args[]) {
        String str = "all cows eat grass";
        System.out.println(reverseEachWord(str));
    }
}
