public class TestBusStop {
    private BusStop myBusStop;
    
    public void test() {
        myBusStop = new BusStop();
        if (myBusStop.maxSeats().getSeats() == 40)
            System.out.println("Correct 0 at maxSeats, getSeats");
        else
            System.out.println("Error 0 at maxSeats, getSeats");
            
        if (myBusStop.registrationStartsWith("YD") == 1)
            System.out.println("Correct 1 at registrationStartsWith");
        else
            System.out.println("Error 1 at registrationStartsWith");
            
        if (myBusStop.enter(30) == 30)
            System.out.println("Correct 2 at enter");
        else
            System.out.println("Error 2 at enter");
            
        if (myBusStop.getBus(2).getPassengers() == 22)
            System.out.println("Correct 3 at getBus, getPassengers");
        else
            System.out.println("Error 3 at getBus, getPassengers");
            
        if (myBusStop.removeBus().getPassengers() == 20)
            System.out.println("Correct 4 at removeBus, getPassengers");
        else
            System.out.println("Error 4 at removeBus, getPassengers");
            
        Bus c = new Bus(35, 15, "LD23 JKL");
        Bus d = new Bus(55, 18, "OD76 ERT");
        
        myBusStop.addBus(c, 0);
        
        System.out.println("Now error message:");
        myBusStop.addBus(c);
        
        myBusStop.addBus(d);
        
        if (myBusStop.removeBus().equals(c))
            System.out.println("Correct 5 at removeBus");
        else
            System.out.println("Error 5 at removeBus");
            
        if (myBusStop.removeBus(1).equals(d))
            System.out.println("Correct 6 at removeBus");
        else
            System.out.println("Error 6 at removeBus");
    }
}