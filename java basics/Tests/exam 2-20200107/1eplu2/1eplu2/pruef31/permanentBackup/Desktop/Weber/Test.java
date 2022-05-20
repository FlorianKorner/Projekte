
public class Test
{
    public void BusStop()
    {
        BusStop b = new BusStop();

        b.maxSeats();
        if(b.maxSeats()==40)
            System.out.println("Correct 1");
        else
            System.out.println("Error 1");

        b.enter();
        if(b.enter()==30)
            System.out.println("Correct 2");
        else
            System.out.println("Error 2");

        b.removeBus();
        if(b.getPassengers()==20)
            System.out.println("Correct 3");
        else
            System.out.println("Error 3");

        b.registrationStartsWith("YD");
        if(b.s==1)
            System.out.println("Correct 4");
        else
            System.out.println("Error 4");

        Bus c = new Bus();
        c.setPassengers(15);
        c.setSeats(35);
        c.setRegistration("LD23 JKL");

        Bus d = new Bus();
        d.setPassengers(18);
        d.setSeats(55);
        d.setRegistration("OD76 ERT");
      
        c.addBus();
        c.setPosition(0);
        d.addBus();
        
        b0.remove();
        if()
    }
}
