public class TestShip
{
    public void test()
    {
        Ship s = new Ship("Mary Celeste",0.0,2,false);
        if(s.getNumberOfMasts()== 2)
        {
            System.out.println("correct 01");
        }
        else
        {
            System.out.println("error 01");
        }
        s.setSpeed(15.0);
        if(s.getSpeed() == 15.0)
        {
            System.out.println("correct 02");
        }
        else
        {
            System.out.println("error 02");
        }
        s.speedup();
        if(s.getSpeed()> 1)
        {
            System.out.println("correct 03");
        }
        else
        {
            System.out.println("error 03");
        }
    }
    
    public void test2()
    {
        Ship a = new Ship("Bounty", 0.5, 3, true);
        a.print();
        if(a.getHasGuns()== true)
        {
            System.out.println("correct 04");
        }
        else
        {
            System.out.println("error 04");
        }
        a.setNumberOfMasts(4);
        if(a.getNumberOfMasts()== 4)
        {
            System.out.println("correct 05");
        }
        else
        {
            System.out.println("error 05");
        }
        a.slowdown();
        if(a.getSpeed()<1)
        {
            System.out.println("correct 06");
        }
        else
        {
            System.out.println("error 06");
        }
    }
}