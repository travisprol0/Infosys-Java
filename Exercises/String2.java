package Exercises;

public class String2 {
    public static boolean checkPalindrome(String str){

        String newString = "";
        for (int i = 0; i < str.length(); i++){
           newString = newString + str.charAt(i);
        }
        //Implement your code here and change the return value accordingly
        if(newString == str){
            return true;
        } else {
            return false;
        }
	}
	
	public static void main(String args[]){
		String str = "radar";
        System.out.println(checkPalindrome(str));
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}
}
