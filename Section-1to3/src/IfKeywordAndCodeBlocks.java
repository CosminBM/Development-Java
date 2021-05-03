public class IfKeywordAndCodeBlocks {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("The score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }


        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final was " + finalScore);
        }


        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well

        boolean gameOver2 = true;
        int score2 = 10000;
        int levelCompleted2 = 8;
        int bonus2 = 200;


        if (gameOver2) {
            int finalScore = score2 + (levelCompleted2 * bonus2);
            System.out.println("Your final was " + finalScore);
        }


    }
}
