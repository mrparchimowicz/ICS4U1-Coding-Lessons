/* <----- Click this to Expand for Instructions
 * 
 * Exercise 5.1 - METHOD CALLS
 * 
 * Recall that a Method can be thought of as a bundle of code wrapped together that executes together. So far we have only used the main() 
 * method, which is the default method that is called when a java file runs.
 * 
 * In order to create a new method, we use a similar syntax to the main method:
 * 
 * 		public static void myMethod(int myInteger); 
 * 
 * where myMethod is the name I'm choosing to give the method (it should be descriptive, what does your method accomplish? e.g. average)
 * and "int x" is telling the method that it is expecting to receive information about an integer called "myInteger" (should also be 
 * descriptive)
 * 
 * We will revisit Exercise 4.1 (A_UserInput.java) and have the program execute the exact same way, but use a method call. Recall 4.1's code:
 * 
 * ==========EXERCISE 4.1==========
 * 
 * import java.util.Scanner;  // Import the Scanner class
 * class A_UserInput {
 * 		public static void main(String[] args) {
 * 		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
 * 		System.out.println("Enter username");
 *
 *	    String userName = myObj.nextLine();  // Read user input
 *		System.out.println("Username is: " + userName);  // Output user input
 *	 }
 * }
 * ================================
 * 
 * 1) We have defined a new method called UserInput(). It does not need any input (yet...)
 * 
 * 2) We copied the exact same code from Exercise 4.1 and put it inside the method
 * 
 * 3) Within main() (remember, this is the default method that java runs), we must "call" the UserInput() method.
 * 
 * Note that we must still import Scanner as per Exercise 4.1, and where we have done so. Pay special attention to _where_ all of the code 
 * is placed.
 * 
 * The reason we may wish to do this is so we have some call over how often the method is called, what information it's given, and when.
 * 
 */

import java.util.Scanner;  // Import the Scanner class

public class A_MethodCalls {
	public static void main(String[] args) {
		UserInput();		// Calls the UserInput() method, passing no additional information
	}

public static void UserInput() {	//The UserInput() code executes only when called as it is not in the main() method. Note however, that 
									//	it is still within the A_MethodCalls class.
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}