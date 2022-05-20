public class TestShip
{
    private String name;
    private double speed;
    private int numberOfMasts;    
    private boolean hasGuns;
    public void test1()
    {
        Ship s = new Ship("Mary Celeste", 0.0, 2, false);
        s.print();
        if(numberOfMasts == 2)
        {
            System.out.println("Correct3");
        }
        else
        {
            System.out.println("Error3");
        }
        s.setSpeed(15.0);
        if(Math.abs(speed - 15.0) < 0.001)
        {
            System.out.println("Correct1");
        }
        else
        {
            System.out.println("Error1");
        }

        s.setSpeed(16.0);
        if(Math.abs(speed - 16.0) < 0.001)
        {
            System.out.println("Correct2");
        }
        else
        {
            System.out.println("Error2");
        }

    }

    public void test2()
    {
        Ship s1 = new Ship("Bounty", 0.5, 3, true);
        s1.print();
        if(hasGuns == true)
        {
            System.out.println("It has guns!");
        }
        else
        {
            System.out.println("It has no guns!");
        }
        s1.setnumberOfMasts(4);
        if(numberOfMasts == 4)
        {
            System.out.println("Correct4");
        }
        else
        {
            System.out.println("Error4");
        }
        s1.setSpeed(0.2);
        if(Math.abs(speed - 0.2) < 0.001 )
        {
            System.out.println("Correct 5");
        }
        else
        {
            System.out.println("Error5");
        }
    }
}