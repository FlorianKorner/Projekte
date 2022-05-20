
public class Test
{
   
    public void Test()
    {
       BusStop p = new BusStop();
       
        b0.maxSeats();
        if(b0.maxSeats().equals( 40))
       System.out.println("The method max. seats is  working");
        else
        System.out.println("The method max. seats is not working");
        
        b0.registrationStartsWith();
        if(b0.registrationStartsWith("YD") == 1)
        System.out.println("The method registration starts with is working");
        else
        System.out.println("The method registration starts is not working");
       
        b0.enter(30);
        if(b0.enter() == 30)
         System.out.println("The method enter  is working");
        else
        System.out.println("The method enter is not working");
        
        b0.removeBus();
        if(b0.removeBus())
         System.out.println("The method remove bus with is working");
        else
        System.out.println("The method remove bus is not working");
       
        b0.getBus(2);
        if(b0.getBus().equals(22))
        System.out.println("The method get bus with is working");
        else
        System.out.println("The method get bus is not working");
        
        Bus c = new Bus(35,15,"LD23 JKL");
        Bus d = new Bus(55,18,"OD76 ERT"); 
        
        p.removeBus(0);
        p.addBus(c,0);
        p.addBus(c,0);
        p.addBus(d);
        if(b0.removeBus().equals(c))
        {
            System.out.println("The method remove bus with is working");
        else
        System.out.println("The method remove bus is not working");
        
    }
}
}
        
        