import java.util.Random;
public class Test
{
    public void testNumbers()
    {
        Numbers n = new Numbers(100);

        if (n.getElement(10) != 0) System.out.println("error 0");
        n.setElement(10,3);
        if (n.getElement(10) != 3) System.out.println("error 1");

        n.setElement(-1,-1);
        System.out.println("There should be an error message above this line!");
        n.setElement(100,-1);
        System.out.println("There should be an error message above this line!");

        n.fillWithOddNumbers();
        if (n.sum() != 10000) System.out.println("error 2");

        n.fillWithEvenNumbers();
        n.print();
        System.out.println("Here schould be a long row of even numbers obove this message");

        n.maxValue();
        System.out.println("Above there schould be the last number of the row of numbers above");

        n.minValue();
        System.out.println("Above there should be the number 2");

        n.maxPosition();
        System.out.println("Above there should be the number 100");

        n.minPosition();
        System.out.println("Above there should be the number 0");
    }

    public void testStrings(){
        Strings s =new Strings(100);

        s.number();
        System.out.println("number above should be 0");
        s.setElement(3,"test1");
        s.getElement(3);
        System.out.println("should say \"test1\" above");
        s.setElement(10,"test");
        s.maxValue();
        System.out.println("should say \"test1\" above");
        s.minValue();
        System.out.println("should say \"test\" above");
        s.maxPosition();
        System.out.println("should say 10 above");
        s.minPosition();
        System.out.println("should say 3 above");
        s.contain("test");
        System.out.println("should say 2 above");
    }

    public void testMeasurements(){
        Measurements m =new Measurements(1000);
        Random r =new Random();
        for(int i=0;i<1000;i++){
            m.setElement(i,(r.nextDouble()/2+1));
        }
        m.minValue();
        System.out.println("Above there should be a Number close to 1.5");
        m.maxValue();
        System.out.println("Above there should be a Number close to 2");
        m.minPos();
        System.out.println("Above there should be the Number 1");
        m.maxPos();
        System.out.println("Above there should be the Number 1000");
        m.range();
        System.out.println("Above there should be the Number 0.5");
        m.sum();
        System.out.println("Above there should be a big number");
        m.average();
        System.out.println("Above there should be the Number ~1.75");
        m.print();
        System.out.println("Above there should be 20 rows of numbers");
        m.variance();
    }
}
