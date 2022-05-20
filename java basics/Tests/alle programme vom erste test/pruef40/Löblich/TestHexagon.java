
public class TestHexagon
{
    public void TestHexagon()
    
    {
        RegularHexagon myRH = new RegularHexagon(1.0);
        myRH.print();
        
       
        
        if(Math.abs(myRH.getCircumference() -6) < 0.001)
        {
             System.out.println("CORRECTc");
            
        }
        else
        {
             System.out.println("ERRORc");
        }
        
        if(Math.abs(myRH.getArea() - 3.6742346) <0.001)
        {
            System.out.println("CORRECTa");
        }
        else
        {
            System.out.println("ERRORa");
        }
        
        myRH.setS(3.0);
        
          if(Math.abs(myRH.getCircumference() -18) < 0.001)
        {
             System.out.println("CORRECTc2");
            
        }
        else
        {
             System.out.println("ERRORc2");
        }
        
          if(Math.abs(myRH.getArea() - 19.091883) <0.001)
        {
            System.out.println("CORRECTa2");
        }
        else
        {
            System.out.println("ERRORa2");
        }
        
        
        
    }
    
}