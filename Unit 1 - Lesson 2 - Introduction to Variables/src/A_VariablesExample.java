/*<----- Click this to Expand for Instructions
 * 
 * Exercise 2.1 - VARIABLES EXAMPLE
 * 
 * We store information in variables, named locations in memory.
 * 
 * Naming a piece of information allows us to use that name later, accessing the information we stored.
 * 
 * In Java, we specify the type of information we’re storing. Primitive datatypes are types of data built-in to the Java system.
 * 
 * We must declare a variable to reference it within our program. Declaring a variable requires that we specify the _type_ and give the variable a name. 
 * 
 * These are declared within the appropriate method.
 * 
 * Run the code, and note how the different variables look, and how they can be pre-assigned. Pay special attention to piApproximation ("f" in definition) 
 * and salaryRequirement (".0" in output)
 * 
 * Uncomment lines 32 and 42 and try to run the code again. Note the error that occurs. How can we fix this?
 * 
 */

public class A_VariablesExample {
	public static void main(String[] args) {
		 
		 // datatype variableName = preliminary value
		 boolean isEmployed = false; // This declares a variable that has only a "True" or "False" (or 1 or 0) value, which is False by default
		 int age = 30; // This declares a variable but does not give it a value to begin with
		 float piApproximation = 3.14f; // This declares a variable which can support decimals
		 double salaryRequirement = 36214.22; // This declares a variable with a predetermined value of 36,214, with decimal support
		 String myName = "Mr. Parchimowicz"; // This declares a "text" variable called a String, with my name as the default value
		 char letterGrade = 'B';
		 //int incompleteDeclaration;
		 
		 // Outputting each variable to check the values
		 System.out.println(age);
		 System.out.println(isEmployed);
		 System.out.println(age);
		 System.out.println(piApproximation);
		 System.out.println(salaryRequirement);
		 System.out.println(myName);
		 System.out.println(letterGrade);
		 //System.out.println(incompleteDeclaration);
		 
	} // End Main
} // End Class