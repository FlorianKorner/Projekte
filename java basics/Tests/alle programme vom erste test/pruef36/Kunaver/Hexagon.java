public class Hexagon
{
    private double s;
    
    public Hexagon()
    {
        setS(1.0);
    }
    
    public Hexagon(double newS)
    {
        setS(newS);
    }
    
    private void setS(double newS)
    {
        if(newS>0)
            s=newS;
        else 
            {
                System.out.println("Error. Invalid input: "+newS);
                s = 1;
            }
    }
    
    private double getS()
    {
        return s;
    }
    
    public double getHeightOfComponentTriangle()
    {
        return Math.sqrt(3*(getS()/2));
    }
    
    public double getAreaOfComponentTriangle()
    {
        return(getS()*getHeightOfComponentTriangle())/2;
    }
    
    public double getCircumference()
    {
        return getS()*6;
    }
    
    public double getArea()
    {
        return getAreaOfComponentTriangle()*6;
    }
    
    public void print()
    {
        System.out.println("The side length of the component triangle is "+getS());
        System.out.println("The height of the component triangle is "+getHeightOfComponentTriangle());
        System.out.println("The area of the component triangle is " + getAreaOfComponentTriangle());
        System.out.println("The circumference of the hexagon is " +getCircumference());
        System.out.println("The area of the hexagon is " +getArea());
    }
}