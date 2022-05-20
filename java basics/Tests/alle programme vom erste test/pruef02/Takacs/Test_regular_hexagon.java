
public class Test_regular_hexagon
{
    Regular_Hexagon myRegular_Hexagon = new Regular_Hexagon(1);
   
    public void print()
    {
        myRegular_Hexagon.setS(1);

        if(myRegular_Hexagon.getCircumreference()==6)
        {
            System.out.println("correct1");
        }
        else
        {
            System.out.println("wrong1");
        }
        if(myRegular_Hexagon.getAreaOfRegularHexagon()== 8.598076211353316)
        {
            System.out.println("correct2");
        }
        else
        {
            System.out.println("wrong2");
        }
    }

    
    Regular_Hexagon myRegular_Hexagon2 = new Regular_Hexagon(3);     
    
    public void print2()
    {
        myRegular_Hexagon.setS(3);

        if(myRegular_Hexagon2.getCircumreference()==18)
        {
            System.out.println("correct1");
        }
        else
        {
            System.out.println("wrong1");
        }

            
        if(myRegular_Hexagon2.getAreaOfRegularHexagon()==25.794228634059948)
        {
            System.out.println("correct2");
        }
        else
        {
            System.out.println("wrong2");
        }

         
            
    }
    
    
    
    
}