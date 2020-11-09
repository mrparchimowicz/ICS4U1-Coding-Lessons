/*<----- Click this to Expand for Instructions
 * 
 * Exercise 11.1 - TRY CATCH FINALLY STATEMENTS
 * 
 * An 'Error' (from a program perspective) is any action that the programs takes for which 
 * it must stop operating (because it is not equipped to deal with the error). Errors could 
 * occur due to Programmer Error (i.e. "bugs" or unwanted side effects which cause the 
 * program to halt) or User Error (Bad Input or Action, for instance typing a word instead of
 * an integer, hereby crashing your program).
 * 
 * Often times we can be clever as programmers and design our program in such a way that it 
 * is equipped to deal with bad user input. This is not always possible, and sometimes we need
 * to provide the program with "options" to perform if an error occurs. In other words, 
 * sometimes we want to detect and handle errors within the code itself.
 * 
 * In Java, when an Error is detected, we say "an 'Exception' is thrown." Exceptions can be "caught"
 * and handled by using a "Try-Catch" statement. This is often cleaner, and much more efficient, than
 * trying to code numerous situations, for example, what does my program do if they enter a char? 
 * What if it's a string? What if it's an integer, but outside of the acceptable range (division by 
 * zero, etc)? We would then need to check these errors and ensure they function properly.
 * 
 * The syntax looks like this:
 * 
 * try {
 * 	// Some code
 * } catch (Exception e) {
 *  // Code that runs if Exception e occurs
 * } finally {
 * 	// Code that runs after the Try/Catch
 * }
 * 
 * The above code is useful whenever your code has a chance for error, depending on user input etc.
 * You "handle" the exception in order to prevent your program from "terminating". Note however that
 * if your error is due to programmer error and not user error (e.g. your array runs out of bounds)
 * you should probably fix the problem directly instead of using a try-catch!
 * 
 * 1) Run the following code as is, calling noExcepHandling. Try entering a string (it is, naturally,
 * 	  expecting an Integer). Take note of the name of the error (InputMismatchException).
 * 2) Call excepHandling() instead. Note the try-catch-finally structure, and how we needed to 
 * 	  import InputMismatchException from the java.util library. Then we can use it in the 'catch'
 *    statement.
 *    
 * This will be very helpful!
 * 
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class A_TryCatchFinallyStatements {

	public static void main(String[] args) {
		noExcepHandling();
		//excepHandling();
	}
	public static void noExcepHandling() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an Integer.");
		int userInteger = scan.nextInt();
		System.out.println("You entered " + userInteger);
		System.out.println("We didn't handle the exception...this line never prints ):");
	}
	public static void excepHandling() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an Integer.");
		try {
			int userInteger = scan.nextInt();
			System.out.println("You entered " + userInteger);
		} catch (InputMismatchException e){
			System.out.println("You didn't enter an integer.");
		} finally {
			System.out.println("We handled the exception!");
		
		}
	}
}
