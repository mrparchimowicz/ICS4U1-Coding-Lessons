/*<----- Click this to Expand for Instructions
 * 
 * Exercise 10.5 - ASSIGNMENT 5 - PALINDROME CHECKER
 * 
 * A "Palindrome" is a word or sentence that can be read the same forwards and backwards. For example:
 * 
 * madam
 * kayak
 * racecar
 * A man, a plan, a canal – Panama
 * On a clover, if alive, erupts a vast, pure evil; a fire volcano.
 * 
 * Using the String Reversal function I've provided below, create a Palindrome checker - that is, have the user 
 * input a string, and return whether or not it is a palindrome.
 * 
 * As a starting point, you may assume the user enters all lowercase text, and with no spaces, periods, commas, semicolons, 
 * colons or hyphens. For instance, the user will enter onacloverifaliveeruptsavastpureevilafirevolcano.
 * 
 * Extension: Remove this requirement. That is, format the string into lowercase and remove all spaces, periods, commas, 
 * semicolons, colons and hyphens, then check if it is a palindrome.
 * 
 */

public class E_Assignment7 {
	public static void main(String[] args) {
		String a = "I'm a Palindrome!";
		System.out.println(reverser(a));
	}
	public static String reverser(String inputString) {
		String reversedString = "";
		for(int i = inputString.length()-1; i >= 0; i--) {
			reversedString = reversedString + inputString.charAt(i);
		}
	return reversedString;
	}
}
