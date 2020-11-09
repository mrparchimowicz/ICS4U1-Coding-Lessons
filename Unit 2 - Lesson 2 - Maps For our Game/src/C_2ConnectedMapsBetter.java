/*<----- Click this to Expand for Instructions
 * 
 * Exercise 9.3 - 2 CONNECTED ASCII MAPS - IMPROVED
 * 
 * Your next assignment will be to make a 3 x 3 grid of 'rooms' that you can walk between. Note how in exercise 9.2 
 * I used numerous 'if' statements to accomplish the task of determining what directions you can go - this will get 
 * become exceptionally annoying with additional rooms.
 * 
 * There are multiple ways to address this issue - using "ArrayLists" might be a good choice if you know how to use 
 * them, I will cover them in a lesson soon if you don't. Once we cover Object Oriented Programming, we will also 
 * see that defining "Classes" and "Objects" can greatly simplify this as well. 
 * 
 * A less technical, but still somewhat effective solution using what we already know, is to define several arrays
 * to store key information, such as which directions we can move.
 * 
 * I defined a new 2-D int Array called roomChanges[][], which is a 2 by 4 Array in this case. The 2 rows represent
 * the two rooms, and the 4 columns represent the valid directions (0 = N, 1 = E, 2 = S, 3 = W). if I were to access 
 * the information in roomChanges[0][2] for instance, it means I am in room 0 (the left room) and am trying to move
 * down. This is not possible, and so it will return the new room as the same room (0).
 * 
 * I also defined another 2-D String Array called roomChangeText[][] for the text that goes along with roomChanges[][], 
 * and also a 2-D Boolean Array called roomChangeRedrawMap[][] that stores whether or not I need to redraw the map.
 * 
 * Note 1: This is only one possible way to do this, and is by no means the "best" way.
 *  
 * Note 2: For those who already know Object Oriented, we would be much more efficient to create a class of "Triples" 
 * (destination room, changing room text, and redraw map yes/no) and we can then create objects in this class.
 * 
 * The map remains the same:
 * 
 *       ...                 ...
 *      |   |               |   |
 *      |   |               |   |
 *      |   |               |   |
 *      |   |_______________|   |
 *      |           |           |
 *      |           |           |
 *      |___________|___________|
 *      Room Divider^            
 * 
 * 
 * Try to "Step through" the program and understand how it works.
 * 
 */
import java.util.Scanner;
public class C_2ConnectedMapsBetter {

	public static void main(String[] args) {
		drawBanner();
		Scanner prompter = new Scanner(System.in);
		int roomID = 0; // 0 = Left room, 1 = right room
		boolean redrawMap = true; // Indicates whether the map needs to be redrawn or not
		boolean quitting = false; // Indicates whether the user typed quit
		int directionID = 0; // 0 = N, 1 = E, 2 = S, 3 = W
		String userChoice = "start"; // A string which accepts user input to determine if they input a valid direction
		String[][] mapRow = new String[13][2]; // An array which draws out the maps of each room.
		int[][] roomChanges = new int[2][4]; //first element refers to the roomID, second element refers to N,E,S, or W
		String[][] roomChangeText = new String[2][4]; //first element refers to the roomID, second element refers to N,E,S, or W
		
		mapRow = getMaps(mapRow);
		roomChangeText = getRoomChangeText(roomChangeText);
		roomChanges = getRoomChanges(roomChanges);
		
		while (quitting == false) { // Checks if the user wishes to quit
			if(redrawMap == true){ // If the maps needs to be redrawn, the program does so and prompts the user for input
				say(mapRow, roomID);
				say("What will you do?");
			}
			userChoice = prompter.nextLine(); //Programs seeks userInput
			if(userChoice.toLowerCase().equals("quit")) {
				quitting = true;
			} else if (userChoice.contentEquals("N") || userChoice.contentEquals("E") || userChoice.contentEquals("S") || userChoice.contentEquals("W")) { // User enters an appropriate direction
				directionID = getDirectionID(userChoice);
				say(roomChangeText[roomID][directionID]); // Outputs the appropriate transitional text (from room to room)
				if (roomChanges[roomID][directionID] == roomID) { // Checks whether the map needs to be redrawn - if the starting room and destination room are the same, the map does not need to be redrawn. Otherwise, it does.
					redrawMap = false;
				} else {
					redrawMap = true;
				}
				roomID = roomChanges[roomID][directionID];
			} else { // If the user enters something besides "quit" or a valid direction
				say("I did not understand your input.");
				redrawMap = false;
			}
		}
		say("Goodbye."); // After user types quit, the program ends.
		prompter.close();
	}

