public class Test
{
    public void test()
    {
        Account a = new Account("Andreas",10000000.0, 8.0, false);
        if (a.withdraw(1000000.0) == 1000000.0)
            System.out.println("correct 1");
        else System.out.println("error 1");
        if (a.withdraw(10000000.0) == 0.0)
            System.out.println("correct 1");
        else System.out.println("error 1");
        if (a.withdraw2(10000000.0) == 9000000.0)
            System.out.println("correct 1");
        else System.out.println("error 1");
        
    }
    public void testPentagon()
    {
        Pentagon p = new Pentagon();
        p.print();
        if (Math.abs(p.getCircumference()-5.87785) < 0.0001)
            System.out.println("correct 1");
        else
            System.out.println("error 1");
        if (Math.abs(p.getArea()-2.37764) < 0.0001)
            System.out.println("correct 2");
        else
            System.out.println("error 2");
    }
}
