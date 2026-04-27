import java.util.*;

public class GuessGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int roundsPlayed = 0;
        String playAgain = "yes";
        System.out.println("Number Guessing Game");
        while (playAgain.equalsIgnoreCase("yes")) {
            int targetNumber = random.nextInt(100) + 1;
            int tries = 0;
            int maxAttempts = 7;
            boolean isGuessed = false;
            System.out.println("\nGuess a number between 1 and 100");
            while (tries < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = input.nextInt();
                tries++;
                if (userGuess == targetNumber) {
                    System.out.println("Correct!");
                    isGuessed = true;
                    score += (maxAttempts - tries + 1);
                    break;
                } 
                else if (userGuess > targetNumber) {
                    System.out.println("Too high");
                } 
                else {
                    System.out.println("Too low");
                }
            }
            if (!isGuessed) {
                System.out.println("The number was: " + targetNumber);
            }
            roundsPlayed++;
            System.out.println("Score: " + score);

            System.out.print("Play again? ");
            playAgain = input.next();
        }
        System.out.println("\nGame ended");
        System.out.println("Rounds played: " + roundsPlayed);
        System.out.println("Final score: " + score);

        input.close();
    }
}