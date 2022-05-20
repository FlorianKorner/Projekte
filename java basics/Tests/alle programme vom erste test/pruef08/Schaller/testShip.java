public class testShip 
{
    private void testShip(double speed,int numberOfMasts,boolean hasGuns,String name)
    {
        speed= 15.0;
        name="Mary Celeste";
        hasGuns= false;
        numberOfMasts= 2;
    }   

    public void newTestShip(double speed,int numberOfMasts,boolean hasGuns,String name)
    {
        speed= 0.5;
        name="bounty";
        hasGuns= true;
        numberOfMasts= 3;
    }

    public void decreaseSpeed (double newSpeed,double speed)
    {
        newSpeed=speed-1;
    }

    public void increaseSpeed (double newSpeed,double speed)
    {
        newSpeed=speed+1;
    }
}

