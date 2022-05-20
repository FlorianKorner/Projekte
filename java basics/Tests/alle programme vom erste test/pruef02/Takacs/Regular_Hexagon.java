
public class Regular_Hexagon
{
    private double s;
    
    
    public Regular_Hexagon()
    {
        setS(1.0);
    }
    
    public Regular_Hexagon(double newS)
    {
        setS(newS);
    }
    
    public void setS(double newS)
    {
        if(newS > 0.0 )
        {
            s = newS;
        }
        else
        {
        System.out.println("Wrong parameter in setS ;");
        s = 3 ;
    }
    }
    
    public double getS()
    {
        return s; 
    }
    
    public double getHeightOfComponentTriangle()
    {
        return Math.sqrt(3)*s/2;
    }
    
    public double getAreaOfComponentTriangle()
    {
        return getS()+getHeightOfComponentTriangle()/2;
        }
    
    public double getCircumreference()
    {
        return 6*s;
    }
    
    public double getAreaOfRegularHexagon()
    {
        return 6*getAreaOfComponentTriangle();
    }
    
    public void print()
    {
        System.out.println("+++++++++++++Regular Hexagon+++++++++");
        System.out.println("The sidelength of triangle is " + getS());
        System.out.println("The Height of triangle is " + getHeightOfComponentTriangle());
        System.out.println("The Area of Regular Hexagon is " + getAreaOfRegularHexagon());
        System.out.println("The circumreference of  Regular Hexagon is " +  getCircumreference());
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}