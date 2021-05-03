public class FloatAndDouble {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes).
	    int myIntValue = 5 / 3;
	    // width of int = 32 (4 bytes).
	    float myFloatValue = 5f / 3f;
        //width of int = 64 (8 bytes).
	    double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number of above and store in a variable.
        // 3. Print out the result.
        //
        // Notes: 1 pound is equal to 0.45359237 kilograms.

        double pounds = 50d;
        double calculateKilograms = pounds * 0.45359237;
        System.out.println("Kilograms: " + calculateKilograms);
        // 22.6796185 kilograms
        double pi = 3.141_592_7d;
    }
}
