public class TestIsoscelesTriangleIf
{
    public void test()
    {
        IsoscelesTriangle i = new IsoscelesTriangle();
        i.setSidelengthA(5);
        if(i.getSidelengthA()>=0.0)
        {
            System.out.println("correct 6");
        }
        else
        {
            System.out.println("error 6 -> number chosen for sidelengthA is not valid"+i.getSidelengthA());
        }
        i.setSidelengthB(15);
        if(i.getSidelengthB() <=0.0)
        {
            System.out.println("error 7  -> number chosen for sidelengthB is not valid"+i.getSidelengthB());
        }
        else
        {
            System.out.println("correct 7");
        }
        i.print();
    }
}