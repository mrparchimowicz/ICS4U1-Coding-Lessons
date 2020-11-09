package A_Setters;

public class TestStudents {
	public static void main(String[] args) {
		Student s1 = new Student("Joe",16, 'm', 11, 70,80,90,100); 		
		Student s2 = new Student("Amy",16, 'f', 11, 70,80,90,100);
		//System.out.println(s2.name); // This returns an error since TestStudents cannot access the private variable name within the Students class
		//System.out.println(s1.name); // This prints Joe
		System.out.println(s1.getName()); // This prints Amy
		System.out.println(s2.getName()); // This prints Joe
	}
}
