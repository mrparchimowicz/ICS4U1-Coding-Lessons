/*<----- Click this to Expand for Instructions
 * 
 * Exercise 8.1 - INITIALIZING VARIABLES - REVISITED
 * 
 * In prior exercises, we only addressed initializing a single variable at a time. 
 * However, we can initialize multiple variables at a time to compactify our code. 
 * See the following code for a few examples. You're encouraged to use these methods 
 * where possible!
 * 
 * Note that in some of these situations it makes more sense to use an Array, and 
 * this is for illustrative purposes only.
 * 
 * Also note the use of "\n" to force the output text to move to the next line. This 
 * is called a "Carriage Return" and is also convenient. We could also build this 
 * into our 'say' function in some way, or perhaps make a 'sayln' function.
 * 
 */

public class A_InitializingVariablesRevisited {

	public static void main(String[] args) {
		String str1 = "String 1", str2 = "String 2", str3 = "String 3";
		String str4, str5, str6;
		str4 = str5 = str6 = "We're all the same";
		say(str1 + "\n" + str2 + "\n" + str3 + "\n" + str4 + "\n" + str5 + "\n" + str6);
	}
	
	public static void say(String prompt) {
		System.out.println(prompt);
	}
}
