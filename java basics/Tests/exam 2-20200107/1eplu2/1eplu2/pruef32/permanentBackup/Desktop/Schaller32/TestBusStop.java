public class TestBusStop
{
    public void test()
    {
        Bus b = new Bus (10,40,"AB33 SMI");
        BusStop BS = new BusStop(b,0);
        
        BS.maxSeats(40);
        System.out.println(maxSeats)
    }
}