public class Hexagon_Test
{
    public void test()
    {
        Hexagon myHexagon = new Hexagon();
        myHexagon.print();
        if(Math.abs(myHexagon.getCircumference() - 6.0) < 0.0001 && Math.abs(myHexagon.getArea() - 2.598076211353316) < 0.0001)
        {
            System.out.println("Correct 187");
        }
        else 
        {
            System.out.println("Error 187");
        }
        myHexagon.setS(3.0);
        myHexagon.print();
        if(Math.abs(myHexagon.getCircumference() - 18.0) < 0.0001 && Math.abs(myHexagon.getArea() - 23.382685902179844) < 0.0001)
        {
            System.out.println("Correct 404");
        }
        else 
        {
            System.out.println("Error 404");
        }
    }
} 