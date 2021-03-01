class Applicant {
    private String name;
    private String jobProfile;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getJobProfile() {
         return jobProfile;
    }
    public void setJobProfile(String jobProfile) {
        this.jobProfile = jobProfile;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
class Validator{
    public boolean validateName(String name){
        return name != null && !name.trim().isEmpty();
    }
    public boolean validateJobProfile(String jobProfile){
        return jobProfile.toLowerCase().equals("associate") || jobProfile.toLowerCase().equals("clerk") || jobProfile.toLowerCase().equals("executive") || jobProfile.toLowerCase().equals("officer");
    }
    public boolean validateAge(int age){
        return age>=18 && age<=30;
    }
    public void validate(Applicant applicant) throws InvalidNameException, InvalidJobProfileException, InvalidAgeException{
        if(!validateName(applicant.getName())){
            throw new InvalidNameException("Invalid name");
        }
        if(!validateJobProfile(applicant.getJobProfile())){
            throw new InvalidJobProfileException("Invalid job profile");
        }
        if(!validateAge(applicant.getAge())){
            throw new InvalidAgeException("Invalid age");
        }
        return;
    }
}
class InvalidAgeException extends Exception {
    private static final long serialVersionUID = 1L;
    public InvalidAgeException(String message) {
        super(message);
    }
}
class InvalidJobProfileException extends Exception {
    private static final long serialVersionUID = 1L;
    public InvalidJobProfileException(String message) {
        super(message);
    }
}
class InvalidNameException extends Exception {
    private static final long serialVersionUID = 1L;
    public InvalidNameException(String message) {
        super(message);
    }
}
class Tester {
    public static void main(String[] args) {
        try {
            Applicant applicant= new Applicant();
            applicant.setName("Jenny");
            applicant.setJobProfile("Clerk");
            applicant.setAge(25);
            Validator validator = new Validator();
            validator.validate(applicant);
            System.out.println("Application submitted successfully!");
        } 
        catch (InvalidNameException|InvalidJobProfileException|InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}