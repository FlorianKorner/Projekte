/**
 * class ImageAlgorithms
 * 
 * @author Andreas Schenk 
 * @version 2007-01-28
 */
public class ImageAlgorithms
{
    SimpleImage image;
    private ImageAlgorithms()
    {
    }

    public ImageAlgorithms(SimpleImage image)
    {
        this.image = image;
    }

    public void horizontalLine(int line, int start, int end, int r, int g, int b)
    {
        for(int counter = start; counter <= end; counter++)
        {
            image.setRGB(counter, line, r, g, b);
        }
    }  

    public void verticalLine(int line, int start, int end, int r, int g, int b)
    {
        for(int counter = start; counter <= end; counter++)
        {
            image.setRGB(line, counter, r, g, b);
        }
    }

    public void square(int left, int top, int width, int height, int r, int g, int b)
    {
        for(int counter = left; counter <= width; counter++)
        {
            image.setRGB(counter, width, r, g, b);
        }
        for(int counter = top; counter <= height; counter++)
        {
            image.setRGB(height, counter, r, g, b);
        }
        for(int counter = left; counter <= width; counter++)
        {
            image.setRGB(counter, left, r, g, b);
        }
        for(int counter = top; counter <= height; counter++)
        {
            image.setRGB(top, counter, r, g, b);
        }
    }

    public void rectangle(int left, int top, int width, int height, int r, int g, int b)
    {
        horizontalLine(top, left, left + width, r, g, b);
        verticalLine(left, top, height + top, r, g, b);
        horizontalLine(height + top, left, width + left, r, g, b);
        verticalLine(width + left, top, height + top, r, g, b);
    }

    public void triangle(int left, int top, int width, int height, int r, int g, int b)
    {   for(int counter = left; counter <= width; counter++){
            verticalLine(counter, top, counter, r, g, b);
        }
    }

    public void filledRectangle(int left, int top, int width, int height, int r, int g, int b)
    {   for(int counter = left; counter <= width; counter++){
            verticalLine(counter, top, height, r, g, b);
        }
    }

    public void filledSquare(int left, int top, int width, int r, int g, int b)
    {
        for(int cCounter = width; cCounter > 0; cCounter--)
        {
            horizontalLine(top, left, left+width, r, g, b);
            top++;
        }
    } 

    public void withstripesRectangle(int left, int top, int width, int height, int r1, int g1, int b1, int r2, int g2, int b2)
    {
        for(int counter = left; counter <= width; counter++){
            if(counter % 2 == 0){
                verticalLine(counter, top, height, r1, g1, b1);
            }
            else verticalLine(counter, top, height, r2, g2, b2);
        }
    }

    public void filledRectangle2(int left, int top, int width, int height, int r1, int g1, int b1, int r2, int g2, int b2) {  
        for(int rC = 0; rC < 100; rC++)
        {
            for(int cC = 0; cC < 100; cC++)
            {
                if((cC + rC) % 2 == 0)  image.setRGB(left +rC,top + cC, r1, g1, b1);
                else image.setRGB(left + rC,top + cC, r2, g2, b2);
            }
        }

    }

    public void filledRectangle2s(int left, int top, int width, int height, int r1, int g1, int b1, int r2, int g2, int b2, int stripeWidth, int repeat)
    {
        for(int rCounter = 0;rCounter < repeat; rCounter++)
        {
            filledRectangle(left, top, width, stripeWidth, r1, g1, b1);
            top+=stripeWidth;
            filledRectangle(left,top,width,stripeWidth,r2,g2,b2);
            top+=stripeWidth;
        }
    } 

    public void chessBoard(int left, int top, int width)
    {
        for(int rC = 0; rC <= 8; rC++)
        {
            for(int cC = 0; cC < 8; cC ++){             
                if((rC + cC) % 2 == 0)filledSquare(top + rC * width , left + cC * width, width, 0, 0, 0);
                else filledSquare(top + rC * width, left + cC * width, width, 255, 255, 255);                                   
            }
        } 
    }  

    public void diagonalLineDown(int startColumn, int startRow, int endColumn, int r, int g, int b)
    {
        for (int ct = 0; ct <= endColumn - startColumn; ct++)
        {
            image.setRGB(startColumn + ct, startRow + ct, r, g, b);
        }
    }

    public void diagonalLineUp(int startColumn, int startRow, int endColumn, int r, int g, int b)
    {
        for(int ct = endColumn; ct >= 0; ct--)
        {
            image.setRGB(endColumn - ct, startRow + ct, r, g, b);
        }
    }
    
    public void triangle(int line, int start, int end, int r, int g, int b){
        horizontalLine();
        diagonalLineDown();
        diagonalLineUp(start,end);
    }
}