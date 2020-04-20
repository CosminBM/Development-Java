import org.w3c.dom.ls.LSOutput;

public class SecondAndMinutesChallenge {

    public static void main(String[] args) {
        getDurationString(61,0);
    }

    public static int getDurationString(int minutes, int seconds){
        if(minutes <= 0 || seconds < 0 || seconds > 59){
            System.out.println("Invalid value");
            return -1;
        } else {
            int hours = minutes / 60;
            hours += seconds / 3600;
            System.out.println(hours + "h " + minutes + "m " + seconds + "s");
            return hours;
        }
    }

    public static int getDurationString(int seconds){
        if(seconds <= 0){
            System.out.println("Invalid value");
            return -1;
        } else {
            int minutes= seconds / 60;
            return getDurationString(minutes, seconds);
        }
    }




}
