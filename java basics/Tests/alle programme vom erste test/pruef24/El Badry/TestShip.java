public class TestShip
{
    Ship myShip = new Ship("Mary Celeste", 0.0, 2, false);
    {
    if (myShip.getNumberOfMasts() == 2)
    {
        System.out.println("correct");
    }
    else
    {
        System.out.println("error");
    }
    }
    
    myShip.setSpeed(15.0);
    {
    if (myShip.getSpeed() == 15.0)
    {
        System.out.println("correct1");
    }
    else
    {
        speed = 15.0;
    }
    }
    
    Ship myShip2 = new Ship("Bounty", 0.5, 3, true);
    {
        if (myShip2.getHasGuns() == true)
        {
            System.out.println("The ship has guns.");
        }
        else
        {
            System.out.println("The ship has no guns.");
        }
    }
    
    myShip2.setNumberOfMasts(4);
    {
        if (myShip2.getNumberOfMasts() == 4)
        {
            System.out.println("correct2");
        }
        else
        {
            System.out.println("error2");
        }
    }
} 