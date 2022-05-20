public class TestShip
{
    public void Test()
    {
        Ship myShip=new Ship();
        if(myShip.getNumberOfMasts()<=4&&myShip.getNumberOfMasts()>=0)
        {
            System.out.println("correct 1");
        }
        else
        {
            System.out.println("false 1");
        }
        myShip.setSpeed(15.0);
        if(myShip.getSpeed()==15.0)
        {
            System.out.println("correct 2");
        }
        else
        {
            System.out.println("false 2");
        }
        myShip.speedup();
        if(myShip.getSpeed()==16)
        {
            System.out.println("correct 3");
        }
        else
        {
            System.out.println("false 3");
        }
        Ship SecondShip=new Ship("Bounty", 0.5, 3, true);
        SecondShip.print();
        if(SecondShip.getHasGuns()==true)
        {
            System.out.println("correct 4");
        }
        else
        {
            System.out.println("false 4");
        }
        SecondShip.setNumberOfMasts(4);
        if(SecondShip.getNumberOfMasts()==4)
        {
            System.out.println("correct 5");
        }
        else
        {
            System.out.println("false 5");
        }
        SecondShip.slowdown();
        if(SecondShip.getSpeed()==0.5)
        {
            System.out.println("correct 6");
        }
        else
        {
            System.out.println("false 6");
        }
    }
}