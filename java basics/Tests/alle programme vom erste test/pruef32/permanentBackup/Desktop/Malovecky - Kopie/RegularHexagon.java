public class RegularHexagon
{
    private double sideLength;
    
    public void setSideLength(double newSideLength)
    {
        if(newSideLength > 0.0)
        {
            sideLength = newSideLength;
        }
        else
        {
            System.out.println("False input in setSideLength");
            sideLength = 1.0;
        }
    }
    public double getSideLength()
    {
        return sideLength;
    }
    
    public RegularHexagon(double newSideLength)
    {
        setSideLength(newSideLength);
    }
    
    public double getHeightOfComponentTriangle()
    {
        return Math.sqrt((getSideLength() * 3)/2);
    }
    
    public double getAreaOfComponentTriangle()
    {
        return (getSideLength()*getHeightOfComponentTriangle())/2;
    }
    
    public double getCircumference()
    {
        return 6* getSideLength();
    }
    
    public double getArea()
    {
        return 6* getAreaOfComponentTriangle();
    }
    
    public void print()
    {
        System.out.println("Your Side Length is:" + getSideLength());
        System.out.println("Your Height of Component Triangle is:" + getHeightOfComponentTriangle());
        System.out.println("Your Area of Component Triangle is:" + getAreaOfComponentTriangle());
        System.out.println("Your Circumference is:" + getCircumference());
        System.out.println("Your Area is:" + getArea());
    }
}