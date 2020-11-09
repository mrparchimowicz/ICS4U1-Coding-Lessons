package B_Getters;

public class Student {

	// This initializes the variables we will need to specific/characterize/create an object in the Student class

	private String name;
	private int age;
	private char gender;
	private int grade;
	private int mark1;
	private int mark2;
	private int mark3;
	private int mark4;
	
	public Student(String stName, int stAge, char stGender, int stGrade, int stMark1, int stMark2, int stMark3, int stMark4) {
		this.name = stName;
		this.age = stAge;
		this.gender = stGender;
		this.grade = stGrade;
		this.mark1 = stMark1;
		this.mark2 = stMark2;
		this.mark3 = stMark3;
		this.mark4 = stMark4;

	}
	public int getGrade() {
		return this.grade;
	}
	
	public void setGrade(int newGrade) {
		this.grade = newGrade;
	}
	
}
