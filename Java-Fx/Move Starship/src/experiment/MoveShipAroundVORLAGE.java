package experiment;

/** 
 * Source: Aufgabe: Starship bewegen VORLAGE

 *  
 *  @author: PUZ
 *  @version: 2021-03-17
 */
import java.io.FileInputStream;

import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MoveShipAroundVORLAGE extends Application {

	private static final int DURATION = 500;
	private static final int SHIP_HEIGHT = 90;
	private static final int SHIP_WIDTH = 90;
	private static final int HEIGHT = 600;
	private static final int WIDTH = 800;
	private int angle = 0;
	private String Orientation= "North";
	private String Postion = "A";
	

//	private ShipOrientation shipOrientation;
//	private ShipPosition shipPosition;

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Starship bewegen");

		FileInputStream input = new FileInputStream("src/res/green_ship.png");
		Image image = new Image(input, SHIP_WIDTH, SHIP_HEIGHT, true, true);
		ImageView ivGreenShip = new ImageView(image);
		ivGreenShip.setLayoutX(0d);
		ivGreenShip.setLayoutY(0d);

		Button btnA = new Button("A");
		Button btnB = new Button("B");
		Button btnC = new Button("C");
		Button btnD = new Button("D");
		
		Button btnTask1 = new Button("Task1");
		Button btnTask2 = new Button("Task2");
		Button btnRotate = new Button("Rotate");
		Button btnTranslate = new Button("Translate");

		HBox hboxButton = new HBox(10, btnTask1, btnTask2, 
				
				                       btnRotate, btnTranslate);
		hboxButton.setLayoutX(100d);
		hboxButton.setLayoutY(100d);

		Pane mainPane = new Pane();
		mainPane.getChildren().add(hboxButton);
		mainPane.getChildren().add(ivGreenShip);

		Scene scene = new Scene(mainPane, WIDTH, HEIGHT);
		primaryStage.setScene(scene);
		primaryStage.show();

		btnTask1.setOnAction(e -> doTask1(ivGreenShip, DURATION));
		btnTask2.setOnAction(e -> doTask2(ivGreenShip, DURATION));
		btnRotate.setOnAction(e -> doRotate(ivGreenShip));
		btnTranslate.setOnAction(e -> doTranslate(ivGreenShip));
		


	}

	/**
	 *  translate to right direction when possible
	 *  
	 * @param ivGreenShip
	 */
	private void doTranslate(Node node) {
		TranslateTransition move =new TranslateTransition(new Duration(DURATION), node);
		
		if(this.Postion == "A" && this.Orientation == "East") {
			move.setByX(690);
			this.Postion="B";
		}
		else if(this.Postion == "A" && this.Orientation != "East"){
			Alert a =new Alert(Alert.AlertType.WARNING);
			a.setContentText("Orentation must be East");
			a.show();
		}
		
		else if(this.Postion == "B" && this.Orientation == "South") {
			move.setByY(490);
			this.Postion="C";
		}
		else if(this.Postion == "B" && this.Orientation != "South"){
			Alert a =new Alert(Alert.AlertType.WARNING);
			a.setContentText("Orentation must be South");
			a.show();
		}
		
		else if(this.Postion == "C" && this.Orientation == "West") {
			move.setToX(0);
			this.Postion="D";
		}
		else if(this.Postion == "C" && this.Orientation != "West"){
			Alert a =new Alert(Alert.AlertType.WARNING);
			a.setContentText("Orentation must be West");
			a.show();
			}
		
		else if(this.Postion == "D" && this.Orientation == "North") {
			move.setToY(0);
			this.Postion="A";
		}
		else if(this.Postion == "D" && this.Orientation != "North"){
			Alert a =new Alert(Alert.AlertType.WARNING);
			a.setContentText("Orentation must be North");
			a.show();
		}
		move.play();
	}	
	/**
	 *  rotate Node clockwise for 90 deg
	 * @param node
	 */
	private void doRotate(Node node) {
		RotateTransition rotate = new RotateTransition(new Duration(DURATION), node);
		rotate.setByAngle(90f);
		angle+=90;
		if(angle==360) {
			angle=0;
			}
		
		if(this.angle ==0 || this.angle ==360) {
			this.Orientation="North";
			System.out.println("North");
		}
		else if (this.angle==90) {
			this.Orientation="East";
			System.out.println("East");
		}
		else if (this.angle==180) {
			this.Orientation="South";
			System.out.println("South");
		}
		else if (this.angle==270) {
			this.Orientation="West";
			System.out.println("West");
		}
		rotate.play();
		
	}

	
	public void doTask1(Node node, int duration) {
		TranslateTransition transition0 = new TranslateTransition(new Duration(DURATION), node);
		transition0.setToX(690);
		transition0.setToY(0);
		//xCoordinate+=SHIP_HEIGHT+600;
		TranslateTransition transition1 = new TranslateTransition(new Duration(DURATION), node);
		transition1.setToX(690);
		transition1.setToY(490);
		//yCoordinate+=SHIP_HEIGHT+600;
		TranslateTransition transition2 = new TranslateTransition(new Duration(DURATION), node);
		transition2.setToX(0);
		transition2.setToY(490);
		
		TranslateTransition transition3 = new TranslateTransition(new Duration(DURATION), node);
		transition3.setToX(0);
		transition3.setToY(0);
		SequentialTransition seqT = new SequentialTransition(transition0, transition1, transition2, transition3);
		seqT.play();
		
	}
	public void doTask2(Node node, int duration) {
		double angle =0;
		TranslateTransition transition0 = new TranslateTransition(new Duration(DURATION), node);
		transition0.setToX(690);
		transition0.setToY(0);
		RotateTransition rotate0 =new RotateTransition(new Duration(DURATION), node);
		rotate0.setByAngle(angle+90f);
		angle+=90f;
		ParallelTransition parTrans0 = new ParallelTransition(node, transition0, rotate0);
		//xCoordinate+=SHIP_HEIGHT+600;
		
		TranslateTransition transition1 = new TranslateTransition(new Duration(DURATION), node);
		transition1.setToX(690);
		transition1.setToY(490);
		RotateTransition rotate1 =new RotateTransition(new Duration(DURATION), node);
		ParallelTransition parTrans1 = new ParallelTransition(node, transition1, rotate1);
		rotate1.setToAngle(angle+90f);
		angle+=90f;
		//yCoordinate+=SHIP_HEIGHT+600;
		
		TranslateTransition transition2 = new TranslateTransition(new Duration(DURATION), node);
		transition2.setToX(0);
		transition2.setToY(490);
		RotateTransition rotate2 =new RotateTransition(new Duration(DURATION), node);
		ParallelTransition parTrans2 = new ParallelTransition(node, transition2, rotate2);
		rotate2.setToAngle(angle+90f);
		angle+=90f;
		
		TranslateTransition transition3 = new TranslateTransition(new Duration(DURATION), node);
		transition3.setToX(0);
		transition3.setToY(0);
		RotateTransition rotate3 =new RotateTransition(new Duration(DURATION), node);
		ParallelTransition parTrans3 = new ParallelTransition(node, transition3, rotate3);
		rotate3.setToAngle(angle+90f);
		angle+=90f;
		
		SequentialTransition seqT = new SequentialTransition(parTrans0, parTrans1, parTrans2, parTrans3);
		seqT.play();
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}