package experiment.sprite;

import java.util.Random;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MoveCat extends Application {

	// variable
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;


	

	private long frameCount = 0; 
	private boolean gameStarted = false;

	private int scoreCat = 0;
	private Sprite cat;
	
	private int scoreMouse = 0;
    private Sprite rat;

    private int scoreDog = 0;
    private Sprite dog;

    private int catSpeedX = 0;
    private int catSpeedY = 0;

    private double dogSpeedX = 10;
    private double dogSpeedY = 10;

	public void start(Stage stage) throws Exception {
		stage.setTitle("Move Cat  (v.0.1) VORLAGE");
		// background size
		Canvas canvas = new Canvas(WIDTH, HEIGHT);
		GraphicsContext gc = canvas.getGraphicsContext2D();

		// JavaFX Timeline: free form animation defined by KeyFrames and their duration
		Timeline tl = new Timeline(new KeyFrame(Duration.millis(100), e -> run(gc)));
		// number of cycles in animation INDEFINITE = repeat indefinitely
		tl.setCycleCount(Timeline.INDEFINITE);

		// mouse control (move and click)
		canvas.setOnMouseMoved(e -> {
			System.out.println("mouse moved");
		});

		canvas.setOnMouseClicked(e -> {
			System.out.println("mouse clicked");
			gameStarted = !gameStarted;
			scoreCat = 0;
            scoreDog = 0;
            frameCount=0;
		});
		
		
		stage.addEventHandler(KeyEvent.KEY_PRESSED, (event) -> {
			System.out.println(event.getCode());
			
			System.out.println("key pressed");
			if (event.getCode() == KeyCode.UP||event.getCode() == KeyCode.W) {
				cat.setPosition(cat.getPositionX(), cat.getPositionY()-1);
				
			} else if (event.getCode() == KeyCode.DOWN||event.getCode() == KeyCode.S) {
				cat.setPosition(cat.getPositionX(), cat.getPositionY()+1);
				
			} else if (event.getCode() == KeyCode.LEFT||event.getCode() == KeyCode.A) {
				cat.setPosition(cat.getPositionX()-1, cat.getPositionY());
				
			}	else if (event.getCode() == KeyCode.RIGHT||event.getCode() == KeyCode.D) {
				cat.setPosition(cat.getPositionX()+1, cat.getPositionY());
				
			}
			

		});
		cat = new Sprite();
		cat.setImage("res/images/cat-small.png");
		cat.setPosition(WIDTH/2, HEIGHT/2);
		
		stage.setScene(new Scene(new StackPane(canvas)));
		stage.show();
		tl.play();
	}

	private void run(GraphicsContext gc) {

		
		// Bewegung von Sprites / Logik
		//////////////////////////////////////////////////////
		Random random = new Random();
		
		if (gameStarted) {
			frameCount++;
			cat.setPositionX(cat.getPositionX()+catSpeedX);
            cat.setPositionY(cat.getPositionY()+catSpeedY);

            if(cat.getPositionX()>WIDTH) {
                cat.setPositionX(0-cat.getWidth());
            }
            if(cat.getPositionX()<-cat.getWidth()) {
                cat.setPositionX(WIDTH);
            }
            if(cat.getPositionY()<0- cat.getHeight()) {
                cat.setPositionY(HEIGHT);
            }
            if(cat.getPositionY()>HEIGHT) {
                cat.setPositionY(0-cat.getHeight());
            }
            if(cat.intersects(dog)) {
                dog.setPosition(random.nextInt((int) (WIDTH-dog.getWidth())), random.nextInt((int) (HEIGHT-dog.getHeight())));
                scoreDog++;

                dogSpeedX = dogSpeedY = Math.random() + 0.2;

            }
            if(cat.intersects(rat)) {
                rat.setPosition(random.nextInt((int) (WIDTH-rat.getWidth())), random.nextInt((int) (HEIGHT-rat.getHeight())));
                scoreCat++;
            }

            dog.setPositionX(dog.getPositionX()+dogSpeedX);
            dog.setPositionY(dog.getPositionY()+dogSpeedY);

            if(dog.getPositionY() >= HEIGHT - dog.getHeight()) {
                dogSpeedY = -dogSpeedY;
            }
            if(dog.getPositionY() <= 0) {
                dogSpeedY = -dogSpeedY;
            }
            if(dog.getPositionX() >= WIDTH - dog.getWidth()) {
                dogSpeedX = -dogSpeedX;
            }
            if(dog.getPositionX() <= 0) {
                dogSpeedX = -dogSpeedX;
            }

            if(scoreDog==5) {
                System.out.println("dog wins");
                gameStarted=false;
            }
            if(scoreCat==5) {
                System.out.println("cat wins");
                gameStarted=false;
            }



		}
		// RENDER / ZEICHEN VON SPRITES
		///////////////////////////////////////////////////////
		// set graphics
		// set background color
		gc.setFill(Color.ANTIQUEWHITE);
		gc.fillRect(0, 0, WIDTH, HEIGHT);

		// set text
		gc.setFill(Color.CADETBLUE);
		gc.setFont(Font.font(25));
		// set the start text
		gc.setStroke(Color.WHITE);
		gc.setTextAlign(TextAlignment.CENTER);
		if (!gameStarted) {
			gc.fillText("Click to Start", WIDTH / 2, HEIGHT / 2);
		}
		// score
		gc.fillText("Cat: " + scoreCat + "\t\tDog: " + scoreDog +"\t\t\t\t\t\t" + frameCount, WIDTH / 2, 100);


		cat.render(gc);
		rat.render(gc);
	    dog.render(gc);
	        
	}

	// start the application
	public static void main(String[] args) {
		launch(args);
	}
}