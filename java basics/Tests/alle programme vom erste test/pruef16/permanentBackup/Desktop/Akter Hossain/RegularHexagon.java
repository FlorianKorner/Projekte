
/**
 * Beschreiben Sie hier die Klasse RegularHexagon.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class RegularHexagon
{
    private double side;

    public RegularHexagon()
    {
        this.side = 1.0;   
    }

    public RegularHexagon(double side)
    {
        setSide (side);   
    }

    public double getSide()
    {
        return side;   
    }

    public void setSide(double side)
    {
        if(side >= 0.0)
        {
            this.side = side;   
        }
        else
        {
            System.out.println("Invalid number: " + getSide());
        }
    }
    
    public double getHeightOfComponentTriangle()
    {
     return (Math.sqrt(3*side)) /2.0;   
    }
    
    public double getAreaOfComponentTriangle()
    {
     return (side * getHeightOfComponentTriangle())/2.0;   
    }
    
    public double getCircumference()
    {
     return 6*side;   
    }
    
    public double getArea()
    {
        return 6 * getAreaOfComponentTriangle();
    }
    
    public void print()
    {
     System.out.println ("Sidelength: " + getSide());  
     System.out.println ("Height Of Component Triangle: " + getHeightOfComponentTriangle());
     System.out.println ("Area Of Component Triangle: " + getAreaOfComponentTriangle());
     System.out.println ("Circumference: " + getCircumference());
     System.out.println ("Area: " + getArea());
     
    }
}
