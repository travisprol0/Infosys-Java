import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Patient {

	private String name;
	private String gender;
	private int age;
	
	public Patient(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name: "+this.name+", Gender: "+this.gender+", Age: "+this.age;
	}
}


class Tester {
    
    public static List<Deque<Patient>> splitQueue(Deque<Patient> patientsQueue) {
	    ArrayList<Deque<Patient>> splitQueues = new ArrayList<Deque<Patient>>();
	    Deque<Patient> seniorQueue = new ArrayDeque<Patient>();
	    Deque<Patient> normalQueue = new ArrayDeque<Patient>();
	    Deque<Patient> tempSeniorQueue = new ArrayDeque<Patient>();
	    Deque<Patient> tempNormalQueue = new ArrayDeque<Patient>();
	    Patient patient;
	    int size = patientsQueue.size();
	    
	    /*
	    Separate by age and put into temporary
	    queues to maintain order later
	    */
	    for (int i = 0; i < size; i++){
	        patient = patientsQueue.pop();
	        if(patient.getAge() >= 60){
	            tempSeniorQueue.push(patient);
	        }
	        else{
	            tempNormalQueue.push(patient);
	        }
	    }
	    
	    /*
	    Pop from temporary queue and push to other
	    queues to maintain the original order of the patients
	    */
	    int seniorQueueSize = tempSeniorQueue.size();
	    int normalQueueSize = tempNormalQueue.size();
	    
	    for (int i = 0; i < seniorQueueSize; i++){
	        seniorQueue.push(tempSeniorQueue.pop());
	        }
	   	for (int i = 0; i < normalQueueSize; i++){
	        normalQueue.push(tempNormalQueue.pop());
	        }
	        
	    // Senior queue goes first   
	    splitQueues.add(seniorQueue);
	    splitQueues.add(normalQueue);
		return splitQueues;
	}

	public static void main(String[] args) {
		
		Patient patient1=new Patient("Jack","Male",25);
		Patient patient2=new Patient("Tom","Male",64);
		Patient patient3=new Patient("Simona","Female",24);

		Deque<Patient> patientsQueue = new ArrayDeque<Patient>();
		patientsQueue.add(patient1);
		patientsQueue.add(patient2);
		patientsQueue.add(patient3);

		List<Deque<Patient>> queuesList = splitQueue(patientsQueue);
		
		int counter=0;
		for (Deque<Patient> queue : queuesList) {
			if(counter==0)
				System.out.println("Patients in the senior queue\n============================");
			else
				System.out.println("Patients in the normal queue\n============================");
			
			for (Patient patient : queue) {
				System.out.println("Name : "+patient.getName());
				System.out.println("Age : "+patient.getAge());
				System.out.println();
			}
			counter++;
		}	
	}
	

}