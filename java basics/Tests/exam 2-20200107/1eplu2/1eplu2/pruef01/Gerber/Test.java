
public class Test
{ private BusStop x = new BusStop();
    
    public void test01()
    {
    if(x.maxSeats().getSeats()!=40) {System.out.println("Error01");}
    if(x.registrationStartsWith("YD")!=1) {System.out.println("Error02");}
    if(x.enter(30)!=30) {System.out.println("Error03");}
    if(x.getBus(2).getPassengers()!=22) {System.out.println("Error04");}
    x.removeBus();
    if(x.b0.getPassengers()+x.b1.getPassengers()+x.b2.getPassengers()!=20){System.out.println("Error05");}
    Bus c = new Bus(15,35,"LD23 JKL");
    Bus d = new Bus(18,55,"OD76 ERT");
    x.addBus(c,0);
    if(x.addBus(c,0)!=false){System.out.println("Error06");}
    x.addBus(d);
    if(x.removeBus()!=c){ System.out.println("Error07");}
    if(x.removeBus(1)!=d){System.out.println("Error08");}
    }



}