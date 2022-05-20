
/**
 * Beschreiben Sie hier die Klasse RegularHexagonTest.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class RegularHexagonTest
{
    public void Test()
    {
        RegularHexagon rh = new RegularHexagon(5.0);  
        rh.print();
        System.out.println();

        if(Math.abs(rh.getCircumference()-30.0)< 0.1)
        {
            System.out.println("Circumference is correct");
        }
        else
        {
            System.out.println("Circumference is not correct");
        }
        if(Math.abs(rh.getArea()-29.047375)< 0.1)
        {
            System.out.println("Area is correct");
        }
        else
        {
            System.out.println("Area is not correct");
        }
        System.out.println();
    }

    public void test2()
    {
        RegularHexagon rh = new RegularHexagon(3.0); 
        rh.print();
        System.out.println();

        if(Math.abs(rh.getCircumference()-18.0)< 0.1)
        {
            System.out.println("Circumference is correct");
        }
        else
        {
            System.out.println("Circumference is not correct");
        }
        if(Math.abs(rh.getArea()-13.5)< 0.1)
        {
            System.out.println("Area is correct");
        }
        else
        {
            System.out.println("Area is not correct");
        }
    }
}
