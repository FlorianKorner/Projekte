package application;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.imageio.ImageIO;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.scene.ImageCursor;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;

/**
 * This Program works like paint you can draw lines, 
 * change the colour you draw in and draw shapes
 * 
 * @author Florian Körner
 *
 */
public class Controller {
	@FXML
	private Canvas canvas;
	@FXML
	private ColorPicker colorPicker;
	@FXML
	private ColorPicker colorPicker1;
	@FXML
	private BorderPane borderPane;
	@FXML
	private MenuBar menuBar;
	
	public Canvas getCanvas() {
		return canvas;
	}
	private boolean draw = true;
	private Desktop desktop = Desktop.getDesktop();
	private Image image = new Image(this.getClass().getResourceAsStream("/res/pics/icon2.png"));
	private Double lastPosX;
	private Double lastPosY;
	
    
	
										//TODO draw
							 	//lines between the points DONE
	private int size =1;
	
										// draw with lines
	private void draw(int size) {
		if(this.draw==true) {
		this.canvas.setOnMouseDragged(event -> {
				this.size=size;
				
//				System.out.println("reached");
				

				if(this.lastPosX == null) this.lastPosX = event.getX();
				if(this.lastPosY == null) this.lastPosY = event.getY();
				
				this.canvas.getGraphicsContext2D().setLineWidth(size);
				
				this.canvas.getGraphicsContext2D().setStroke(this.colorPicker.valueProperty().getValue());
				this.canvas.getGraphicsContext2D().strokeLine(event.getX()+8, event.getY()+image.getHeight()/8+4,
															  this.lastPosX+8, this.lastPosY+image.getHeight()/8+4);
				this.lastPosX = event.getX();
				this.lastPosY = event.getY();
				
			});
			this.canvas.setOnMousePressed(event -> {
//				System.out.println("SET");
				this.lastPosX = event.getX();
				this.lastPosY = event.getY();
			});
			this.canvas.setOnMouseClicked(event -> {
				this.canvas.getGraphicsContext2D().setFill(this.colorPicker.valueProperty().getValue());
				this.canvas.getGraphicsContext2D().fillOval(event.getX()+8, event.getY()+image.getHeight()/8+4, size, size);
				this.size=size;
//				this.canvas.getGraphicsContext2D().fillRect(event.getX()+8, event.getY()+image.getHeight()/8+4, 
//															event.getX()+8-event.getX()+8, size);
			});
		}
	}
	
