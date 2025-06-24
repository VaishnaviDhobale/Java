// 9.wap to find largest element in an array 
public class LargestEleInArr {
    public static void main(String[] args) {
        int[] arr = {3,9,8};
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        System.out.println(largest);

    }
}
