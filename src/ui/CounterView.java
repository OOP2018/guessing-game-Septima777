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
 * This class shows the number of guessing the number on this game.
 * @author Noppawan Kulchol
 *
 */
public class CounterView implements Observer{
	/** declare the stage */
	private Stage stage;
	/** declare the game */
	private NoppawanGame game;
	/** the label that shows the counter value. */
	private Label label;
	
	/**
	 * Initialize a CounterView, which shows value of a counter.
	 * @param game is the guessing game.
	 */
	public CounterView(NoppawanGame game) {
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
		stage.setTitle("Count");
	}
	
	/** Show the window and update the counter value. */
	public void run() {
		stage.show();
		displayCount();
	}
	
	/** show the number of count */
	public void displayCount() {
		label.setText( String.format("%2d", game.getCount()) );
	}

	/**
	 * update this class when action occur.
	 */
	@Override
	public void update(Observable o, Object arg) {
		displayCount();
	}	
}
