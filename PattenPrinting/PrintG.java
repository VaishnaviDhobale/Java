public class PrintG {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == 0 || i == 6) && j > 0 ||
                    (j == 0 && i > 0 && i < 6) ||
                    (i == 3 && j > 1) ||
                    (j == 4 && i > 3 && i < 6)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
