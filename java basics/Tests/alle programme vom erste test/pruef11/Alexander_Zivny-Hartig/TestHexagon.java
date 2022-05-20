public class TestHexagon
{
    public void TestHexagon()
    {
        Hexagon myHexagon = new Hexagon();
        myHexagon.print();
        
        if (myHexagon.getCircumference() == 6.0)
            System.out.println("Correct Circumference.");
        else
            System.out.println("Incorrect Circumference.");
            
        if (Math.abs(myHexagon.getArea() - 2.598076211353316) < 0.000001)
            System.out.println("Correct Area.");
        else
            System.out.println("Incorrect Area.");
            
        Hexagon mySecondHexagon = new Hexagon(3.0);
        mySecondHexagon.print();
        
        if (mySecondHexagon.getCircumference() == 18.0)
            System.out.println("Correct Circumference2.");
        else
            System.out.println("Incorrect Circumference2.");
            
        if (Math.abs(mySecondHexagon.getArea() - 13.5) < 0.01)
            System.out.println("Correct Area2.");
        else
            System.out.println("Incorrect Area2.");
    }
}