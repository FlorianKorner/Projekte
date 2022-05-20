public class RegularHexagon
{
    private double s;
    private double heightOfComponentTriangle;
    private double areaOfComponentTriangle;
    private double circumference;
    private double area;

   
    public RegularHexagon(double newS)
    {
        s=(1.0);
    }

    public void setS(double newS)
    {
        if(newS>0.0)
        {
            s=newS;
        }
        else
        {
            System.out.println("Side Length Error");
            s=3;
        }
    }

    public double getS()
    {
        return s;
    }

    public double getHeightOfComponentTriangle()
    {
        heightOfComponentTriangle=(s*3/2)*(s*3/2);
        return heightOfComponentTriangle;
    }

    public double getAreaOfComponentTriangle()
    {
        areaOfComponentTriangle=(s*heightOfComponentTriangle/2);
        return areaOfComponentTriangle;
    }
    
    public double getCircumference()
    {
        circumference=Math.abs(areaOfComponentTriangle+ areaOfComponentTriangle+ areaOfComponentTriangle);
        return circumference;
    }
    
    public double getArea()
    {
        area=Math.abs(areaOfComponentTriangle*areaOfComponentTriangle);
        return area;
    }
    
    public void print()
    {
        System.out.println("****************");
        System.out.println("The sideLength is " + getS());
        System.out.println("The HeightOfComponentTriangle is " + getHeightOfComponentTriangle());
        System.out.println("The getAreaOfComponentTriangle is " + getAreaOfComponentTriangle());
        System.out.println("The Circumference is " + getCircumference());
        System.out.println("The area is " + getArea());
        System.out.println("****************");
    }
}