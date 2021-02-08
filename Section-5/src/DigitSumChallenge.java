public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int number) {
        int sum;
        if (number < 10) {
            return -1;
        }
        for (sum = 0; number > 0; sum += number % 10, number /= 10) ;
        return sum;
    }
}
