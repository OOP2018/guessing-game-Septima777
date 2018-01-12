/**
 * Program that solve a guessing game, random the number. This program just return the solution.
 * @author Noppawan Kulchol
 *
 */
public class GameSolver {
	public int play(NumberGame game){
		System.out.println( game.toString() );		
		System.out.println( game.getMessage() );		
		System.out.print("Your answer? ");		
		int guess = game.getUpperBound()/2;
		int constant = guess;
		int branch = 2;
		boolean correct = game.guess(guess);
		while(!correct){
			System.out.println(game.getMessage());
			System.out.print("Your answer? ");
			if(game.getMessage().contains("Sorry, too large.")){
				guess = guess - constant/branch;
			}if(game.getMessage().contains("Sorry, too small.")){
				guess = guess + constant/branch;
			}
			if(constant/branch>1){
				branch = branch*2;
			}
			correct = game.guess(guess);
		}
		return guess;
	
	}
}
