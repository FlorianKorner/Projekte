public class TestShip
{
    public void test()
    {
        Ship FirstShip = new Ship();
        if (FirstShip.getNumberOfMasts() == 2)
        {
            System.out.println("correct 1");
        }
        else
        {
            System.out.println("error 1");
        }
        FirstShip.setSpeed(15.0);
        if (FirstShip.getSpeed() == 15.0)
        {
            System.out.println("correct 2");
        }
        else
        {
            System.out.println("error 2");
        }
        FirstShip.speedup();
        if (FirstShip.getSpeed() == 16.0)
        {
            System.out.println("correct 3");
        }
        else
        {
            System.out.println("error 3");
        }

        Ship SecondShip = new Ship("Bounty", 0.5, 3, true);
        SecondShip.print();
        if (SecondShip.getHasGuns() == true)
        {
            System.out.println("correct 4");
        }
        else
        {
            System.out.println("error 4");
        }
        SecondShip.setNumberOfMasts(4);
        if (SecondShip.getNumberOfMasts() == 4)
        {
            System.out.println("correct 5");
        }
        else
        {
            System.out.println("error 5");
        }
        SecondShip.slowdown();
        if (SecondShip.getSpeed() == 0.5)
        {
            System.out.println("correct 6");
        }
        else
        {
            System.out.println("error 6");
        }
    }
}