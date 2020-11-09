/*<----- Click this to Expand for Instructions
 * 
 * Exercise 11.4 - CUSTOM EXCEPTIONS
 * 
 * NOTE: We will discuss this in more detail when we discuss Object Oriented Programming (OOP), 
 * so I will only provide a bare-bones explanation of that part for now. 
 * 
 * Up until now, we have only used one "class" (typically, something like 
 * "public class D_CustomExceptions"). All of our methods were typically written inside of that 
 * class and if they weren't, Java would complain and throw an error.
 * 
 * It may be the case that we want to have a separate "class" that can be invoked, or called, by
 * our main class. Please open IntegerOutOfRangeException if you haven't already and have a look 
 * at the comments in there.
 * 
 * In order to 'group' these two classes together, I must put them in a package - this is where
 * "CustomExceptions" comes into play. These two files are 'grouped' and I can invoke each class
 * at will. Note how I must include package CustomExceptions; in my code, to ensure Java recognizes
 * all of the .class files within the package.
 * 
 * Note how I have defined IntegerOutofRangeException, an "Extension" of the 
 * Exception class... it does not even have any code in it, because I don't need it to yet! (That
 * comes later...)
 * 
 * Observe the code below:
 * 
 * If a non-Integer is input, the InputMismatchException is caught, as in the prior example.
 * 
 * If an input greater than 10 or less than 1 is entered, we manually 'throw' an Exception, 
 * IntegerOutOfRangeException, which we have defined as an Extension of the Exception class.
 * 
 * Two final notes: 
 * 
 * - note that if you throw an exception, you jump directly from the try to the catch section 
 * corresponding to the exception. Specifically, we do not print "You entered a valid Integer
 * between 1 and 10" unless we do not throw the Integer out of Range Exception, or 
 * InputMismatchException.
 * 
 * - We can use multiple catch statements to catch multiple different exceptions within the same 
 * try-catch-finally statement!
 * 
 */

package CustomExceptions;
import java.util.Scanner;
import java.util.InputMismatchException;

public class D_CustomExceptions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer between 1 and 10:");
		try {
			int userInput = scan.nextInt();
			if (userInput < 1 || userInput > 10) {
				throw new IntegerOutOfRangeException(); // Note that this kicks the program out into the "Catch" statement
			}
			System.out.println("You entered a valid Integer between 1 and 10.");
		} catch (InputMismatchException e) {
			System.out.println("You did not enter an Integer.");
		} catch (IntegerOutOfRangeException e) {
			System.out.println("Your input value is not in the specified range.");
		}
	}
}
