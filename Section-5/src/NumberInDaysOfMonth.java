public class NumberInDaysOfMonth {

    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
        getDaysInMonth(1, 2020);
        getDaysInMonth(2, 2020);
        getDaysInMonth(2, 2018);
        getDaysInMonth(-1, 2020);
        getDaysInMonth(1, -2020);
    }

    public static boolean isLeapYear(int year){
        return year >= 1 && year <= 9999 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year){
        if(year < 1 || year > 9999) return -1;
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> -1;
        };
    }
}

