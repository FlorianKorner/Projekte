public class Hexagon 
{
    private double s;

    public Hexagon()
    {
        setS(1.0);
    }

    public Hexagon(double newS)
    {
        s = newS;
    }

    public void setS(double newS)
    {
        if(newS > 0.0)
        {
            s = newS;
        }
        else
        {
            System.out.println("Error 1");
            s = 1.0;
        }
    }
    public double getS()
    {
        return s;
    }

    public double getHeightOfComponentTriangle()
    {
        return (Math.sqrt(3)*s/2);
    }
    public double getAreaOfComponentTriangle()
    {
        return s*getHeightOfComponentTriangle()/2;
    }

    public double getCircumference()
    {
        return s*6;
    }
    public double getArea()
    {
        return getAreaOfComponentTriangle()*6;
    }

    public void print()
    {
        System.out.println("The side length is: "+s);
        System.out.println("The height of the component Triangle is: "+getHeightOfComponentTriangle());
        System.out.println("The Area of the component Triangle is: "+getAreaOfComponentTriangle());
        System.out.println("The circumference is: "+getCircumference());
        System.out.println("The Area is: "+getArea());
    }
}