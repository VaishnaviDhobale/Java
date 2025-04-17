//Write a Java program that calculates and prints the sum of all elements in an integer array.

import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {

        // create array
        int[] numbers = {5,3,53,5,4};
        int sum = 0; 


        // calculate sum
        for (int i=0; i <= numbers.length-1; i++) {
            sum+=numbers[i];
        }

        // print total
        System.out.println("Sum is: " + sum);
    }
}
