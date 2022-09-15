public class Circle
{
    private double radius;
    
    public Circle(double radius)
    {
        setRadius(radius);
    }
    
    public Circle()
    {
        
    }

    public void setRadius(double newRadius)
    {
        radius = newRadius;
        
        if(getRadius()== radius)
        {
            System.out.println("correct 1");
        }
        else
        {
            System.out.println("error 1 please repeat the process ->radius is : "+getRadius());
        }
    }

    public double getRadius()
    {
        return radius;
    }

    public double getCircumference()
    {
        return ((2*Math.PI)*radius);
    }

    public double getArea()
    {
        return Math.PI*(radius*radius);
    }

    public void print()
    {
        System.out.println("radius :"+getRadius());
        System.out.println("Circumference :"+getCircumference());
        if(getCircumference() <=0.0)
        {
            System.out.println("error 2 Circumference can not be 0 or smaller than 0 -> Circumference is : "+getCircumference());
        }
        else
        {
            System.out.println("correct 2");
        }
        System.out.println("Area :"+getArea());
        if(getArea() <=0.0)
        {
            System.out.println("error 3 area can not be 0 or smaller than 0 -> area is : "+getArea());
        }
        else
        {
            System.out.println("correct 3");
        }
    }
}