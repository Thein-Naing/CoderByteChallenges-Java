/* AB Check

Have the function ABCheck(str) take the str parameter being passed and return the string true
if the characters a and b are separated by exactly 3 places anywhere in the string at least once
(ie. "lane borrowed" would result in true because there is exactly three characters between a and b).
Otherwise return the string false. */

  // 1. use str.matches method with regex (".*a.{3}?b.*") and (".*b.{3}?a.*").
  /* 2. Meaning: 
       (i) ".*a.{3}?b.*" means a is 3 places away from b and also ".*b.{3}?a.*" meeans b is 3 places away from a.
       (ii) . DOT represent ANY ONE character and so .{3} = three characters.
       (iii) ? means from  and 
       (iv) *a means matches any string that contains zero or more occurrences of a  and *b means matches any string that contains zero or more occurrences of b.
  // 3. Return it by using Boolean.toString() method with ternary operator for true and false */ 



import java.util.*; 
import java.io.*;

class Main {

  public static String ABCheck(String str) {
    
    // code goes here  
   return Boolean.toString((str.matches(".*a.{3}?b.*")) || (str.matches(".*b.{3}?a.*")));
     
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ABCheck(s.nextLine())); 
  }

}
