class Tester {
    
    public static boolean checkPasswordValidity(String password) {
		// Implement your code here and change the return value accordingly
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%&*_])(?=\\S+$).{8,20}$";
		if (password.matches(regex)){
			return true;
		} else {
			return false;
		}
	}
    
    public static void main(String[] args) {
        
        //Change the value of password for testing your code with different passwords
        String password = "P@$sW0rd";
        System.out.println("The password is "+ (checkPasswordValidity(password) ? "valid!" : "invalid!"));
    }
    
}
