/*<----- Click this to Expand for Instructions
 * 
 * Exercise 9.1 - ASCII MAPS
 * 
 * For our Text-based game, we will want to have a graphical representation of our surroundings. 
 * Here is an example of a simple 'crossroads' and a player character (X) standing right at the centre.
 * 
 * Take note of how I stored the map information, line by line, inside of an array and then recalled it 
 * to print to console.
 * 
 * Next we will be dealing with multiple map screens.
 * 
 */

public class A_AsciiMaps {
	public static void main(String[] args) {
		String[] mapRow = new String[13];
		mapRow = getMap(mapRow);
		say(mapRow);
	}

	public static String[] getMap(String[] mapRow){
		mapRow[0] =  ("  ===================  ");
		mapRow[1] =  ("||       |<N>|       ||");
		mapRow[2] =  ("||       |   |       ||");
		mapRow[3] =  ("||       |   |       ||");
		mapRow[4] =  ("||_______|   |_______||");
		mapRow[5] =  ("||                   ||");
		mapRow[6] =  ("||<W>      X      <E>||");
		mapRow[7] =  ("||_______     _______||");
		mapRow[8] =  ("||       |   |       ||");
		mapRow[9] =  ("||       |   |       ||");
		mapRow[10] = ("||       |   |       ||");
		mapRow[11] = ("||       |<S>|       ||");
		mapRow[12] = ("  ===================  ");
		
		return mapRow;
	}

	public static void say(String prompt) {
		System.out.println(prompt);
	}
	public static void say(String[] prompt) {
		for (int i = 0; i < prompt.length; i++){
			System.out.println(prompt[i]);
		}
	}
}
