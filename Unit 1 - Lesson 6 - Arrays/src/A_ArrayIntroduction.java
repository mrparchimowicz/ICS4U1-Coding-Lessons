/* <----- Click this to Expand for Instructions
 * 
 * Exercise 6.1 - ARRAYS - INTRODUCTION
 * 
 * Sometimes we will need many variables (sometimes even an unknown number of them) to define and store certain pieces of data. For instance,
 * if Mr. Parchimowicz needed to know what every students' Name was, he would have to define many individual variables to 
 * keep track of this.
 * 
 * Instead, we can use an 'Array.' If a variable is a "box" that stores information to be recalled later, an Array is a "box with many 
 * smaller boxes inside. For instance, this could look something like this:
 * 
 * [ Alice ][  Bob  ][Charles][ David ][Eugene ][ Frank ][  Gail ][ Henry ][  Ivy  ]
 *  name[0]  name[1]  name[2]  name[3]  name[4]  name[5]  name[6]  name[7]  name[8]
 * 
 * Important note: The first value in an array is name[0] not name[1]! That means the n'th value is name[n-1].
 * 
 * In order to define an Array, we need to define the appropriate variable type (String, int, etc.) using Square Brackets [],
 * 
 * 		String[] name = {"Alice", "Bob", "Charles", "David", "Eugene", "Frank", "Gail", "Henry", "Ivy"};
 * 
 * or if you don't want to pre-set values but know how many of them there are, we could have used
 * 
 * 		String[] name = new String[10];
 * 
 * These variables could then be invoked by calling them by name. For instance:
 * 
 * 		System.out.println(name[5]);
 * 
 * would output "Frank" to the console. 
 * 
 * Here is a sample of this code in action.
 * 
 * 1) Define an array, and ask the user for 10 Names. 
 * 
 * 2) Output all possible values of the array to the console using a loop.
 * 
 * Helpful Tip:
 * 
 * If you ever need to know the length of an Array called myArray, you can use the function 
 * 
 * myArray.length;
 * 
 * 3) Output the length of the Array using the myArray.length function as above, and verify that the Array's length is 10.
 * 
 */

public class A_ArrayIntroduction {
	public static void main(String[] args) {

	}
}
