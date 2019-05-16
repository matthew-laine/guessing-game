import java.util.Random;

public class GuessingGame {
	private static final String YOU_WIN = "You Win!";
	private static final String TOO_HIGH = "Too High, Guess Again...";
	private static final String TOO_LOW = "Too Low, Guess Again...";
	private static final String INSTRUCTIONS = "Guess a number from 1 to 10.\n"
			+ "Enter -1 to quit, and 0 for instructions.";
	Random random = new Random();
	int correctNumber = random.nextInt(10) + 1;

	public String playGame(int guessedNumber) {
		if(guessedNumber == 0) {
			return INSTRUCTIONS;
		}else if(guessedNumber < correctNumber) {
			return TOO_LOW;
		}else if(guessedNumber > correctNumber) {
			return TOO_HIGH;
		}else {
			return YOU_WIN;
		}
	}
}
