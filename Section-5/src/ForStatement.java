import java.util.Arrays;

public class ForStatement {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        for (int i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }
        forMethod();
    }

    public static void forMethod() {
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                System.out.println("Prime number is " + i);
                count++;
                if(count == 3){
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}
