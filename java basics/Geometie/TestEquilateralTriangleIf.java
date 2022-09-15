public class TestEquilateralTriangleIf
{
    public void test()
    {
        EquilateralTriangle e = new EquilateralTriangle(5);
        if(e.getSidelength() !=5.0)
        {
            System.out.println("correct 1");
        }
        else
        {
            System.out.println("error 1");
        }
        e.print();
        e.setSidelenghth(10);       
        if(e.getSidelength() !=10.0)
        {
            System.out.println("correct 3");
        }
        else
        {
            System.out.println("error 3");
        }
        e.print();
    }
}