public class Pentagon
{
    private double radius;
    public Pentagon()
    {
        setRadius(1.0);
    }
    public Pentagon(double newRadius)
    {
        setRadius(newRadius);
    }
    public void setRadius(double newRadius)
    {
        if (newRadius > 0.0)
            radius = newRadius;
        else
        {
            System.out.println("error in setradius: " + newRadius);
            radius = 1.0;
        }
    }
    public double getRadius()
    {
        return radius;
    }
    public double getSideLengthOfComponentTriangle()
    {
        return radius;
    }
    public double getBaseLengthOfComponentTriangle()
    {
        return radius*Math.sqrt((5.0-Math.sqrt(5))/2.0);
    }
    public double getHeightOfComponentTriangle()
    {
        return Math.sqrt(getSideLengthOfComponentTriangle()*
        getSideLengthOfComponentTriangle()-
        (getBaseLengthOfComponentTriangle()*
        getBaseLengthOfComponentTriangle())/4.0);
    }
    public double getAreaOfComponentTriangle()
    {
        return getBaseLengthOfComponentTriangle() *
            getHeightOfComponentTriangle() / 2.0;
    }
    public double getCircumference()
    {
        return 5 * getBaseLengthOfComponentTriangle();
    }
    public double getArea()
    {
        return 5 * getAreaOfComponentTriangle();
    }
    public void print()
    {
        System.out.println("pentagon: radius = " + getRadius());
        System.out.println("  circumference = " + getCircumference());
        System.out.println("  area = " + getArea());
    }
}
