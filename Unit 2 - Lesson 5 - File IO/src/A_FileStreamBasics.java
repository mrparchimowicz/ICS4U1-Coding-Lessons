/*<----- Click this to Expand for Instructions
 * 
 * Exercise 12.1 - FILE STREAM BASICS
 * 
 * We have already explored the four pillars of Computation (recall the "Toaster" analogy). 
 * As a reminder these are:
 * 
 * 1) Input
 * 2) Storage
 * 3) Processing
 * 4) Output
 * 
 * Most of the programs we have written involve all four of these steps! In varying amounts...
 * 
 * However, what if we did not want to define everything within our program itself? In the case of
 * our "Choose your Own Adventure" and "World Map" projects, most of the work was writing to our 
 * array... what if we could share this information between programs? Or more precisely, what if 
 * we could store this information externally, and "load it" into our programs? Turns out, we can!
 * 
 * Recall that we needed to take special care to "Pass" information between our methods and functions.
 * By doing so, we opened a line of communication between the calling method, and the answering 
 * method. We sent any 'parameters' we needed, and in the case of an answering function, it "returned"
 * something.
 * 
 * This is similar to what happens when our program wishes to communicate with an external file. We 
 * need to _ask_ the file for information (called an INPUT STREAM), store / process that information
 * and then at some point, we may with to _send_ information to a file (using an OUTPUT STREAM).
 * 
 * A few commands to get us started:
 * 
 * - import java.io.*; - Imports all of the functions inside of the "io" (InputOutput) library
 * 						 Note that I import them one at a time in this example to illustrate what 
 * 						 is inside the library.
 * - File() - A Java representation of a file (System.in / System.out)
 * - PrintWriter() - Used to write to a file, much like System.out
 * - Scanner() - can read from a file, exactly like reading from System.in (the way we used it 
 *               thus far)
 * - output.close(); - "Closes" the stream, so it is no longer passing information. This is very 
 * important so java stops "looking" for information to pass through the stream in question.
 * 
 * Observe the following program. Run it, it will not work, but take note of the exception type 
 * and name. This is happening because the file we are writing to doesn't exist and must be created 
 * first...
 * 
 * This looks like a job for Exception Handling!
 * 
 */

import java.io.File;
import java.io.PrintWriter;

public class A_FileStreamBasics {

	public static void main(String[] args) {
		File externalTextFile = new File("test.txt");
		
		//Write your name and Age to the file
		PrintWriter output = new PrintWriter(externalTextFile);
		output.println("Mr. Parchimowicz");
		output.println("100,000");
		output.close();
		
	}
	
}
