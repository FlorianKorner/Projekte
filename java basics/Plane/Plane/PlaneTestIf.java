public class PlaneTestIf
{
    public void testIf()
    {
        Plane p = new Plane();
        p. setColor("blue");
        if(p.getColor()== "blue")
        {
            System.out.println("correct 4");
        }
        else
        {
            System.out.println("error 4");
            p.setColor("null");
        }
        p.setSpeed(400);
        if(p.getSpeed()!=400)
        {
            System.out.println("correct 5");
        }
        else
        {
            System.out.println("error 5 please call the Admin ->"+p.getSpeed());
            p.setSpeed(0);
        }
        p.setHasPassengerseats(true);
        if(p.getHasPassengerseats()==true)
        {
            System.out.println("correct 6");
        }
        else
        {
            System.out.println("error 6 please call the Admin ->"+p.getHasPassengerseats());
            p. setHasPassengerseats(false);
        }
        p.print();
    }
}