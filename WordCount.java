/* Word Count

Have the function WordCount(str) take the str string parameter being passed and return the number of words the string contains 
(e.g. "Never eat shredded wheat or cake" would return 6). Words will be separated by single spaces. */

import java.util.*; 
import java.io.*;

class Main {

  public static int WordCount(String str) {
    // code goes here  
    
  return str.split("\s").length;                   /* 1. remove white space from  str using str.split method with regex: "\s" === whitespace character. */
   // return input.split("\\s+").length;           /* 2. OR use split("\\s+") which will split the string into string of array with separator as space or multiple spaces.
                                                         "\s+" is a regular expression for one or more spaces. */
    
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(WordCount(s.nextLine())); 
  }

}
