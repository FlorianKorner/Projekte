package experiment;

import java.io.FileInputStream;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SequentialTransitionExample extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		Polygon poly = new Polygon();

		// Setting points for the polyogn
		poly.getPoints().addAll(
				new Double[] { 320.0, 270.0, 270.0, 220.0, 270.0, 270.0, 320.0, 120.0, 370.0, 270.0, 370.0, 220.0 });

		// Setting Color and Stroke properties for the polygon
		poly.setFill(Color.LIMEGREEN);
		poly.setStroke(Color.BLACK);

		FileInputStream input = new FileInputStream("src/res/images/cat-new-year.png");
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);
		

		// Setting durations for the transitions
		Duration dur1 = Duration.millis(10000);
		Duration dur2 = Duration.millis(5000);

		// Setting the pause transition
		PauseTransition pause = new PauseTransition(Duration.millis(1000));

		// Setting the fade transition
		FadeTransition fade = new FadeTransition(dur2);
		fade.setFromValue(1.0f);
		fade.setToValue(0.3f);
		fade.setCycleCount(2);
		fade.setAutoReverse(true);

		// Setting Translate transition
		TranslateTransition translate = new TranslateTransition(dur1);
		translate.setToX(-150f);
		translate.setCycleCount(2);
		translate.setAutoReverse(true);

		// Setting Rotate Transition
		RotateTransition rotate = new RotateTransition(dur2);
		rotate.setByAngle(180f);
		rotate.setCycleCount(4);
		rotate.setAutoReverse(true);

		// Setting Scale Transition
		ScaleTransition scale = new ScaleTransition(dur1);
		scale.setByX(1.5f);
		scale.setByY(1.2f);
		scale.setCycleCount(2);
		scale.setAutoReverse(true);

		// Instantiating Sequential Transition class by passing the list of transitions
		// into its constructor
		SequentialTransition seqT = new SequentialTransition(poly, rotate, pause, fade, translate, scale);
//		SequentialTransition seqT = new SequentialTransition(imageView, rotate, pause, fade, translate, scale);
        
		// playing the transition
		seqT.play();

		// Configuring the group and scene
		Group root = new Group();
		root.getChildren().addAll(imageView, poly);
		Scene scene = new Scene(root, 890, 850, Color.WHEAT);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Sequential Transition Example");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}