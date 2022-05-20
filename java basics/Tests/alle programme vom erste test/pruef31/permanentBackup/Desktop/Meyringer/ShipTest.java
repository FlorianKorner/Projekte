public class ShipTest
{
   public ShipTest()
   {
        Ship myShip = new Ship();
        if(myShip.getNumberOfMasts() == 2)
        {
            System.out.println("Correct 1");
        }
        else
        {
            System.out.println("Error 1");
        }
        myShip.setSpeed(15);
        if(myShip.getSpeed() == 15)
        {
            System.out.println("Correct 2");
        }
        else 
        {
            System.out.println("Error 2");
        }
        myShip.speedup();
        if(myShip.getSpeed() == 16)
        {
            System.out.println("Correct 3");
        }
        else 
        {
            System.out.println("Error 3");
        }
   }
}