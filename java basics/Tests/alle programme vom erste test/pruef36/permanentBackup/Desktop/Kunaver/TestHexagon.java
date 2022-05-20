public class TestHexagon
{
    public void test()
    {
        Hexagon a = new Hexagon();
        a.print();
        if(a.getCircumference() == 6)
            System.out.println("Test 1 Correct");
        else
            System.out.println("Test 1 Uncorrect");
        if(Math.abs(a.getArea() - 3.674234614174767) < 0.0001)
            System.out.println("Test 2 Correct");
        else
            System.out.println("Test 2 Uncorrect");
        Hexagon b= new Hexagon(3.0);
        b.print();
        if(b.getCircumference() == 18.0)
            System.out.println("Test 1 Correct");
        else
            System.out.println("Test 1 Uncorrect");
        if(Math.abs(b.getArea() - 19.09188309203678) < 0.0001)
            System.out.println("Test 2 Correct");
        else
            System.out.println("Test 2 Uncorrect");
    }
}