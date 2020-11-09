/*<----- Click this to Expand for Instructions
 * 
 * Exercise 11.3 - EXCEPTION HANDLING LOOP EXAMPLE
 * 
 * Here is a simple example of using a do-while loop with our prior example, to repeatedly prompt
 * the user for input, until they input an integer.
 * 
 * Some people believe it is more natural to use 'do-while' loops while Exception Handling, but 
 * this is often just a stylistic preference. I would never deduct marks for using a while, or a 
 * do-while so long as your code is functional.
 * 
 * Note that I needed to put the definition of scanner inside of the do-while loop, so that it 
 * continues to prompt for input every time. Try un-commenting line 30, and comment line 32. If you 
 * type in a word, the loop will execute forever...this is ok, we can terminate our code manually, 
 * by clicking the Red Square at the top-right corner of the console (bottom right corner of the
 * screen typically).
 * 
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class C_TryCatchFinallyLoopEx {

	public static void main(String[] args) {
		//noExcepHandling();
		excepHandling();
	}
	public static void noExcepHandling() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an Integer.");
		int userInteger = scan.nextInt();
		System.out.println("You entered " + userInteger);
		System.out.println("We didn't handle the exception...this line never prints ):");
	}
	
	public static void excepHandling() {
		boolean goodInput = false;
		//Scanner scan = new Scanner(System.in);
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter an Integer.");
			try {
				int userInteger = scan.nextInt();
				System.out.println("You entered " + userInteger);
				goodInput = true;
			} catch (InputMismatchException e){
				System.out.println("You didn't enter an integer.");
			} finally {
				System.out.println("Note that this prints whether the exception occurs or not...");
			}

		} while(goodInput == false);
		System.out.println("We handled the exception!");
	}
}
