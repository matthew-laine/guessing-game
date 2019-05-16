import java.util.Scanner;

public class GuessingGameApp {
	GuessingGame myGuessingGame = new GuessingGame();
	Scanner myScanner = new Scanner(System.in);
	private static final String YOU_WIN = "You Win!";
	private static final String TOO_HIGH = "Too High, Guess Again...";
	private static final String TOO_LOW = "Too Low, Guess Again...";
	private static final String INSTRUCTIONS = "Guess a number from 1 to 10.\n"
									+ "Enter -1 to quit, and 0 for instructions.";
	int attemptsLeft = 3;

	public void runGuessingGameApp() {
		boolean gameIsStillGoingOn = true;
		System.out.println(INSTRUCTIONS);
		int gameInput;
		String gameOutput;
		
		while(gameIsStillGoingOn) {
			gameInput = myScanner.nextInt();
			gameOutput = myGuessingGame.playGame(gameInput);
			if(gameInput == -1) {
				System.out.println("Good Bye!");
				break;
			}
			if(gameOutput == INSTRUCTIONS) {
				System.out.println(gameOutput);
			} else if(gameOutput == TOO_HIGH || gameOutput == TOO_LOW) {
				if(attemptsLeft > 1) {
					System.out.println(gameOutput);
					attemptsLeft--;
					System.out.println(attemptsLeft + " attempts left");
					if(attemptsLeft <= 0) {
						gameIsStillGoingOn = false;
					}
				} else {
					System.out.println("Sorry, You Lose :(");
					gameIsStillGoingOn = false;
				}
			} else if(gameOutput == YOU_WIN) {
				System.out.println(gameOutput);
				gameIsStillGoingOn = false;
			} else {
				System.out.println("gameOutput != predetermined values\n" +
							"program will now exit");
				break;
			}
		}
		myScanner.close();
	}
	

}