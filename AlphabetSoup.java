/* easy
Alphabet Soup
Have the function AlphabetSoup(str) take the str string parameter being passed and return the string with the letters in alphabetical order (ie. hello becomes ehllo). Assume numbers and punctuation symbols will not be included in the string.
Examples
Input: "coderbyte"
Output: bcdeeorty
Input: "hooplah"
Output: ahhloop

Tags
string manipulation sorting  */


import java.util.*; 
import java.io.*;

class Main {

  public static String AlphabetSoup(String str) {
    // code goes here  
 
         char[] str1 = str.toCharArray();        // 1. Convert given str to char str using str.toCharArray() method.
         Arrays.sort(str1);                      // 2. Sort converted char str.
         return new String(str1);                // 3. Convert char str back to str and  return it.

  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(AlphabetSoup(s.nextLine())); 
  }

}
