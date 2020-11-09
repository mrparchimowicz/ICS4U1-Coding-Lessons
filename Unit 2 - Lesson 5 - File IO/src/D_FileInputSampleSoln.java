/*<----- Click this to Expand for Instructions
 * 
 * Exercise 12.4 - FILE INPUT SAMPLE SOLUTION
 * 
 * The prior exercise dealt with using a file OutputStream, to send information TO a file.
 * 
 * Now we will demonstrate how to retrieve information FROM a file using a file InputStream.
 * 
 * When we declare our scanner, instead of pointing it to "System.in" like normal and waiting
 * for Console Input from the user, we instead point it to the file, B_FileOutput.txt.
 * 
 * We can then use our typical scanner commands, as if the 'file' was typing into the console
 * line by line.
 * 
 * EXERCISE: Try to run the code, and note that there is a FileNotFoundException being thrown.
 * Using a try-catch-finally statement, fix this! Don't forget to import 
 * java.io.WhateverTheErrorNameIs;
 * 
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class D_FileInputSampleSoln {

	public static void main(String[] args) {
		File externalTextFile = new File("B_FileOutput.txt");
		try{ 
			Scanner scan = new Scanner(externalTextFile);
			String name = scan.nextLine();
			int age = scan.nextInt();
			System.out.println("My name is " + name + "\nand I am " + age + " years old.");
		} catch(FileNotFoundException e) {
			
		} finally {
			
		}
	}

}
