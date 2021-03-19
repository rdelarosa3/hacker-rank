import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        System.out.println(Arrays.toString(q));
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        int bribes = 0;
        boolean chaotic = false;
        for( int i = 0; i< q.length; i++){
            arr1.add(q[i]);
            arr2.add(i+1);
        }
        for( int i = 0; i< q.length; i++){
            if(arr1.get(i)>arr2.get(i)){
                int iBribe = arr2.indexOf(q[i])-i;
                if(iBribe > 3){
                    chaotic = true;
                }else{
                    bribes += iBribe; 
                } 
            }
        }
        System.out.println(chaotic ? "Too chaotic" : bribes);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
