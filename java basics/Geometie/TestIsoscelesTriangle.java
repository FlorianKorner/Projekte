public class TestIsoscelesTriangle
{
    public void test()
    {
        IsoscelesTriangle i = new IsoscelesTriangle();
        i.setSidelengthA(5);
        if(i.getSidelengthA()>=0.0)
        {
            System.out.println("correct 3");
        }
        else
        {
            System.out.println("error 3 -> number chosen for sidelengthA is not valid"+i. getSidelengthA());
        }
    }
}