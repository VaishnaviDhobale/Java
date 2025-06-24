public class Fibonacci {
    public static void main(String[] args) {
        int num = 4;
        int first = 0, second = 1;

        System.out.print("Fibonacci series: ");
        for (int i = 0; i < num; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
