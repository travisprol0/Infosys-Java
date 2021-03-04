class Faculty {
    private String name;
    private float basicSalary;
    private float bonusPercentage;
    private float carAllowancePercentage;

    public Faculty(String name, float basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
        bonusPercentage = 4f;
        carAllowancePercentage = 2.5f;

    }

    public double calculateSalary() {
        double salary = (double) ((1f + this.getBonusPercentage() / 100f + this.getCarAllowancePercentage() / 100f)
                * this.getBasicSalary());
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(float bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public float getCarAllowancePercentage() {
        return carAllowancePercentage;
    }

    public void setCarAllowancePercentage(float carAllowancePercentage) {
        this.carAllowancePercentage = carAllowancePercentage;
    }

}

class OfficeStaff extends Faculty {
    private String designation;

    public OfficeStaff(String name, float basicSalary, String designation) {
        super(name, basicSalary);
        this.designation = designation;
    }

    @Override
    public double calculateSalary() {
        double salary = (double) ((1f + this.getBonusPercentage() / 100f + this.getCarAllowancePercentage() / 100f)
                * this.getBasicSalary());
        switch (designation) {
        case "Accountant":
            return (double) salary + 10000.0;
        case "Clerk":
            return (double) salary + 7000.0;
        case "Peon":
            return (double) salary + 4500.0;
        default:
            return (double) salary;
        }
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

}

class Teacher extends Faculty {
    private String qualification;

    public Teacher(String name, float basicSalary, String qualification) {
        super(name, basicSalary);
        this.qualification = qualification;
    }

    @Override
    public double calculateSalary() {
        System.out.println(qualification);
        double salary = super.calculateSalary();
        switch (qualification) {
        case "Doctoral":
            return (double) salary + 20000.0;
        case "Masters":
            return (double) salary + 18000.0;
        case "Bachelors":
            return (double) salary + 15500.0;
        case "Associate":
            return (double) salary + 10000.0;
        default:
            return (double) salary;
        }
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

}



class Tester {
    public static void main(String[] args) {
        
        Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
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
