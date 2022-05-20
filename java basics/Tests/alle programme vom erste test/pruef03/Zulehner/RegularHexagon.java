
public class RegularHexagon
{
    private double s; // sidelength;

    public RegularHexagon()
    {
        setS(1.0);
    }

    public RegularHexagon( double newS)
    {
        setS(newS);
    }

    public void setS( double newS)
    {if(newS > 0.0)
            s = newS;
    }

    public double getS()
    {
        return s;
    }

    public double getHeightOfComponentTriangle()
    {
        return (Math.sqrt(3*s)/2);
    }

    public double getAreaOfComponentTriangle()
    {
        return ((s * heightOfComponentTriangle)/2);
    }

    public double getCircumference()
    {
        return (6*s);
    }

    public double getArea()
    {
        return (6 * getAreaOfComponentTriangle);
    }

    public void print()
    {
        System.out.println("The SideLength is:" + getS());
        System.out.println("The HeightOfComponentTriangleis:" + getHeightOfComponentTriangle());
        System.out.println("The AreaOfComponentTriangle is :" + getAreaOfComponentTriangle());
        System.out.println("The Circumference is:" + getCircumference());
        System.out.println("The Area is:" + getArea());
    }

}