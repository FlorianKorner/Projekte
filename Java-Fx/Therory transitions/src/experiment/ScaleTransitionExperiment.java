package experiment;
/**
 *  Source-Link: https://www.genuinecoder.com/javafx-animation-tutorial/ 
 *  
 *  @author PUZ
 *  @version 2021-03-05
 */
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.util.Duration;
 
public class ScaleTransitionExperiment extends Application {
 
  @Override
  public void start(Stage primaryStage) throws Exception {
    Button btn = new Button("Genuine Coder");
    Group group = new Group(btn);
    Scene scene = new Scene(group, 600, 600);
 

    //Duration = 2.5 seconds
    Duration duration = Duration.millis(10000);
    //Create new scale transition
    ScaleTransition scaleTransition = new ScaleTransition(duration, btn);
    //Set how much X should enlarge
    scaleTransition.setByX(1.5);
    //Set how much Y should
    scaleTransition.setByY(1.5);
    
    
    scaleTransition.play();
 
    primaryStage.setScene(scene);
    primaryStage.show();
  }
 
  public static void main(String[] args) {
    Application.launch(args);
  }
}