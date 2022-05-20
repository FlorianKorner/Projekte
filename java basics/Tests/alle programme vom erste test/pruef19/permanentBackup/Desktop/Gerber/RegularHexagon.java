public class RegularHexagon
{
    private double s;
    
    public RegularHexagon()
    {
        s = 1.0;
    }

    public RegularHexagon( double newS)
    {
        setS(newS);
    }

    public void setS (double newS)
    {
        if ( newS > 0.0)
            s = newS;
        else
        {
            System.out.println(" ERROR in setS");
            s = 1.0;
        }
    }

    public double getS()
    {
        return s;
    }

    public double getHeightOfComponentTriangle()
    {
        return Math.sqrt((3*s)/2.0);
    }

    public double getAreaOfComponentTriangle()
    {
        return (s*getHeightOfComponentTriangle())/2;
    }

    public double getCircumference()
    {
        return s*6;
    }

    public double getArea()
    {
        return getAreaOfComponentTriangle()*6; 
    }

    public void PrintInfo()
    {
        System.out.println(" The hexagons side equals " + getS());
        System.out.println(" The heigth of one triangle equals " + getHeightOfComponentTriangle());
        System.out.println(" The area of one triangle equals " + getAreaOfComponentTriangle());
        System.out.println(" The hexagons circumference is " + getCircumference());
        System.out.println(" the hexagons area is " + getArea());

    }

}