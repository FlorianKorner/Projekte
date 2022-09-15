public class TestCarIf
{
    public void test()
    {
        Car c = new Car();
        c.setColor("blue");
        if (c.getColor() == "blue")
        {
            System.out.println("correct 4");
        }
        else
        {
            System.out.println("error 4");
            c.setColor(null);
        }
        c.setSpeed(130);
        if(c.getSpeed()==130)
        {
            System.out.println("correct 5");
        }
        else
        {
            System.out.println("error 5");
        }
        c.setHasLeftHandDrive(true);
        c.print();
    }
}