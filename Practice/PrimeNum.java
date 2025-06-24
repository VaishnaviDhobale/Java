// .wap to check given no.is prime or no ->divisible by 1 and number itself
public class PrimeNum {
    static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 2;
        System.out.println(checkPrime(num));
    }
}
