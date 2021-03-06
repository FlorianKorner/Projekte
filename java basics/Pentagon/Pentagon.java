public class Pentagon
{
    private double radius;
    public Pentagon()
    {
    }
    public Pentagon(double newRadius)
    {
        setRadius(newRadius);
    }
    
    public void setRadius(double newRadius)
    {
        if(newRadius<=0.0)
        {
            System.out.println("check if Radius is greater than 0.0"+newRadius);
            radius=1.0;
        }
        else
        {
            radius = newRadius;
        }
    }

    public double getRadius()
    {
        return radius;
    }

    public double getBaselengthOfComponentTriangle()
    {
        return getRadius()*Math.sqrt((5-Math.sqrt(5))/2);
    }

    public double getSidelengthOfComponentTriangle()
    {
        return getRadius();
    }

    public double getHeightOfComponentTriangle()
    {
        return Math.sqrt(((getSidelengthOfComponentTriangle()*
                           getSidelengthOfComponentTriangle())-
                           ((getBaselengthOfComponentTriangle()*
                           getBaselengthOfComponentTriangle())/4.0)));
    }
    public double getAreaOfComponentTriangle ()
    {
        return (getBaselengthOfComponentTriangle()*getHeightOfComponentTriangle())/2.0;
    }
    public double getCircumference ()
    {
        return getBaselengthOfComponentTriangle()*5;
    }
    public double getArea()
    {
        return getAreaOfComponentTriangle()*5;
    }
    public void print()
    {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Radius is :"+ getRadius());
        System.out.println("Circumperence of the pentagon is :"+getCircumference());
        System.out.println("Area of pentagon is :"+getArea());
        System.out.println("-------------------------------------------------------------------");
    }
}