public class TestRegular
{
    public void test()
    {
        RegularHexagon myRegularHexagon=new RegularHexagon();
        myRegularHexagon.print();
        if(Math.abs(myRegularHexagon.getCircumference()-6.0)<0.000000001)
        {
            System.out.println("correct 1");
        }
        else
        {
            System.out.println("error 1");
        }
        if(Math.abs(myRegularHexagon.getArea()-2.598076211353316)<0.000000001)
        {
            System.out.println("correct 2");
        }
        else
        {
            System.out.println("error 2");
        }
        RegularHexagon secondRegularHexagon=new RegularHexagon(3.0);
        secondRegularHexagon.print();
        if(Math.abs(secondRegularHexagon.getCircumference()-18.0)<0.0000000001)
        {
            System.out.println("correct 3");
        }
        else
        {
            System.out.println("error 3");
        }
        if(Math.abs(secondRegularHexagon.getArea()-23.382685902179844)<0.000000000001)
        {
            System.out.println("correct 4");
        }
        else
        {
            System.out.println("error 4");
        }
    }
}