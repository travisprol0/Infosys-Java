class Main {

    public static boolean checkPalindrome(int number){
      int i = number, rev = 0;
      while(i != 0){ 
        int digit = i % 10; 
        rev = rev * 10 + digit;
        i = i/10; 
      }
  
      if (number == rev){
        return true;
      } else {
        return false;
      }
    }
  
    public static void main(String[] args) {
      System.out.println(checkPalindrome(9889));
    }
  }