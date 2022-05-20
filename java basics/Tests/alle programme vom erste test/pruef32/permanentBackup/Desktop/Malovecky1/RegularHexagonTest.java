public class RegularHexagonTest
{
    public void test()
    {
        RegularHexagon h = new RegularHexagon(1.0);
        h.print();
        if(Math.abs(h.getCircumference()- 6)< 0.001)
        {
            System.out.println("correct 01");
        }
        else
        {
            System.out.println("error 01");
        }
        if(Math.abs(h.getArea()-3.6742)<0.01)
        {
            System.out.println("correct 02");
        }
        else
        {
            System.out.println("error 02");
        }
    }
    public void test2()
    {
        RegularHexagon a = new RegularHexagon(3.0);
        a.print();
        if(Math.abs(a.getCircumference()- 18)< 0.001)
        {
            System.out.println("correct 03");
        }
        else
        {
            System.out.println("error 03");
        }
        if(Math.abs(a.getArea()-19.0918)<0.01)
        {
            System.out.println("correct 04");
        }
        else
        {
            System.out.println("error 04");
        }
    }
}