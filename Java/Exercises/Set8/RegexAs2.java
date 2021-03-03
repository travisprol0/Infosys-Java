class Tester {

    public static boolean checkWebAddressValidity(String webAddress) {
		String regex = "^(https?)://(www.|)[\\w]*.(com|org|net)$";
		if (webAddress.matches(regex)){
			return true;
		} else {
			return false;
		}
	}
    
      
    public static void main(String[] args) {
        
        //Change the value of webAddress for testing your code with different web addresses
        String webAddress = "http://www.company.com";
        System.out.println("The web address is "+ (checkWebAddressValidity(webAddress) ? "valid!" : "invalid!"));
    }
}
