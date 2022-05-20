public class RegularHexagon
{
    private double s;
    
    public RegularHexagon()
    {
        setS(1.0);
    }
    
    public RegularHexagon(double newS)
    {
        setS(newS);
    }
    
    public void setS(double newS)
    {
        if(newS > 0.0)
        s = newS;
        else
        System.out.println("Error in setS!");
    }
    public double getS()
    {
        return s;
    }
    
    public double getHeightOfComponentTriangle()
    {
        return (Math.sqrt(3) * s) / 2;
    }
    public double getAreaOfComponentTriangle()
    {
        return (s * getHeightOfComponentTriangle()) / 2;
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
        System.out.println("************** Data of Hexagon **************");
        System.out.println("side length is: "+ s);
        System.out.println("height of component triangle is: " + getHeightOfComponentTriangle());
        System.out.println("area of component triangle is: " + getAreaOfComponentTriangle());
        System.out.println("circumference is: " + getCircumference());
        System.out.println("area is: " + getArea());
    }
    
}