public class PlaneTest
{
    public void test()
    {
        Plane p = new Plane("silver", 400, true);
        p. print();
        p. setSpeed(500);
        p. print();
        p. setColor("white");
        p. print();
        p. setHasPassengerseats(false);
    }
}