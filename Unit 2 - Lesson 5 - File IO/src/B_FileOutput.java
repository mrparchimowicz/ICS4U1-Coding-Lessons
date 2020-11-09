/*<----- Click this to Expand for Instructions
 * 
 * Exercise 12.2 - FILE OUTPUT
 * 
 * Note the use of a try-catch-finally statement in the code below.
 * 
 * We used a special Exception, called IOException, found within the java.io library. 
 * 
 * The IOException Exception is a special exception that is triggered when Java realizes our file 
 * does not exist. Note that IOException does not actually create the file... it simply keeps Java 
 * from terminating the program! When it keeps running, Eclipse goes ahead and creates the file, 
 * which is then used to read and write to.
 * 
 * EXERCISE - Run the program once. Locate the file B_FileStreamBasics2.txt on your computer.
 * It will be stored in the "Working Directory" of Unit 2 - Lesson 12 - File I/O. Open the file.
 * Take note of what it says. This is shared throughout the entire Project, and is not limited to 
 * a specific class file. To demonstrate this, we will try Reading this same file in the next 
 * exercise.
 * 
 */

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class B_FileOutput {

	public static void main(String[] args) {
		File externalTextFile = new File("B_FileOutput.txt");
		
		//Write your name and Age to the file
		try{
			PrintWriter output = new PrintWriter(externalTextFile);
			output.println("Mr. Parchimowicz");
			output.println("100,000");
			output.close();
		} catch (IOException e) {
		} finally {
		
		}
	}
	
}
