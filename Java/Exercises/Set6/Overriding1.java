class Faculty{
    private String name;
    private float basicSalary;
    private float bonusPercentage;
    private float carAllowancePercentage;
    
    public Faculty(String name, float basicSalary){
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonusPercentage = 4f;
        this.carAllowancePercentage = 2.5f;
    }
    
    public double calculateSalary(){
        return getBasicSalary() + getBasicSalary()*(getBonusPercentage()*0.01) + getBasicSalary()*(getCarAllowancePercentage()*0.01);
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public float getBasicSalary(){
        return basicSalary;
    }
    
    public void setBasicSalary(float basicSalary){
        this.basicSalary = basicSalary;
    }
    
    public float getBonusPercentage(){
        return bonusPercentage;
    }
    
    public void setBonusPercentage(float bonusPercentage){
        this.bonusPercentage = bonusPercentage;
    }
    
    public float getCarAllowancePercentage(){
        return carAllowancePercentage;
    }
    
    public void setCarAllowancePercentage(float carAllowancePercentage){
        this.carAllowancePercentage = carAllowancePercentage;
    }
    
}

class OfficeStaff extends Faculty{
    private String designation;
    
    public OfficeStaff(String name, float basicSalary, String designation){
        super(name, basicSalary);
        this.designation = designation;
    }
    
    @Override
    public double calculateSalary(){
        double totalSalary = getBasicSalary() + getBasicSalary()*(getBonusPercentage()*0.01) + getBasicSalary()*(getCarAllowancePercentage()*0.01);
        if(designation == "Accountant"){
            totalSalary += 10000.0;
        } else if (designation == "Clerk"){
            totalSalary += 7000.0;
        } else if (designation == "Peon"){
            totalSalary += 4500.0;
        } else{
            return (totalSalary*100)/100.0;
        }
       return (totalSalary*100)/100.0;
    }
    
    public String getDesignation(){
        return designation;
    }
    
    public void setDesignation(String designation){
        this.designation = designation;
    }
}

class Teacher extends Faculty{
    private String qualification;
    
    public Teacher(String name, float basicSalary, String qualification){
        super(name, basicSalary);
        this.qualification = qualification;
    }
    
    @Override
    public double calculateSalary(){
        double totalSalary = getBasicSalary() + getBasicSalary()*(getBonusPercentage()*0.01) + getBasicSalary()*(getCarAllowancePercentage()*0.01);
        if(qualification == "Doctoral"){
            totalSalary += 20000.0;
        } else if (qualification == "Masters"){
            totalSalary += 18000.0;
        } else if (qualification == "Bachelors"){
            totalSalary += 15500.0;
        } else if(qualification == "Associate"){
             totalSalary += 10000.0;
        } else{
            return (totalSalary*100)/100.0;
        }
        return (totalSalary*100)/100.0;
    }
    
    public String getQualification(){
        return qualification;
    }
    
    public void setQualification(String qualification){
        this.qualification = qualification;
    }
    
    
}


class Tester {
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher("Travis", 57000f, "Doctoral");
		OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");
		
		System.out.println("Teacher Details\n***************");
		System.out.println("Name: "+teacher.getName());
		System.out.println("Qualification: "+teacher.getQualification());
		System.out.println("Total salary: $" + Math.round(teacher.calculateSalary()*100)/100.0); 
		System.out.println();

		System.out.println("Office Staff Details\n***************");
		System.out.println("Name: "+officeStaff.getName());
		System.out.println("Designation: "+officeStaff.getDesignation());
		System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary()*100)/100.0); 

        //Create more objects for testing your code   

	}
}
