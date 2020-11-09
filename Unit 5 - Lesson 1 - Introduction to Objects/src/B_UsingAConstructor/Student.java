package B_UsingAConstructor;

public class Student {

	// This initializes the variables we will need to specific/characterize/create an object in the Student class

	String name;
	int age;
	char gender;
	int grade;
	int mark1;
	int mark2;
	int mark3;
	int mark4;
	
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
}
