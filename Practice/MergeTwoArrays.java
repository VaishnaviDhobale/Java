
// 8.wap to merge to arrays 

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        
        int[] arr1 = { 3, 6 };
        int[] arr2 = { 4, 7 };

        int[] mergedArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            mergedArr[i] = arr1[i];
        }
        
        for (int i = 0; i < arr1.length; i++) {
            mergedArr[arr1.length + i] = arr2[i];
        }

        System.out.println(Arrays.toString(mergedArr));
    }

}