public class RegularHexagon {
    double s;
    //constructors
    //default constructor
    public RegularHexagon() {
        setS(1.0);
    }
    //constructor with 1 parameter
    public RegularHexagon(double newSideLength) {
        setS(newSideLength);
    }
    //setter for side length 
    public void setS(double newS) {
        if(newS < 0.0) {
            s = 0.0;
            System.out.println("s needs to be over 0.0, not: " + newS);
        }
        else {
            s = newS;
        }
    }
    //getter for side length
    public double getS() {
        return s;
    }
    /*method to calculate and return the height of one 
     of the six component triangles in a regular hexagon*/
    public double getHeightOfComponentTriangle() {
        return Math.sqrt(3 * (s / 2));
    }
    /*method to calculate and return the area of one 
     of the six component triangles in a regular hexagon*/
    public double getAreaOfComponentTriangle() {
        return (s * getHeightOfComponentTriangle()) / 2;
    }
    //method to calculate and return the circumference of the hexagon
    public double getCircumference() {
        return s * 6;
    }
    //method to calculate and return the area of the hexagon
    public double getArea() {
        return getAreaOfComponentTriangle() * 6;
    }
    //print method
    public void print() {
        System.out.println("side length: " + getS());
        System.out.println("height of a component triangle of the hexagon: " + getHeightOfComponentTriangle());
        System.out.println("area of a component triangle of the hexagon: " + getAreaOfComponentTriangle());
        System.out.println("circumference of the hexagon: " + getCircumference());
        System.out.println("area of the hexagon: " + getArea());
    }
}
