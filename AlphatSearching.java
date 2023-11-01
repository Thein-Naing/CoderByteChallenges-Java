/* easy
Alphabet Searching
Have the function AlphabetSearching(str) take the str parameter being passed and return the string true
if every single letter of the English alphabet exists in the string, otherwise return the string false.
For example: if str is "zacxyjbbkfgtbhdaielqrm45pnsowtuv" then your program should return the string true
because every character in the alphabet exists in this string even though some characters appear more than once.

Examples
Input: "abcdefghijklmnopqrstuvwxyyyy"
Output: false
Input: "abc123456kmo"
Output: false

Tags
string manipulation searching */

import java.util.*; 
import java.io.*;

class Main {

  public static Boolean AlphabetSearching(String str) {
              
                                                 // 1.  str.toLowerCase().replaceAll("[^a-z]", "") meaning: Eliminate the characters except alphabet letters from the arr.
                                                 // 2.  replaceAll("(.)(?=.*\\1)", "").length() == 26; meaning remove duplicate characters. Then count letters, to be exact 26 nos.* /
                                              
        
   // code goes here       
    return str.toLowerCase().replaceAll("[^a-z]", "").replaceAll("(.)(?=.*\\1)", "").length() == 26; 
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(AlphabetSearching(s.nextLine())); 
  }

}
