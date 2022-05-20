public class Test
{
    public void test()
    {
        BusStop b = new BusStop();

        if(b.maxSeats().getSeats() == 40)
        {
        System.out.println("correct 1");
        }
        else
        {
        System.out.println("error 1");
        }

        if(b.registrationStartsWith("YD") ==1)
        {
            System.out.println("correct 2");
        }
        else
        {
            System.out.println("error 2");
        }

        if(b.enter(30) == 30)

        {
            System.out.println("correct 3");
        }
        else
        {
            System.out.println("error 3");
        }
        
        if(b.getBus(2).getPassengers() == 22)
        {
            System.out.println("correct 4");
        }
       else
        {
            System.out.println("error 4");
        }
        
       Bus x = b.removeBus();
       if(x.getPassengers() == 0)
       {
            System.out.println("correct 5");
       }
        else
        {
            System.out.println("error 5");
       }
       
    }
}
