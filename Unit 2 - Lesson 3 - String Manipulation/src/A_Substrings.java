/*<----- Click this to Expand for Instructions
 * 
 * Exercise 10.1 - GETTING CHARACTERS AND SUBSTRINGS BY INDEX
 * 
 * We will be (very) briefly putting our game on hold to practice a little bit of STRING MANIPULATION. These are operations 
 * we can do to transform strings, count their length, or otherwise tap into the information that they contain.
 * 
 * The String class has a number of methods for examining the contents of strings, finding characters or substrings within 
 * a string, changing case, and other tasks.
 * 
 * ==============
 *    charAt()
 * ==============
 *
 * You can recover the character at position 'n' in a String by using the chatAt() "accessor" method. Note that the first 
 * character has index 0, and the last has index (length() - 1). Think of a String as an "Array of char's." 
 * 
 * For example, suppose:
 * 
 * String sampleText = "Hello"
 * 
 *   [    H    ][    e    ][    l    ][    l    ][    o    ]
 *    charAt(0)  charAt(1)  charAt(2)  charAt(3)  charAt(4)
 *    
 * So then the syntax:
 * 
 *  System.out.println(sampleText.charAt(3));
 *  
 *  would print the following to the console:
 *  
 *  l
 *  
 * Also note that we can use the length() accessor method as well, so for example, instead of writing charAt(4), we may have 
 * wanted to access the last character in the string, however long it is and could use the syntax:
 * 
 * System.out.println(sampleText.charAt(sampleText.length - 1);
 * 
 * ==============
 * substring(n,m)
 * ==============
 *  
 *  We can recover a 'substring' from the string, by using the substring() accessor method. See the sample code below.
 *  
 *  Also note that if I were to use a substring(n,m) method where m = n + 1, then this is the same as using the charAt() method.
 *  
 *  Exercise: Define a new string and set the string to "Mississippi." Print a substring to the console that contains the substring "sip."
 * 
 */

public class A_Substrings {

	public static void main(String[] args) {
		String sampleText = "Hello there";
		System.out.println(sampleText.substring(6,11));
	}
}
