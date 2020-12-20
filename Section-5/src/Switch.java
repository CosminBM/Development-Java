public class Switch {

    public static void main(String[] args) {
        intSwitch();
        charSwitch();
        stringSwitch();
    }

    public static void intSwitch() {
        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was 3, 4 or 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
        }
    }

    public static void charSwitch() {
        char switchValue = 'C';
        switch (switchValue) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println(switchValue + " value was found");
                break;
            default:
                System.out.println("Not found a value from A, B, C, D, E");
                break;
        }
    }

    public static void stringSwitch() {
        String month = "Januarfy";
        switch (month) {
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
