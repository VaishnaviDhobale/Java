public class PrintQ {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if ((i == 0 || i == 6) && j > 0 && j < 4 ||
                    (j == 0 || j == 4) && i > 0 && i < 6 ||
                    (i == j && i > 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
