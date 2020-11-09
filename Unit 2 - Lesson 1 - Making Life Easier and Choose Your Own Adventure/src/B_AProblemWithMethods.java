/*<----- Click this to Expand for Instructions
 * 
 * Exercise 8.2 - A PROBLEM WITH METHODS
 * 
 * Below I have a 'say' function, which can simplify typing System.out.println() 
 * (some of you have been using this all along...).
 * 
 * An issue I noticed several of you having during our first unit was the same error that 
 * occurs when you run the code below.
 * 
 * Please submit your answers to the following questions to Google Classroom (in a single 
 * Google Doc for all of Lesson 8 is fine)
 * 
 * 		A) Explain how the 'say' method works. Why is it convenient to define this? What 
 * 		   other functions have you defined 'out of convenience' in the past?
 *        
 *      B) Why is it yielding this error? How could we fix this? What if I wanted to be 
 *         able to send both Strings and Ints as prompts?
 *      
 * Note that on line 32, "Hello this is an int: " + sampleInt parses as a String, even 
 * though it contains an integer - this means the entire prompt is sent to say as a String.
 * 
 *   
 */ 
 

public class B_AProblemWithMethods {

	public static void main(String[] args) {
		String sampleString = "Hello. This is a string: Hello.";
		int sampleInt = '7';
		
		say(sampleString);
		say("Hello this is an int: " + sampleInt);
		say(sampleInt);
	}
	
	public static void say(String prompt) {
		System.out.println(prompt);
	}
}
