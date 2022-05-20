
public class TestShip
{
    public void test01()
    {

        Ship s = new Ship ( "Mary Celeste", 0.0, 2, false);

        if (s.getNumberOfMasts() == 2)
            System.out.println(" correct01");
        else
        {
            System.out.println(" ERROR01");
        }

        s.setSpeed(15.0);

        if (s.getSpeed() == 15.0)
            System.out.println("correct02");
        else
        {
            System.out.println(" ERROR02");
        }

        s.speedup();

        if (s.getSpeed() == 16.0 )
            System.out.println("correct03");
        else
        {
            System.out.println(" ERROR03");
        }

    }

    public void printShip()
    { 
        Ship s01 = new Ship ( "Bounty", 0.5, 3, true);
        
        System.out.println(" The ships name is: " + s01.getName() + ".");
        System.out.println(" It drives with a speed of " + s01.getSpeed() + " knotes.");
        System.out.println(" It has " + s01.getNumberOfMasts() + " Masts. " );

        if ( s01.getHasGuns() == true )
            System.out.println(" It has guns on board ");
        else
        {
            System.out.println(" It has no guns on board ");
        }

        s01.setNumberOfMasts(4);

        if ( s01.getNumberOfMasts() == 4)
            System.out.println("correct04");
        else
        {
            System.out.println(" ERROR04");
        }
        
        s01.slowdown();

        if ( s01.getSpeed() == 0.0)
            System.out.println("correct05");
        else
        {
            System.out.println(" ERROR05");
        }

    }

}