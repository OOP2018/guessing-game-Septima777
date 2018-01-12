import java.util.Random;

/**
 * Game of guessing the secret number. 
 * @author Noppawan Kulchol
 *
 */
public class MyGuessGame extends NumberGame {
	private int upperBound;
	private int secret;
	private int count;

	/**
	 * Initialize a new game
	 * 
	 * @param upperBound
	 *            is the max value of this game (secret number)
	 */
	public MyGuessGame(int upperBound) {
		this.upperBound = upperBound;
		long seed = System.nanoTime();
		Random rand = new Random(seed);
		this.secret = rand.nextInt(upperBound) + 1;
		setMessage("I'm think of a number between 1 and " + upperBound);

	}

	/**
	 * Check the number that equals to secret number or not. If it equals, print
	 * that Right. If it is more, print too large. If it is less, print too small.
	 */
	@Override
	public boolean guess(int number) {
		this.count++;
		if (number == secret) {
			setMessage("Right! The secret number is " + this.secret);
			return true;
		} else if (number > secret) {
			setMessage("Sorry, too large.");
		} else if (number < secret) {
			setMessage("Sorry, too small.");
		}
		return false;
	}

	/**
	 * Return the upperbound of this game.
	 * @return the upperbound of this game.
	 */
	public int getUpperbound() {
		return this.upperBound;
	}

	/**
	 * print description of this game before start the game.
	 */
	public String toString() {
		return "Guess a secret number.";
	}

	/**
	 * get the number of random.
	 */
	public int getCount() {
		return this.count;

	}

}
