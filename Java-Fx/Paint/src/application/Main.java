package application;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	private Stage primaryStage;
	@Override
    public void start(Stage stage) throws Exception {
        primaryStage = stage;
        FXMLLoader fxloader = new FXMLLoader(this.getClass().getResource("graphical interface.fxml"));

        try {
            primaryStage.setScene(new Scene(fxloader.load()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        primaryStage.getIcons().add(new Image(this.getClass().getResourceAsStream("/res/pics/icon.jpg")));
        
        primaryStage.setTitle("Paint by Florian Körner");
        primaryStage.show();
    }
	
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
