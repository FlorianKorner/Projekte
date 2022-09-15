package experiment.sprite;

import javafx.scene.image.Image;
import javafx.scene.canvas.GraphicsContext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.geometry.Rectangle2D;

public class Sprite
{
    private Image image;

	private double positionX;
    private double positionY;
    
    private double width;
	private double height;

    public Sprite()
    {
        positionX = 0;
        positionY = 0;
    }


	// height/width: nur Getters
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	
	// Position: get/Set
	public void setPositionX(double positionX) {
		this.positionX = positionX;
	}

	public void setPositionY(double positionY) {
		this.positionY = positionY;
	}
	public double getPositionX() {
		return positionX;
	}
	public double getPositionY() {
		return positionY;
	}	
	
    public void setImage(String filename)
    {
    	
    	Image i = null;
		try {
			i = new Image(new FileInputStream(filename));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        setImage(i);
    }
    public void setImage(Image i)
    {
        image = i;
        width = i.getWidth();
        height = i.getHeight();
    }

    
    public void translateBy(double x, double y)
    {
        positionX = positionX + x;
        positionY = positionY + y;
    }
    public void setPosition(double x, double y)
    {
        positionX = x;
        positionY = y;
    }


    public void render(GraphicsContext gc)
    {
        gc.drawImage( image, positionX, positionY );
    }

    public Rectangle2D getBoundary()
    {
        return new Rectangle2D(positionX,positionY,width,height);
    }
    
    public boolean intersects(Sprite s)
    {
        return s.getBoundary().intersects(this.getBoundary());
    }
    
    public String toString()
    {
        return " Position: [" + positionX + "," + positionY + "]";
    }
}