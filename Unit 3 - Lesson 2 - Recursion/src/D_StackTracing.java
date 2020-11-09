/*<----- Click this to Expand for Instructions
 * 
 * Exercise 3.2.3 - STACK TRACING
 * 
 * Note the addition of the second System.out.println(i) to the code below. 
 * 
 * Before running the code, try to predict the output... then run the code.
 * It's very likely that the output does not match what you expect... this is
 * because of the Recursive 'Stack.' We "stack" the methods:
 * 
 * 			printThisNumber(5) is called - Prints 5
 * 				printThisNumber(4) is called - Prints 4
 * 					printThisNumber(3) is called - Prints 3
 * 						printThisNumber(2) is called - Prints 2
 * 							printThisNumber(1) is called - Prints 1
 * 								printThisNumber(0) is called - Prints nothing
 * 							printThisNumber(1) resolves - Prints 1
 * 						printThisNumber(2) resolves - Prints 2
 * 					printThisNumber(3) resolves - Prints 3
 * 				printThisNumber(4) resolves - Prints 4
 * 			printThisNumber(5) resolves - Prints 5
 * 
 * Making a diagram like this, or at least mentally following it in such a way, 
 * is called "tracing" the recursive algorithm. This technique will be very useful
 * when our recursive algorithms get more challenging.
 */
public class D_StackTracing {

	public static void main(String[] args) {
		printThisNumber(5);
	}
	public static void printThisNumber(int i) {
		if (i > 0) {
			System.out.println(i);
			printThisNumber(i-1);
			System.out.println(i);
		}
	}
}
