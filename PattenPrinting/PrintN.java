public class PrintN {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 0 || j == 6 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
