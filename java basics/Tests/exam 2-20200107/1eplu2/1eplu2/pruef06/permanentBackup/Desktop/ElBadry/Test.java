
/**
 * Beschreiben Sie hier die Klasse Test.
 * 
 * @author (El Badry Laetitia) 
 * @version (17.12.2019)
 */
public class Test
{
    public void test()
    {
   Bus b2 = new Bus (12, 40, "YD34 HIF");
   {
       if (b2.maxSeats == 40)
       {
           System.out.println("MaxSeat true");
        }
        else
        {
            System.out.println("MaxSeat false");
        }
        if (b2.registrationStartsWith("YD") == 1)
        {
            System.out.println("RegistrationStartsWith true");
        }
        else
        {
            System.out.println("RegistrationStartsWith false");
        }
        if (b2.enter(30) == 30)
        {
            System.out.println("Enter true");
        }
        else
        {
            System.out.println("Enter false");
        }
        if (b2.getBus(2) == 22)
        {
            System.out.println("getBus true");
        }
        else
        {
            System.out.println("getBus false");
        }
        if (b2.remove == passengers(20))
        {
            System.out.println("Remove true");
        }
        else
        {
            System.out.println("Remove false");
        }
    }
    
    Bus c = new Bus (15, 35, "LD23 JKL");
    Bus d = new Bus (18, 55, "OD76 ERT");
    
    
    
    
}
    
            
        
            
   
}

