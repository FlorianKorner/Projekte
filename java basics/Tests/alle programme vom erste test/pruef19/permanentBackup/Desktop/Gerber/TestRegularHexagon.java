public class TestRegularHexagon
{
    public void hexagon01()
    { 
        RegularHexagon rh = new RegularHexagon(2.0);

        System.out.println(" The Hexagons side equals " + rh.getS());
        System.out.println(" The Heigth of one triangle equals " + rh.getHeightOfComponentTriangle());
        System.out.println(" The Area of one triangle equals " + rh.getAreaOfComponentTriangle());
        System.out.println(" The hexagons circumference is " + rh.getCircumference());
        System.out.println(" the hexagons area is " + rh.getArea());

        if (Math.abs(rh.getCircumference()-rh.getS()*6) < 0.001)
            System.out.println(" correct01");
        else
        {
            System.out.println(" ERROR01");
        }

        if (Math.abs(rh.getArea()-rh.getAreaOfComponentTriangle()*6) < 0.001)
            System.out.println(" correct02");
        else
        {
            System.out.println(" ERROR02");
        }

    }

    public void hexagon02()
    { 
        RegularHexagon RH = new RegularHexagon(3.0);

        System.out.println(" The hexagons side equals " + RH.getS());
        System.out.println(" The heigth of one triangle equals " + RH.getHeightOfComponentTriangle());
        System.out.println(" The area of one triangle equals " + RH.getAreaOfComponentTriangle());
        System.out.println(" The hexagons circumference is " + RH.getCircumference());
        System.out.println(" the hexagons area is " + RH.getArea());

        if (Math.abs(RH.getCircumference()-RH.getS()*6) < 0.001)
            System.out.println(" correct03");
        else
        {
            System.out.println(" ERROR03");
        }

        if (Math.abs(RH.getArea()-RH.getAreaOfComponentTriangle()*6) < 0.001)
            System.out.println(" correct04");
        else
        {
            System.out.println(" ERROR04");
        }

    }

}