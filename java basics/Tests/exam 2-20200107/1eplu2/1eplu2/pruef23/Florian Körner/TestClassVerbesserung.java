/**
 * Beschreiben Sie hier die Klasse TestClasse.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TestClassVerbesserung
{
    public void test(){
        BusStopVerbesserung bs=new BusStopVerbesserung(); 
        BusVerbesserung b = bs.maxSeats();
        if(b.getSeats() != 50)System.out.println("Error 1");
        if(b.getSeats() != 50) System.out.println("Error 2");
    }
}