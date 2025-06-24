// 10.wap to remove duplicates from an array 

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,2,3,43};
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int i=0; i<arr.length;i++){
            if(!newArr.contains(arr[i])){
                newArr.add(arr[i]);
            }
        }

        System.out.println(newArr);
    }
}
