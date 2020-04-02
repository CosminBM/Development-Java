public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {

        if((int)one * 1000 == (int)two * 1000){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.1756));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

}


// -3.1756, -3.175   3.175, 3.1756   3.0, 3.0   -3.123, 3.123