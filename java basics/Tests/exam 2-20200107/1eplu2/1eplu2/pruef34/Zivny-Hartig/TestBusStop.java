public class TestBusStop {
    
    public void test() {
        BusStop s = new BusStop();
        
        if (s.maxSeats().getSeats() != 40) System.out.println("Wrong amount of seats.");
        if (s.registrationStartsWith("YD") != 1) System.out.println("Wrong amount of startsWith.");
        if (s.enter(30) != 30) System.out.println("Wrong amount of enters.");
        if (s.getBus(2).getPassengers() != 22) System.out.println("Wrong amount of passengers.");
        if (s.removeBus().getPassengers() != 20) System.out.println("Wrong amount of passengers_2.");
        
        Bus c = new Bus(15, 35, "LD23 JKL");
        Bus d = new Bus(18, 55, "OD76 ERT");
        
        s.addBus(c, 0);
        s.addBus(c);
        s.addBus(d);
        if (s.removeBus() != c) System.out.println("Wrong bus.");
        if (s.removeBus(1) != d) System.out.println("Wrong bus_2.");
    }
    
}
