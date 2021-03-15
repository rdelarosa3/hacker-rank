import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        List<Integer> sums = new ArrayList<>(); // stores sum of each hourglass
        int count = 0;
        while(count < 16){
            for(int i = 0; i <= 3; i++){ 
                for(int j = 0; j <= 3; j++){ // each hourglass is a 3 X 3
                    // sum of the hourglass
                    int sum = 
                        arr[i][j] + arr[i][j+1] + arr[i][j+2] + 
                        arr[i+1][j+1] + 
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]
                    ;
                    // add sum to arraylist
                    sums.add(sum);
                    count++;
                }
            }
        }
        int maxSum = Collections.max(sums);
        return maxSum;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
