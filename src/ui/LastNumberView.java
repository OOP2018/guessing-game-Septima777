package ui;

import java.util.Observable;
import java.util.Observer;

import game.NoppawanGame;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
/**
 * This class shows the last number that we guess on the guessing game.
 * @author Noppawan Kulchol
 *
 */
public class LastNumberView implements Observer{
	/** declare the stage */
	private Stage stage;
	/** declare the game */
	private NoppawanGame game;
	/** the label that shows the counter value. */
	private Label label;
	
	/**
	 * Initialize a LastNumberView, which shows the last number that we guess.
	 * @param game is guessing game.
	 */
	public LastNumberView(NoppawanGame game) {
		this.game = game;
		initComponents();
	}
	
	/**
	 * Initialize the components on the stage.
	 */
	private void initComponents() {
		stage = new Stage();
		// components and containers for our window
		HBox root = new HBox();
		root.setPadding(new Insets(100));
		root.setAlignment(Pos.CENTER);
		label = new Label("   ");
		label.setPrefWidth(144);
		label.setFont(new Font("Arial", 80.0));
		label.setAlignment(Pos.CENTER);
		root.getChildren().add(label);
		Scene scene = new Scene(root);
		stage.sizeToScene();
		stage.setScene(scene);
		stage.setTitle("Last Number");
	}
	
	/** Show the window and update the last number that we guess */
	public void run() {
		stage.show();
		displayLastNumber(0);
	}
	
	/** show the last number that we guess */
	public void displayLastNumber(int number) {
		label.setText( String.format("%2d",number) );
	}

	/**
	 * update this class when action occur.
	 */
	@Override
	public void update(Observable o, Object arg) {
		int number = (int) arg;
		displayLastNumber(number);
	}	

	

}
