public class TestRegularHexagon {
    //test method
    public void test() {
        //creating a default hexagon
        RegularHexagon testHexagon1 = new RegularHexagon();
        //printing the first testing hexagon
        testHexagon1.print();
        //checking if circumference of the first testing hexagon is correct
        if((Math.abs(testHexagon1.getCircumference() - 6.0)) < 0.0001) {
            System.out.println("correct 1");
        }
        else {
            System.out.println("error 1");
        }
        //checking if area of the first testing hexagon is correct
        if((Math.abs(testHexagon1.getArea() - 3.67423)) < 0.0001) {
            System.out.println("correct 2");
        }
        else {
            System.out.println("error 2");
        }
        //creating a hexagon with a side length of 3.0
        RegularHexagon testHexagon2 = new RegularHexagon(3.0);
        //printing the second testing hexagon
        testHexagon2.print();
        //checking if circumference of the second testing hexagon is correct
        if((Math.abs(testHexagon2.getCircumference() - 18.0)) < 0.0001) {
            System.out.println("correct 3");
        }
        else {
            System.out.println("error 3");
        }
        //checking if area of the second testing hexagon is correct
        if((Math.abs(testHexagon2.getArea() - 19.09188)) < 0.0001) {
            System.out.println("correct 4");
        }
        else {
            System.out.println("error 4");
        }
    }
}
