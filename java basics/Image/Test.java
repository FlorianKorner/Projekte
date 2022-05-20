
/**
 * Write a description of class Test here.
 * 
 * @author Andreas Schenk
 * @version 2007-01-28
 */
public class Test
{
    private SimpleImage image;
    private ImageAlgorithms algorithm;
    public Test()
    {
        image = new SimpleImage();
        algorithm = new ImageAlgorithms(image);
    }
    public void testHorizontalLine()
    {
        algorithm.horizontalLine(100, 50, 250, 255, 0, 0);
        image.repaint();
    }
    public void testHorizontalLine2()
    {
        algorithm.horizontalLine(200, 50, 250, 0, 0, 255);
        image.repaint();
        image.save();
    }
    public void testVericalLine()
    {
        algorithm.verticalLine(50, 200, 250, 0, 0, 255);
        image.repaint();
        
    }
    public void testSquare()
    {
        algorithm.square(100, 100, 200, 200, 0, 255, 0);
        image.repaint();
    }
     public void testRectangle()
    {
        algorithm.rectangle(50, 50, 100, 200, 255, 0, 0);
        image.repaint();
    }
    
    public void testfilledRectangle()
    {
        algorithm.filledRectangle(100, 100, 200, 250, 255, 255, 0);
        image.repaint();
    }
     public void testfilledSquare()
    {
        algorithm.filledSquare(10, 10, 100, 0, 255, 0);
        image.repaint();
    }
    public void testwithstripesRectangle()
    {
        algorithm.withstripesRectangle(100, 100, 200, 250, 255, 255, 255, 0, 0, 255);
        image.repaint();
    }
     public void testfilledRectangle2()
    {
        algorithm.filledRectangle2(100, 100, 200, 250, 255, 255, 255, 0, 0, 255);
        image.repaint();
    }
    public void testfilledRectangle2s()
    {
        algorithm.filledRectangle2s(100, 150, 200, 250, 255, 255, 255, 0, 0, 255, 10, 10);
        image.repaint();
    }
    public void testChessBoard()
    {
        algorithm.chessBoard(100, 100, 20);
        image.repaint();
    }
    
    public void testDaigonalLineUp(){
        algorithm.diagonalLineUp(20, 20, 200, 20, 200,255);
        image.repaint();
    }
    public void testDiagonalLineDown(){
        algorithm.diagonalLineDown(10,10,100,20,200,255);
        image.repaint();
    }
    public void testTraingle()
    {
        algorithm.triangle(100, 100, 200, 250, 255, 0, 255);
        image.repaint();
    }
}