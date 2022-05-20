public class Hexagon
{
    public double s;

    public Hexagon(double newS)
    {
    setS(1.0);
    }
    
    public void setS(double newS)
    {
        s=newS;
    }

    public double getS()
    {
        return s;
    }

    public double getHeight()
    {
        return Math.sqrt((3*s)/2);
    }

    public double getAreaOfComponent()
    {
        return (s*getHeight())/2.0;
    }
    
    public double getCircumfrence()
    {
    return s*6;
    }
    
    public double getArea()
    {
    return getAreaOfComponent()*6;
    }
    
    public void print()
    {
    System.out.println("--------------");
    System.out.println("This is one side length:    "+getS());
    System.out.println("This is the area:   "+getArea());
    System.out.println("This is the circumfrence:   "+getCircumfrence());
    System.out.println("--------------");
    }
}