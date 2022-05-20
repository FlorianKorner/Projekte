
/**
 * Beschreiben Sie hier die Klasse TestShip.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TestShip
{
    public void TestShip()
    {
        Ship s = new Ship ("Marley",100.0,2,false); 
        s.print();
        System.out.println();

        s.setNumberOfMasts(2);
        s.print();
        if(s.getNumberOfMasts() == 2)
        {
            System.out.println("number of masts is correct");
        }
        else
        {
            System.out.println("number of masts is not correct");
        }
        System.out.println();

        s.setSpeed (15.0);
        s.print();
        if (s.getSpeed() == 15.0)
        {
            System.out.println("speed is correct"); 
        }
        System.out.println();

        s.setSpeed(15.0 +1.0);
        s.print();
        if(s.getSpeed()== 16)
        {
            System.out.println("speed is correct"); 
        }

    }

    public void ship2()
    {
        Ship sh = new Ship ("Bounty",0.5,3,true);
        sh.print();

        if (sh.getHasGuns() == true)
        {
            System.out.println("It has guns"); 
        }
        else
        {
            System.out.println("It does not have guns"); 
        }
        System.out.println();
        
        sh.setNumberOfMasts (4);
        sh.print();
        if (sh.getNumberOfMasts() == 4)
        {
            System.out.println("number of masts is correct"); 
        }
        System.out.println();
        
        
        sh.setSpeed(15.0 - 1.0);
        sh.print();
        if(sh.getSpeed()== 14)
        {
            System.out.println("speed is correct"); 
        }
        

    }

}

