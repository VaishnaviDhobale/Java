public class PrintB {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) { // rows
            for (int j = 0; j < 5; j++) { // columns
                if (j == 0 || (j == 4 && (i != 0 && i != 3 && i != 6)) || 
                    ((i == 0 || i == 3 || i == 6) && j > 0 && j < 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
