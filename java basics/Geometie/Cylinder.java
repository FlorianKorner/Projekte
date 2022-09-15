public class Cylinder
{
    private double height;
    private double radius;

    public Cylinder(double height, double radius)
    {
        setHeight(height);
        setRadius(radius);
    }

    public Cylinder()
    {

    }

    public void setHeight(double newHeight)
    {
        height = newHeight;
        if(getHeight() >=0.0)
        {
            System.out.println("correct 1");
        }
        else
        {
            System.out.println("error 1 please check if the height is bigger than 0.0 !");
        }
    }

    public double getHeight()
    {
        return height;
    }

    public void setRadius(double newRadius)
    {
        radius = newRadius;
        if (getRadius() >=0.0)
        {
            System.out.println("correct 2");
        }
        else
        {
            System.out.println("error 2 please check if the radius is bigger than 0.0 !");
        }
    }

    public double getRadius()
    {
        return radius;
    }

    public double getVolume()
    {
        return Math.PI*(radius*radius)*(height);
    }

    public double getSurface()
    {
        return (2.0* Math.PI)*(radius)*(radius+height);
    }

    public void print()
    {
        System.out.println("radius: "+ getRadius());
        System.out.println("height: "+ getHeight());
        System.out.println("volume: "+ getVolume());
        System.out.println("surface: "+ getSurface());
    }
}