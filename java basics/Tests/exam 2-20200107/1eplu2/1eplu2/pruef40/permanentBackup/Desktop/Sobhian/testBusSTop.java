
public class testBusSTop
{
    public void test(){
        BusStop x = new BusStop();
        
       // if(x.maxSeats()==) System.out.println("C1");
       // else System.out.println("E1");
       if(x.registrationStartsWith("YD")==1) System.out.println("C2");
       else System.out.println("E2");
       if(x.enter(30)==30) System.out.println("C3");
       else System.out.println("E3");
       if(x.getBus(2).getPassengers()==22) System.out.println("C4");
       else System.out.println("E4");
       if(x.removeBus().getPassengers()==20)System.out.println("C5");
        else System.out.println("E5");
       
       Bus c = new Bus(15, 35, "LD23 JKL");
       Bus d = new Bus(18, 55, "OD76 ERT");
       
       x.addBus(c);
       x.addBus(c);
       
       x.addBus(d);
       
       if(x.removeBus()==c) System.out.println("C6");
       else System.out.println("E6");
       
       x.removeBus();
       if(x.removeBus(1)==d) System.out.println("C7");
       else System.out.println("E7");
    }
}
