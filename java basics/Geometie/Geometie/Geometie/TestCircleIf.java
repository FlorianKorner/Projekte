public class TestCircleIf
{
    public void test()
    {
        Circle c = new Circle();
        c.setRadius(10);
        if(c.getRadius() == 10)
        {
            System.out.println("correct 4");
        }
        else
        {
            System.out.println("error 4 -> radius is;"+c.getRadius());
        }
        c.print();
    }
}