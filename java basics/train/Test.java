
/**
 * Beschreiben Sie hier die Klasse Test.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Test
{
    public void testLokomotive(){
        Lokomotive l =new Lokomotive(500.5,10000.6);
        if(l.getWeight()!=500.5) System.out.println("Error: 1");
        if(l.getPower()!=10000.6) System.out.println("Error: 2");
        l.print();
    }
    public void testCarriage(){
        Carriage c =new Carriage(10.8,100.39);
        if(c.getEmptyWeight()!=10.8) System.out.println("Error: 1");
        if(c.getPayload()!=100.39) System.out.println("Error: 2");
        if(c.getTotalWeight()!=10.8+100.39) System.out.println("Error: 3");
        c.print();
    }
    public void testTrain(){
        Train t =new Train(500.5,10000.6);
        t.addCarriage(10.9,120.4);
        if(t.publiceFreePos!=1)System.out.println("Error: 1 wrong freePos");
        t.addCarriage(11.0,102.4);
        t.removeCarriage(1);
        if(t.list[1].getEmptyWeight()!=11.0&&t.list[1].getPayload()!=102.4)System.out.println("Error: 2 Error in pushing carriages into hole");
        if(t.numberOfCarriages()!=1)System.out.println("Error: 3 wrong amount of carriages");
        t.addCarriage(20.0,100.0);
        if(t.totalEmptyWeightOfCarriages()!=31)System.out.println("Error: 4 wrong empty weight of carriages");
        if(t.totalFullWeightOfCarriages()!=102.4+11.0+20.0+100.0)System.out.println("Error: 5 wrong weight of carriages");
        if(t.totalEmptyWeightOfTrain()!=500.5+11.0+20.0)System.out.println("Error: 6 wrong weight of carriages");
        if(t.totalFullWeightOfTrain()!=500.5+11.0+102.4+20.0+100.0)System.out.println("Error: 7 wrong weight of carriages");
        if(t.carriageWithMinimumTotalWeight()!=11.0+102.4)System.out.println("Error: 8");
        if(t.carriageWithMaximumTotalWeight()!=120.0)System.out.println("Error: 9");
        if(t.canTheTrainDrive()==false)System.out.println("Error 10: mistake in determining wether the train is to heavy or not");
        t.l.setPower(1000);
        t.list[1].setPayload(100000.0);
        System.out.println("Above there schould be stated that the first Carriage with a ");
        System.out.println("emptyWeight of 11.0 and a payload of 100000.0 was removed");
        System.out.println("error 8 and 9 wanted");
    }
}
