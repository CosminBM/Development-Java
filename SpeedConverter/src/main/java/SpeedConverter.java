import org.w3c.dom.ls.LSOutput;

public class SpeedConverter {

    public long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour  < 0){
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }

    }

    public void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0 ){
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println( kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void main(String [ ] args) {
        SpeedConverter test = new SpeedConverter();
        System.out.println("The number is " + test.toMilesPerHour(75.114));
        test.printConversion(75.114);
    }
}
