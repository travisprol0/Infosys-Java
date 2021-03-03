class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;

	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Employee\nemployeeId: " + this.getEmployeeId() + "\nemployeeName: " + this.getEmployeeName()
				+ "\nsalary: " + this.getSalary();
	}
	
}

class PermanentEmployee extends Employee {

	private double basicPay;
	private double hra;
	private float experience;

	public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
		super(empId, name);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}

	public void calculateMonthlySalary() {
		float variableComponent = 0.0f;
		if (this.experience < 3.0f) {
			variableComponent = 0.0f * (float)basicPay;
		} else if (this.experience >= 3.0f && this.experience < 5.0f) {
			variableComponent = 0.05f * (float)basicPay;
		} else if (this.experience >= 5.0f && this.experience < 10.0f) {
			variableComponent = 0.07f * (float)basicPay;
		} else if (this.experience >= 10.0f) {
			variableComponent = 0.12f * (float)basicPay;
			
		}
		double salary = ((float)basicPay + (float)hra + (float)variableComponent);
		System.out.println((double)salary);
		System.out.println(variableComponent);
		super.setSalary(salary);
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}
	public String toString() {
		return "Employee\nemployeeId: " + this.getEmployeeId() + "\nemployeeName: " + this.getEmployeeName()
				+ "\nsalary: " + this.getSalary();
	}
}

class ContractEmployee extends Employee {
	private double wage;
	private float hoursWorked;

	public ContractEmployee(int empId, String name, double wage, float hoursWorked) {
		super(empId, name);
		this.wage = wage;
		this.hoursWorked = hoursWorked;
	}
	
	public void calculateSalary() {
		super.setSalary(this.hoursWorked * this.wage);
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public float getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(float hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public String toString() {
		return "Employee\nemployeeId: " + this.getEmployeeId() + "\nemployeeName: " + this.getEmployeeName()
				+ "\nsalary: " + this.getSalary();
	}
}

class Tester {
      
    public static void main(String[] args) {
      
        PermanentEmployee permanentEmployee = new PermanentEmployee(711211, "Rafael", 1850, 115, 3.5f);
        permanentEmployee.calculateMonthlySalary();
        System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+Math.round(permanentEmployee.getSalary()*100)/100.0);
            
        ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
        contractEmployee.calculateSalary();
        System.out.println("Hi "+contractEmployee.getEmployeeName()+", your salary is $"+Math.round(contractEmployee.getSalary()*100)/100.0);
        
        //Create more objects for testing your code
    }
      
}





// WITH GETTERS AND SETTERS


class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    
    public Employee(int employeeId, String employeeName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
    
    public int getEmployeeId(){
        return employeeId;
    }
    
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
    
    public String getEmployeeName(){
        return employeeName;
    }
    
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public String toString(){
        return "Employee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary();
    }
    
}


class PermanentEmployee extends Employee {
      private double basicPay;
      private double hra;
      private float experience;
      
      public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience){
          super(empId, name);
          this.basicPay = basicPay;
          this.hra = hra;
          this.experience = experience;
      }
      
      public void calculateMonthlySalary(){
          if(getExperience() >= 10){
              setSalary(getBasicPay() + getHra() + (getBasicPay() * 1.12));
          }else if(getExperience() >= 5){
              setSalary(getBasicPay() + getHra() + (getBasicPay() * 1.07));
          } else if(getExperience() >= 3){
              setSalary(getBasicPay() + getHra() + (getBasicPay() * 1.05));
          } else {
              setSalary(getBasicPay() + getHra());
          }
      }
      
      public double getBasicPay(){
          return basicPay;
      }
      
      public void setBasicPay(double basicPay){
          this.basicPay = basicPay;
      }
      
      public double getHra(){
          return hra;
      }
      
      public void setHra(double hra){
          this.hra = hra;
      }
      
      public float getExperience(){
          return experience;
      }
      
      public void setExperience(float experience){
          this.experience = experience;
      }
    
    public String toString(){
        return "PermanentEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nbasicPay: "+this.getBasicPay()+"\nhra: "+this.getHra()+"\nexperience: "+this.getExperience();
    }
    
}

class ContractEmployee extends Employee {
    private double wage;
    private float hoursWorked;
    
    public ContractEmployee(int empId, String name, double wage, float hoursWorked){
        super(empId, name);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }
    
    public void calculateSalary(){
        setSalary(getWage() * getHoursWorked());
    }
    
    public double getWage(){
        return wage;
    }
    
    public void setWage(double wage){
        this.wage = wage;
    }
    
    public float getHoursWorked(){
        return hoursWorked;
    }
    
    public void setHoursWorked(){
        this.hoursWorked = hoursWorked;
    }
     

    public String toString(){
        return "ContractEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nwage: "+this.getWage()+"\nhoursWorked: "+this.getHoursWorked();
    }

}

class Tester {
      
    public static void main(String[] args) {
      
        PermanentEmployee permanentEmployee = new PermanentEmployee(711211, "Rafael", 1850, 115, 3.5f);
        permanentEmployee.calculateMonthlySalary();
        System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+Math.round(permanentEmployee.getSalary()*100)/100.0);
            
        ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
        contractEmployee.calculateSalary();
        System.out.println("Hi "+contractEmployee.getEmployeeName()+", your salary is $"+Math.round(contractEmployee.getSalary()*100)/100.0);
        
        //Create more objects for testing your code
    }
      
}
