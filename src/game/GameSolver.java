package game;
/**
 * Program that solve a guessing game, random the number. This program just
 * return the solution.
 * 
 * @author Noppawan Kulchol
 *
 */
public class GameSolver {

	/**
	 * Play a NumberGame and return the solution. The NumberGame object must
	 * provide messages (getMessage) containing the phrase "too small" if a
	 * guess is too small and "too large" if a guess is too large, for efficient
	 * solution.
	 *
	 * @param game is the NumberGame to solve.
	 * @return the secret number.
	 */
	public int play(NumberGame numberGame) {
		int guess = numberGame.getUpperBound() / 2;
		int min = 1;
		int max = numberGame.getUpperBound();
		while (!numberGame.guess(guess)) {

			if (numberGame.getMessage().contains("large")) {
				max = guess - 1;
				guess = min + (max - min) / 2;
			}
			if (numberGame.getMessage().contains("small")) {
				min = guess + 1;
				guess = min + (max - min) / 2;
			}

		}
		return guess;

	}
}
