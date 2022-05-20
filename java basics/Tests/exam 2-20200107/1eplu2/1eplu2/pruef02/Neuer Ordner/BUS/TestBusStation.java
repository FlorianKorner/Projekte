
/**
 * Beschreiben Sie hier die Klasse TestBusStation.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TestBusStation
{
    public void test(){
        BusStop s = new BusStop();
        Bus x = s.maxSeats();
        System.out.println(s.registrationStartsWith("YD"));
        //if(x.getSeats() == 40){
            //System.out.println("right1");
        //}
        if(s.registrationStartsWith("YD")==1){
            System.out.println("right1");
        }
        if(s.enter(30) == 30){
            System.out.println("right2");
        }
        Bus a = s.getBus(2);
    }
    
}
