import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class BinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main( String[] args){
        int base10 = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<Integer> base2List = new ArrayList<>();// list to store each binary number from base10

        // keep dividing base10 by 2 and store its remainder in arraylist
        while(base10 >= 1){
            base2List.add(base10%2);
            base10 /= 2;
        }

        int consecutiveCount = 0; // stores the highest consective amount of 1's
        int currentCount = 0; // keeps count of the current amount consecutive 1's until theres a 0;

        /** usese arraylist and checks for consecutive 1's and updates varibales respectively */
        for (int i : base2List){
            if(i == 0){
                currentCount = 0;
            }else{
                currentCount++;
            }
            if(currentCount > consecutiveCount){
                consecutiveCount = currentCount;
            }
        }

        System.out.println(consecutiveCount); // returns the highest amount of consective 1's
        scanner.close();

    }
}