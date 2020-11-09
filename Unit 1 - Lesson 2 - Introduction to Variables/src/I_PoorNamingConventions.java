/* <----- Click this to Expand for Instructions
 * 
 * Exercise 2.9 - POOR NAMING CONVENTIONS
 * 
 * Naming variables according to convention leads to clear, readable, and maintainable code. 
 * When someone else, or our future self, reads the code, there is no confusion about the purpose of a variable.
 * 
 * While both would compile, which variable name do you think is better?
 * 
 * String data = "Mr. Parchimowicz";
 * 
 * OR
 * 
 * String nameOfUser = "Mr. Parchimowicz";
 * 
 * It gets worse - some variable names are so confusing that Java simply cannot run.
 * 
 * Try to run the code, and note which variable(s) are causing problems. Rename them according to the proper convention.
 * 
 * Then for each variable, fix its variable declaration so that it is of the correct type.
 * 
 */

public class I_PoorNamingConventions {
	public static void main(String[] args) {
				
		// good variable naming convention
		boolean isHuman = false;
		// bad variable naming convention (Note that these all compile as well and don't produce errors)
		boolean ishuman = false; // no capitalization for new word
		boolean IsHuman = false; // first word should be lowercase
		boolean is_human = false; // underscores don't separate words

		
		String 1stName = "Jimmy";
		String blah = "Smith";
		String .com = "sjimmy@google.com";
		int salaryexpectation = 100000;
		int year_of_birth = 1995;
    
		System.out.println("The program runs!");
	}
}