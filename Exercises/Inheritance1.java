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
    
    public void setSalary(int salary){
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
    
    public double calculateMonthlySalary(){
        
        double variableComponent;
        
        if(this.experience >= 10){
            variableComponent = PermanentEmployee.getSalary() * 1.12;
        }
        if(this.experience >= 5){
            variableComponent = PermanentEmployee.getSalary() * 1.07;
        }
        if(this.experience >= 3){
            variableComponent = PermanentEmployee.getSalary() * 1.05;
        }
        
        return this.basicPay + this.hra + variableComponent;
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
   
  //Implement your code here 
  
  //Uncomment the below method after implementation before verifying 
  //DO NOT MODIFY THE METHOD
  /*
  public String toString(){
      return "ContractEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nwage: "+this.getWage()+"\nhoursWorked: "+this.getHoursWorked();
  }
  */
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
