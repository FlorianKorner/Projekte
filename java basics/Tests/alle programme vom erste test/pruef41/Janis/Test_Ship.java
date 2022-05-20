public class Test_Ship
{
    public void test()
    {
        Ship ship = new Ship("Mary Celeste", 0.0, 2, false);
        /* if(ship.getName() == "Mary Celeste")
        {
            System.out.println("The Name is correct");
        }
        else
        {
            System.out.println("The Name is incorrect");
        } */
        
        
        if(ship.getNumberOfMasts() == 2)
        {
            System.out.println("The number of masts is correct");
        }
        else
        {
            System.out.println("The number of masts is incorrect");
        }
        
        ship.setSpeed(15.0);
        
        if(ship.getSpeed() == 15.0)
        {
            System.out.println("The Speed is correct");
        }
        else
        {
            System.out.println("The Speed is incorrect");
        }
        
        /* if(ship.getHasGuns() == false)
        {
            System.out.println("The Guns are correct");
        }
        else
        {
            System.out.println("The Guns are incorrect");
        } */
        ship.speedup();
        if(ship.getSpeed() == 16.0)
        {
            System.out.println("The Speed speedup is correct");
        }
        else
        {
            System.out.println("The Speed speedup is incorrect");
        }
        
        
        
        
    }
    public void test2()
    {
        Ship ship = new Ship("Bounty", 0.5, 3, true);
        ship.print();
        
        if(ship.getHasGuns() == true)
        {
            System.out.println("The Guns are correct");
        }
        else
        {
            System.out.println("The Guns are incorrect");
        }
        
        ship.setNumberOfMasts(4);
        if(ship.getNumberOfMasts() == 4)
        {
            System.out.println("The number of masts is correct");
        }
        else
        {
            System.out.println("The number of masts is incorrect");
        }
        ship.slowdown();
        if(ship.getSpeed() == 0.5)
        {
            System.out.println("The Speed slowdown is correct");
        }
        else
        {
            System.out.println("The Speed slowdown is incorrect");
        }
    }
}