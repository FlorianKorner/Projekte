public class Hexagon
{
    private double length;
    
    public Hexagon()
    {
        length = 1.0;
    }
    public Hexagon(int newLength)
    {
        setLength(newLength);
    }
    public void setLength(double newLength)
    {
        if(newLength > 0)
        length = newLength;
        else
        System.out.println("Error in setting length " + newLength);
    }
    public double getLength()
    {
        return length;
    }
    public double getHeightofComponentTriangle()
    {
        return Math.sqrt(3.0 * length / 2.0);
    }
    public double getAreaofComponentTriangle()
    {
        return length * getHeightofComponentTriangle() / 2.0;
    }
    public double getArea()
    {
        return getAreaofComponentTriangle() * 6;
    }
    public double getCircumference()
    {
        return getHeightofComponentTriangle() * 6;
    }
    public void print()
    {
        System.out.println("********************************************");
        System.out.println("The side length is " + length);
        System.out.println("The Area is " + getArea());
        System.out.println("The Circumference is " + getCircumference());
        System.out.println("**********************************************");
        System.out.println("Just for Extra text ;)");
    }
}
