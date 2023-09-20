/* Palindrome
Have the function Palindrome(str) take the str parameter being passed and return the string true if the parameter is a palindrome,
(the string is the same forward as it is backward) otherwise return the string false. 
For example: "racecar" is also "racecar" backwards. Punctuation and numbers will not be part of the string.

Examples
Input: "never odd or even"
Output: true
Input: "eye"
Output: true

Tags
string manipulation ecursion  */

import java.util.*; 
import java.io.*;

class Main {

    // code goes here  

public static boolean Palindrome(String str) {           // 1. use boolean 


        String str1 = str.replaceAll("\s+", "");         //2. create and use regex ("\s+", "") === remove all white space by replace all with nothing.
        StringBuilder str2 = new StringBuilder(str1);    //3. use StringBuilder method to create str2 and reverse. then you need to convert back using toString() method.

        if( str1.equals(str2.reverse().toString())) {    // 4. if str1 == str2, then return true.
             return true;
        } else {
            return false;                                //5. otherwise return false.
        }
    }

   	
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(Palindrome(s.nextLine())); 
  }

}
