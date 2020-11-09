/* <----- Click this to Expand for Instructions
 * 
 * Exercise 7.2 - FUNCTION CALLS
 * 
 * If we wanted to store populatesArray's hard work in myArray for main() to use, we need to pass the information to and from populatesArray. For this reason,
 * we use a FUNCTION call. A Function is like a Method except it 'returns' a value to wherever it was called.
 * 
 * The code executes as follows:
 * 
 * 1) main() is called by the compiler and runs first. It defines an Array of size 10 called myArray (Line 29). 
 * 
 * 2) It then passes myArray to populatesArray using the syntax populatesArray(myArray); (line 30)
 * 
 * 3) populatesArray is expecting an integer Array called myArray (line 37). Note that 'void' has been changed to 'int[]', this is because the function will 
 *    eventually pass an integer Array back to main(). We could have also used String, or boolean if that was what information it would send back.
 * 
 * 4) populatesArray then stores the numbers 0-9 in myArray (lines 39 - 42). Note that we did not need to re-define myArray within populatesArray as we did in 7.1.
 * 
 * 5) populatesArray 'returns' myArray (line 42) and main() resumes on line 30. The results returned by populatesArray are stored in myArray (myArray = ...)
 * 
 * 6) myArray is printed to the console using a For loop (lines 31 - 34).
 * 
 */

public class B_FunctionCalls {

	public static void main(String[] args) 
	{
		int[] myArray = new int[10];
		myArray = populatesArray(myArray);
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(myArray[i]);
		}
	}
	
	public static int[] populatesArray(int[] myArray) 
	{
		for (int i = 0; i < 10; i++) 
		{
			myArray[i] = i;
		}
		return myArray;
	}
}
