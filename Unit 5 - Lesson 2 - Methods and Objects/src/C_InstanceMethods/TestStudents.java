package C_InstanceMethods;

public class TestStudents {
	public static void main(String[] args) {
		Student s1 = new Student("Joe",16, 'm', 11, 70,80,90,100); 		
		Student s2 = new Student("Amy",16, 'f', 11, 70,80,90,100);
		s1.setGrade(12);
		int joeGrade = s1.getGrade();
		System.out.println(joeGrade);
	}
}
