/*<----- Click this to Expand for Instructions
 * 
 * Exercise 13.4 - ANSI ESCAPE IN CONSOLE
 * 
 * As promised, I wanted to show how you can print things in Colour in the console in Java Eclipse. This will actually require
 * the installation of a special package for your Java Eclipse, provided by eclipse.org:
 * 
 * https://marketplace.eclipse.org/content/ansi-escape-console
 * 
 * To install this, fine the Install button on the above webpage. Click and drag the install button into your Eclipse Workspace 
 * (left hand side of your eclipse window).
 * 
 * Then confirm and complete the installation. Upon completion of the installation process, RELAUNCH Eclipse (important) and then 
 * run the following code to test if it worked. If it still does not work, confirm that there is an "ANSI ESCAPE" icon in the 
 * top-right corner of your console, and that it is enabled.
 * 
 * To use colour, simply use the listed colour combinations below (or Google some more if you'd like). This will look something like:
 * 
 *     System.out.println("\u001B[46m\u001B[31mThis is printed in red on a Cyan background!\u001B[0m");
 *     
 * Note that you must use \u001B[0m, the reset ANSI code, whenever you wish to return your colour-scheme to the default.
 *     
 * For this example, I saved the ANSI codes as variables, and then called them using their variable names. For instance, the above could also be written as:
 * 
 *     System.out.println(ANSI_RED + ANSI_BG_CYAN + "This is printed in red on a Cyan background!" + ANSI_RESET);
 *     
 * BONUS: Look at how I called on all of the strings in fg and bg. We will think about this more when we discuss Array-Lists...
 * BONUS: Note how I declared variables using the public static final modifier. Public declares a public variable, and static final means the value of the 
 * 		  variable CANNOT be updated... in the case of ANSI Codes this makes sense as they are simply defined out of programmer convenience, and in no way 
 * 		  impacts the code execution.
 *  
 */

public class D_ANSIColouring {

  public static final String ANSI_RESET  = "\u001B[0m";

  public static final String ANSI_BLACK  = "\u001B[30m";
  public static final String ANSI_RED    = "\u001B[31m";
  public static final String ANSI_GREEN  = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE   = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN   = "\u001B[36m";
  public static final String ANSI_WHITE  = "\u001B[37m";

  public static final String ANSI_BRIGHT_BLACK  = "\u001B[90m";
  public static final String ANSI_BRIGHT_RED    = "\u001B[91m";
  public static final String ANSI_BRIGHT_GREEN  = "\u001B[92m";
  public static final String ANSI_BRIGHT_YELLOW = "\u001B[93m";
  public static final String ANSI_BRIGHT_BLUE   = "\u001B[94m";
  public static final String ANSI_BRIGHT_PURPLE = "\u001B[95m";
  public static final String ANSI_BRIGHT_CYAN   = "\u001B[96m";
  public static final String ANSI_BRIGHT_WHITE  = "\u001B[97m";

  public static final String[] FOREGROUNDS = {
    ANSI_BLACK, ANSI_RED, ANSI_GREEN, ANSI_YELLOW,
    ANSI_BLUE, ANSI_PURPLE, ANSI_CYAN, ANSI_WHITE,
    ANSI_BRIGHT_BLACK, ANSI_BRIGHT_RED, ANSI_BRIGHT_GREEN, ANSI_BRIGHT_YELLOW,
    ANSI_BRIGHT_BLUE, ANSI_BRIGHT_PURPLE, ANSI_BRIGHT_CYAN, ANSI_BRIGHT_WHITE 
  };

  public static final String ANSI_BG_BLACK  = "\u001B[40m";
  public static final String ANSI_BG_RED    = "\u001B[41m";
  public static final String ANSI_BG_GREEN  = "\u001B[42m";
  public static final String ANSI_BG_YELLOW = "\u001B[43m";
  public static final String ANSI_BG_BLUE   = "\u001B[44m";
  public static final String ANSI_BG_PURPLE = "\u001B[45m";
  public static final String ANSI_BG_CYAN   = "\u001B[46m";
  public static final String ANSI_BG_WHITE  = "\u001B[47m";

  public static final String ANSI_BRIGHT_BG_BLACK  = "\u001B[100m";
  public static final String ANSI_BRIGHT_BG_RED    = "\u001B[101m";
  public static final String ANSI_BRIGHT_BG_GREEN  = "\u001B[102m";
  public static final String ANSI_BRIGHT_BG_YELLOW = "\u001B[103m";
  public static final String ANSI_BRIGHT_BG_BLUE   = "\u001B[104m";
  public static final String ANSI_BRIGHT_BG_PURPLE = "\u001B[105m";
  public static final String ANSI_BRIGHT_BG_CYAN   = "\u001B[106m";
  public static final String ANSI_BRIGHT_BG_WHITE  = "\u001B[107m";

  public static final String[] BACKGROUNDS = {
    ANSI_BG_BLACK, ANSI_BG_RED, ANSI_BG_GREEN, ANSI_BG_YELLOW,
    ANSI_BG_BLUE, ANSI_BG_PURPLE, ANSI_BG_CYAN, ANSI_BG_WHITE,
    ANSI_BRIGHT_BG_BLACK, ANSI_BRIGHT_BG_RED, ANSI_BRIGHT_BG_GREEN, ANSI_BRIGHT_BG_YELLOW,
    ANSI_BRIGHT_BG_BLUE, ANSI_BRIGHT_BG_PURPLE, ANSI_BRIGHT_BG_CYAN, ANSI_BRIGHT_BG_WHITE };

  public static void main(String[] args) {
    for (String fg : FOREGROUNDS) {
      for (String bg : BACKGROUNDS)
        System.out.print(fg + bg + "  TEST  ");
      System.out.println(ANSI_RESET);
    }

    System.out.println(ANSI_RESET + "\n  Back to default.\n");
  }

}