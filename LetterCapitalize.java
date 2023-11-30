/* Letter Capitalize
easy 
Have the function LetterCapitalize(str) take the str parameter being passed and capitalize the first letter of each word. 
Words will be separated by only one space.
Examples
Input: "hello world"
Output: Hello World
Input: "i ran there"
Output: I Ran There

Tags
string manipulation */

import java.util.*; 
import java.io.*;

class Main {

  public static String LetterCapitalize(String str) {
    // code goes here  
    String[] words = str.split(" ");
    StringBuffer result = new StringBuffer();    // StringBuilder result = new StringBuilder() method also works.

   for (int i = 0; i < words.length; i++) {     
        result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
    }
    return result.toString().trim();
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine())); 
  }

}
