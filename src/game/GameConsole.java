package game;
import java.util.Scanner;

/** 
 *  Play guessing game on the console.
 *  @author Noppawan Kulchol
 */
public class GameConsole {

	/** play the game. */
	public int play(NumberGame game) {
		Scanner console = new Scanner(System.in);
		// describe the game
		System.out.println( game.toString() );		
		System.out.println( game.getMessage() );
		
		System.out.print("Your answer? ");
		int guess = console.nextInt();
		boolean correct = game.guess(guess);
		while(!correct){
			System.out.println(game.getMessage());
			System.out.print("Your answer? ");
			guess = console.nextInt();
			correct = game.guess(guess);
		}
		return guess;
	}
	
}
