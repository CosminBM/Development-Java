package com.cosmin;

public class Main {

    public static void main(String[] args) {

        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and se it to any valid short number.
        // 3. Create a int variable and set it to any valid int number.
        // 4. Create a variable type long, and make it equal to
        // 50000 + 10 times the sum of the byte, plus the short plus the int

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 100;
        long longValue = 50000L + 10L * (byteValue + shortValue + intValue);
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longValue: " + longValue);
        System.out.println("shortTotal: " + shortTotal);
    }
}
