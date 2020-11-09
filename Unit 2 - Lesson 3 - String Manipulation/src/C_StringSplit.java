/*<----- Click this to Expand for Instructions
 * 
 * Exercise 10.3 - THE STRING SPLIT() ARRAY
 * 
 * Sometimes we want to use a "Delimiter" as an indication that we want to start or stop searching a string. For instance, in these comments
 * <-- the Asterisk "*" can be used as a delimiter to return where each line begins and ends! That is exactly what we will do in this example.
 * 
 * We can turn a string into an Array of Substrings, each split by a specified character by using:
 * 
 * String[] split(String regex)
 * 
 * or 
 * 
 * String[] split(String regex, int limit) (puts an upper bound on how many items are returned, if we only want to search the first part of a String).
 *  
 * Exercise: Please internalize the following code - this will help us a lot when we return to making our game!
 * 
 */

public class C_StringSplit {

	public static void main(String[] args) {
		String thisComment = "*<----- Click this to Expand for Instructions * * Exercise 10.3 - THE STRING SPLIT() ARRAY * * Sometimes we want to use a \"Delimiter\" as an indication that we want to start or stop searching a string. For instance, in these comments * <-- the Asterisk can be used as a delimiter to return where each line begins and ends! That is exactly what we will do in this example. * * We can turn a string into an Array of Substrings, each split by a specified character by using: * * String[] split(String regex) * * or * * String[] split(String regex, int limit) (puts an upper bound, if we only want to search the first part of a String. * * Exercise: Please internalize the following code - this will help us a lot when we return to making our game! * ";
		System.out.println(thisComment + "/r/n");
		String[] commentLines = thisComment.split("\\*"); //Note that since * is a "protected character" (for multiplication) we need to "escape" this, by putting two backslashes in front of it.
		for (int i = 0; i < commentLines.length; i++) {
			System.out.println(commentLines[i]);
		}
	}
}
