import org.w3c.dom.ls.LSOutput;

//if and else statements
public class FirstClass {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        //call method as a function
        int highScore= calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(" Your HighScore is " + highScore);
    }

    public static int calculateScore( boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if( gameOver ) {
            finalScore += ( levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    };
}