	public static String[][] getMaps(String[][] mapRow){ // Populates an Array containing all of the map information
		//Room #1, to the West of room #1
		mapRow[0][0] =  ("  ===================  ");
		mapRow[1][0] =  ("||       |<N>|       ||");
		mapRow[2][0] =  ("||       |   |       ||");
		mapRow[3][0] =  ("||       |   |       ||");
		mapRow[4][0] =  ("||       |   |_______||");
		mapRow[5][0] =  ("||       |           ||");
		mapRow[6][0] =  ("||       | X      <E>||");
		mapRow[7][0] =  ("||       |___________||");
		mapRow[8][0] =  ("||                   ||");
		mapRow[9][0] =  ("||                   ||");
		mapRow[10][0] = ("||                   ||");
		mapRow[11][0] = ("||                   ||");
		mapRow[12][0] = ("  ===================  ");
		//Room #2, to the East of Room #1
		mapRow[0][1] =  ("  ===================  ");
		mapRow[1][1] =  ("||       |<N>|       ||");
		mapRow[2][1] =  ("||       |   |       ||");
		mapRow[3][1] =  ("||       |   |       ||");
		mapRow[4][1] =  ("||_______|   |       ||");
		mapRow[5][1] =  ("||           |       ||");
		mapRow[6][1] =  ("||<W>      X |       ||");
		mapRow[7][1] =  ("||___________|       ||");
		mapRow[8][1] =  ("||                   ||");
		mapRow[9][1] =  ("||                   ||");
		mapRow[10][1] = ("||                   ||");
		mapRow[11][1] = ("||                   ||");
		mapRow[12][1] = ("  ===================  ");
		return mapRow;
	}

	public static int[][] getRoomChanges(int[][] roomChangeText){ // Populates an Array with all the destination rooms
		//Room #0, to the West of room #1
		roomChangeText[0][0] =  0;
		roomChangeText[0][1] =  1; // Moving to the East is allowed, the destination is room 1
		roomChangeText[0][2] =  0;
		roomChangeText[0][3] =  0;
		//Room #1, to the East of room #0
		roomChangeText[1][0] =  1;
		roomChangeText[1][1] =  1; 
		roomChangeText[1][2] =  1;
		roomChangeText[1][3] =  0; // Moving to the East is allowed, the destination is room 0
		return roomChangeText;
	}
	
	public static String[][] getRoomChangeText(String[][] roomChangeText){ // Populates an Array with all the destination rooms
		//Room #0, to the West of room #1
		roomChangeText[0][0] =  "We haven't coded how to move North yet...";
		roomChangeText[0][1] =  "You move East."; // Moving to the East is allowed, the destination is room 1
		roomChangeText[0][2] =  "You can't go that way.";
		roomChangeText[0][3] =  "You can't go that way.";
		//Room #1, to the East of room #0
		roomChangeText[1][0] =  "We haven't coded how to move North yet...";
		roomChangeText[1][1] =  "You can't go that way."; 
		roomChangeText[1][2] =  "You can't go that way.";
		roomChangeText[1][3] =  "You move West."; // Moving to the East is allowed, the destination is room 0
		return roomChangeText;
	}
	
	public static int getDirectionID(String userChoice) { // Returns a direction ID depending on what direction the user inputs.
		int directionID = 0;
		if (userChoice.equals("N")) {
			directionID = 0;
		} else if (userChoice.equals("E")) {
			directionID = 1;
		} else if (userChoice.equals("S")) {
			directionID = 2;
		} else if (userChoice.equals("W")) {
			directionID = 3;
		}
		return directionID;
	}
	
	public static void drawBanner() { // Draws a little banner as an introductory graphic when the game loads
		say(" ================================== ");
		say("|                                  |");
		say("|            ICS 4U1 RPG           |");
		say("|                                  |");
		say(" ================================== ");
		say("                                    ");
		say("                                    ");
	}
	
	public static void say(String prompt) {
		System.out.println(prompt);
	}
	public static void say(String[] prompt) {
		for (int i = 0; i < prompt.length; i++){
			System.out.println(prompt[i]);
		}
	}
	public static void say(String[][] prompt, int column) {
		for (int i = 0; i < prompt.length; i++){
			System.out.println(prompt[i][column]);
		}
	}
}
