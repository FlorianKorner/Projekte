public class TestEquilateralTriangleIf
{
    public void test()
    {
        EquilateralTriangle e = new EquilateralTriangle(5);
        if(e.getSidelength() !=5.0)
        {
            System.out.println("correct 4");
        }
        else
        {
            System.out.println("error 4");
        }
        e.print();
        e.setSidelenghth(10);       
        if(e.getSidelength() !=10.0)
        {
            System.out.println("correct 5");
        }
        else
        {
            System.out.println("error 5");
        }
        e.print();
    }
}