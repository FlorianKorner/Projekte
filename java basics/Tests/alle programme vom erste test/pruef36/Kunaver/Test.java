public class Test
{
    public void test()
    {
        Ship a = new Ship();
        if(a.getNumberOfMasts() == 2)
            System.out.println("Test 1 Correct");
        else
            System.out.println("Test 1 Uncorrect");
        a.setSpeed(15.0);
        if(a.getSpeed()==15.0)
            System.out.println("Test 2 Correct");
        else
            System.out.println("Test 2 Uncorrect");
        a.speedup();
        if(a.getSpeed() == 16)
            System.out.println("Test 3 Correct");
        else
            System.out.println("Test 3 Uncorrect");
        Ship b = new Ship("Bounty", 0.5, 3, true);
        b.print();
        if(b.getHasGuns())
            System.out.println("Test 4 Correct");
        else
            System.out.println("Test 4 Uncorrect");
        b.setNumberOfMasts(4);
        if(b.getNumberOfMasts() == 4)
            System.out.println("Test 5 Correct");
        else
            System.out.println("Test 5 Uncorrect");
        b.slowdown();
        if(b.getSpeed()==0)
            System.out.println("Test 6 Correct");
        else
            System.out.println("Test 6 Uncorrect");
    }
}