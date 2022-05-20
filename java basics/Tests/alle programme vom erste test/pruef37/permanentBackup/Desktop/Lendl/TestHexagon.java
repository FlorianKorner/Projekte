public class TestHexagon
{
    public void test()
    {
        RegularHexagon RH = new RegularHexagon ();
        RH.print();
        if(RH.getCircumference() == 6.0)
        {
            System.out.println("Correct 1");
        }
        else
        {
            System.out.println("Error 1");
        }

        if(RH.getArea() == 3.674234614174767)
        {
            System.out.println("Correct 2");
        }
        else
        {
            System.out.println("Error 2");
        }

        RegularHexagon Rh = new RegularHexagon (3);
        Rh.print();
        if(Rh.getCircumference() == 18.0)
        {
            System.out.println("Correct 3");
        }
        else
        {
            System.out.println("Error 3");
        }

        if(Rh.getArea() == 19.09188309203678)
        {
            System.out.println("Correct 4");
        }
        else
        {
            System.out.println("Error 4");
        }

    }
}