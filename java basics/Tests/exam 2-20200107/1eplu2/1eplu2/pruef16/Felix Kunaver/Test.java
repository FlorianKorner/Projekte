public class Test{
    
    public void test(){
        BusStop test = new BusStop();
        if(test.maxSeats().getSeats() != 40)
            System.out.println("Error");
        if(test.registrationStartsWith("YD") != 1)
            System.out.println("Error 2");
        if(test.enter(30) != 30)
            System.out.println("Error 3");
        if(test.getBus(2).getPassengers() != 22)
            System.out.println("Error 4");
        if(test.removeBus().getPassengers() != 20)
            System.out.println("Error 5");
        Bus c = new Bus(15, 35, "LD23 JKL");
        Bus d = new Bus(18, 55, "OD76 ERT");
    
        test.addBus(c, 0);
        test.addBus(c);
        System.out.println("There should be an error above.");
        test.addBus(d);
        if(test.removeBus() != c)
            System.out.println("Error 6");
        if(test.removeBus(1) != d)
            System.out.println("Error 7");
        
        
        
        
    }
}