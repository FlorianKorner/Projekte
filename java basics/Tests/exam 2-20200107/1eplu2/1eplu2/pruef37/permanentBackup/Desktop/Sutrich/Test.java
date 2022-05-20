public class Test{
    public void test(){
        BusStop b = new BusStop();
        b.maxSeats();
        if(b.maxSeats() == 40)
        System.out.println("Correct1");
        else
        System.out.println("Error1");
        b.registrationStartsWith("YD");
        if(b.registrationStartsWith() == 1)
        System.out.println("Correct2");
        else
        System.out.println("Error2");
        b.enter(30);
        if(b.enter == 30)
         System.out.println("Correct2");
        else
        System.out.println("Error2");
    }
}