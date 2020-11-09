/*<----- Click this to Expand for Instructions
 * 
 * Exercise 3.2.1 - WHAT IS RECUSION?
 * 
  * Recursion is the concept that a problem can be broken down into sub-problems that are identical 
 * in nature to the original but smaller.  When designing a solution to the problem. 
 * If we can create an appropriate method that calls itself from within the body of the code, then 
 * we can call said method on simpler input parameters, until eventually we reach an 'obvious' case
 * or in other words, one that is plainly simple to calculate.
 * 
 * - A 'complex' case is one where a simpler recursion call is necessary to calculate the appropriate 
 * 		output
 * - A 'simple' case is one where a simpler recursion call is not necessary, or possible 
 *
 * --------------------------------
 * 
 * Examples of "Everyday" Recursion
 * 
 * To draw a family tree, we start with an individual and draw all direct descendants. You might start by writing
 * the name of the person, and under that name write the names of any children. For each child, you would
 * then write the names of their children, and so on, until you reach the various dead-ends of the tree (i.e.,
 * individuals without children).
 * 
 * This process can be described easily and efficiently using recursion.
 * 
 * To draw the family tree of a person:
 *  	write the name of the person
 * 		if the person had children
 * 			for each child
 * 				draw the family tree of the child
 * 
 * This example illustrates two features typical of recursive algorithms:
 * 
 * 1) The simplest case of the problem can be solved directly, without recursion. 
 * 		In our example, a childless person is the simplest case; after writing their name, that person's family tree 
 * 		is complete.
 * 
 * 2) All other cases are done by writing the name of the current person, and then addressing their
 * children using the same algorithm. These are referred to as the 'complex' case.
 * 
 * There are many examples of this recursive approach to solving problem in real life, although we are often
 * unaware of them at a conscious level. 
 * 
 * In any recursive algorithm, it is crucial that we have a way of stopping the process. This is often
 * called a terminating condition of a recursive algorithm. In our previous example, the terminating condition is
 * when a person has no children.
 * 
 * Exercises: (Check with Mr. Parchimowicz if you're unsure)
 * 
 * 1) The following is a recursive definition of the process of climbing the stairs:
 * 	
 * To climb the stairs():
 * 		if you are at the top
 * 			you are done
 * 		else
 * 			take one step up
 * 			climb the stairs()
 * 
 * 		(a) Identify the simple case in climb the stairs
 * 		(b) Identify the complex case in climb the stairs
 * 
 * 2) Why is the terminating condition so important in a recursive algorithm?
 * 
 * 3) Which of the following can be said to be examples of recursion?
 * 		(a) closing a zipper
 * 		(b) nested Russian wooden dolls
 * 		(c) a reflection of a mirror in a mirror
 * 
 * 4) Rewrite the definition of climb the stairs using a while statement.
 * 
 * 5) Give a recursive description of the process of reading a book.
 *
 * 6) Find another everyday task that can be defined recursively and give the recursive algorithm for it.
 */

public class A_RecursionExplanation {

}
