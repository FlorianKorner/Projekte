public class TestShip
{
    public void TestShip()
    {
        Ship myShip = new Ship();
        
        if (myShip.getNumberOfMasts() == 2)
            System.out.println("Correct NumberOfMasts");
        else
            System.out.println("Incorrect NumberOfMasts");
        
        myShip.setSpeed(15.0);
        if (myShip.getSpeed() == 15.0)
            System.out.println("Correct Speed");
        else
            System.out.println("Incorrect Speed");
            
        myShip.speedup();
        if (myShip.getSpeed() == 16.0)
            System.out.println("Correct Speed increase");
        else
            System.out.println("Incorrect Speed increase");
            
        Ship mySecondShip = new Ship("Bounty", 0.5, 3, true);
        mySecondShip.print();
        
        if (mySecondShip.getHasGun())
            System.out.println("Has Gun.");
        else
            System.out.println("Does not have gun.");
            
        mySecondShip.setNumberOfMasts(4);
        if (mySecondShip.getNumberOfMasts() == 4)
            System.out.println("Correct amount of Masts.");
        else
            System.out.println("Incorrect amount of Masts.");
           
        mySecondShip.slowdown();
        if (mySecondShip.getSpeed() == 0.0)
            System.out.println("Correct Speed decrease.");
        else
            System.out.println("Incorrect Speed decrease.");
    }
}