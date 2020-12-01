import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    // Print 1-255
    public String Print1To255() {
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
        return null;
    }
    
    // Print odd numbers between 1-255
    public String PrintOdds1To255() {
        for (int i = 1; i <= 255; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        return null;
    }
    
    // Print Sum
    public String PrintSum() {
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum = sum + i;
            System.out.println("New number: " + i +" Sum: " + sum);
        }
        return null;
    }
    
    // Iterating through an array
    public String IteratingArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return null;
    }
    
    // Find Max
    public Integer FindMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    
    // Get Average
    public double GetAverage(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double avg = sum / arr.length;
        return avg;
    }
    
    // Array with Odd Numbers
    public ArrayList<Integer> ArrayWithOdds() {
        ArrayList<Integer> oddOnes = new ArrayList<Integer>();
        for (int i = 1; i <= 255; i++) {
            if (i % 2 == 1) {
                oddOnes.add(i);
            }
        }
        return oddOnes;
    }
    
    // Greater Than Y
    public Integer GreaterThanY(int[] arr, int num) {
        int more = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                more = more + 1;
            }
        }
        return more;
    }
    
    // Square the values
    public ArrayList<Integer> SquareValues(ArrayList<Integer> arr) {
        ArrayList<Integer> arrX2 = new ArrayList<Integer>();
        for (Integer num : arr) {
            arrX2.add(num * num);
        }
        return arrX2;
    }
    
    // Eliminate Negative Numbers
    public int[] NoNegativeNums(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        return arr;
    }
    
    // Max, Min, and Average
    public ArrayList<Object> MaxMinAvg(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                max = arr[i];
            }
        }
        double avg = sum / arr.length;
        ArrayList<Object> arr2 = new ArrayList<Object>( Arrays.asList( max, min, avg ) );
        return arr2;
    }
    
    // Shifting the Values in the Array
    public int[] ShiftingValues(int[] arr) {
        int end = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                arr[i] = arr[i + 1];
            }
            else {
                arr[i] = 0;
            }
        }
        return arr;
    }
}