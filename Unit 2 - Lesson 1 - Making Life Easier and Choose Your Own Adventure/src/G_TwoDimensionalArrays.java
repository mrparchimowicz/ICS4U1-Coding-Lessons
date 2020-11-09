/*<----- Click this to Expand for Instructions
 * 
 * Exercise 8.7 - TWO DIMENSIONAL ARRAYS
 * 
 * Recall that an Array is like several variables tied together, and we 
 * define an Array of size n using the following syntax (e.g. for an int):
 * 
 * int[] myArray = new int[n];
 * 
 * This looks something like this (supposing n = 4):
 * 
 * [ myArray[0] ] [ myArray[1] ] [ myArray[2] ] [ myArray[3] ]
 * 
 * This is a "1-Dimensional Array" because it resembles a one-dimensional object 
 * (a straight line) in Math class.
 * 
 * We can create a "Matrix" or 2-Dimensional Array with any of the Syntax in the following code.
 * 
 * A 2-Dimensional (n by m) Array resembles the following (assuming n = 4, m = 5):
 * 
 * [ myArray[0][0] ] [ myArray[1][0] ] [ myArray[2][0] ] [ myArray[3][0] ]
 * [ myArray[0][1] ] [ myArray[1][1] ] [ myArray[2][1] ] [ myArray[3][1] ]
 * [ myArray[0][2] ] [ myArray[1][2] ] [ myArray[2][2] ] [ myArray[3][2] ]
 * [ myArray[0][3] ] [ myArray[1][3] ] [ myArray[2][3] ] [ myArray[3][3] ]
 * [ myArray[0][4] ] [ myArray[1][4] ] [ myArray[2][4] ] [ myArray[3][4] ]
 * 
 * Each array element has an associated ordered pair (think of coordinates in Math 
 * class). We can then recall the information stored in a given element by invoking 
 * the name of the Array element at location (i,j), myArray[i][j].
 * 
 * This extends naturally to three, four, etc. dimensional arrays, but in practice 
 * these are rarely used unless you have a particular reason for doing so 
 * (e.g. studying higher dimensional math)
 *  
 *  Note that we need to be careful when determining the 'length' of a 2-D Array. 
 *  While this does make sense to do, it is a bit counter intuitive. Study the code 
 *  below carefully, and note how I display all of the array elements in the console.
 *  
 */


public class G_TwoDimensionalArrays {
	public static void main(String[] args) {
		int[][] myArray1 = new int[4][5]; //This declares the 1st 2-D Array and its size, but does not populate it with values
		int[][] myArray2; //This declares the 2nd 2-D Array, but not its size
		myArray2 = new int[4][5]; //This declares the size of the 2nd 2-D Array, but does not populate it with values
		int[][] myArray3 = new int[][] { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}, {17,18,19,20} }; //This declares the 3rd 2-D Array, its size, and populates it with specific values in one step 
		int[][] myArray4 = new int[][] { {1,2,3,4},      //Exactly the same as myArray3, but easier to visualize
										 {5,6,7,8}, 
										 {9,10,11,12}, 
										 {13,14,15,16}, 
										 {17,18,19,20} }; 
				
		int numRows = myArray4.length, numColumns = myArray3[0].length;
		System.out.println("The number of Rows in myArray4 is: " + numRows + "\n" + "The number of Columns in myArray4 is: " + numColumns + "\n");
		
		for(int i = 0; i< numRows; i++) {
			for(int j = 0; j < numColumns; j++) {
				System.out.print("[" + myArray4[i][j] + "] ");
			}
			System.out.print("\n");
		}
		
	}			
}
