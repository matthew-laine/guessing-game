
public class GuessingGame {
	public String playGame(int guessedNumber) {
		if(guessedNumber == 0) {
			return "Guess a number from 1 to 10.";
		}else if(guessedNumber < 7) {
			return "Too Low, Guess Again...";
		}else if(guessedNumber > 7) {
			return "Too High, Guess Again...";
		}
		return "You Win!";
	}
}
