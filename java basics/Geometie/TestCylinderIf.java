public class TestCylinderIf
{
    public void test1()
    {
        Cylinder c = new Cylinder();
        c. setHeight(15);
        if(c.getHeight() != 15.0)
        {
            System.out.println("correct 3");
        }
        else
        {
            System.out.println("error 3  ->height is "+ c.getHeight());
        }
        c.setRadius(10);
        if(c.getRadius()==10.0)
        {
            System.out.println("correct 4");
        }
        else
        {
            System.out.println("error 4"+ c.getRadius());
        }
        c. print();
        if(c. getSurface()>=0.0)
        {
            System.out.println("correct 5");
        }
        else
        {
            System.out.println("error 5 ->surface is not valid"+c.getSurface());
        }
         if(c.getVolume()>= 0.0)
        {
            System.out.println("correct 6");
        }
        else
        {
            System.out.println("error 6 ->surface is not valid"+c. getSurface());
        }
        }
    }