/**
 * Program that solve a guessing game, random the number. This program just return the solution.
 * @author Noppawan Kulchol
 *
 */
public class GameSolver {
	public int play(NumberGame numberGame){
		System.out.println( numberGame.toString() );		
		System.out.println( numberGame.getMessage() );		
		System.out.print("Your answer? ");
		int min = 1;
		int max = numberGame.getUpperBound();
		int guess = min + (max - min)/2;
		while(!numberGame.guess(guess)){
			System.out.println(numberGame.getMessage());

			System.out.print("Your answer? ");
			if(numberGame.getMessage().contains("too large")){
				max = guess - 1;
				guess = min + (max - min)/2;
			}if(numberGame.getMessage().contains("too small")){
				min = guess + 1;
				guess = min + (max - min)/2;
			}
			

		}
		return guess;
	
	}
}
