/*<----- Click this to Expand for Instructions
 * 
 * Exercise 3.1.4 - REMOVING ELEMENTS FROM AN ARRAYLIST
 * 
 * A few more helpful methods that allow us to manipulate ArrayLists:
 * 		1) .remove(int i) - removes the value of the i'th element of the ArrayList
 * 		2) .remove(Object o) - removes a specified object from the ArrayList
 * 		3) .removeAll() - remove all instances of a specified object from the ArrayList
 * 		4) .removeIf() - remove all elements that match a particular predicate
 * 
 * See the below code for examples of how these can be used.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class D_RemovingElementsFromAnArrayList {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List: " + programmingLanguages);

        // Remove the element at index `5`
        programmingLanguages.remove(5);
        System.out.println("After remove(5): " + programmingLanguages);

        // Remove the first occurrence of the given element from the ArrayList
        // (The remove() method returns false if the element does not exist in the ArrayList)
        programmingLanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\"): " + programmingLanguages);

        // Remove all the elements that exist in a given collection
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages);

        // Remove all the elements that satisfy the given predicate
        programmingLanguages.removeIf(new Predicate<String>() {

        	public boolean test(String s) {
                return s.startsWith("C");
            }
        });

        /*
            The above removeIf() call can also be written using lambda expression like this -
            programmingLanguages.removeIf(s -> s.startsWith("C"))
        */

        System.out.println("After Removing all elements that start with \"C\": " + programmingLanguages);

        // Remove all elements from the ArrayList
        programmingLanguages.clear();
        System.out.println("After clear(): " + programmingLanguages);
    }
}