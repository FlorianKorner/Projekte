public class Test
{
    public void test()
    {
        Ship s=new Ship();
        if(s.getNumberOfMasts()==1)
        {System.out.println("correct 1");
        }
        else
        {System.out.println("Error 1");
        }
        s.setSpeed(15.0);
        if(s.getSpeed()==15.0)
        {
            System.out.println("correct 2");
        }
        else
        {
            System.out.println("Error 2");
        }
        s.speedup();
        if(s.getSpeed()==16){
            System.out.println("correct 3");
        }
        else
        {System.out.println("Error 3");
        }
        Ship h =new Ship("bounty", 0.5, 3,true);
        h.print();
        if (h.getHasGuns()==true)
        {System.out.println("correct 4");
        }else{
        System.out.println("Error 4");
        }
        h.setNumberOfMasts(4);
        if(h.getNumberOfMasts()==4)
        {
            System.out.println("correct 5");
        }
        else
        {
            System.out.println("Error 5");
        }
        h.slowdown();
        if(h.getSpeed()==2)
        {System.out.println("correct 6");
        }
        else{
        System.out.println("Error 6");
        }
    }
}