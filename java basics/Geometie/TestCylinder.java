public class TestCylinder
{
    public void test()
    {
        Cylinder c = new Cylinder(5, 10);
        c.print();
        c.setHeight(10);
        c.setRadius(20);
        c.print();
        if(c. getHeight()== 10 && c.getRadius() == 20)
        System.out.println("correct 1");
        else
        System.out.println("errror 1");
    }
}