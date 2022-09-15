package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Layouting 2");

        TextField txtName = new TextField("");
        TextField txtSurname = new TextField("");

        
        Button button = new Button ("Klick me!");
        
        
        HBox nameControls = new HBox(15, txtName);
        HBox surnnameControls = new HBox(5, txtSurname);
 
        HBox personButtons = new HBox(10, button);
        VBox personControls = new VBox(18, nameControls, surnnameControls, personButtons);

        HBox mainBox = new HBox(13, personControls);

        button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Button Click Event!");
				System.out.println(txtName);
				System.out.println(txtSurname);
			}
		});
        
        Scene scene = new Scene(mainBox, 900, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);

    }
}
