/**
 * class Image
 * 
 * @author Andreas Schenk 
 * @version 2007-01-28
 */

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class SimpleImage extends JPanel
{
    private BufferedImage image;
    private int width, height;
    private String fileName = "test.png";
    private JFrame frame;
    public SimpleImage()
    {
        this(300, 300);
    }
    public SimpleImage(int width, int height)
    {
        super();
        if (width < 1 || height < 1 || width > 1000 || height > 1000)
        {
            throw new IllegalArgumentException("Image size not possible: width = " + width + " height = " + height);
        }
        this.width = width;
        this.height = height;
        image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

        frame = new JFrame("Simple Image");
        frame.add(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(width, height));
        frame.setResizable(false);
        frame.pack();      
        frame.setVisible(true);
    }
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(image,0,0,null);
    }
    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }
    public void setRGB(int column, int row, int r, int g, int b)
    {
        if (row < 0 || column < 0 || row >= width || column >= height)
        {
            throw new IllegalArgumentException("Pixel coordinates wrong: row = " + row + " column = " + column);
        }
        if (r < 0 || g < 0 || b < 0 || r > 255 || g > 255 || b > 255)
        {
            throw new IllegalArgumentException("Pixel color wrong: r = " + r + " g = " + g + " b = " +b);            
        }
        image.setRGB(column, row, ((r & 0xff) << 16) | ((g & 0xff) << 8) | (b & 0xff));
    }
    public void save()
    {   
        try
        {
            File file = new File(fileName);
            ImageIO.write(image, "png", file);
            System.out.println("File saved to " +  fileName);
        }
        catch (Exception e)
        {
            System.out.println("Fehler: " + e.getMessage());
        }
    }
    public void saveAs(String fileName)
    {
        if (fileName != null && fileName.length() > 0)
        {
            if (!fileName.endsWith(".png"))
                this.fileName = fileName+".png";
            save();
        }
        else
        {
            System.out.println("Please choose a suitable file name!");
        }
    }
}
