/*easy
Bitwise One
Have the function BitwiseOne(strArr) take the array of strings stored in strArr, which will only contain two strings of equal length that represent binary numbers, 
and return a final binary string that performed the bitwise OR operation on both strings. 
A bitwise OR operation places a 0 in the new string where there are zeroes in both binary strings, otherwise it places a 1 in that spot. 
For example: if strArr is ["1001", "0100"] then your program should return the string "1101"
Examples
Input: new String[] {"100", "000"}
Output: 100
Input: new String[] {"00011", "01010"}
Output: 01011
Tags
array searching bitwise operation */

import java.util.*; 
import java.io.*;

class Main {

  public static String BitwiseOne(String[] strArr) {
    // code goes here 
    
   StringBuilder result = new StringBuilder();                                  // 1.Initial state of result shall be empty string. Use StringBuilder method .
   for (int i = 0 ; i < strArr[0].length(); i++){
            if ( strArr[0].charAt(i) == '0' && strArr[1].charAt(i) == '0') {    /* 2.Loop through each and every character of given strArr to check a character is 0 or 1
                                                                                     in the strArr[0] and strArr[1]. */
                result.append('0');                                             // 3. If it is a 0, then add it to stack.
            } else {
                result.append('1');                                             // 4. Otherwiseit will be 1 and add it to stack.
            }     
      }                          
         return result.toString();                                              // 5. Rejoin back to str and return the result.
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(BitwiseOne(s.nextLine())); 
  }

}
