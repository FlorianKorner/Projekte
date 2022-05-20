public class Test
{
    public void test()
    
    {
        BusStop Sarajevo = new BusStop();
        Bus b0 = new Bus(0, 100, "YD47 EHI");
        Bus b1 = new Bus(0, 80, "DD37 EHI");
        Bus b2 = new Bus(0, 30, "YD72 EHI");
        
        if(Sarajevo.maxSeats() == b0)
         System.out.println("c 1");
        else
         System.out.println("e 1");
        if(Sarajevo.registrationStartsWith("YD") == 0) 
         System.out.println("c 2");
        else
         System.out.println("e 2");
        if(Sarajevo.enter(30) == 30)
         System.out.println("c 3");
        else
         System.out.println("e 3");
        if((Sarajevo.getBus(1)).getPassengers() == 0)
         System.out.println("c 4");
        else
         System.out.println("e 4");
         Bus b3 = new Bus(18, 35, "LD23 JKL");
        if(Sarajevo.removeBus() == null)
         System.out.println("c 5");
        else
         System.out.println("e 5");
        if(Sarajevo.addBus(b3, 0) == false) 
         System.out.println("c 6");
        else
         System.out.println("e 6");
        Sarajevo.addBus(b3, 0);
        if(Sarajevo.removeBus(0) == b3)
         System.out.println("c 7");
        else
         System.out.println("e 7");
    }
}
