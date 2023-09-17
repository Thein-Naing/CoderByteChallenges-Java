/* Time Convert

Have the function TimeConvert(num) take the num parameter being passed and return the number of hours and minutes the parameter converts to 
(ie. if num = 63 then the output should be 1:3). Separate the number of hours and minutes with a colon.  */

import java.util.*; 
import java.io.*;

class Main {

  public static String TimeConvert(int num) {        // 1. change int variable to String variable since we want to use Integer.toString method .
   // code goes here  
    String  Hour = Integer.toString(num / 60);       // 2. use Integer.toString method to convert int to str for converted Hour integer.
    String  Minute = Integer.toString(num % 60);     // 3. same pocedure as step 2 for converted Minute integer.
 
     return Hour + ":" + Minute;                     // 4. return Hour and Minute with ":" colon sign.
  } 

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(TimeConvert(s.nextLine())); 
  }

}
