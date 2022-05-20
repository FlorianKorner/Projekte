public class TestBusStop {
    public void test() {
        BusStop bs = new BusStop();
        if(!bs.maxSeats().equals(new Bus(12,40,"YD34 HIF"))) System.out.println("error 1");
        if(bs.registrationStartsWith("YD") != 1) System.out.println("error 2");
        if(bs.enter(30) != 30) System.out.println("error 3");
        if(bs.getBus(2).getPassengers() != 22) System.out.println("error 4");
        if(bs.removeBus().getPassengers() != 20) System.out.println("error 5");
        Bus c = new Bus(15,35,"LD23 JKL");
        Bus d = new Bus(18,55,"OD76 ERT");
        bs.addBus(c,0);
        if(bs.addBus(c,0) != false) System.out.println("error 6");
        bs.addBus(d,1);
        if(!bs.removeBus().equals(c)) System.out.println("error 7");
        if(!bs.removeBus(1).equals(d)) System.out.println("error 8");
        System.out.println("If there is no error message(except for'adding not possible')");
        System.out.println("in the console the test was positive! :-)");
    }
}
