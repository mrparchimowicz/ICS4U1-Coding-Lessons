/*<----- Click this to Expand for Instructions
 * 
 * Exercise 3.2.3 - RECURSIVE VS NON-RECURSIVE
 * 
 * Here is a comparison of two different algorithms to find the letter d inside of a string literal, 
 * stored in the variable 'word.'
 * 
 * EXERCISE: Play around with the inputs, "food" to include different possibilities. Add counters to both
 * 			trying your best to understand what both algorithms are doing, how they are similar, and how
 * 			they are different.
 */

public class C_RecursiveVsNonRecursive {
	public static void main(String[] args) {
		System.out.println("Non-Recursively:");
		System.out.println(searchNonRecursive("food"));
		System.out.println("\nRecursively:");
		System.out.println(searchRecursive("food"));
		
	}
	public static boolean searchNonRecursive(String word) {
		for (int x = 0 ; x < word.length () ; x++) {
			if (word.charAt (x) == ('d')){
				return true;
			}//end if
		}//end for
		return false;
	}//end search

	public static boolean searchRecursive(String word){ 
		if (word.charAt (0) == ('d')) {
			// If the first letter is a d then the word has a d in it…
			return true;
		} else if (word.length() == 1) {
			// If this is the last letter and we haven’t found a d yet... there isn’t one.
			return false;
		} else {
			// Search the rest of the word for the letter d! 
			return searchRecursive(word.substring(1));
		}
	}
}
