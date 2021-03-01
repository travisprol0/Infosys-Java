package Exercises;

public class String1 {
    public static String moveSpecialCharacters(String str){
        String regex = "[^a-zA-Z0-9]";
        String specialChars = "";
        String letters = "";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (String.valueOf(ch).matches(regex)) {
                specialChars = specialChars + ch;
            } else {
                letters = letters + ch;
            }
        }
        return letters + specialChars;
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}
}