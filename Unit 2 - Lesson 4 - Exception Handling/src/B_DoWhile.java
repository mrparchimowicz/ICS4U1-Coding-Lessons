/*<----- Click this to Expand for Instructions
 * 
 * Exercise 11.2 - DO WHILE LOOPS
 * 
 * Java provides us with an alternative to the "While" Loop, called the 'do-while loop.'
 * 
 * This is almost identical to the while loop, as seen below. The crucial difference is that in
 * the do-while loop, the condition is evaluated at the END of the loop, instead of at the beginning.
 * One implication of this is that EVERY DO-WHILE LOOP EXECUTES AT LEAST ONCE, even if its condition
 * is met to terminate the loop.
 * 
 * The following sample code demonstrates this.
 * 
 * A do-while loop can be surprisingly useful... please keep it in your back pocket!
 * 
 */

public class B_DoWhile {

	public static void main(String[] args) {
		boolean runLoop = false;
		while (runLoop == true) {
			System.out.println("This line is never printed ): because runLoop is false!");
		}
		do {
			System.out.println("Even though runLoop is false, this line still prints once!");
		} while (runLoop == true);
	}
}
