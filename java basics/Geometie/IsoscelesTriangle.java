public class IsoscelesTriangle 
{
    private double sidelengthA;
    private double sidelengthB;

    public IsoscelesTriangle(double sidelengthA, double sidelengthB)
    {
        setSidelengthA(sidelengthA);
        setSidelengthB(sidelengthB);
    }
    
    public IsoscelesTriangle()
    {
    }
    public void setSidelengthA(double newSidelengthA)
    {
        sidelengthA =newSidelengthA;
        if(getSidelengthA()>=0.0)
        {
            System.out.println("correct 1");
        }
        else
        {
            System.out.println("error 1 ->sidelengthA is not a valid number"+getSidelengthA());
        }
    }

    public double getSidelengthA()
    {
        return sidelengthA;
    }

    public void setSidelengthB(double newSidelengthB)
    {
        sidelengthB = newSidelengthB;
        if(getSidelengthB()>=0.0)
        {
            System.out.println("correct 2");
        }
        else
        {
            System.out.println("error 2 ->sidelenghtB is not a valid number"+getSidelengthB());
        }
    }

    public double getSidelengthB()
    {
        return sidelengthB;
    }

    public double getCircumference()
    {
        return (sidelengthA * 2) + sidelengthB;
    }

    public double getHeight()
    {
        return Math.sqrt(((sidelengthA * sidelengthA)-((sidelengthB * sidelengthB)/ 4 )));
    }

    public double getArea()
    {
        return (sidelengthB / 2 * getHeight());
    }

    public void print()
    {
        System.out.println("SidelenghtA :" + getSidelengthA());
        System.out.println("SidelenghtB :" + getSidelengthB());
    }
}