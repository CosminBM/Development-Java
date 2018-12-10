package com.cosmin;

public class Main {

    public static void main(String[] args) {
	// byte
    // short
    // int
    // long
    // float
    // double
    // char
    // boolean

     String myString = "This is a string";
     System.out.println("myString is equal to: " + myString);
     myString = myString + ", adding more to the string";
     System.out.println("myString is equal to: " + myString);
     myString = myString + " \u00A9 2018";
     System.out.println("myString is equal to: " + myString);

    String numberString = "250.55";
    numberString += "49.95";
    System.out.println("The result is: " + numberString);

    }
}
