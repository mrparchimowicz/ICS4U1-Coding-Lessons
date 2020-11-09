package A_NoConstructor;

public class TestStudents {
	public static void main(String[] args) {
		Student s1 = new Student(); // This declares and instantiates s1 as a new Student object
		//s1.name = "Joe"; // This assigns name = "Joe" for the s1 object
		s1.age = 16; // This assigns age = 16 for the s1 object
		s1.grade = 11; // This assigns grade = 11 for the s1 object
		System.out.println(s1.name); // This refers to the name associated with the s1 Student object
		System.out.println(s1.age); // This refers to the age associated with the s1 Student object
		System.out.println(s1.gender);
		System.out.println(s1.grade); // This refers to the grade associated with the s1 Student object
		System.out.println(s1.working);
		System.out.println(s1); // This prints the memory location that s1 is assigned to
		Student s2; // This declares, but does not _instantiate_ the object
		s2 = s1; // This points s1 to s2
		System.out.println(s2); // Note this prints the same memory location that s1.name does
		s2.name = "Amy"; // This updates the value of s2.name (which points to s1.name)
		System.out.println(s2.name); // This prints Amy
		System.out.println(s1.name); // So does this
	}
}
