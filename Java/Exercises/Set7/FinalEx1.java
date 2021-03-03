class Student{
    private final int STIPEND = 100;
    private int studentId;
    private int aggregateMarks;
    
    public double calculateTotalStipend(){
        double finalStipend = 0;
        if (getAggregateMarks() < 85){
            finalStipend = getSTIPEND();
        } else if (getAggregateMarks() < 90){
            finalStipend = getSTIPEND() + 10;
        } else if (getAggregateMarks() < 95){
            finalStipend = getSTIPEND() + 15;
        } else if (getAggregateMarks() <= 100){
            finalStipend = getSTIPEND() + 20;
        }
        return finalStipend;
    }
    
    public int getStudentId(){
        return studentId;
    }
    
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    
    public int getAggregateMarks(){
        return aggregateMarks;
    }
    
    public void setAggregateMarks(int aggregateMarks){
        this.aggregateMarks = aggregateMarks;
    }
    
    public int getSTIPEND(){
        return STIPEND;
    }
}

class Tester {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setStudentId(1212);
		student1.setAggregateMarks(93);

		double totalStipend = student1.calculateTotalStipend();
		System.out.println("The final stipend of " + student1.getStudentId()+" is $" + totalStipend);

		Student student2 = new Student();
		student2.setStudentId(1222);
		student2.setAggregateMarks(84);

		totalStipend = student2.calculateTotalStipend();
		System.out.println("The final stipend of " + student2.getStudentId()+" is $" + totalStipend);
	}

}