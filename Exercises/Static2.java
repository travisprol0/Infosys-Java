package Exercises;

class Participant {
    private static int counter;
    private String registrationId;
    private String name;
    private long contactNumber;
    private String city;

    static {
        counter = 10001;
    }
    
    public Participant(String name, long contactNumber, String city){
        this.name = name;
        this.contactNumber = contactNumber;
        this.city = city;
    }
    
    public String getRegistrationId(){
        registrationId = "D" + Participant.counter++;
        return registrationId;
    }
    public int getCounter(){
        return counter;
    }
    
    public void setCounter(int counter){
        this.counter = counter;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public long getContactNumber(){
        return contactNumber;
    }
    
    public void setContactNumber(long contactNumber){
        this.contactNumber = contactNumber;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setSity(String city){
        this.city = city;
    }
}

class Tester {

	public static void main(String[] args) {
		
		Participant participant1 = new Participant("Franklin", 7656784323L, "Texas");
		Participant participant2 = new Participant("Merina", 7890423112L, "New York");
		Participant participant3 = new Participant("Travis", 8622738078L, "Pompton Plains");
		
		//Create more objects and add them to the participants array for testing your code
		
		Participant[] participants = { participant1, participant2, participant3 };
		
		for (Participant participant : participants) {
			System.out.println("Hi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId());
		}

	}
} 