
public class Test_ship
{
    Ship myShip1 = new Ship("Los Shipo",15.0,3,false);
    
    
    public void myShip1()
    {
        myShip1.print();
        myShip1.setNumberOfMasts(2);
        myShip1.setSpeed(15.0);  
        
        myShip1.print();
    
        
        if(myShip1.getNumberOfMasts() == 2)
        {
            System.out.println("Correct1");
        }
        else
        {
           System.out.println("Wrong1"); 
        }
        if(myShip1.getSpeed()==15.0)
        {
            System.out.println("Correct2");
           
        }
        else
        {
           System.out.println("Wrong2"); 
           
        }
        myShip1.setSpeed( 1 + 15);
        
         if(myShip1.getSpeed()==16)
         {
            System.out.println("Correct3");
         }
         else
        {
           System.out.println("Wrong3"); 
           
        }
    }
    
    Ship myShip2 = new Ship("Bounty",0.5,3,true);
    
    public void myShip2()
    {
        
        
        myShip2.setHasGuns(true);
        
        
        
        
        if(myShip2.getHasGuns()== true )
        {
            System.out.println("Correct1");
        }
        else
        {
           System.out.println("Wrong1"); 
        }
        myShip2.setNumberOfMasts(4);
        if(myShip2.getNumberOfMasts() == 4)
         {
            System.out.println("Correct2");
        }
        else
        {
           System.out.println("Wrong2"); 
        }
    }
    
    
    
    
}