/*<----- Click this to Expand for Instructions
 * 
 * Exercise 3.1.1 - ARRAY LISTS
 * 
 * Thus far, Arrays have been regarded as "Static" objects... that is, they have been declared with a fixed size, and until they 
 * were re-declared, that size was fixed, unchangeable, and lead to OutOfBounds Exceptions.
 * 
 * It would be convenient if we would initialize an Array, and then "Append" or add items to the end, without going outside the 
 * bounds of the array... This is precisely what an ArrayList allows us to do.
 * 
 * An ArrayList is a re-sizable array, also called 'Dynamic Array'. It adapts its size to accommodate new elements and shrinks 
 * its size when some elements are removed.
 * 
 * ArrayLists internally use an array to store the elements. Just like arrays, you can retrieve elements from an ArrayList
 * by accessing the appropriate index. ArrayList also allows duplicate and null values, which is convenient.
 * 
 * Unlike a typical Array however, an ArrayList is an _ordered_ collection. It maintains the insertion order of the elements. An
 * important note, is that with ArrayLists, we _cannot_ use primitive variables like int, char etc. We would need to use 'boxed' 
 * types like Integer, Character, Boolean etc.
 * 
 * In order to use ArrayLists, we must import the ArrayList and List classes of the java.util library. See the below code for a 
 * basic example.
 */

import java.util.ArrayList;
import java.util.List;

public class A_ArrayLists {

	public static void main(String[] args) {
		// Creating an ArrayList of String
		List<String> animals = new ArrayList<>();
		List<String> names = new ArrayList<>();

		// Adding new elements to the ArrayList
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Cat");
		animals.add("Dog");

		System.out.println(animals);

		// Adding an element at a particular index in an ArrayList
		animals.add(2, "Elephant");

		System.out.println(animals);

	}
}