/* Additive Persistence

Have the function AdditivePersistence(num) take the num parameter being passed which will always be a positive integer and 
return its additive persistence which is the number of times you must add the digits in num until you reach a single digit. 
For example: if num is 2718 then your program should return 2 because 2 + 7 + 1 + 8 = 18 and 1 + 8 = 9 and you stop at 9.   */

import java.util.*; 
import java.io.*;

class Main {

  public static int AdditivePersistence(int num) {
    // code goes here  
     String num1 = String.valueOf(num);                                                 // 1. convert num to string.
    int count = 0;                                                                      // 2. initial number of times multiply the digits in num shall be "zero".
    while (num1.length() > 1) {                                                         // 3. initiate while loop with condition if there is more than a single digit in num
        int sum = 0;                                                                    // 4. Initial value for sum of all character in num1 shall be "zero"
        for (int i = 0; i < num1.length(); i++) {
            sum += Integer.parseInt(Character.toString(num1.charAt(i)));                /* 5. Loop through each character(digits) of num1 and update sum by adding the digits from given num1 
                                                                                              until we reach a single digit for sum. 
            }                                                                                 System.out.println(num1) //  18;      
                                                                                                                            9;
                                                                                                                            2 */
        num1 = String.valueOf(sum);                                                     // 6. Convert back string to number value.

        count++;                                                                        // 7. Update count(return the last returned digit)  and return.
        }

    return count;
     }

public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(AdditivePersistence(s.nextLine())); 
  }

}
