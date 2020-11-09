/* <----- Click this to Expand for Instructions
 * 
 * Exercise 5.7 - LOGIN SCREEN - SOLUTION
 * 
 * Here is the solution in case you need assistance - give 5.6 an honest effort before looking at this solution.
 * 
 * Note that the login credentials are "ICS4U1" and "login".
 * 
 */

import java.util.Scanner; // Import the Scanner class

public class G_LoginScreenSampleSolution {
	
	public static void main(String args[]) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		boolean correctLogin = false;
		String username = "";
		String password = "";
		String correctUsername = "ICS4U1";
		String correctPassword = "login";
		while (correctLogin == false) {
			System.out.println("Enter Username:");
			username = myObj.nextLine();
			System.out.println("Enter Password");
			password = myObj.nextLine();
			if(username.contentEquals(correctUsername)) { //A "Nested" if-statement because we need to check that both conditions are correct.
				if(password.contentEquals(correctPassword)) {
					correctLogin = true;
				}
			} else {
				System.out.println("Incorrect Login, try again."); 
			} // If correctLogin is not set to true (i.e. if the username and password are not both correct) then the loop repeats.
		}
		System.out.println("Correct Login.");
	}
}

