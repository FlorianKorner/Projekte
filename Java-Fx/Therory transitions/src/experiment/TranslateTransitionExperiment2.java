package experiment; 

/**
 *  Source-Link: https://www.genuinecoder.com/javafx-animation-tutorial/ 
 *  
 *  @author PUZ
 *  
 */
import javafx.stage.Stage;


import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
 
public class TranslateTransitionExperiment2 extends Application {
    
	private Button btn;
	
    @Override
    public void start(Stage primaryStage) throws Exception {
    	

    	
    	Button up   = new Button("up");
    	Button down = new Button("down");
    	HBox   boxButtons = new HBox(10,up, down);
    	up.setOnAction(e -> goUp());
    	down.setOnAction(e -> goDown());    	
        
    	btn = new Button("ClickMe");
 
        Pane group = new Pane(btn);
       
        VBox boxMain = new VBox(boxButtons, group);
        Scene scene = new Scene(boxMain, 600, 600);
 

        
        //Duration = 2.5 seconds
        Duration duration = Duration.millis(2500);
        //Create new translate transition
        TranslateTransition transition = new TranslateTransition(duration, btn);
        //Move in X axis by +200
        transition.setByX(200);
        //Move in Y axis by +100
        transition.setByY(100);
        //Go back to previous position after 2.5 seconds
        transition.setAutoReverse(true);
        //Repeat animation twice
        transition.setCycleCount(2);
        transition.play();
 
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void goDown() {
        Duration duration = Duration.millis(2500);

        TranslateTransition transition = new TranslateTransition(duration, btn);
        transition.setToX(200);
        transition.setToY(100);

        transition.setCycleCount(1);
        transition.play();
	}
	private void goUp() {
	    
        Duration duration = Duration.millis(2500);

        TranslateTransition transition = new TranslateTransition(duration, btn);
        transition.setToX(0);
        transition.setToY(0);

        transition.setCycleCount(1);
        transition.play();
	}
	public static void main(String[] args) {
        Application.launch(args);
    }
}