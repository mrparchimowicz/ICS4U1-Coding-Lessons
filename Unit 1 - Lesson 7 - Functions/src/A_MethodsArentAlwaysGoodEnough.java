/* <----- Click this to Expand for Instructions
 * 
 * Exercise 7.1 - METHODS AREN'T ALWAYS GOOD ENOUGH
 * 
 * Up until now, we always used Methods with the 'void' quantifier - this means that the method does not return any useful information.
 * 
 * Suppose I wanted to store some code that populates an array in a Method. 
 * 
 * 1) Read the following code, and note what the "populatesArray" function is trying to accomplish. Ask Mr. Parchimowicz to verify if you're unsure.
 * 
 * 2) Note that this is _not_ reflected in the console's output. This is because the populatesArray method does not send any information back to main().
 * 
 * 3) Comment out line 34 and note that there is now an error when you run the code. This is because as far as populatesArray knows, myArray does not exist! 
 *    When the method call populatesArray(); was invoked, main() did not send it any information about myArray since it was defined within main().
 * 
 * 4) Move on to 7.2 to see how we can fix this issue with something called a Function Call.
 * 
 */

public class A_MethodsArentAlwaysGoodEnough {

	public static void main(String[] args) 
	{
		int[] myArray = new int[10];
		populatesArray();
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(myArray[i]);
		}
	}
	
	public static void populatesArray() 
	{
		int[] myArray = new int[10];
		for (int i = 0; i < 10; i++) 
		{
			myArray[i] = i;
		}
	}
}
