

public class Test
{
    public void test()
    {
        BusStop c = new BusStop();
        c.maxSeats();
        if(c.maxSeats() == 40)
        {
            return c.maxSeats();
        }
        else
        {
            System.out.println("Error!");
        }
        
    }
}
