/*<----- Click this to Expand for Instructions
 * 
 * Exercise 3.1.3 - ACCESSING ARRAYLIST ELEMENTS WITH .GET()
 * 
 * A few helpful methods that allow us to manipulate ArrayLists:
 * 		1) .isEmpty() - returns a boolean value indicating whether or not the ArrayList is empty
 * 		2) .size() - returns an integer value indicating how many elements are stored in the ArrayList
 * 		3) .get() - access a particular element in the ArrayList
 * 		4) .set() - modify a particular element in a particular location in the ArrayList
 * 
 * See the below code for examples of how these can be used.
 */

import java.util.ArrayList;
import java.util.List;

public class C_AccessingElementsFromAnArrayList {
	public static void main(String[] args) {
		List<String> topCompanies = new ArrayList<>();

		// Check if an ArrayList is empty
		System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());

		topCompanies.add("Google");
		topCompanies.add("Apple");
		topCompanies.add("Microsoft");
		topCompanies.add("Amazon");
		topCompanies.add("Facebook");

		// Find the size of an ArrayList
		System.out.println("Here are the top " + topCompanies.size() + " companies in the world");
		System.out.println(topCompanies);

		// Retrieve the element at a given index
		String bestCompany = topCompanies.get(0);
		String secondBestCompany = topCompanies.get(1);
		String lastCompany = topCompanies.get(topCompanies.size() - 1);

		System.out.println("Best Company: " + bestCompany);
		System.out.println("Second Best Company: " + secondBestCompany);
		System.out.println("Last Company in the list: " + lastCompany);

		// Modify the element at a given index
		topCompanies.set(4, "Walmart");
		System.out.println("Modified top companies list: " + topCompanies);
	}
}
