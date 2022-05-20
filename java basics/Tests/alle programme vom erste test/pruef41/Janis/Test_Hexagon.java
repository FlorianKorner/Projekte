public class Test_Hexagon
{
    public void hexa()
    {
        Hexagon hex = new Hexagon();
        hex.print();

        if(Math.abs(hex.getCircumference() - 6) < 0.0001)
        {
            System.out.println("The circumference is correct");
        }
        else
        {
            System.out.println("The circumference is incorrect");
        }
        
        if(Math.abs(hex.getArea() - 3.6742346) < 0.0001)
        {
            System.out.println("The area is correct");
        }
        else
        {
            System.out.println("The area is incorrect");
        }

    }

    public void hexa2()
    {
        Hexagon hex = new Hexagon(3.0);
        hex.print();
        
        if(Math.abs(hex.getCircumference() - 18) < 0.0001)
        {
            System.out.println("The circumference 2 is correct");
        }
        else
        {
            System.out.println("The circumference 2 is incorrect");
        }
        
        if(Math.abs(hex.getArea() - 19.091883) < 0.0001)
        {
            System.out.println("The area 2 is correct");
        }
        else
        {
            System.out.println("The area 2 is incorrect");
        }
    }
    
}