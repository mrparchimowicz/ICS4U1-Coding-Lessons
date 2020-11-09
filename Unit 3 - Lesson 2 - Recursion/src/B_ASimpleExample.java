/*<----- Click this to Expand for Instructions
 * 
 * Exercise 3.2.2 - A SIMPLE EXAMPLE
 * 
 * Looking at recursion through a programming lens, it is in essence, creating a method or function 
 * that is self-referential. In other words, we have a method, public static void myMethod(), which 
 * contains the method call myMethod(), somewhere within the body of its code (sometimes multiple
 * times...)
 * 
 * Here is a simple example of such a method - try to logically think through the code. In order to 
 * do this, you can "trace" through the code as follows:
 * 
 * 		call printThisNumber(5) -> prints 5
 * 			call printThisNumber(4) -> print 4
 * 
 * Note that the method contains a 'stop condition' (if i > 0). If this were not included, our code
 * would never terminate and would run forever...
 * 
 */

public class B_ASimpleExample {
	public static void main(String[] args) {
		printThisNumber(5);
	}
	public static void printThisNumber(int i) {
		if (i > 0) {
			System.out.println(i);
			printThisNumber(i-1);
		}
	}
}
