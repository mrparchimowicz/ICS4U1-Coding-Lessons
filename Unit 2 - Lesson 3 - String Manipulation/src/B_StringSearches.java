/*<----- Click this to Expand for Instructions
 * 
 * Exercise 10.2 - STRING SEARCHES
 * 
 * Here are some other String methods for finding characters or substrings within a string. The String class provides accessor methods 
 * that return the position within the string of a specific character or substring: indexOf() and lastIndexOf(). 
 * 
 * The indexOf() methods search forward from the beginning of the string, and the lastIndexOf() methods search backward from the end 
 * of the string. 
 * 
 * IMPORTANT: If a character or substring is not found, indexOf() and lastIndexOf() return -1. This can be very useful to keep in mind 
 * (Think Sentinel Values!)
 * 
 * The String class also provides a search method, contains, that returns true if the string contains a particular character sequence. 
 * Use this method when you only need to know that the string contains a character sequence, but the precise location isn't important. 
 * The following is a list of search methods:
 * ________________________________________________________________________________________________________________________
 * |int indexOf(int ch)                          | - Returns the index of the first occurrence of the specified character. |
 * |---------------------------------------------|-------------------------------------------------------------------------|
 * |int lastIndexOf(int ch)                      | - Returns the index of the last occurrence of the specified character.  |
 * |---------------------------------------------|-------------------------------------------------------------------------|
 * |int indexOf(int ch, int fromIndex)           | - Returns the index of the first occurrence of the specified character, |
 * |											 |		searching forward from the specified index.                        |
 * |---------------------------------------------|-------------------------------------------------------------------------|
 * |int lastIndexOf(int ch, int fromIndex)       | - Returns the index of the last occurrence of the specified character,  |
 * |											 |		searching backward from the specified index.                       |
 * |---------------------------------------------|-------------------------------------------------------------------------|
 * |int indexOf(String str)                      | - Returns the index of the first occurrence of the specified substring. |
 * |---------------------------------------------|-------------------------------------------------------------------------|
 * |int lastIndexOf(String str)                  | - Returns the index of the last occurrence of the specified substring.  |
 * |---------------------------------------------|-------------------------------------------------------------------------|
 * |int indexOf(String str, int fromIndex)       | - Returns the index of the first occurrence of the specified substring, |
 * |											 |  	searching forward from the specified index.                        |
 * |---------------------------------------------|-------------------------------------------------------------------------|
 * |int lastIndexOf(String str, int fromIndex)   | - Returns the index of the last occurrence of the specified substring,  |
 * |											 |		searching backward from the specified index.                       |
 * |---------------------------------------------|-------------------------------------------------------------------------|
 * |boolean contains(CharSequence s)             | - Returns true if the string contains the specified character sequence. |
 * |_____________________________________________|_________________________________________________________________________|
 * 
 * Exercise: Observe the following code and try to understand what it's doing. Add comments to the code in plain english.
 * 
 */

public class B_StringSearches {
	public static void main(String[] args) {
		String myWord = "refridgerator";
		int firstF = myWord.indexOf("f");
		int nextE = myWord.indexOf("e", firstF);
		System.out.println(myWord.substring(firstF,nextE+1));
	}
}
