public class PrintW {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 13; j++) {
                if (j == 0 || j == 12 || (i == j - 3 && j >= 3 && j <= 6) || (i + j == 15 && j >= 6 && j <= 9)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
