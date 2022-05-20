public class TestRegularHexagon
{
    public void test()
    {
        RegularHexagon FirstRegularHexagon = new RegularHexagon();
        FirstRegularHexagon.print();
        if (Math.abs(FirstRegularHexagon.getCircumference()-6.0) < 0.0000001)
        {
            System.out.println("correct 1");
        }
        else
        {
            System.out.println("error 1");
        }
        if (Math.abs(FirstRegularHexagon.getArea()-2.598076211353316) < 0.0000001)
        {
            System.out.println("correct 2");
        }
        else
        {
            System.out.println("error 2");
        }
        RegularHexagon SecondRegularHexagon = new RegularHexagon(3.0);
        SecondRegularHexagon.print();
        if (Math.abs(SecondRegularHexagon.getCircumference()-18.0) < 0.0000001)
        {
            System.out.println("correct 3");
        }
        else 
        {
            System.out.println("error 3");
        }
        if (Math.abs(SecondRegularHexagon.getArea()-23.382685902179844) < 0.0000001)
        {
            System.out.println("correct 4");
        }
        else
        {
            System.out.println("error 4");
        }
    }
}