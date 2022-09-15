public class TestWineCask
{
    public void test()
    {
        WineCask1 w1 = new WineCask1(100.0, 200.0);
        System.out.println("Why doesn't it work?");
        WineCask2 w2 = new WineCask2(100.0, 200.0);
        System.out.println("Why does it work now?");
        WineCask3 w3 = new WineCask3(100.0, 200.0);
        System.out.println("Now it works. The order of statements in the constructor doesn't matter");
    }
}
