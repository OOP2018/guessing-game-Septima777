package ui;

import game.NoppawanGame;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
/**
 * 
 * This class is controller of guessing game that show in fxml file.
 *
 * @author Noppawan Kulchol
 *
 */
public class NoppawanGameController {
	
	@FXML
    private Label hintArea;
	
    @FXML
    private TextField answer;

    @FXML
    private Button guessButton;

    @FXML
    private Button cancelButton;
    
    /** declare the game */
    private NoppawanGame game;
    
    /** the number that we guess */
    private String text;
    
    /**
     * set the game (no need to declare a new game).
     * @param game is the guessing game.
     */
    public void setGame(NoppawanGame game) {
		this.game = game;
	}
    

    /**
     * cancel the game.
     */
    public void cancelHandle(){
    	Platform.exit();
    }
    
    
    /**
     * Guess the number. If it is not the right answer it will show hint
     * when we win it will show the secret number.
     */
    public void guessHandle(){
    	text = answer.getText();
    	int number = Integer.parseInt(text);
    	if (!game.guess(number)) {
			hintArea.setText(game.getMessage());
			answer.clear();
		}else {
			hintArea.setTextFill(javafx.scene.paint.Color.GREEN);
			hintArea.setText(game.getMessage());
		}
    }


}
