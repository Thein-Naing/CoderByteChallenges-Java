/* Two Sum

Have the function TwoSum(arr) take the array of integers stored in arr, and determine if any two numbers (excluding the first element) 
in the array can sum up to the first element in the array. For example: if arr is [7, 3, 5, 2, -4, 8, 11],
then there are actually two pairs that sum to the number 7: [5, 2] and [-4, 11]. 
Your program should return all pairs, with the numbers separated by a comma, in the order the first number appears in the array.
Pairs should be separated by a space. So for the example above, your program would return: 5,2 -4,11

If there are no two numbers that sum to the first element in the array, return -1 */

import java.util.*; 
import java.io.*;

class Main {
    public static String TwoSum(int[] arr) {
        String result = "";                                   /*1. create an empty string called result to store results: pair of numbers which are sum up to 
                                                                   first element in given array. initial state of result shall be "zero" */
        for (int i = 1; i < arr.length; i++) {                /* 2. This will be nested loop because we have to check two numbers and compare their sum to firsr element.
                                                                    first, loop through each number in array except first element.*/
            for (int j = i + 1; j < arr.length; j++) {        // 3. continue looping through each other numbers except first element. 
                
                if (arr[i] + arr[j] == arr[0]) {              /* 4. check if sum of these two numbers equal to first element.first element of given array should be
                    result += arr[i] + "," + arr[j] + " ";          arr[0] and if it is true, then add this two elements into stack  with + "," for white spacing. */
                                                                    
                }
            }
        }
      
        if (result.equals(""))                                /* 5. if there are no two numbers that sum to the first element in the array, return -1. */
            return "-1";
            
        return result;                                        //6. then return final result 
    } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(TwoSum(s.nextLine())); 
  }   
  
}
