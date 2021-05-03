public class SharedDigit {

    public static void main(String[] args) {
        hasSharedDigit(12, 39);
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }

        int originalNumber = secondNumber;
        while (firstNumber > 0) {
            while (secondNumber > 0) {
                if (firstNumber % 10 == secondNumber % 10) {
                    return true;
                }
                secondNumber /= 10;
            }
            firstNumber /= 10;
            secondNumber = originalNumber;
        }
        return false;
    }
}
