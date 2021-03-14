import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CloudJump {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps = 0; // number of jumps taken to complete 
        int nextCloud = 1; // index of the next cloud;

        for( int i = 0; nextCloud < c.length; nextCloud = i+1){
            // check to see if the following cloud after next Cloud is also safe and not doesnt extend further than array set index = nextCloud +1
            if( c[nextCloud] == 0 && (nextCloud + 1 < c.length)){
                i = c[nextCloud + 1] != 0 ? nextCloud : nextCloud + 1;
            // if just nextCloud is safe set index  = nextCloud
            }else if (c[nextCloud] == 0){
                i = nextCloud;
            }else{ // if the nextCloud is not safe set index = nextCloud + 1;
                i = nextCloud + 1;
            }
            jumps ++;
        }
        return jumps;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
            
        }
        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
