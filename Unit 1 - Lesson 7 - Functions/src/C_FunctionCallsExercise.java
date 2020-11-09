/* <----- Click this to Expand for Instructions
 * 
 * Exercise 7.3 - FUNCTION CALLS EXERCISE
 * 
 * Convert the method "askForYourName" to a function by making the following changes:
 * 
 * 1) What type of information is askForYourName returning? Change 'void' in askForYourName's declaration to the appropriate variable type (line 33).
 * 
 * 2) "Pass" myName to the function on line 28 by putting myName inside the function call brackets.
 * 
 * 3) Tell askForYourName() that it will be receiving the variable by putting String myName inside the brackets on line 33.
 * 
 * 4) Erase the variable declaration of myName within askForYourName on line 36.
 * 
 * 5) Add a "return myName;" line to the end of the askForYourName function. 
 * 
 * 6) Store the results of askForYourName() in a variable (line 28), and output this variable to console (line 30). Use Exercise 7.2 as an example if needed.
 * 
 */

import java.util.Scanner;

public class C_FunctionCallsExercise {

	public static void main(String[] args) 
	{
		String myName = "(myName did not update)";
		askForYourName();
		System.out.println("I am running inside of main().");
		System.out.println("Hello " + myName);
	}
	
	public static void askForYourName() 
	{
		Scanner myObj = new Scanner(System.in);
		String myName = "";
		System.out.println("I am running inside the askForYourName function.");
		System.out.println("What is your name?");
		myName = myObj.nextLine();
	}
}
