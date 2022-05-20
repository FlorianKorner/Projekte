package experiment;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FadeTransitionExample extends Application {

	@Override
	public void start(Stage primaryStage) {
		Button btn = new Button("Genuine Coder Fade");
		Group group = new Group(btn);
		Scene scene = new Scene(group, 600, 600);

		// Fade in transition
		FadeTransition fadeInTransition = new FadeTransition(Duration.millis(5000), btn);
		fadeInTransition.setFromValue(0.0);
		fadeInTransition.setToValue(1.0);

		// Fade out transition
		FadeTransition fadeOutTransition = new FadeTransition(Duration.millis(5000), btn);
		fadeOutTransition.setFromValue(1.0);
		fadeOutTransition.setToValue(0.0);
		// Duration = 2.5 seconds
		Duration duration = Duration.millis(2500);
		// Create new rotate transition
		
		fadeOutTransition.play();
		//fadeInTransition.play();
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
