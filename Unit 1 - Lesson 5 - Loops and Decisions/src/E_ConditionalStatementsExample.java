/* <----- Click this to Expand for Instructions
 * 
 * Exercise 5.5 - CONDITIONAL STATEMENTS
 * 
 * Sometimes we need the computer to make a decision - do I have enough marks to earn a credit in this course? What is my letter grade?
 * 
 * In order to accomplish this task, we need the Conditional Statements 'if' 'elseif' and 'else'.
 * 
 * Here is an example of how conditional statements can be used to answer precisely this question.
 * 
 * BONUS - Can you think of a simple way to fix the grammar? If you get an A or F, the output should say "an A" or "an F" but it 
 * says "a A" and "a F."
 * 
 */

import java.util.Scanner; // Import the Scanner class

public class E_ConditionalStatementsExample {
	
	public static void main(String args[]) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("What is your final grade?");
		int userGrade = myObj.nextInt();
		char letterGrade = 'F';
		String passFail = "Passed";
		if(userGrade > 80) {		//80% - 100% is an A
			letterGrade = 'A'; 
		} else if(userGrade > 70) {	//70% - 80% is a B
			letterGrade = 'B';
		} else if(userGrade > 60) {	//60% - 70% is a C
			letterGrade = 'C';
		} else if(userGrade > 50) {	//50% - 60% is a D
			letterGrade = 'D';
		} else { // We technically don't need this since we initialized letterGrade to have a value of F.
			letterGrade = 'F';
		}
		
		if(letterGrade == 'F') {
			passFail = "Failed";
		} else {	// Again we don't technically need this
			passFail = "Passed"; 
		}
		System.out.println("You received a mark of " + userGrade + " and got a " + letterGrade + " which means you " + passFail + ".");
	}
	
}