									//draw without lines
//	private void draw(int size) {
//		if(this.draw==true) {
//		this.canvas.setOnMouseDragged(event -> {
//				this.size=size;
//		this.canvas.getGraphicsContext2D().fillOval(event.getX()+8, event.getY()+image.getHeight()/8+4, size, size);
//				
//				
//			});
//			this.canvas.setOnMouseClicked(event -> {
//				this.size=size;
//				this.canvas.getGraphicsContext2D().fillOval(event.getX()+8, event.getY()+image.getHeight()/8+4, size, size);
//			});
//		}
//	}
	
	
	/*
	this.canvas.getGraphicsContext2D().fillOval(event.getX()+8, event.getY()+image.getHeight()/8+4, size, size);
	this.canvas.getGraphicsContext2D().lineTo(event.getX()+8, event.getY()+image.getHeight()/8+4);
	
				//connecting the dots on the canvas with "Rect's"
	this.canvas.getGraphicsContext2D().fillRect(event.getX()+8, event.getY()+image.getHeight()/8+4, 
												size, size);
	this.canvas.getGraphicsContext2D().lineTo(event.getX()+8, event.getY());
	
	System.out.println("X: "+this.lastPosX+"\nY: "+this.lastPosY);
	
	
	/// !!!!from Fanzott!!!!!!
	   
    setOnMousePressed(new EventHandler<MouseEvent>() {​​​​​​​
    @Override
    public void handle(MouseEvent event) {​​​​​​​
       
        if (event.getButton()==MouseButton.PRIMARY){​​​​​​​
            draw=true;
        }​​​​​​​
        if (event.getButton()==MouseButton.SECONDARY){​​​​​​​
            draw=false;
           
        }​​​​​​​
        if (true) return;


     //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
       
        if (draw){​​​​​​​
            gc.setFill(colorpicker.getValue);
            gc.setLineWidth(10.0);
           
            gc.strokeLine(lastX, lastY, event.getX(), event.getY());
       
            lastX=event.getX();
            lastY=event.getY();
        }​​​​​​​
        System.out.println("show:"+event.getX()+"/"+event.getY());
        if (true) return;
     //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/
													//TODO initialize
	@FXML
	public void initialize() {
		this.canvas.setCursor(new ImageCursor(new Image(this.getClass().getResourceAsStream("/res/pics/icon2.png"))));
		
		if(this.draw==true) {
			this.canvas.setOnMouseDragged(event -> {
				this.draw(1);
//				this.lastPosX = event.getX();
//				this.lastPosY = event.getY();
//				System.out.println("X: "+this.lastPosX+"\nY: "+this.lastPosY);
//				this.canvas.getGraphicsContext2D().fillOval(event.getX()+3, event.getY()+image.getHeight()/8, 10, 10);
//				this.size=10;
			});
			
			this.canvas.setOnMouseClicked(event -> {
				this.draw(10);
//				this.canvas.getGraphicsContext2D().fillOval(event.getX()+3, event.getY()+image.getHeight()/8, 10, 10);
//				this.size=10;
			});
		}
		
		
		// color
		this.colorPicker.valueProperty().set(Color.BLACK);
//		Color.DIMGREY
		this.colorPicker1.valueProperty().set(Color.WHITESMOKE);
		this.colorPicker1.valueProperty().addListener((observable, oldValue, newValue) -> {
			this.fillWithCustomColor(newValue);
		});
		
		
		// canvas adjustment
		this.canvas.widthProperty().bind(this.borderPane.widthProperty());
		this.canvas.heightProperty().bind(this.borderPane.heightProperty().subtract(this.menuBar.heightProperty()));
		
	}
	
											//TODO brushes
	@FXML
	public void superThinBrush() {
		this.draw=true;
		if(this.draw==true) {
			this.canvas.setOnMouseDragged(event -> {
				this.draw(1);
//				this.canvas.getGraphicsContext2D().fillOval(event.getX(), event.getY()+image.getHeight()/8, 1, 1);
//				this.size=1;
			});
			this.canvas.setOnMouseClicked(event -> {
				this.draw(1);
//				this.canvas.getGraphicsContext2D().fillOval(event.getX(), event.getY()+image.getHeight()/8, 1, 1);
//				this.size=1;
			});
		}
	}
	@FXML
	public void thinBrush() {
		this.draw=true;
		if(this.draw==true) {
			this.canvas.setOnMouseDragged(event -> {
				this.draw(3);
//				this.canvas.getGraphicsContext2D().fillOval(event.getX(), event.getY(), 3, 3);
//				this.size=3;
			});
			this.canvas.setOnMouseClicked(event -> {
				this.draw(3);
//				this.canvas.getGraphicsContext2D().fillOval(event.getX(), event.getY(), 3, 3);
//				this.size=3;
			});
		}
	}
	@FXML
	public void thickBrush() {
		this.draw=true;
		if(this.draw==true) {
			this.canvas.setOnMouseDragged(event -> {
				this.draw(6);
//				this.canvas.getGraphicsContext2D().fillOval(event.getX(), event.getY(), 6, 6);
//				this.size=6;
			});
			this.canvas.setOnMouseClicked(event -> {
				this.draw(6);
//				this.canvas.getGraphicsContext2D().fillOval(event.getX(), event.getY(), 6, 6);
//				this.size=6;
			});
		}
	}
	@FXML
	public void superThickBrush() {
		this.draw=true;
		
		if(this.draw==true) {
			this.canvas.setOnMouseDragged(event -> {
				this.draw(10);
//				this.canvas.getGraphicsContext2D().fillOval(event.getX(), event.getY(), 10, 10);
//				this.size=10;
			});
			this.canvas.setOnMouseClicked(event -> {
				this.draw(10);
//				this.canvas.getGraphicsContext2D().fillOval(event.getX(), event.getY(), 10, 10);
//				this.size=10;
			});
		}

	}
	
									//TODO colors
	
	@FXML
	public void chooseDrawingColor() {
		this.canvas.setOnMouseDragged(event -> {
			this.canvas.getGraphicsContext2D().setFill(colorPicker.getValue());
			this.draw(this.size);
//			this.canvas.getGraphicsContext2D().fillOval(event.getX(), event.getY(), this.size, this.size);
		});
		this.canvas.setOnMouseClicked(event -> {
			this.canvas.getGraphicsContext2D().setFill(colorPicker.getValue());
			this.draw(this.size);
//			this.canvas.getGraphicsContext2D().fillOval(event.getX(), event.getY(), this.size, this.size);
		});
	}
	
												//TODO	Save and open
	
	@FXML
	public void saveAsPng() {		
		FileChooser fc = new FileChooser();
	    fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("PNG","*.png"));
	    fc.setTitle("Save Picture");
	    File file = fc.showSaveDialog(this.borderPane.getScene().getWindow());
	    if(file != null){
	        WritableImage wi = new WritableImage((int)this.canvas.getWidth(),(int)this.canvas.getHeight());
	        try {
	        	ImageIO.write(SwingFXUtils.fromFXImage(canvas.snapshot(null,wi),null),"png",file);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
	
	@FXML
	public void openPictureAsCanvas() {
		final FileChooser fileChooser = new FileChooser();
		configureFileChooser(fileChooser);
        File file = fileChooser.showOpenDialog(this.borderPane.getScene().getWindow());
        if (file != null) {
        	try {
        		Image image = new Image(file.toURI().toURL().toExternalForm());
        	    this.canvas.getGraphicsContext2D().drawImage(image, 0, 0);
            } catch (MalformedURLException e) {
				e.printStackTrace();
			}
        }
        
	}
	private void openFile(File file) {
        try {
            desktop.open(file);
        } catch (IOException ex) {
           System.out.println(ex);
        }
    }
	private static void configureFileChooser(
	        final FileChooser fileChooser) {      
	            fileChooser.setTitle("View Pictures");
	            
	            fileChooser.getExtensionFilters().addAll(
	                new FileChooser.ExtensionFilter("All Images", "*.*"),
	                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
	                new FileChooser.ExtensionFilter("PNG", "*.png")
	            );
	    }
														//Fill the canvas with a selected color
	
	
	@FXML
	public void fillWithCustomColor(Color color) {
		this.canvas.getGraphicsContext2D().setFill(color);
		this.canvas.getGraphicsContext2D().fillRect(0, 0, this.canvas.getWidth(), this.canvas.getHeight());
	}
	

													// TODO		shapes
		private double PosClikedOnceX;
		private double PosClikedOnceY;
		
		private int shapeCounter=0;

	@FXML
	public void drawBox() {
		this.draw=false;
		if(this.draw==false) {
			
			this.canvas.setOnMouseClicked(event -> {
				if(this.shapeCounter==1) {
					this.shapeCounter++;
					
					this.PosClikedOnceX=event.getX();
					this.PosClikedOnceY=event.getY();
				}
			});
			
			this.canvas.setOnMouseClicked(event -> {
				this.shapeCounter++;
					if(this.shapeCounter==2) {
						this.shapeCounter=0;
						this.canvas.getGraphicsContext2D().fillRect(event.getX()-250, event.getY(),
																	event.getX()-this.PosClikedOnceX, 
																	event.getY()-this.PosClikedOnceY
																	/*width, height*/);
					}
			});
		}
	}
	
	@FXML
	public void drawOval() {
		this.draw=false;
		if(this.draw==false) {
			
			this.canvas.setOnMouseClicked(event -> {
				if(this.shapeCounter==1) {
					this.shapeCounter++;
					
					this.PosClikedOnceX=event.getX();
					this.PosClikedOnceY=event.getY();
				}
			});
			
			this.canvas.setOnMouseClicked(event -> {
				this.shapeCounter++;
					if(this.shapeCounter==2) {
						this.shapeCounter=0;
						this.canvas.getGraphicsContext2D().fillOval(event.getX()-500, event.getY(),
																	event.getX()-this.PosClikedOnceX, 
																	event.getY()-this.PosClikedOnceY
																	/*width, height*/);
					}
			});
		}
	}

	private double radius=100;
	@FXML
	public void drawCircle() {
		this.draw=false;
		if(this.draw==false) {
			
			if(this.shapeCounter==1) {
				this.canvas.setOnMouseClicked(event -> {
					if(this.shapeCounter==1) {
						this.shapeCounter++;
						
						this.PosClikedOnceX=event.getX();
						this.PosClikedOnceY=event.getY();
					}
				});
			}
			if(this.shapeCounter==2) {
				this.canvas.setOnMouseClicked(event -> {
					this.shapeCounter++;
						
							this.shapeCounter=0;
							this.radius=event.getX()-this.PosClikedOnceX;
							this.canvas.getGraphicsContext2D().fillOval(event.getX(), event.getY(),
																		radius, radius /*width, height*/);						
				});
			}
		}
	}
	
}