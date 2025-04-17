// Create a Java program that finds and prints the maximum value in an array of integers.

import java.util.Arrays;

public class MaxValue {
    public static void main(String[] args) {

        // create array
        int[] numbers = {5,3,53,5,4,65,45,321};
        int maxValue = 0; 

        // find max value from array
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>maxValue){
                maxValue = numbers[i];
            }
        }

        //print max value
        System.out.println("Max value is: "+ maxValue);
        
    }
}
