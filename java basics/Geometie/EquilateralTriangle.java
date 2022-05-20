public class EquilateralTriangle
{
    private double sidelength;

    public EquilateralTriangle(double newSidelength)
    {
        setSidelenghth(newSidelength);
    }

      public void setSidelenghth(double newSidelength)
    {
        sidelength = newSidelength;
        if(getSidelength() >=0.0)
        {
            System.out.println("correct 1");
        }
        else
        {
            System.out.println("error 1");
        }
    }

     public double getSidelength()
    {
        return sidelength;
    }

     public double getCircumference()
    {
        return sidelength * 3;
    }

     public double getHeight()
    {
        return Math.sqrt(3.0)/2.0 * sidelength;
    }

     public double getArea()
    {
        return getHeight()*sidelength/2;
    }

     public void print()
    {
        System.out.println("Sidelength :" + getSidelength());
        System.out.println("Area :" + getArea());
        System.out.println("Circumference :" + getCircumference());
    }
}
 