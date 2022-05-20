public class RegularHexagon
{
    private double sideLenght;
    
    public void RegularHexagon()
    {
        sideLenght = 1.0;
    }
    public void RegularHexagon(double newSideLenght)
    {
        this.sideLenght = newSideLenght;
    }
    public void setSideLenght(double newSideLenght)
    {
        if(sideLenght > 0.0)
        {
            System.out.println("It is bigger than 0.0");
        }
        else
        {
            System.out.println("It is smaller than 0.0, not able to be the lenght.");
        }
        this.sideLenght = newSideLenght;
    }
    public double getSideLenght()
    {
        return sideLenght;
    }
    public double getHeightOfComponentTriangle()
    {
        if(Math.sqrt(3.0 * sideLenght / 2.0))
        {
            return HeightOfComponentTriangle;
        }
       
    }
    public double getAreaOfComponentTriangle()
    {
        if(sideLenght * 3.0)
        {
            return AreaOfComponentTriangle;
        }
    }
    public double getCircumference()
    {
        return sideLenght * 6;
    }
    public double getArea()
    {
        return AreaOfComponentTriangle * 6;
    }
}