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
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    
    public String toString(){
        return "Employee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary();
    }
    
}
class PermanentEmployee extends Employee {
      
    private double basicPay;
    private double hra;
    private float experience;
    
    
    public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
        super(empId, name);
        
        this.setBasicPay(basicPay);
        this.setHra(hra);
        this.setExperience(experience);
    
    }
    
    public void calculateMonthlySalary() {
        double variableComp;
        
        if (experience < 3) {
            variableComp = 0;
        } else if(experience >= 3.0 && experience < 5.0) {
            variableComp = basicPay* 0.05;
        } else if(experience >= 5.0 && experience < 10.0) {
            variableComp = basicPay* 0.07;
        } else {
            variableComp =basicPay * 0.12;
        }
        
        
        salary = basicPay + hra + variableComp;
        
    
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
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    
    public String toString(){
        return "PermanentEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nbasicPay: "+this.getBasicPay()+"\nhra: "+this.getHra()+"\nexperience: "+this.getExperience();
    }
    
}
class ContractEmployee extends Employee {
    
    private double wage;
    private float hoursWorked;
    
    public ContractEmployee(int empId, String name, double wage, float hoursWorked) {
        super(empId, name);
        this.setEmployeeName(name);
        this.setWage(wage);
        this.setHoursWorked(hoursWorked);
        
    }
    
    public void calculateSalary() {
    salary = wage * hoursWorked;
        
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
  
     
   
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    
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