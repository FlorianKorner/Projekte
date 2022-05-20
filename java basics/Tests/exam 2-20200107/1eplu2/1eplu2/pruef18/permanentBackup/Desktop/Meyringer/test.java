public class test
{
    public void test()
    {
        BusStop b = new BusStop();
        if(b.maxSeats()== 40)
        {
            System.out.println("Correct 1");
        }
        else
        {
            System.out.println("Error 1");
        }
        b.registrationStartsWith("YD");
        if(b.registrationStartsWith("")== 1)
        {
            System.out.println("Correct 2");
        }
        else
        {
            System.out.println("Error 2");
        }
       
        if( b.enter(30)== 30)
        {
            System.out.println("Correct 3");
        }
        else
        {
            System.out.println("Error 3");
        }
        b.getBus(2);
        
    }
}