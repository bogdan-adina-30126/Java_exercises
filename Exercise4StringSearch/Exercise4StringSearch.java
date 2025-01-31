package isp.lab2.Exercise4StringSearch;


import java.util.Arrays;
import java.util.Scanner;

public class Exercise4StringSearch {
    /**
     * This method should return an array of strings that contain the substring.
     * @param input
     * @param substring what to search for
     * @return
     */
 public static String[] searchSubstrings(String input, String substring) {  
     String[] splitInput = input.split(",");      
     String[] results = new String[splitInput.length];     
     int k = 0;     
     for(String s: splitInput){     
         if(s.contains(substring))             
             results[k++] = s;        }     
     return Arrays.copyOfRange(results, 0, k);       
 }
 
    public static String readFromConsole(String suffix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + suffix);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String input = "apples,computer,bread,tea,car"; // = readFromConsole("words");
        String substring = "te"; // = readFromConsole("substring");
        String[] result = searchSubstrings(input, substring);
        for (String string : result) {
            System.out.println(string);
        }
    }
}
