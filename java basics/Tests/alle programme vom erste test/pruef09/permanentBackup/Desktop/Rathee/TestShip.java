public class TestShip {

    public void test1(){
        Ship s = new Ship();

        s.setNumberOfMasts(2);
        if(s.getNumberOfMasts()==2)
        {System.out.println("Correct 1");}
        else {

            System.out.println("Error 1");}

        s.setSpeed(15.0);{
            if (s.getSpeed()== 15.0)
            {System.out.println("Correct 2");}
            else {

                System.out.println("Error 2");}

        }

        s.speedup();
        if(s.getSpeed()== 16.0)
        {System.out.println("Correct 3");}
        else {

            System.out.println("Error 3");}
    }

    public void test2(){
        Ship s2 = new Ship ("Bounty", 0.5, 3, true);

        s2.print();

        s2.setHasGuns(true);{
            if(s2.getHasGuns()== true )
            {System.out.println("Correct 4");}
            else {

                System.out.println("Error 4");}

        }
        
        
        s2.setNumberOfMasts(4);
        if(s2.getNumberOfMasts()== 4)
        {System.out.println("Correct 5");}
        else {

            System.out.println("Error 5");}
        
        
        s2.slowdown();
        
         if (s2.getSpeed()== 0.0)
            {System.out.println("Correct 6");}
            else {

                System.out.println("Error 6");}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
