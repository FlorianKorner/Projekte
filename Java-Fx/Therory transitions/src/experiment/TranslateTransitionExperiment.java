package experiment; 
/**
 *  Source-Link: https://www.genuinecoder.com/javafx-animation-tutorial/ 
 *  
 *  @author PUZ
 *  @version 2021-03-05
 */
import javafx.stage.Stage;
import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.util.Duration;
 
public class TranslateTransitionExperiment extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button("ClickMe");
        Group group = new Group(btn);
        Scene scene = new Scene(group, 600, 600);
 
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
        //Repeat animation twice (4) Transition.INDEFINITE
        transition.setCycleCount(4);
        transition.play();
 
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}