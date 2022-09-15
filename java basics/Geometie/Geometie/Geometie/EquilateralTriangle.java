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
        if(getCircumference() <=0.0)
        {
            System.out.println("error 2 Circumference can not be 0 or smaller than 0 -> Circumference is : "+getCircumference());
        }
        else
        {
            System.out.println("correct 2");
        }
        System.out.println("Circumference :" + getCircumference());
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
 