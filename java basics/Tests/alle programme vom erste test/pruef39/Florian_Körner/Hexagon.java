public class Hexagon
{
    private double s;
    public Hexagon()
    {
        setS(1.0);
    }
    public Hexagon(double S)
    {
        setS(s);
    }
    public void setS(double newS)
    {   if(newS<0.0)
        {
            s=newS;
        }
        else
        {
            System.out.println("Error 505");
        }
    }

    public double getS()
    {
        return s;
    }
    public double getHeightOfComponentTriangle()
    {
        return Math.sqrt(3.0)*getS() /2.0;
    }
    public double getAreaOfComponentTriangle()
    {
        return (getS()*getHeightOfComponentTriangle())/2.0;
    }
    public double getArea()
    {
        return getAreaOfComponentTriangle()*6;
    }
    public double getCircumference()
    {
        return getS()*6;
    }
    public void print()
    {
        System.out.println("------------------------------------------------------------");
        System.out.println("Circumference: "+getCircumference());
        System.out.println("Area: "+getArea());
        System.out.println("Sidelength: "+getS());
        System.out.println("Height of component triangle: "+getHeightOfComponentTriangle());
        System.out.println("Area of component triangle "+getAreaOfComponentTriangle());
        System.out.println("------------------------------------------------------------");
    }
}