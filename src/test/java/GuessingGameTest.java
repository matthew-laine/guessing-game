import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GuessingGameTest {
	
	GuessingGame underTest = new GuessingGame();
	
	@Test
	public void playGameShouldReturnYouWinWhenInputIs7() {
		String response = underTest.playGame(7);
		assertEquals("You Win!", response);
	}
	
//	@Test
//	public void playGameShouldReturnYouLoseWhenInputIs6() {
//		String response = underTest.playGame(6);
//		assertEquals("You Lose!", response);
//	}
	
	@Test
	public void playGameShouldReturnInstructionsWhenInputIs0() {
		String response = underTest.playGame(0);
		assertEquals("Guess a number from 1 to 10.", response);
	}
	
	@Test
	public void playGameShouldReturnTooLowGuessAgainWhenInputIs6() {
		String response = underTest.playGame(6);
		assertEquals("Too Low, Guess Again...", response);
	}
	
	@Test
	public void playGameShouldReturnTooHighGuessAgainWhenInputIs8() {
		String response = underTest.playGame(8);
		assertEquals("Too High, Guess Again...", response);
	}
	

	

}
