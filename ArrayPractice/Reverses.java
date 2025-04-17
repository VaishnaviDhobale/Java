import java.util.Arrays;

public class Reverses {
    public static void main(String[] args) {

        // create array
        int[] numbers = {2, 3, 5, 7, 8, 53};


        // print reverse array
        System.out.println("Reversed array: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
