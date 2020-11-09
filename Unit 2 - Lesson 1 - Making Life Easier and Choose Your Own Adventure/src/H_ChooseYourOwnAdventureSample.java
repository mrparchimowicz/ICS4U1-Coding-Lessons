/*<----- Click this to Expand for Instructions
 * 
 * Exercise 8.8 - "CHOOSE YOUR OWN ADVENTURE" - SAMPLE
 * 
 * Please submit responses to the following to Google Classroom (in a Google Doc is fine)
 * 
 * A) Look over my sample code, run it, and work through the code until you understand it. Then explain what it is doing, "Algorithmically." That is, what is the first thing the program does? The second? Etc.
 * 
 * B) Explain how the 'say' method works. Why is it convenient to define this? What other functions have you defined 'out of convenience' in the past?
 * 
 * C) Despite defining the 'say' function, note that I still used "System.out.println()" in main() when I print roomStart. Change this to 'say' and run the code. What happens? Why am I getting this error, and how can I fix this? 
 * 
 * D) Take note of any inefficiencies in my code and mention them - I actually tried to code this without using only concepts I covered in Unit 1, and purposely inefficiently.
 * 
 * I will be asking you to make your own "Choose Your Own Adventure" as efficiently as you can! You can use _anything_ you already know, whether I covered it or not...
 * 
 * Also note, I did not comment my work at all... I'll be asking you to comment as needed when you make your own!
 * 
 */  


/* * * * * * * * * * * * * * * * * * * * * * * * *
 *                                               *
 * ICS 4U1 - Unit 2 - I/O and Exception Handling *
 *      "Choose Your Own Adventure" Sample 2     *
 *                                               *
 *               Mr. Parchimowicz                *
 *                                               *
 *                 Decision Tree                 *
 *                       A                       *
 *                      / \                      *
 *                     B   C                     *
 *                    / \ / \                    *
 *                   D   E   F                   *
 *                                               *
 * * * * * * * * * * * * * * * * * * * * * * * * */

import java.util.Scanner;

public class H_ChooseYourOwnAdventureSample {

	public static void main(String[] args) {
		char roomStart = 'A';
		while(roomStart != 'Z') {
			roomStart = prompter(roomStart);
			System.out.println(roomStart); // Change 'System.out.println' in this line to 'say' and compile the program. Take note of the error - why do you get this error?
		}
	}

	public static void getRoomText(char roomID) {
		if (roomID == 'A') {	
			say("You enter Room 112.");
			say("Do you:");
			say("A) Take your Seat");
			say("B) Stay Standing");
		} else if (roomID == 'B') {
			say("You take your seat. Your notice that your computer is off.");
			say("Do you:");
			say("A) Turn your computer on");
			say("B) Leave your computer off");
		} else if (roomID == 'C') {
			say("You remain standing. Mr. Parchimowicz looks at you with a confused look on his face.");
			say("Do you:");
			say("A) Take your seat");
			say("B) Leave the classroom");
		} else if (roomID == 'D') {
			say("You are seated at your computer with your computer on and decide to get to work.");
		} else if (roomID == 'E') {
			say("You are seated at your computer with your computer off. You decide you had better turn it on and get to work.");
		} else if (roomID == 'F') {
			say("You leave the classroom. Insert something funny about Mr. Parchimowicz chasing you and slipping on \n a banana peel or some other Mario Kart-esque shenanigans.");
		}
	}
	
	public static char prompter(char roomStart) {
		getRoomText(roomStart);
		Scanner responsePrompter = new Scanner(System.in);
		char roomEnd = 'A';
		String roomDecision = responsePrompter.nextLine();
		if (roomStart == 'A') {
			if(roomDecision.contentEquals("A")) {
				roomEnd = 'B';
			} else if (roomDecision.contentEquals("B")) {
				roomEnd = 'C';
			}
		} else if (roomStart == 'B') {
			if(roomDecision.contentEquals("A")) {
				roomEnd = 'D';
			} else if (roomDecision.contentEquals("B")) {
				roomEnd = 'E';
			}
		} else if (roomStart == 'C') {
			if(roomDecision.contentEquals("A")) {
				roomEnd = 'E';
			} else if (roomDecision.contentEquals("B")) {
				roomEnd = 'F';
			}
		} else if (roomStart == 'D' || roomStart == 'E' || roomStart == 'F') {
			roomStart = 'Z';
		}
		return roomEnd;
	}
	
	public static void say(String prompt) {
		System.out.println(prompt);
	}

}