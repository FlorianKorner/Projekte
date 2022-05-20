class TestHexagon {
    public RegularHexagon myHexagon;
    
    public void test() {
        RegularHexagon myHexagon = new RegularHexagon();
        myHexagon.print();
        
        if (Math.abs(myHexagon.getCircumference() - 6) < 0.01) {
            System.out.println("Correct 1 at getCircumference");
        }
        else {
            System.err.println("Error 1 at getCircumference");
        }
        
        if (Math.abs(myHexagon.getArea() - 2.598) < 0.01) {
            System.out.println("Correct 2 at getArea");
        }
        else {
            System.err.println("Error 2 at getArea");
        }
        
        myHexagon.setSideLength(3.0);
        System.out.println("Side length was set to: 3.0");
        if (Math.abs(myHexagon.getCircumference() - 18) < 0.01) {
            System.out.println("Correct 3 at getCircumference");
        }
        else {
            System.err.println("Error 3 at getCircumference");
        }
        
        if (Math.abs(myHexagon.getArea() - 23.383) < 0.01) {
            System.out.println("Correct 4 at getArea");
        }
        else {
            System.err.println("Error 4 at getArea");
        }
    }
}