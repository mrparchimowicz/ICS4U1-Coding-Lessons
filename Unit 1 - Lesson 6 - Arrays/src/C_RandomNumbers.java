/* <----- Click this to Expand for Instructions
 * 
 * Exercise 6.3 - GENERATING RANDOM NUMBERS
 * 
 * In order to generate a random number, we will use the Math Class, and the 'random' method within the Math Class. This method returns a 
 * number that is based on the computer's current 'system clock'. Computers can only be deterministic, and cannot conduct truly random 
 * behaviour, they can only simulate it. (it is not "Truly" random, but is good enough for our purposes). We sometimes call these
 * "pseudorandom" numbers.
 * 
 * 1) This number is a very long decimal between 0 and 1. In order to make this number between a and b, we must multiply by (b - a + 1) 
 *    and add a. 
 * 
 * 2) Then we want to strip off the decimal part so we only have a whole number, and can do this using the "int" operator.
 * 
 * Ask Mr. Parchimowicz if you're confused, it's difficult to convey through text. A visual on the whiteboard will be helpful in explaining 
 * this.
 * 
 * Here is an example of generating a number between 30 and 70. You do not necessarily need to define max, min and range (you can just fill 
 * in the appropriate numbers) but this demonstrates what I am trying to say.
 * 
 */

import java.lang.Math; // We must import the Math class, just like Scanner

public class C_RandomNumbers {
	public static void main(String args[]) 
    { 
        // define the range 
        int max = 70; 
        int min = 30; 
        int range = max - min + 1; 
  
        // generate random numbers within 1 to 10 
        for (int i = 0; i < 10; i++) { 
            int rand = (int)(Math.random() * range) + min; 
  
            // Output is different everytime this code is executed 
            System.out.println(rand); 
        } 
    } 
}
