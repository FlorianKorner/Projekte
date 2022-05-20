public class TriangleABC
{
    private double sidelengthA;
    private double sidelengthB;
    private double sidelengthC;
   
    public TriangleABC(double newSidelengthA,double newSidelengthB,double newSidelengthC)
    {
        setSidelengthA(newSidelengthA);
        setSidelengthB(newSidelengthB);
        setSidelengthC(newSidelengthC);
    }

    public TriangleABC()
    {
    }

    public void setSidelengthA(double newSidelengthA)
    {
        sidelengthA = newSidelengthA;
        if(getSidelengthA()==sidelengthA)
        {
            System.out.println("correct 1");
        }
        else
        {
            System.out.println("error 1-> sidelengthA is :"+getSidelengthA());
        }
    }

    public double getSidelengthA()
    {
        return sidelengthA;
    }

    public void setSidelengthB(double newSidelengthB)
    {
        sidelengthB = newSidelengthB;
        if(getSidelengthB()==sidelengthB)
        {
            System.out.println("correct 2");
        }
        else
        {
            System.out.println("error 2-> sidelengthB is :"+getSidelengthB());
        }
    }

    public double getSidelengthB()
    {
        return sidelengthB;
    }

    public void setSidelengthC(double newSidelengthC)
    {
        sidelengthC = newSidelengthC;
        if(getSidelengthC()==sidelengthC)
        {
            System.out.println("correct 3");
        }
        else
        {
            System.out.println("error 3-> sidelengthC is :"+getSidelengthC());
        }
    }

    public double getSidelengthC()
    {
        return sidelengthC;
    }
    public boolean isTriangle()
    {
        if((getSidelengthA()>0.0) && (getSidelengthB())>0.0 && (getSidelengthC()>0.0)
            &&((getSidelengthA()+getSidelengthB())>getSidelengthC())
            &&((getSidelengthA()+getSidelengthC())>getSidelengthB())
            &&((getSidelengthC()+getSidelengthB())>getSidelengthA()))
        {
            return true;
        }
        else
        {
            System.out.println("error 4 -> not a triangle");
            return false;
        }
    }
    public double getBiggestSide()
    {
        if(getSidelengthC()<getSidelengthA()&&getSidelengthB()<getSidelengthA())
        {
            return getSidelengthA();
        }
        else if(getSidelengthA()<getSidelengthC() && getSidelengthC()>getSidelengthB())
        {
            return getSidelengthC();
        }
        else
        {
            return getSidelengthB();
        }
    }
}