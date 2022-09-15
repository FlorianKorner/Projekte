package experiment;

import java.io.FileInputStream;

import javafx.animation.RotateTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
/** 
 * Source: 
 *  http://tutorials.jenkov.com/javafx/group.html
 *  
 *  @author: PUZ
 *  @version: 2021-03-05
 */
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.Node; 
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;


public class SequentialTransitionGroup extends Application  {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Group Experiment 1");

        // Child nodes: 
        Button button1 = new Button("Button Number 1 (0,0)");
        //
        Button button2 = new Button("Button 2 (100,50)");
        button2.setLayoutX(100d);
        button2.setLayoutY(50d);        
        //        
        FileInputStream input = new FileInputStream(
        		"src/res/images/green_ship.png");
        Image image = new Image(input);
        ImageView ivGreenShip = new ImageView(image);
        ivGreenShip.setLayoutX(100d);
        ivGreenShip.setLayoutY(50d);	

        Group group = new Group();

        group.getChildren().add(button1);
        group.getChildren().add(button2);
        group.getChildren().add(ivGreenShip);
        
//        Button button3 = new Button("CLICK ME");
//        button3.setOnAction(e -> moveIt(group, 1000));
        VBox vboxMain = new VBox(10, /*button3, */ group);
        
        Scene scene = new Scene(vboxMain, 800,  600);
        primaryStage.setScene(scene);
        primaryStage.show();
        
 
        
    }

	/**
	 * @param group
	 */
	public void moveIt(Node node, int duration) {
		
		// Setting durations for the transitions
		Duration dur1 = Duration.millis(duration);
		Duration dur2 = Duration.millis(duration);
		
		// Setting Translate transition
		TranslateTransition translate = new TranslateTransition(dur1);
		translate.setToX(200f);
		translate.setToY(100f);		
		translate.setCycleCount(3);
		translate.setAutoReverse(true);

		// Setting Rotate Transition
		RotateTransition rotate = new RotateTransition(dur2);
		rotate.setByAngle(90f);
		rotate.setCycleCount(5);
		rotate.setAutoReverse(true);
		
		SequentialTransition seqT = new SequentialTransition(node, translate, rotate);
		// playing the transition
		seqT.play();
		
		
	}

    public static void main(String[] args) {
        Application.launch(args);
    }
}
