public class test
{
    public void t()
    {
        busStop h = new busStop();
        
        if(h.maxSeats().getSeats() == 40) 
        {
            System.out.println("Max. Seats correct");
        }
        else{
            System.out.println("Max. Seats error");
        }
        
        if(h.registrationStartsWith("YD") == 1)
        {
            System.out.println("Starts with registration correct");
        }
        else{
            System.out.println("Starts with registration error");
        }
        
        if(h.enter(30) == 30)
        {
            System.out.println("enter correct");
        }
        else{
            System.out.println("enter error");
        }
        
        if(h.getBus(2).getPassengers() == 22)
        {
            System.out.println("getBus correct");
        }
        else{
            System.out.println("getBus error");
        }
        
        if(h.removeBus(0).getPassengers() == 20)
        {
            System.out.println("remove correct");
        }
        else{
            System.out.println("remove error");
        }
        bus c = new bus(15,35,"LD23 JKL");
        bus d = new bus(18, 55, "OD76 ERT");
        h.addBus(c, 0);
        h.addBus(c);
        h.addBus(d);
        if(h.removeBus() == c)
        {
            System.out.println("remove 2 correct");
        }
         else{
            System.out.println("remove 2 error");
        }
        if(h.removeBus(1) == d)
        {
            System.out.println("remove 3 correct");
        }
         else{
            System.out.println("remove 3 error");
        }
    }
}