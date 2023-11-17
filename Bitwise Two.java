/*  Bitwise Two
easy

Have the function BitwiseTwo(strArr) take the array of strings stored in strArr, which will only contain two strings of equal length that represent binary numbers, and return a final binary string that performed the bitwise AND operation on both strings. A bitwise AND operation places a 1 in the new string where there is a 1 in both locations in the binary strings, otherwise it places a 0 in that spot. For example: if strArr is ["10111", "01101"] then your program should return the string "00101"
Examples
Input: new String[] {"100", "000"}
Output: 000
Input: new String[] {"10100", "11100"}
Output: 10100

Tags
array searching bitwise operation */

import java.util.*; 
import java.io.*;

class Main {

  public static String BitwiseTwo(String[] strArr) {
    // code goes here  
   
    String result = "";                                       
    for (int i = 0; i < strArr[0].length(); i++) {           
    if (strArr[0].charAt(i) == '1' && strArr[1].charAt(i) == '1') {
       result  += "1";                                      
        } else {
            result += "0";                                 
        }                                                         
    }
          return result;       
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(BitwiseTwo(s.nextLine())); 
  }

}
