/* <----- Click this to Expand for Instructions
 * 
 * Exercise 4.1 - USER INPUT
 * 
 * So far, we’ve not allowed the user to have any control over the way a program runs. We will now work with a special class called "Scanner"
 * which we do not have to code from scratch (it is pre-built into Java). This class allows us to extract information the user inputs to the 
 * Console.
 * 
 * 1) First we must "import" the Scanner class. (Line 38)
 * 
 * 2) In order to use a class, we must first create an "object" within that class (we will talk about this more during Object Oriented 
 * Programming). (Line 42)
 * 
 * 3) We must then write code that Reads the user input and stores it in a variable (Line 45)
 * 
 * 4) Then we are free to use this stored information in any way as we did during Lesson 3, manipulating it, outputting it, etc. (Line 46)
 * 
 * Note that the object created in the Scanner class is very particular - in this case we are expecting the user to input a String variable 
 * (their username) and so we use the "myObj.nextLine()" command. This is because myObj is the name of the Scanner object we declared,
 * and nextLine() is a method that deals specifically with Strings. However this will change if we use different data types.
 * 
 * Here is a list of Scanner methods:
 * 
 * nextBoolean()	Reads a boolean value from the user
 * nextByte()		Reads a byte value from the user
 * nextDouble()		Reads a double value from the user
 * nextFloat()		Reads a float value from the user
 * nextInt()		Reads a int value from the user
 * nextLine()		Reads a String value from the user
 * nextLong()		Reads a long value from the user
 * nextShort()		Reads a short value from the user
 * 
 * If we use an incorrect data type, the program will return an error. In line 45 try changing nextLine() to nextInt(). Then change String to int. 
 * Input a string to see what this error might look like.
 * 
 */

import java.util.Scanner;  // Import the Scanner class

class A_UserInput {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}