public class RegularHexagon
{
    private double s;

    public void setSideLength(double newS)
    {
        if(newS > 0.0)
        {
            s = newS;
        }
        else
        {
            System.out.println("Error 134; side length must be positive!");
            setSideLength(5);
        }
    }

    public double getSideLength()
    {
        return s;
    }

    public RegularHexagon()
    {
        setSideLength(1.0);
    }

    public RegularHexagon(double newS)
    {
        setSideLength(newS);
    }

    public double getHeightOfComponentTriangle()
    {
        return Math.sqrt(3 * (s / 2.0));
    }

    public double getAreaOfComponentTriangle()
    {
        return (getHeightOfComponentTriangle() * s) / 2.0;
    }

    public double getCircumference()
    {
        return s * 6;
    }

    public double getArea()
    {
        return getAreaOfComponentTriangle() * 6;
    }

    public void print()
    {
        System.out.println("*****************************************");
        System.out.println("The side length of the hexagon is: " + getSideLength());
        System.out.println("The height of every component triangle is " + getHeightOfComponentTriangle());
        System.out.println("The area of every component triangle is " +  getAreaOfComponentTriangle());
        System.out.println("The circumference of the hexagon is " + getCircumference());
        System.out.println("The area of the hexagon is " + getArea());
        System.out.println("*****************************************");
    }
}