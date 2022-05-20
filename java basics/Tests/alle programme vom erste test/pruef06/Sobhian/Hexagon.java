
public class Hexagon
{
    private double s;
    
    //constructors
    public Hexagon() {
        s=1;
    }
    public Hexagon(double newS) {
        setS(newS);
    }
    
    public void setS(double newS) {
        if(newS > 0)
        s=newS;
        else
        System.out.println("The side length can't be smaller than 0.");
    }
    public double getS() {
        return s;
    }
    
    
    public double getHeightOfComponentTriangle() {
       return Math.sqrt(3)*s/2.0;
    }
    public double getAreaOfComponentTriangle() {
        return s*getHeightOfComponentTriangle()/2;
    }
    public double getCircumference() {
        return s*6;
    }
    public double getArea() {
        return getAreaOfComponentTriangle()*6;
    }
    
    public void print() {
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("*** Hexagon ***");
        System.out.println("The side length is " + getS());
        System.out.println("The heigth of just one triangle is " + getHeightOfComponentTriangle());
        System.out.println("The area of one triangle is " + getAreaOfComponentTriangle());
        System.out.println("The circumference of the hexagon is " + getCircumference());
        System.out.println("The area of the hexagon is " + getArea());
    }
}
