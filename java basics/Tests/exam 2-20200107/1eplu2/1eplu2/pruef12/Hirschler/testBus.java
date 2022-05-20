public class testBus
{
    BusStop bs1;
    
    public void test()
    {
        bs1.maxSeats();
        if(bs1.maxSeats() == 40)
        {
            System.out.println(" maxSeats is 40!");
        }
        else
        {
            System.out.println("maxSeats is NOT 40!");
        }
        bs1.registrationStartsWith("YD");
        if(bs1.registrationStartsWith().equals("YD"))
        {
            
            System.out.println("Correct");
        }
        else
        {
            System.out.println("NOT Correct");
        }
        bs1.enter(30);
        if(bs1.enter() == 30)
        {
            System.out.println("enter == 30!!");
        }
        else
        {
            System.out.println("enter != 30!");
        }
        bs1.getBus(2);
        if(bs1.getPassengers() == 22)
        {
            System.out.println("22 passengers in the Bus");
        }
        else
        {
            System.out.println("less || too much passengers in the Bus");
        }
        
    }
}