
public class SecondAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
    }

    private static String getDurationString(long minutes, long seconds) {
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        }

        String h = hours + "h";
        if (hours < 10){
            h = "0" + h;
        }

        String m = remainingMinutes + "m";
        if (remainingMinutes < 10){
            m = "0" + m;
        }

        String s = seconds + "s";
        if (seconds < 10){
            s = "0" + s;
        }

        return h + " " + m + " " + s;
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "Invalid value";
        } else {
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
    }
}
