/* <----- Click this to Expand for Instructions
 * 
 * Exercise 5.2 - INTRODUCTION TO LOOPS
 * 
 * Sometimes we will want a piece of code to run a predetermined number of times, or until some condition is satisfied (e.g. the User inputs
 * "Quit" to exit the program). Perhaps we want to run the code 100 times. In order to accomplish this without typing the code out many times
 * (such as in the noLoops(); method), we can employ 'for' loops:
 * 
 *		for(initialization; condition ; increment/decrement)
 *		{
 * 			statements;
 *		}
 * 
 * - 'initialization' is some sort of variable or counter declaration (usually an int). We commonly use 'i' or 'j' as a so-called 
 *   "dummy variable" whose only purpose is to count within the loop
 * - 'condition' is the condition during which we the loop to run (for example, if we want it to run 10 times, we can it to run until our 
 * 	 counter equals 10)
 * - increment/decrement tells us how the counter will behave - will it increase? By 1? By 2? Decrease?
 * - statements; is whatever code we want to execute repeatedly.
 * 
 * See the sample loop code in the Loop method on Lines (44 to 46)
 * 
 * 1) For learning purposes, we used two methods, one with a loop and one without - try un-commenting line (40) and commenting line (39) to 
 *    compare and see that they indeed have the same output. Which code is preferable?
 * 
 * We also introduce a bit of coding shorthand here - the '--' operator. Because we are counting backwards by 1, we can simply type i--, 
 * which represents the code
 *  
 * 		i = i - 1;
 * 
 * This can help compactify code and make it easier to read. Try changing the i-- to i++ in the loop and uncomment the Loops() command in 
 * the main() method.
 * 
 * 2) Note that the output stops at 2... can you change the code to make it stop at 1? At 0? (There are multiple correct solutions) 
 *
 */

public class B_IntroductionToLoops {
    
	public static void main(String args[]){
        Loops();
//		noLoops();
    }
	
	public static void Loops() {
        for(int i = 10; i > 1; i--){ // This is our loop - we want it to run 10 times, counting backwards
            System.out.println("The value of i is: " + i);
        }
	}
	
	public static void noLoops() {
		int myCounter = 10; 
    	System.out.println("The value of i is: " + myCounter);
    	myCounter--;		//This is a shortcut - it represents the myCounter = myCounter - 1; (which can get very tedious to type!)
    	System.out.println("The value of i is: " + myCounter);
    	myCounter--;
    	System.out.println("The value of i is: " + myCounter);
    	myCounter--;
    	System.out.println("The value of i is: " + myCounter);
    	myCounter--;
    	System.out.println("The value of i is: " + myCounter);
    	myCounter--;
    	System.out.println("The value of i is: " + myCounter);
    	myCounter--;
    	System.out.println("The value of i is: " + myCounter);
    	myCounter--;
    	System.out.println("The value of i is: " + myCounter);
    	myCounter--;
    	System.out.println("The value of i is: " + myCounter);
    	myCounter--;
	}
}
