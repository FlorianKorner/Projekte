package experiment;

import java.io.FileInputStream;

import javafx.animation.ParallelTransition;
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


public class SequentialAndParallelGroup extends Application  {


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
        
        Button btnSequential = new Button("Sequential Transition");
        Button btnParallel = new Button("Parallel Transition");
        VBox hboxButton = new VBox(10, btnSequential, btnParallel);
        VBox vboxMain = new VBox(10, hboxButton, group);
        
        Scene scene = new Scene(vboxMain, 800,  600);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        btnSequential.setOnAction(e -> moveItSequential(group, 1000));
        btnParallel.setOnAction(e -> moveItParallel(group, 1000));
        
    }

	/**
	 * @param group
	 */
	public void moveItSequential(Node node, int duration) {
		
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
		
		SequentialTransition seqTrans = new SequentialTransition(node, translate, rotate);
		seqTrans.play();
		
	}

	public void moveItParallel(Node node, int duration) {
		
		// Setting durations for the transitions
		Duration dur1 = Duration.millis(duration);
		Duration dur2 = Duration.millis(duration);
		
		// Setting Translate transition
		TranslateTransition translate = new TranslateTransition(dur1);
		translate.setToX(200f);
		translate.setToY(100f);		
		translate.setCycleCount(5);
		translate.setAutoReverse(true);

		// Setting Rotate Transition
		RotateTransition rotate = new RotateTransition(dur2);
		rotate.setByAngle(90f);
		rotate.setCycleCount(4);
		rotate.setAutoReverse(true);
		

		
        ParallelTransition parTrans = new ParallelTransition(node, translate, rotate);
        
        parTrans.play();
		
	}

	public static void main(String[] args) {
        Application.launch(args);
    }
}
