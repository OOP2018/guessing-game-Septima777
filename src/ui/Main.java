package ui;

import java.net.URL;

import game.NoppawanGame;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * This class use for run application.
 * @author Noppawan Kulchol
 *
 */
public class Main extends Application {
	
	/**
	 * Set stage and scene to show the program.
	 */
	@Override
	public void start(Stage primaryStage) {
		NoppawanGame game = new NoppawanGame(100);
		
		try {
			URL url = getClass().getResource("NoppawanGameUI.fxml");
			if (url == null) {
				System.out.println("Couldn't find file: NoppawanGameUI.fxml");
				Platform.exit();
			}
			FXMLLoader loader = new FXMLLoader(url);
			Parent root = loader.load();
			NoppawanGameController controller = loader.getController();
			controller.setGame(game);
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.sizeToScene();
			primaryStage.setTitle("Guessing Game");
			primaryStage.show();
		} catch(Exception e) {
			System.out.println("Exception creating scene: "+e.getMessage());
		}
		
		CounterView counterView = new CounterView(game);
		game.addObserver(counterView);
		counterView.run();
		
		LastNumberView lastNumber = new LastNumberView(game);
		game.addObserver(lastNumber);
		lastNumber.run();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}


