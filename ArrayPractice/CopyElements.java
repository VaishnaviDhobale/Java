// Write a Java program to copy elements from one array to another.

import java.util.Arrays;

public class CopyElements {
    public static void main(String[] args) {

        // original array- array1
        int[] array1 = {23,4,5,3,53,5};

        //copied array- array2
        int[] array2 = new int[array1.length];

        // copy element one by one to array2
        for(int i=0; i<=array1.length-1; i++){
            array2[i] = array1[i];
        }    

        // print array2- copied array 
        for(int i=0; i<=array2.length-1; i++){
            System.out.print(array2[i] + " ");
        }

    }
}
