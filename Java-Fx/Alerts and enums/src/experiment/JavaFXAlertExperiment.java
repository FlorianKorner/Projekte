package experiment;
/**
 *  source: https://www.geeksforgeeks.org/javafx-alert-with-examples/
 */
// Java Program to create alert of different 
// types and display them 

import java.util.Optional;

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.*; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.control.*; 
import javafx.stage.Stage; 
import javafx.scene.control.Alert.AlertType; 

public class JavaFXAlertExperiment extends Application { 

	// launch the application 
	public void start(Stage s) 
	{ 
		// set title for the stage 
		s.setTitle("creating alerts"); 

		// create a button 
		Button btnConfirmation 	= new Button("Confirmation alert"); 
		Button btnError 		= new Button("error alert"); 
		Button btnInformation 	= new Button("Information alert"); 
		Button btnWarning 		= new Button("Warning alert"); 

		// create a tile pane 
		TilePane r = new TilePane(); 

		// create a alert 
		Alert a = new Alert(AlertType.NONE); 

		// action events 		
		btnError.setOnAction(e -> {
			a.setAlertType(AlertType.ERROR);  
			a.show(); 
		});
		btnInformation.setOnAction(e -> {
			a.setAlertType(AlertType.INFORMATION);  
			a.setContentText("This is what I want to say to you.");
			a.setTitle("This is the title string");
			a.setHeaderText("this is your header text");
			a.show(); 
		});
		btnWarning.setOnAction(e -> {
			a.setAlertType(AlertType.WARNING);  
			a.show(); 
		});
		btnConfirmation.setOnAction(e -> {
			// set alert type 
			a.setAlertType(AlertType.CONFIRMATION); 
			// show the dialog 	
			// a.show(); 
			// react to selection
			 Optional<ButtonType> result = a.showAndWait();
			 if (result.isPresent() && result.get() == ButtonType.OK) {
			     formatSystem();
			 }			
		});			
		
// REMINDER: HOWTO without lambda function 
//
//		// action event 
//		EventHandler<ActionEvent> event3 = new
//						EventHandler<ActionEvent>() { 
//			public void handle(ActionEvent e) 
//			{ 
//				// set alert type 
//				a.setAlertType(AlertType.WARNING); 
//
//				// show the dialog 
//				a.show(); 
//			} 
//		}; 
//
//		// when button is pressed  
//		btnWarning.setOnAction(event3); 

		// add button 
		r.getChildren().add(btnConfirmation); 
		r.getChildren().add(btnError); 
		r.getChildren().add(btnInformation); 
		r.getChildren().add(btnWarning); 

		// create a scene 
		Scene sc = new Scene(r, 300, 300); 

		// set the scene 
		s.setScene(sc); 

		s.show(); 
	} 

	private void formatSystem() {
		// TODO Auto-generated method stub
		System.out.println("Formatting a system, please wait ...");
	}

	public static void main(String args[]) 
	{ 
		// launch the application 
		launch(args); 
	} 
} 
