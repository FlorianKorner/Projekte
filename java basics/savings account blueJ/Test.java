public class Test
{
    public void test()
    {
       Sparbuch s = new Sparbuch();
       s.setBesitzer("Florian");
       s.setZinssatz(3);
       s.setBetrag(20000);
       s.setGesperrt(false);
       s.print();
    }
}