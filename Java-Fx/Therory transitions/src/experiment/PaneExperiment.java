package experiment;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PaneExperiment extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {

        Pane  pane  = new Pane();
        Label label = new Label("Hello Pane");
        label.setLayoutX(100d);
        label.setLayoutY(200d);
        
        pane.getChildren().add(label);

        Scene scene = new Scene(pane, 600,600);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}