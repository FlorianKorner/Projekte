public class TestShip
{
    public void test()
    {
        Ship myShip = new Ship ();
        myShip.print();
        if(myShip.getNumberOfMasts() == 2)
        {
            System.out.println("Correct 1");
        }
        else
        {
            System.out.println("Error 1");
        }        
        myShip.setSpeed(15.0);
        if(myShip.getSpeed() == 15.0)
        {
            System.out.println("Correct 2");
        }
        else
        {
            System.out.println("Error 2");
        }
        myShip.speedup();
        if(myShip.getSpeed() == 16.0)
        {
            System.out.println("Correct 3");
        }
        else
        {
            System.out.println("Error 3");
        }

        Ship yourShip = new Ship ("Bounty", 0.5, 3, true);
        yourShip.print();
        if(yourShip.getHasGuns() == true)
        {
            System.out.println("Correct 4");
        }
        else
        {
            System.out.println("Error 4");
        }
        yourShip.setNumberOfMasts(4);
        if(yourShip.getNumberOfMasts() == 4)
        {
            System.out.println("Correct 5");
        }
        else
        {
            System.out.println("Error 5");
        }
        yourShip.slowdown();
        if(yourShip.getSpeed() == 0.0)
        {
            System.out.println("Correct 6");
        }
        else
        {
            System.out.println("Error 6");
        }
        yourShip.print();
    }
}