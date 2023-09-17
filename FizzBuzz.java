/* FizzBuzz

Have the function FizzBuzz(num) take the num parameter being passed and return all the numbers from 1 to num separated by spaces, 
but replace every number that is divisible by 3 with the word "Fizz", replace every number that is divisible by 5 with the word "Buzz",
and every number that is divisible by both 3 and 5 with the word "FizzBuzz". For example:
if num is 16, then your program should return the string "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16". 
The input will be within the range 1 - 50. */

import java.util.*; 
import java.io.*;

class Main {
public static String FizzBuzz(int num) {

     String result = "";  // 1. define a String called result and initial state of result shall be "zero"
    for(int i = 1; i <= num; i++) { //2.  //2. loop through i where i started from 1 and ended at num.
      if(i % (3 * 5 ) == 0) {   // 3. if remainder of i divided by both 3 and 5 are equal to "zero", then return "FizzBuzz".
        result += "FizzBuzz";
      }
      else if(i % 3 == 0) {    // 4. if remainder of i divided by 3 is equal to "zero", then return "Fizz".
        result += "Fizz";
      }
      else if(i % 5 == 0) {   // 5. if remainder of i dividev by 5 is equal to "zero", then return "Buzz".
        result += "Buzz";
      }
      else {
        result += i + "";   // 6. if none of the above is matched, then  return i with "".
      }
    }
    return result;    //7. then return result.
  }
     
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FizzBuzz(s.nextLine())); 
  }

}
