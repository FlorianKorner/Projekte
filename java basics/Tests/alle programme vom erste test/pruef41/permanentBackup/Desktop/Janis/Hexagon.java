public class Hexagon
{
    private double s; /* side Length == l */

    public Hexagon()
    {
        s = 1;
    }

    public Hexagon(double newS)
    {
        setS(newS);
    }

    public void setS(double newS)
    {
        if(newS >0)
        {
            s = newS;
        }
        else
        {
            System.out.println("Your value is not valid");
            s = 1;
        }
    }

    public double getS()
    {
        return s;
    }

    public double getHeightOfComponentTriangle()
    {
        return Math.sqrt(3*s/2);
    }

    public double getAreaOfComponentTriangle()
    {
        return s * getHeightOfComponentTriangle() / 2;
    }

    public double getCircumference()
    {
        return 6*s;
    }

    public double getArea()
    {
        return 6 * getAreaOfComponentTriangle();
    }

    public void print()
    {
        System.out.println("The side length is " + s + 
            " the height of a component triangle is " + getHeightOfComponentTriangle() + 
            " the area of a cimponent triangle is " +getAreaOfComponentTriangle() +
            " the Circumference is " + getCircumference() +
            "the area is " + getArea());
    }
}