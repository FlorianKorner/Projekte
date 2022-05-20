class RegularHexagon {
    public double sideLength;
    
    public RegularHexagon() {
        setSideLength(1.0);
    }
    
    public RegularHexagon(double newSideLength) {
        setSideLength(newSideLength);
    }
    
    public void setSideLength(double newSideLength) {
        if (newSideLength > 0)
            sideLength = newSideLength;
        else {
            System.err.println("Error at setSideLength, value will be set to 1.0");
            sideLength = 1.0;
        }
    }
    
    public double getSideLength() {
        return sideLength;
    }
    
    public double getHeightOfComponentTriangle() {
        return Math.sqrt(3) * getSideLength() / 2;
    }
    
    public double getAreaOfComponentTriangle() {
        return getSideLength() * getHeightOfComponentTriangle() / 2.0;
    }
    
    public double getCircumference() {
        return getSideLength() * 6;
    }
    
    public double getArea() {
        return getAreaOfComponentTriangle() * 6;
    }
    
    public void print() {
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("Values for a regular hexagon:");
        System.out.println("Side length: " + getSideLength());
        System.out.println("Height of the component triangle: " + getHeightOfComponentTriangle());
        System.out.println("Cirumference: " + getCircumference());
        System.out.println("Area: " + getArea());
        System.out.println("++++++++++++++++++++++++++++++++++++");
    }
}