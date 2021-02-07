import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    /**
     Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent 
     (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. 
     Round the result to the nearest integer.
     **/
     // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tax = meal_cost * tax_percent/100;
        double tip = meal_cost * tip_percent/100;
        long total = Math.round(meal_cost + tax + tip);
        System.out.println(total);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
