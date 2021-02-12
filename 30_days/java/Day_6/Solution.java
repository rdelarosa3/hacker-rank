import java.io.*;
import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int testCases = scanner.nextInt();
        while (testCases > 0) {
            String input = scanner.next();
            String evens = "";
            String odds = "";
            for (int i = 0; i < input.length(); i++) {
                if(i%2 == 0){
                    evens = evens + input.charAt(i);
                }else{
                    odds = odds + input.charAt(i);
                }
            }
            String result = evens + " " + odds;
            System.out.println(result);
            testCases--;
        }   
    }
}