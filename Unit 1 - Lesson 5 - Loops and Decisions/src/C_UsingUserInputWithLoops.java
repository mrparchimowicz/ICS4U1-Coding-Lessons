/* <----- Click this to Expand for Instructions
 * 
 * Exercise 5.3 - USER INPUT WITH LOOPS
 * 
 * Note that we got rid of our methods Loops() and noLoops() in this exercise - we no longer need to use the long tedious noLoops() code
 * and so we can just put our loop within our main() method.
 * 
 * We will create a program that prompts the user for a number and then prints "the value of i is: + i;" for i up to and including the 
 * user-entered value. If you entered 4 for instance, the output would be the numbers 1, 2, 3 and 4.
 * 
 * 1) Import the Scanner class - as we will need that to grab user input
 * 
 * 2) Prompt the user for a number
 * 
 * 3) Invoke the Scanner's nextInt(); method to collect the next entered Integer and store it in a variable.
 * 
 * 4) Update the condition 'i < 10;' within the loop to reflect what we are trying to do.
 * 
 */

//Import the Scanner here

public class C_UsingUserInputWithLoops {
    
	public static void main(String args[]){
		//Create an object in the Scanner Class
		
		//Prompt the user for a number
		
		//Use Scanner to store the next Integer the user enters in a variable
		

		for(int i = 1; i < 10; i++){ 	//This is our loop - we want it to run however many times the user enters, counting forward by 1
										//We will need to change the 'condition' i < 10;
			
            System.out.println("The value of i is: " + i);
        }
	}
}
