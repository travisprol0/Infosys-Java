class Tester {

    public static boolean checkNameValidity(String name) {
        String regex = "^(?=.{2,30}$)[A-Z]+[a-zA-Z]*(\\s[A-Z]+[a-zA-Z]*)*";
            if (name.matches(regex)){
               return true;
            }
        return false;
    }
    
    public static void main(String[] args) {
        
        //Change the value of name for testing your code with different names
        String name = "roger federer";
        System.out.println("The name is "+ (checkNameValidity(name) ? "valid!" : "invalid!"));      
    }
}
