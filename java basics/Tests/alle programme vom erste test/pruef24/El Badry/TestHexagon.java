public class TestHexagon
{
    Hexagon h1 = new Hexagon();
    {
        if (h1.getCircumference() == 6 && h1.getArea() == Math.sqrt(3 * h1.getS() / 2) * 6)
        {
            System.out.println("correct");
        }
        else
        {
            System.out.println("error");
        }
    }
    
    Hexagon h2 = new Hexagon();
    h2.setS(3);
    {
        if (h2.getCircumference() == 18 && h2.getArea() == Math.sqrt(3 * h2.getS() / 2) * 6)
        {
            System.out.println("correct");
        }
        else
        {
            System.out.println("error");
        }
    }
}
    
        
     