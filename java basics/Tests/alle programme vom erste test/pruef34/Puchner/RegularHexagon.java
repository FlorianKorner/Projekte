public class RegularHexagon
{
    private double S;

    public RegularHexagon()
    {
        setS(1.0);
    }

    public RegularHexagon(double newS)
    {
        setS(newS);
    }

    public double getHeightOfComponentTriangle()
    {
        return Math.sqrt(3)*S/2;
    }

    public double getAreaOfComponentTriangle()
    {
        return S*getHeightOfComponentTriangle()/2;
    }

    public double getCircumference()
    {
        return S*6;
    }

    public double getArea()
    {
        return getAreaOfComponentTriangle()*6;
    }

    public void setS(double newS)
    {
        if (newS > 0.0)
        {
            S = newS;
        }
        else
        {
            System.out.println("-The side length must be greater than 0.0-");
        }
    }

    public double getS()
    {
        return S;
    }

    public void print()
    {
        System.out.println("----RegularHexagon-------");
        System.out.println("Circumference= " +getCircumference());
        System.out.println("Area= " +getArea());
        System.out.println("----ComponentTriangle----");
        System.out.println("Height= " +getHeightOfComponentTriangle());
        System.out.println("Area= " +getAreaOfComponentTriangle());
        System.out.println("-------------------------");
    }
}