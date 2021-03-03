package Exercises;

public class String2 {

    public static boolean checkPalindrome(String str) {
        String reversedString = "";

        for(int i = str.length()-1; i >= 0; i--){
            reversedString += str.charAt(i);
        }
        if (reversedString.equals(str)){
            return true;
        } else {
            return false;
        }

    }

    public static void main(String args[]) {
        String str = "radar";
        if (checkPalindrome(str))
            System.out.println("The string is a palindrome!");
        else
            System.out.println("The string is not a palindrome!");
    }

}