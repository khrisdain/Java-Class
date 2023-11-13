public class Method {
    public static void main(String[] args) {
        String playerName = "Jacob";
        int playerScore = 1500;
        int highScorePosition = calculateHighScorePositions( playerScore );
        displayHighScore( playerName, highScorePosition);
    }
    public static void displayHighScore(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
        + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePositions(int playerScore) {
        if( playerScore >= 1000) {
            return 1;
        } else if ( playerScore >= 500 && playerScore < 1000){
            return 2;
        } else if ( playerScore >= 100 && playerScore < 500 ){
            return 3;
        } else {
            return 4;
        }
    }
}
