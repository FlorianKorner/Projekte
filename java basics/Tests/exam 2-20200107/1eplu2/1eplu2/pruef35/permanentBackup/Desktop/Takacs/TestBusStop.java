
public class TestBusStop{
    private BusStop f0;
    
    
    
    public void print(){
    
    
        
    f0.maxSeat();
    if(f0.maxSeat().equals(40))
        System.out.println("Correct1");
    else
        System.out.println("Error");
    
    Bus c = new Bus(35,15,"LD23 JKL");
    Bus d = new Bus(18,55,"OD76 ERT");
    
    f0.removeBus(0);
    f0.addBus(c,0);
    f0.addBus(c,0);
}
    
    
    
    
    
    
}