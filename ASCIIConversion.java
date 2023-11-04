/*ASCII Conversion
Have the function ASCIIConversion(str) take the str parameter being passed and return a new string where every character, aside from the space character, is replaced with its corresponding decimal character code. 
For example: if str is "dog" then your program should return the string 100111103 because d = 100, o = 111, g = 103.

Examples
Input: "hello world"
Output: 104101108108111 119111114108100
Input: "abc **"
Output: 979899 4242

Tags
string manipulation regular expression back-end mobile Android iOS  */

import java.util.*; 
import java.io.*;

class Main {

  public static String ASCIIConversion(String str) {
    StringBuilder str1 = new StringBuilder();                      // 1. Use StingBuilder() method to create a mutable string: str1 to hold characters.
    for (char ch: str.toCharArray()) {                             // 2. Loop through each every character of given string to check its corresponding decimal character code.
      if (ch !=  ' ')                                               // 3. If character is found, add its corresponding decimal character code to str1. != ' ' must be single quotation mark.
        str1.append((int) ch );                                    
      else
        str1.append(ch);                                          // 4. Otherwise it will be a whitespace and also add it to str1.
    }
    return str1.toString();                                       // 5. Convert str1 to String and return.
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ASCIIConversion(s.nextLine())); 
  }

}
