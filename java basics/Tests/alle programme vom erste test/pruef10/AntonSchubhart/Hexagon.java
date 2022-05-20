

public class Hexagon
{
    private double sideLength;
    
    public Hexagon()
    {
        setSideLength(1.0);
    }
    
    public Hexagon(double newSideLength)
    {
        setSideLength(newSideLength);
    }
    
    public void setSideLength(double newSideLength)
    {
        sideLength=newSideLength;
    }
    public double getSideLength()
    {
        return sideLength;
    }
    
    public double getHeightOfComponentTriangle()
    {
        return Math.sqrt(3)*sideLength/2;
    }
    public double getAreaOfComponentTiangle()
    {
        return (sideLength+getHeightOfComponentTriangle())/2;
    }
    public double getCircumference()
    {
        return sideLength*6;
    }
    public double getArea()
    {
        return getAreaOfComponentTiangle()*6;
    }
    public void print()
    {
        System.out.println("################");
        System.out.println("Height of component Triangle:"+ getHeightOfComponentTriangle());
        System.out.println("Area of component Triangle:"+ getAreaOfComponentTiangle());
        System.out.println("Area of Hexagon:"+ getArea());
        System.out.println("Circumference of Hexagon:"+ getCircumference());
        System.out.println("################");
    }
}
