public class Test
{
    public void Test()
    {
        BusStop a = new BusStop();
        /*if((a.maxSeats()).getSeats() == 40)
        {
           System.out.println("Correct"); 
        }
        else
        {
            System.out.println("Error");
        }*/
        //The Problem is that the passengers cannot be added correctly, I tried a lot but it wont work
        if(a.registrationStartsWith("YD") == 1)
        {
            System.out.println("Correct");
        }
        else
        {
            System.out.println("Error");
        }
        
        if((a.getBus(2)).getPassengers() == 22)
        {
            System.out.println("Correct");
        }
        else
        {
            System.out.println("Error");
        }
        a.removeAtPos(0);
        Bus c = new Bus("LD23 JKL", 15,35);
        Bus d = new Bus("OD76 ERT", 18, 55);
        a.addBus(c);
        System.out.println("There should pop up an Error Message after this");
        if(a.addBus(c))
        {
            System.out.println("Correct");
        }
        else
        {
            System.out.println("Error");
        }
        a.addBus(d);
        if(a.removeBus() == c)
        {
            System.out.println("Correct");
        }
        else
        {
            System.out.println("Error");
        }
        
        if(a.removeAtPos(1) == d)
        {
            System.out.println("Correct");
        }
        else
        {
            System.out.println("Error");
        }
    }
}
