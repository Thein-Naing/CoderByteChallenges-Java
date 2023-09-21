/* Vowel Count
Have the function VowelCount(str) take the str string parameter being passed and return the number of vowels the string contains 
(ie. "All cows eat grass and moo" would return 8). Do not count y as a vowel for this challenge.
Examples
Input: "hello"
Output: 2
Input: "coderbyte"
Output: 3

Tags
string manipulation searching regular expression */

import java.util.*; 
import java.io.*;

class Main {

  public static int VowelCount(String str) {

    // code goes here  
    
    // 1 . use str.replaceAll method with regex and then findd the length.
    /* 2. [^ ] === used to specify a nonmatching list where we are trying to match 
                   any character except for the ones in the list. */
    /* 3. meaning: Hey regex!, find the charactrers which are not match with a,e,i,o,u and replace with nothing.*/

     return str.replaceAll("[^a,e,i,o,u]", "").length(); 
     
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(VowelCount(s.nextLine())); 
  }

}
