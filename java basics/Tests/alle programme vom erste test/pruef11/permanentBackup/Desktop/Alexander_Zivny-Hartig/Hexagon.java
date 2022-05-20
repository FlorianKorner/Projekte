public class Hexagon
{
    private double length;
    
    public Hexagon()
    {
        setLength(1.0);
    }
    public Hexagon(double newLength)
    {
        setLength(newLength);
    }
    
    public void setLength(double newLength)
    {
        if (newLength > 0)
            length = newLength;
        else
        {
            System.out.println("Invalid Length: " + newLength);
            length = 1.0;
        }
    }
    public double getLength()
    {
        return length;
    }
    
    public double getHeigthOfComponentTriangle()
    {
        return Math.sqrt(3 * getLength()) / 2.0;
    }
    public double getAreaOfComponentTriangle()
    {
        return getLength() * getHeigthOfComponentTriangle() / 2.0;
    }
    
    public double getCircumference()
    {
        return getLength() * 6;
    }
    public double getArea()
    {
        return getAreaOfComponentTriangle() * 6;
    }
    
    public void print()
    {
        System.out.println("--- Hexagon ---");
        System.out.println("Side length: " + getLength());
        System.out.println("Heigth of component triangle: " + getHeigthOfComponentTriangle());
        System.out.println("Area of component triangle: " + getAreaOfComponentTriangle());
        System.out.println("Circumference: " + getCircumference());
        System.out.println("Area: " + getArea());
    }
}