
public class TestShip
{
        public void test() {
        Ship s = new Ship();
        s.print();
        
        if(s.getNumberOfMasts()==2)
        System.out.println("correct1");
        else
        System.out.println("error1");
        
        s.setSpeed(15.0);
        if(s.getSpeed()==15)
        System.out.println("correct2");
        else
        System.out.println("error2");
        
        s.speedup();
        if(s.getSpeed()==16)
        System.out.println("Correct3");
        else
        System.out.println("error3");
    }
    public void test2() {
        Ship p = new Ship("Bounty", 0.5, 3, true);
        p.print();
        
        if(p.getHasGuns()==true)
        System.out.println("hasGuns");
        else
        System.out.println("hasNOGuns");

        p.setNumberOfMasts(4);
        if(p.getNumberOfMasts()==4)
        System.out.println("Correct4");
        else
        System.out.println("error4");
        
        p.slowdown();
        if(p.getSpeed()==3)
        System.out.println("correct5");
        else
        System.out.println("error5");
    }
}
