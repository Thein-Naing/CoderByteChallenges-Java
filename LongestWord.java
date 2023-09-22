/*    Longest Word

Have the function LongestWord(sen) take the sen parameter being passed and return the longest word in the string.
If there are two or more words that are the same length, return the first word from the string with that length.
Ignore punctuation and assume sen will not be empty. Words may also contain numbers, for example "Hello world123 567"   */

import java.util.*; 
import java.io.*;

    /*  1. use str.replaceAll method with regex and then split the string.
    /* 2. [^ ] === used to specify a nonmatching list where we are trying to match any character except for the ones in the list. 
          here only characters and numbers are in the list.[^a-z0-9\s] */
    /* 3. meaning: Hey regex!, find the characters which are not match with(characters a-z & numbers 0-9) and replace with nothing. 
          then remove white space from sen using str.split method. */
    /* 4. use Arrays.sort method to arrange words in asce order and return words at index 0.  */

class Main {  
  public static String LongestWord(String sen) {  
    String[] words = sen.replaceAll("[^a-z0-9\s]", "").split(" ");    
    Arrays.sort(words, (String a, String b) -> b.length() - a.length());
    return words[0];
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }   
  
}
