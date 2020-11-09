/* <----- Click this to Expand for Instructions
 * 
 * Exercise 6.2 - ARRAYS - INTRODUCTION - SOLUTION
 * 
 * Note how silly the way I defined the name Array is on line 13. This would also work however.
 * 
 * Be very careful with your indices! (Arrays start from 0 and go to 9 in this case, so make sure your loops work that way as well)
 * 
 */

import java.util.Scanner;

public class B_ArrayIntroductionSampleSolution {
	public static void main(String[] args) {
		String[] name = new String[10];
		//String[] name = {"", "", "", "", "", "", "", "", "", ""};
	    Scanner myObj = new Scanner(System.in);
	    System.out.println("Input 10 names:");
		for(int i = 0; i < 10; i++) {
			System.out.print((i+1) + ")");
			name[i] = myObj.nextLine();
		}
		for(int i = 0; i < 10; i++) {
			System.out.println((i+1) + ")" + name[i]);
		}

	}
}