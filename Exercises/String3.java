package Exercises;

public class String3 {
    public static String reverseEachWord(String str) {

        String[] words = str.split(" ");

        String reverseString = "";

        for (String w : words) {
            String reverseWord = "";

            for (int i = w.length() - 1; i >= 0; i--) {
                reverseWord = reverseWord + w.charAt(i);
            }
            reverseString = reverseString + reverseWord + " ";
        }
        return reverseString.substring(0, reverseString.length()-1);

        // return finalString;
    }

    public static void main(String args[]) {
        String str = "All Cows Eat Grass";
        System.out.println(reverseEachWord(str));
    }
}
