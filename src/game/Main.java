<<<<<<< HEAD:src/game/Main.java
package game;
=======
>>>>>>> f5ab43872db83001cf4c6eed0b494f9fbd84a164:src/Main.java


/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 * 
 */
public class Main {
	public static void main(String[] args) {
		// upper limit for secret number in guessing game
		int upperBound = 100;
		NumberGame game = new NoppawanGame(upperBound);
		GameSolver ui = new GameSolver( );
		int solution = ui.play( game );
		System.out.println(game.getMessage());
		System.out.println("Counted " + game.getCount() + " times");
		System.out.println("play() returned "+solution);
		
	}
}
