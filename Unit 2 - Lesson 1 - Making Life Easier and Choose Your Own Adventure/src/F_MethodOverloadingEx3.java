/*<----- Click this to Expand for Instructions
 * 
 * Exercise 8.6 - METHOD OVERLOADING EXERCISE 3 - FUNCTION OVERLOADING 2
 * 
 * Create 3 _FUNCTIONS_ which do the following:
 * 
 *	public static void countInstances(int[] myArray, int lookFor) {
 *	// return the number of instances of "lookFor" in myArray	
 *	
 *	public static void countInstances(char[] myArray, char lookFor) {
 *	// return the number of instances of "lookFor" in myArray	
 * 	
 *	public static void countInstances(String[] myArray, String lookFor) {
 *	// return the number of instances of "lookFor" in myArray
 * 
 * Copy and paste your code into the Google Doc for Lesson 8 (please don't submit individual 
 * .java files).
 * 
 */

public class F_MethodOverloadingEx3 {

	public static void main(String[] args) {
		int[] intArray = {4,3,4,4,4,6};
		char[] charArray = {'A','B','C','D','D','E','F'};
		String[] stringArray = {"Me", "Me", "You", "You", "You"};
		countInstances(intArray,4);
		countInstances(charArray,'D');
		countInstances(stringArray,"You");
	}
	
	public static void countInstances(int[] myArray, int lookFor) {
		
	}
	
	public static void countInstances(char[] myArray, char lookFor) {
		
	}
	
	public static void countInstances(String[] myArray, String lookFor) {
		
	}
}