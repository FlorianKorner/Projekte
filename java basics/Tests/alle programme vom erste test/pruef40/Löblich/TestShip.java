
public class TestShip
{
    public void TestShip()
    {
        Ship myShip = new Ship("Mary Celeste",0.0,2,false);
        
        if(myShip.getName() == "Mary Celeste")
        {
            System.out.println("CORRECTname");
        }
        else
        {
            System.out.println("ERRORname");
        }
        
        if(myShip.getSpeed() == 0.0)
        {
            System.out.println("CORRECTspeed");
        }
        else
        {
            System.out.println("ERRORspeed");
        }
        
        if(myShip.getNumberOfMasts() == 2)
        {
            System.out.println("CORRECTnumberofmasts");
        }
        else
        {
            System.out.println("ERRORnumberofmasts");
        }
        
        if(myShip.getHasGuns() == false)
        {
            System.out.println("CORRECTguns");
        }
        else
        {
            System.out.println("ERRORguns");
        }
        
        myShip.setSpeed(15.0);
        myShip.speedup();
        
        if(myShip.getSpeed()== 16.0)
        {
            System.out.println("CORRECTspeedup");
        }
        else
        {
            System.out.println("ERRORspeedup");
        }
         
        myShip.setName("Bounty");
        myShip.setSpeed(0.5);
        myShip.setNumberOfMasts(3);
        myShip.setHasGuns(true);
        
        if(myShip.getName() == "Bounty")
        {
            System.out.println("CORRECTname2");
        }
        else
        {
            System.out.println("ERRORname2");
        }
        
         if(myShip.getSpeed() == 0.5)
        {
            System.out.println("CORRECTspeed2");
        }
        else
        {
            System.out.println("ERRORspeed2");
        }
        
         if(myShip.getNumberOfMasts() == 3)
        {
            System.out.println("CORRECTnumberofmasts2");
        }
        else
        {
            System.out.println("ERRORnumberofmasts2");
        }
        
         if(myShip.getHasGuns() == true)
        {
            System.out.println("CORRECTguns2");
        }
        else
        {
            System.out.println("ERRORguns2");
        }
        
        myShip.setNumberOfMasts(4);
        myShip.slowdown();
        
          if(myShip.getNumberOfMasts() == 4)
        {
            System.out.println("CORRECTnumberofmasts3");
        }
        else
        {
            System.out.println("ERRORnumberofmasts3");
        }
        
         if(myShip.getSpeed() == 0.5)
        {
            System.out.println("CORRECTspeed3");
        }
        else
        {
            System.out.println("ERRORspeed3");
        }
        
    }
    
    
}