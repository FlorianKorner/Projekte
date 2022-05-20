
public class TestRegularHexagon
{
    public TestRegularHexagon()
    {
        RegularHexagon myRegularHexagon = new RegularHexagon();
        myRegularHexagon.print();
        myRegularHexagon.getCircumference();
        myRegularHexagon.getArea();
   
    
       RegularHexagon myRegularHexagon2 = new RegularHexagon(3);
       myRegularHexagon2.print();
       myRegularHexagon2.getCircumference();
       myRegularHexagon2.getArea();
    }
    }