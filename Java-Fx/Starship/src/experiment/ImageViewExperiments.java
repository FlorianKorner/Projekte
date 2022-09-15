package experiment;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.io.FileInputStream;

public class ImageViewExperiments extends Application {


	    @Override
	    public void start(Stage primaryStage) throws Exception {
	        primaryStage.setTitle("ImageView Experiment 1");

	        FileInputStream input = 
	        		new FileInputStream("res/images/crew/free/Spock_2268.jpg");
	        Image image = new Image(input);
	       
	        ImageView iview1 = new ImageView(image);
	        iview1.setFitWidth(550);
	        iview1.setFitHeight(200);
	        iview1.setPreserveRatio(true);
	        
	        HBox hbox = new HBox(iview1);

	        Scene scene = new Scene(hbox, 600, 600);
	        primaryStage.setScene(scene);
	        primaryStage.show();

	    }

	    public static void main(String[] args) {
	        Application.launch(args);
	    }
}