/* Three Sum

Have the function ThreeSum(arr) take the array of integers stored in arr, and determine if any three distinct numbers (excluding the first element) 
in the array can sum up to the first element in the array.
For example: if arr is [8, 2, 1, 4, 10, 5, -1, -1] then there are actually three sets of triplets that sum to the number 8: [2, 1, 5], [4, 5, -1] and [10, -1, -1].
Your program should return the string true if 3 distinct elements sum to the first element, otherwise your program should return the string false. 
The input array will always contain at least 4 elements. */

import java.util.*; 
import java.io.*;

class Main {  
  public static String ThreeSum(int[] arr) { 
          for ( int i = 1; i < arr.length; i++) {  /* 1. This will be nested loop because we have to check two numbers and compare their sum to firsr element.
                                                   firstly, loop through each number in array except first element.*/
        for ( int j = i + 1; j < arr.length; j++){
            for ( int k = j + 1; k < arr.length; k++) { // 2. continue looping through each other numbers except first element.
                if ( arr[k] + arr[j] + arr[i] == arr[0]) {   // 3. check if sum of these three numbers equal to first element.
                                                          
                    return "true";                    //4. then return "true" String, not boolean.
                }     
            }
        }
    }
    
           return "false";   // 6. otherwise return "false" String , not boolean.
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ThreeSum(s.nextLine())); 
  }   
  
}
