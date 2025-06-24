public class PrintV {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 13; j++) {
                if (j == i || j == 12 - i && i < 6) {
                    System.out.print("*");
                } else if (i == 6 && j == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
