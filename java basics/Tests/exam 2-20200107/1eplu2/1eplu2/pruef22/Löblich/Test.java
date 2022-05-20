public class Test
{
    BusStop b = new BusStop();
    
    public void test()
    {
        if(b.maxSeats().getSeats() == 40)
        {
            System.out.println("CORRECT");
        }
        else
        {
            System.out.println("ERROR");
        }
        
        if(b.registrationStartsWith("YD") == 1)
        {
            System.out.println("CORRECT");
        }
        else
        {
            System.out.println("ERROR");
        }
        
       if(b.enter(30) == 30)
       {
           
        System.out.println("CORRECT");
        }
        else
        {
            System.out.println("ERROR");
        }
        
      
       if(b.getBus(2).getPassenger() == 22)
       {System.out.println("CORRECT");
        }
        else
        {
            System.out.println("ERROR");
        }
        
        
        if(b.removeBus(0).getPassenger() == 20)
        {
            System.out.println("CORRECT");
        }
        else
        {
            System.out.println("ERROR");
        }
        
        Bus c = new Bus(15,35,"LD23 JKL");
        Bus d = new Bus(18,55,"OD76 ERT");
        b.addBus(c,0);
        b.addBus(c);
        b.addBus(d);
        
        if(b.removeBus() == c)
        {
            System.out.println("CORRECT");
        }
        else
        {
            System.out.println("ERROR");
        }
        
        if(b.removeBus() ==d)
        {
            System.out.println("CORRECT");
        }
        else
        {
            System.out.println("ERROR");
        }
        
        
}
}
