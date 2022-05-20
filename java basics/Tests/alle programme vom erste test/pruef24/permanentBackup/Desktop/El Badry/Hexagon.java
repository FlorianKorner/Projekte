public class Hexagon
{
    private double s;
    
    public Hexagon()
    {
        this.s = 1.0;
    }
    
    public Hexagon(double newS)
    {
        setS(newS);
    }
    
    public void setS(double newS)
    {
        if (newS > 0.0)
        {
            s = newS;
        }
        else
        {
            s = 1.0;
        }
    }
    
    public double getS()
    {
        return s;
    }
    
    public double getHeightOfComponentTriangle()
    {
        return Math.sqrt(3 * getS() / 2);
    }
    
    public double getAreaOfComponentTriangle()
    {
        return getS() * getHeightOfComponentTriangle() / 2;
    }
    
    public double getCircumference()
    {
        return getS() * 6;
    }
    
    public double getArea()
    {
        return getAreaOfComponentTriangle() * 6;
    }
    
    public void printInfo()
    {
        System.out.println("side length: " + getS() + ", height of component triangle: " + getHeightOfComponentTriangle() + ", area of component triangle: " + getAreaOfComponentTriangle() +
        ", circumference: " + getCircumference() + ", area: " + getArea());
    }
}
    