public class RegularHexagon
{
    private double sideLength;
    public RegularHexagon()
    {
        setSideLength(1.0);
    }
    public RegularHexagon(double newSideLength)
    {
        setSideLength(newSideLength);
    }
    public void setSideLength(double newSideLength)
    {
        if(newSideLength>=0.0)
        {
            sideLength=newSideLength;
        }
        else
        {
            System.out.println("error 1");
        }
    }
    public double getSideLength()
    {
        return sideLength;
    }
    public double getHeightOfComponentTriangle()
    {
        return Math.sqrt(3)*getSideLength()/2;
    }
    public double getAreaOfComponentTriangle()
    {
        return sideLength*getHeightOfComponentTriangle()/2;
    }
    public double getCircumference()
    {
        return sideLength*6;
    }
    public double getArea()
    {
        return getAreaOfComponentTriangle()*6;
    }
    public void print()
    {
        System.out.println("----Regular Hexagon----");
        System.out.println("side length is: "+getSideLength());
        System.out.println("height of triangle: "+getHeightOfComponentTriangle());
        System.out.println("Are of Triangle: "+getHeightOfComponentTriangle());
        System.out.println("Circumfrence is: "+getCircumference());
        System.out.println("Area is: "+getArea());
    }
}