
public class SecondAndMinutesChallenge {

    public static void main(String[] args) {
        getDurationString(0, 61);
    }

    public static int getDurationString(int minutes, int seconds) {
        int hours = seconds % 3600;
        minutes = seconds / 60;
        seconds = seconds % 60;

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid value");
            return -1;
        } else {
            String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
            System.out.println(timeString);
            return 1;
        }
    }

    public static int getDurationString(int seconds) {
        if (seconds <= 0) {
            System.out.println("Invalid value");
            return -1;
        } else {
            int minutes = (seconds % 3600) / 60;
            return getDurationString(minutes, seconds);
        }
    }


}
