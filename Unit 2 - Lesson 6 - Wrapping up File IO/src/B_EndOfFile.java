/*<----- Click this to Expand for Instructions
 * 
 * Exercise 13.2 - END OF FILE (EOF)
 * 
 * In assignment 9, we knew exactly how many maps, and exactly how many lines each map was. Unfortunately, sometimes 
 * we will not know this information beforehand, especially if we depend on the user for input. The idea is to use 
 * a structure like .length for Arrays... however no such thing exists exactly like this for IOStreams. 
 * 
 * Luckily, we know exactly what we are looking for - an 'empty' string, when we try to read the next line! However, 
 * we need to be extra careful here, if we use an if-statement and look for "" in our incoming string, this is bad form 
 * because we may have a blank line in the middle of our document somewhere. We want to be sure this blank string comes
 * at the end of our document.
 * 
 * This can be accomplished using a 'null' string... we can look for stringName = null to accomplish this! 
 * 
 * EXERCISE:
 * 		A) Take a look at the createFile method - this is yet another way we can open an IOStream to an extenal
 * 		   text file. This one uses the File Writer.
 *  
 * 		B) Run the following program, and try to follow the logic and trace what is written to 'testinputfile.txt'.
 * 		   Note that I am only writing two lines to it, but am trying to read three lines from it.
 * 
 * 		C) Rewrite the program so it only prints lines as long as there are lines to be read. You should use a while
 * 		   loop, looking something like:
 * 
 * 					while(line != null){ 
 * 						line = myInput.readLine();
 * 					}
 * 
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class B_EndOfFile {

	public static void main(String[] args) throws IOException {
		createFile();
		FileReader myReader = new FileReader("testinputfile.txt");
		BufferedReader myInput = new BufferedReader(myReader);

		String line1 = myInput.readLine();
		String line2 = myInput.readLine();
		String line3 = myInput.readLine();

		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
	}
	
	public static void createFile() {
		BufferedWriter bw = null;
		try {
			String mycontent = "This String would be written\n" +
					"to the specified File";
			//Specify the file name and path here
			File file = new File("testinputfile.txt");

			/* This logic will make sure that the file 
			 * gets created if it is not present at the
			 * specified location*/
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(mycontent);
			
		} catch (IOException e) {

		}
		finally
		{ 
			try{
				if(bw!=null)
					bw.close();
			}catch(Exception ex){
				System.out.println("Error in closing the BufferedWriter"+ex);
			}
		}
	}
}

