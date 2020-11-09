/*<----- Click this to Expand for Instructions
 * 
 * Exercise 3.1.5 - ARRAYLIST.SORT()
 * 
 * We can also sort ArrayLists by using the ArrayList.sort() method. Here is an example
 * of sorting by "naturalOrder" (i.e. Alphabetical Order)
 * 
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class E_SortingAnArrayList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Jennifer");
        names.add("Mark");
        names.add("David");

        System.out.println("Names : " + names);

        // Following is an even more concise solution
        names.sort(Comparator.naturalOrder());

        System.out.println("Sorted Names : " + names);
    }
}