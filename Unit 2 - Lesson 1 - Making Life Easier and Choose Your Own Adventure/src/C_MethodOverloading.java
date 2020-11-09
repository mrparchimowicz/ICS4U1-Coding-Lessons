/*<----- Click this to Expand for Instructions
 * 
 * Exercise 8.3 - THE TRICK - METHOD OVERLOADING
 * 
 * It turns out that Java is smart enough to recognize different 
 * instances of the same method name as distinct methods. This is 
 * called _METHOD OVERLOADING_ and is extremely useful.
 *  
 * In plain English, this means I can create multiple 'say' methods, 
 * each having different parameters, and Java will sort out which 
 * one works correctly. Observe the below code now works without issue.
 *  
 * Add a response to the following question to your Google Doc for lesson 8.
 *  
 * 		A) Create a new 'say' method that can print 'char' variables to the console.
 *  
 * 		B) Create a new 'say' method that can print String Arrays (String[]) to the 
 * 	   	   console, with each element of the Array printed on its own line. Ensure 
 * 	   	   that it can accept Arrays of all lengths!
 *  
 */  

public class C_MethodOverloading {

	public static void main(String[] args) {
		String sampleString = "Hello. This is a string: Hello.";
		int sampleInt = 7;
		char sampleChar = 'A';
		String[] sampleArray = {"Hello.", "This is an Array.", "say() can even handle me now!"};
		
		say(sampleString);
		say("Hello this is an int: " + sampleInt);
		say(sampleInt);
		//say(sampleChar);
		//say(sampleArray);
	}
	
	public static void say(String prompt) {
		System.out.println(prompt);
	}
	
	public static void say(int prompt) {
		System.out.println(prompt);
	}
}
