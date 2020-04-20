public class MethodOverloading {

    public static void main(String[] args) {
        int newScore = calculateScore("Roco", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(0, 1);
        calcFeetAndInchesToCentimeters(-10);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inch) {
        double centimeters = feet * 30.48;
        centimeters += inch * 2.54;
        if (feet < 0 || inch < 0 || inch > 12) {
            System.out.println("Invalid feet or inches");
            return -1;
        } else {
            System.out.println(feet + " feet, " + inch + " inches = " + centimeters + "cm");
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inch) {
        double feet = (int) inch / 12;
        double remainingInches = (int) inch % 12;
        if (inch <= 0) {
            System.out.println("Invalid inches");
            return -1;
        } else {
            System.out.println(inch + " inches equals to " + feet + " feet " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player, no score points");
        return 0;
    }

}


