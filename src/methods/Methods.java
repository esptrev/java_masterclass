package methods;


public class Methods {
    protected static boolean gameOver = false;
    protected static int score = 3000;
    protected static int levelCompleted = 10;
    protected static int bonus = 300;

    public static void main(String[] args) {

        //// USING THE RETURN VALUE FROM CS2 AS AN ASSIGMENT FOR THE VARIABLE HS, THEN PRINT HS ////
        int highScore = calculateScore2(gameOver,score,levelCompleted,bonus);
        System.out.println("Final score: " + highScore);


        calculateScore(gameOver,score,levelCompleted,bonus);  /// METHOD CALLED WITH VARIABLES ABOVE
        calculateScore(true,10000,8,200); /// CALLED WITH ARGUMENTS IN PARAMETER
        calculateScore(true,100,1,100);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Trevor",highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("DocRob", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Willie", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Berry",highScorePosition);

        /// USE THE MAIN TO CALL THE OTHER CLASS METHODS NOTHING ELSE ///
    }///END OF MAIN


    /// METHOD/PROCEDURE IS VOID AND AS SUCH WILL NOT RETURN A VALUE /// IT ONLY PRINTS TO CONSOLE ///
    public static void calculateScore (boolean gameOver,int score,int levelCompleted,int bonus) {
        int finalScore = 0;
        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
        }
        if (finalScore >= 8000) {
            System.out.println("Big WInner your score exceeded 5K " + finalScore);
        } else if(finalScore >= 3000 && finalScore < 8000){
            System.out.println("Almost,  try again to break high score " + finalScore);
        }else {
            System.out.println("Womp, Womp, go back and learn some skills " + finalScore);
        }
    }

    /// BELOW FUNCTION/METHOD IS NOT STATIC AND WILL RETURN VALUE /// NOTICE RETURN STATEMENTS ///
    public static int calculateScore2 (boolean gameOver,int score,int levelCompleted,int bonus) {
        int finalScore = 0;
        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;

            if (finalScore >= 8000) {
                System.out.println("Big WInner your score exceeded 5K " + finalScore);
            } else if(finalScore >= 3000 && finalScore < 8000){
                System.out.println("Almost,  try again to break high score " + finalScore);
            }else {
                System.out.println("Womp, Womp, go back and learn some skills " + finalScore);
            }
            return finalScore;
        }

            return -1;
    }


/// CALLED IN MAIN
    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " achieved a position of: " + highScorePosition + " on the high score table");
    }


/// CALLED IN MAIN AS VARIABLE DECLARATION
    public static int calculateHighScorePosition(int playerScore){
//        if (playerScore >= 1000){
//            return 1;
//        }else if (playerScore >= 500){
//            return 2;
//        }else if (playerScore >= 100){
//            return 3;
//        }
//        return 4;
//// ALTERNATIVE FUNCTION BODY, REDUCES RETURN STATEMENTS, SIMPLIFIES WHATS BEING RETURNED ////
        int position = 4;   //// ASSUMES POSITION WILL BE A DEFAULT OF 4
        if(playerScore >= 1000) {
            position = 1;
        }else if(playerScore >= 500){
            position = 2;
        }else if (playerScore >= 100){
            position = 3;
        }
        return position;

    }






}/// END OF CLASS
