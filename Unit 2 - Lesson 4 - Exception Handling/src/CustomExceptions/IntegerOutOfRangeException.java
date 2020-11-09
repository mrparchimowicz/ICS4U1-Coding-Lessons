/*<----- Click this to Expand for Instructions
 * 
 * Exercise 11.4 - CUSTOM EXCEPTIONS
 *
 * Note how I have defined IntegerOutofRangeException, an "Extension" of the 
 * Exception class... hence the use of the "extends" keyword. We will explain the significance
 * of the word "extends" later, in OOP.
 * 
 * This class does not even have any code in it, because I don't need it to yet! (That
 * comes later in OOP.)
 * 
 * By doing this, I have told Java that an "Exception" named IntegerOutOfRangeException exists.
 * For the purposes of this exercise, all I needed to do was give this exception a name... I will
 * then use this exception to "catch" an exception in the main file D_CustomExceptions.class
 * 
 */

package CustomExceptions;

public class IntegerOutOfRangeException extends Exception {

}
