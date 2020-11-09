/*<----- Click this to Expand for Instructions
 * 
 * Exercise 9.2 - 2 CONNECTED ASCII MAPS
 * 
 * Now I will demonstrate how we can connect two maps together, and take user Input to indicate our Character's 
 * movement. The map I am working with looks like this:
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
 * The idea is that the user can type "E" to move East, "W" to move west, and N to move North (although I did 
 * not implement North yet.) as well as "quit" to quit.
 * 
 */
import java.util.Scanner;
public class B_2ConnectedMaps {

	public static void main(String[] args) {
		drawBanner();
		Scanner prompter = new Scanner(System.in);
		int roomID = 0;
		boolean redrawMap = true;
		boolean quitting = false;
		String userChoice = "start";
		String[][] mapRow = new String[13][2];
		mapRow = getMaps(mapRow);
		while (quitting == false) {
			if(redrawMap == true){
				say(mapRow, roomID);
				say("What will you do?");
			}
			userChoice = prompter.nextLine();
			if(userChoice.toLowerCase().equals("quit")) {
				quitting = true;
			} else {
				if (userChoice.equals("W")) {
					if(roomID == 1) {
						roomID = 0;
						redrawMap = true;
						say("You move West.");
					} else if(roomID == 0){
						say("You can't go that way.");
						redrawMap = false;
					}
				} else if (userChoice.equals("E")) {
					if(roomID == 0) {
						roomID = 1;
						redrawMap = true;
						say("You move East.");
					} else if(roomID == 1){
						say("You can't go that way.");
						redrawMap = false;
					}
				} else {
					say("You can only go East (\"E\") or West (\"W\").");
					redrawMap = false;
				}
			}
		}
		say("Goodbye.");
	}

	public static String[][] getMaps(String[][] mapRow){
		//Room #0, to the West of room #1
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
		//Room #1, to the East of Room #0
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

	public static void drawBanner() {
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
