/*<----- Click this to Expand for Instructions
 * 
 * Exercise 13.1 - THE BUFFERED READER
 * 
 * As I mentioned, we will need knowledge of three methods of opening and using Data Streams:
 * 
 * 		1) Scanner (Prior to Lesson 12)
 * 		2) PrintWriter (Lesson 12)
 * 		3) BufferedReader (Lesson 13.1)
 * 		4) BufferedWriter (Lesson 13.2)
 * 
 * Each of the three methods have their own limitations. This exercise serves as a comparison of the Scanner and BufferedReader, and will also illustrate 
 * the syntax. See the following code, run it and note what happens.
 * 
 * Note also how I throw IOException using the method, instead of a try-catch statement (it is exactly the same... but this is short-hand when I am putting 
 * the entire method into the 'try' statement).
 * 
 * Here are some differences between Scanner and Buffer:
 * 			BufferedReader is synchronous while Scanner is not. BufferedReader should be used if we are working with multiple threads.
 * 			BufferedReader has significantly larger buffer memory than Scanner.
 * 			The Scanner has a small buffer (1KB char buffer) as opposed to the BufferedReader (8KB byte buffer), but it’s more than enough.
 * 			IMPORTANT: BufferedReader is faster than scanner because scanner does parsing of input data and BufferedReader simply reads a sequence of characters.
 *
 * EXERCISE: Why doesn't the Scanner ask you for a String when the following code is run? Uncomment line 46 and re-run the code... Why did this work????
 * 			 Note that this issue does not occur with the BufferedReader...
 * 
 */

import java.util.Scanner;
import java.io.*;

class A_BufferedReader {
	// Code using Scanner Class
	public static void main(String[] args) throws IOException {
		System.out.println("Using Buffer:\n");
		UsingBuffer();
		System.out.println("\n\nUsing Scanner: \n");
		UsingScanner();

	}
	
	public static void UsingScanner() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scn.nextInt();
		System.out.println("Enter a String");
		//scn.nextLine();
		String b = scn.nextLine();
		System.out.printf("Your integer was " + a + " and your string was " + b);
	}

	// Code using Buffer Class
	public static void UsingBuffer() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an integer");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter a String");
		String b = br.readLine();
		System.out.printf("Your integer was " + a + " and your string was " + b);
	}
}