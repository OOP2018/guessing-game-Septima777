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
		int guess = numberGame.getUpperBound()/2;
		int min = 1;
		int max = numberGame.getUpperBound();
		while(!numberGame.guess(guess)){
			System.out.println(numberGame.getMessage());

			System.out.print("Your answer? ");
			if(numberGame.getMessage().contains("large")){
				max = guess - 1;
				guess = min + (max - min)/2;
			}if(numberGame.getMessage().contains("small")){
				min = guess + 1;
				guess = min + (max - min)/2;
			}
			

		}
		return guess;
	
	}
}
