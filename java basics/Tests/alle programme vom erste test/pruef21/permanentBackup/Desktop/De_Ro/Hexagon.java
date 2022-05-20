public class Hexagon{

    //field
    public double length;
    
    //constructors
    public Hexagon(double s) {
    
        length = s;
    }
    
    public Hexagon() {
    
        length = 1.0;
    }
    
    // getter
    public double getLength() {
        
        return length;
    }
    
    // setter
    public void setLength(double s) {
    
        length = s;
    }
    
    //Hight & Area of a component triangle
    public double getHightOfComponentTriangle(double length) {
    
        return Math.sqrt((3 * length) / 2);
    }
    public double getAreaOfComponentTriangle(double length, double getHightOfComponentTriangle) {
        
        System.out.println();
        return (length * getHightOfComponentTriangle) / 2;
    }
    
    //Circumference & Area of the hexagon
    public double getCircumference(double length) {
    
        return length * 6;
    }
    public double getArea(double getAreaOfComponentTriangle) {
    
        return getAreaOfComponentTriangle * 6;
    }
    
    public void print() {
    
        System.out.println("The length of one side is " + length);
    }
}
