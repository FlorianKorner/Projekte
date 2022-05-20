public class regularHexagon
{
    private double s;

    private regularHexagon()
    {
        s=10.0;
    }

    public regularHexagon(double newS)
    {
        s=newS; 
    }

    public void setS(double newS)
    {
        if(s<0.0)
        {
            s=10.0;
            System.out.println("s can not be negative");
        }
        else
        {
            s=newS;
        }
    }

    public double getS()
    {
        return s;
    }

    public void getHeightOfComponentTriangle(double newHeightOfComponentTriangle)
    {
        newHeightOfComponentTriangle=1.5*s/2;
    }

    public void getAreaOfComponentTriangle(double newAreaOfComponentTriangle)
    {
        newAreaOfComponentTriangle=s*1.5*s/2/2;
    }

    public void getCircumfrence(double newCircumfrence)
    {
        newCircumfrence=s*6;
    }

    public void getArea(double newArea)
    {
        newArea=s*1.5*s/2/2*6;
    }

    public void print(double getArea,double getCircumfrence,double getAreaOfComponentTriangle,double getHeightOfComponentTriangle)
    {
        System.out.println("the sidelenght is="+s);
        System.out.println("the area is="+ getArea);
        System.out.println("the circumfrence="+ getCircumfrence);
        System.out.println("the height of a component triangle="+getAreaOfComponentTriangle);
        System.out.println("the areat of a component triangle="+getHeightOfComponentTriangle);
    }
}