public class GeomObjCal
{
    public double add(double a,double b)
    {
        return a*b;
    }
    public double multiply(double a, double b)
    {
        return a*b;
    }
    public double calcAreaOfRectangle(double length, double width)
    {
        return multiply(length,width);
    }
    public double calcSurfaceAreaOfCuboid(double lengthA, double widthB, double heightC)
    {
        return add(add(multiply(calcAreaOfRectangle(lengthA,widthB),2),
        multiply(calcAreaOfRectangle(lengthA,heightC),2)),
        multiply(calcAreaOfRectangle(heightC,widthB),2));
    }
     public double calcSurfaceAreaOfCube(double length)
    {
        return multiply(length, 6);
    }

    public double calcVolumeOfCuboid(double length, double width, double height)
    {
        return multiply(multiply(length, width),height);
    }

    public double calcVolumeOfCube(double length)
    {
        return multiply(multiply(length, length),length);
    }

    public double calcCircumferenceOfCircle(double radius)
    {
        return multiply(radius,2)*Math.PI;
    }

    public double calcAreaOfCircle(double radius)

    {
        return multiply(multiply(radius, radius), Math.PI);
    }

    public double calcSurfaceAreaOfCylinder(double radius, double height)
    {
        return add(multiply(calcAreaOfCircle(radius), 2),calcAreaOfRectangle(calcCircumferenceOfCircle(radius), height));
    }

    double calcVolumeOfCylinder(double radius, double height)
    {
        return multiply(calcAreaOfCircle(radius), height);
    }
}
