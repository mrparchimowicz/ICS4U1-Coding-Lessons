package C_ConstructingNumerousStudents;

public class TestStudents {
	public static void main(String[] args) {
		Student[] ICS4U1ClassList = new Student[5];
		String[] names = {"Bob", "Joe", "Amy", "Sam", "Will"};
		char[] genders = {'m','m','f','f','m'};
				
		for(int i = 0; i < 5; i++) {
			ICS4U1ClassList[i] = new Student(names[i],17,genders[i],12,0,0,0,0); 
		}
		System.out.println(ICS4U1ClassList[0].name);
		System.out.println(ICS4U1ClassList[1].name);
		System.out.println(ICS4U1ClassList[2].name);
		System.out.println(ICS4U1ClassList[3].name);
		System.out.println(ICS4U1ClassList[4].name);

	}
}
