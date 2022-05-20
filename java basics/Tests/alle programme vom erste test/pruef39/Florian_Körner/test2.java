public class test2
{
    public void test()
    {
        Hexagon h = new Hexagon();
        h.print();
        if(Math.abs(h.getHeightOfComponentTriangle()-0.866025404)<0.0001)
        {
            System.out.println("correct 1");
        }
        else{
            System.out.println("Error 1");
        }
        if(Math.abs(h.getAreaOfComponentTriangle()-0.433012702)<0.0001)
        {
            System.out.println("correct 2");
        }
        else{
            System.out.println("Error 2");
        }
        if(Math.abs(h.getArea()-2.598076211)<0.0001)
        {
            System.out.println("correct 3");
        }
        else{
            System.out.println("Error 3");
        }
        if(Math.abs(h.getCircumference()-6)<0.0001)
        {
            System.out.println("correct 4");
        }
        else{
            System.out.println("Error 4");
        }
        Hexagon a =new Hexagon(3.0);
        a.print();
        if(Math.abs(h.getHeightOfComponentTriangle()-2.598076211)<0.0001)
        {
            System.out.println("correct 5");
        }
        else{
            System.out.println("Error 5");
        }
        if(Math.abs(h.getAreaOfComponentTriangle()-3.897114317)<0.0001)
        {
            System.out.println("correct 6");
        }
        else{
            System.out.println("Error 6");
        }
        if(Math.abs(h.getArea()-23.3826859)<0.0001)
        {
            System.out.println("correct 7");
        }
        else{
            System.out.println("Error 7");
        }
        if(Math.abs(h.getCircumference()-18)<0.0001)
        {
            System.out.println("correct 8");
        }
        else{
            System.out.println("Error 8");
        }
    }
}