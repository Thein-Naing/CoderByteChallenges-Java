import java.util.*; 
import java.io.*;

class Main {
public static String FizzBuzz(int num) {

     String output = "";  // 1. initial state of output shall be "zero"
    for(int i = 1; i <= num; i++){
      if(i % 3 == 0 && i % 5 == 0){
        output += "FizzBuzz";
      }
      else if(i % 3 == 0){
        output += "Fizz";
      }
      else if(i % 5 == 0){
        output += "Buzz";
      }
      else{
        output += i + "";
      }
     
    }
    return output;
  }
     

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FizzBuzz(s.nextLine())); 
  }

}
