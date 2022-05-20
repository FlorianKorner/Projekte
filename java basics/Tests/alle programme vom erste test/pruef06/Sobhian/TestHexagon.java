
public class TestHexagon
{
    public void test() {
        Hexagon h = new Hexagon();
        h.print();
        
        if(h.getCircumference()-6.0==0)
        System.out.println("correct1");
        else
        System.out.println("error1");
        
        if(Math.abs(h.getArea()-2.59) > 0.0001)
        System.out.println("correct2");
        else
        System.out.println("error2");

    }
    public void test30() {
        Hexagon h = new Hexagon(3);
        h.print();
        
        if(h.getCircumference()-18==0)
        System.out.println("correct3");
        else
        System.out.println("error3");
        
        if(Math.abs(h.getArea()-23.38) > 0.0001)
        System.out.println("correct4");
        else
        System.out.println("error4");

    }
}
