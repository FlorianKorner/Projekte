package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application  {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("GridPane Experiment");

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button 6");

        GridPane gridPane = new GridPane();

        gridPane.add(button1, 0, 0);
        gridPane.add(button2, 1, 0);
        gridPane.add(button3, 2, 0);
        gridPane.add(button4, 0, 1);
        gridPane.add(button5, 1, 1);
        gridPane.add(button6, 2, 1);
        
        
        TextField txt1= new TextField("Text 1");
        TextField txt2= new TextField("Text 2");
        TextField txt3= new TextField("Text 3");
        TextField txt4= new TextField("Text 4");
        TextField txt5= new TextField("Text 5");
        TextField txt6= new TextField("Text 6");
        
        gridPane.add(txt1, 0, 5);
        gridPane.add(txt2, 2, 5);
        gridPane.add(txt3, 2, 6);
        gridPane.add(txt4, 0, 7);
        gridPane.add(txt5, 1, 8);
        gridPane.add(txt6, 2, 9);

        Scene scene = new Scene(gridPane, 240, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}