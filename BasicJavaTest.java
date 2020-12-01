import java.util.ArrayList;
import java.util.Arrays;

public class BasicJavaTest {
    public static void main(String[] args) {
        // Importing BasicJava.java file
        BasicJava go = new BasicJava();
    
        // Print 1-255
        go.Print1To255();

        // Print odd numbers between 1-255
        go.PrintOdds1To255();

        // Print Sum
        go.PrintSum();

        // Iterating through an array
        int[] arr01 = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 0 };
        go.IteratingArray(arr01);

        // Find Max
        int[] arr02 = { 8, 3, 5, 6, 3, 4, 5, 3, 9, 1 };
        int max = go.FindMax(arr02);
        System.out.println("Max = " + max);

        // Get Average
        int[] arr03 = { 8, 3, 5, 6, 3, 4, 5, 3, 9, 1 };
        double avg = go.GetAverage(arr03);
        System.out.println("Average = " + avg);

        // Array with Odd Numbers
        ArrayList<Integer> oddOne = go.ArrayWithOdds();
        System.out.println("oddOne = " + oddOne);

        // Greater Than Y
        int[] arr04 = { 7, 6, 9, 5, 6, 7, 2, 8, 9, 7 };
        int num = 5;
        int gty = go.GreaterThanY(arr04, num);
        System.out.println(gty + " Numbers are greater than " + num);

        // Square the values
        ArrayList<Integer> arr05 = new ArrayList<Integer>( Arrays.asList( 3, 4, 0, 9, 8, 4, 5, 6, 7, 3 ) );
        ArrayList<Integer> sqr = go.SquareValues(arr05);
        System.out.println("Squared array values: " + sqr);

        // Eliminate Negative Numbers
        int[] arr06 = { -7, 6, -9, 5, -6, 7, -2, 8, -9, 7 };
        int[] negNums = go.NoNegativeNums(arr06);
        System.out.println("Array with no Negative Numbers: " + Arrays.toString(negNums));

        // Max, Min, and Average
        int[] arr07 = { 0, 9, 7, 7, 8, 5, 6, 9, 0, 6 };
        ArrayList<Object> mma = go.MaxMinAvg(arr07);
        System.out.println("Max, Min, and Average" + mma);

        // Shifting the Values in the Array
        int[] arr08 = { 7, 6, 5, 7, 5, 6, 8, 3, 7, 2 };
        int[] shift = go.ShiftingValues(arr08);
        System.out.println("Shifted values to the left: " + Arrays.toString(shift));
    }
}