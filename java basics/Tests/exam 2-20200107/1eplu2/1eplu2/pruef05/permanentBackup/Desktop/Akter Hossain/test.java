
/**
 * Beschreiben Sie hier die Klasse test.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class test
{
    public test()
    {
     BusStop bs = new BusStop();  
     
     if( bs.removeBus() == null)
     {
         System.out.println("correct");
        }
        
        BusStop bs1 = new BusStop(15,25,"LD23 JKL");  
        Bus c = bs1;
        BusStop bs2 = new BusStop(18,55,"OD76 ERT");  
         Bus d = bs2;
         
       
        
     
    }
}
