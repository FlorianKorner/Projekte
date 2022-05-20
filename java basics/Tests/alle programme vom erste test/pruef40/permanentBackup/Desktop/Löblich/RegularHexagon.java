
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
        {
            s = newS;
        }
        else
        {
            System.out.println("Wrong parameter in setS :" + newS);
            s = 5.0;
        }
    }
    
    public double getS()
    {
        return s ;
    }
    
    public double getHeightOfTriangle()
    {
        return Math.sqrt (( 3 * getS())/2.0);
        
    }
    
    public double getAreaOfTriangle()
    {
        return (getS() * getHeightOfTriangle()) / 2.0;
    }
    
    public double getCircumference()
    {
        return getS() * 6;
    }
    
    public double getArea()
    {
        return getAreaOfTriangle() * 6;
    }
    
    public void print()
    {
        System.out.println("The side length is:" + getS());
        System.out.println("The Height of the component triangle is :" + getHeightOfTriangle());
         System.out.println("The Area of the component triangle is:" + getAreaOfTriangle());
         System.out.println("The circumference of the hexagon is :" + getCircumference());
          System.out.println("The area of the hexagon is:" + getArea());
    }
    
    
}