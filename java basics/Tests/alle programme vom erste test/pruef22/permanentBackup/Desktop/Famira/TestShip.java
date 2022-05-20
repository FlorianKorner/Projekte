public class TestShip {
    //test method
    public void test() {
        //creating first testing ship using constructor without parameters
        Ship testShip1 = new Ship();
        //checking if the setter and getter for numberOfMasts are working
        if(testShip1.getNumberOfMasts() == 2) {
            System.out.println("correct 1");
        }
        else {
            System.out.println("error 1");
        }
        //checking if the setter and getter for speed are working
        testShip1.setSpeed(15.0);
        if(testShip1.getSpeed() == 15.0) {
            System.out.println("correct 2");
        }
        else {
            System.out.println("error 2");
        }
        //checking if the method speedup() is working
        testShip1.speedup();
        if(testShip1.getSpeed() == 16.0) {
            System.out.println("correct 3");
        }
        else {
            System.out.println("error 3");
        }
        //creating second testing ship using constructor with parameters
        Ship testShip2 = new Ship("Bounty", 0.5, 3, true);
        //printing the second testing ship
        testShip2.print();
        //checking if the setter and getter for hasGuns are working
        if(testShip2.getHasGuns() == true) {
            System.out.println("correct 4");
        }
        else {
            System.out.println("error 4");
        }
        //checking if the setter and getter for numberOfMasts are working
        testShip2.setNumberOfMasts(4);
        if(testShip2.getNumberOfMasts() == 4) {
            System.out.println("correct 5");
        }
        else {
            System.out.println("error 5");
        }
        //checking if the method slowdown() is working
        testShip2.slowdown();
        if(testShip2.getSpeed() == 0.0) {
            System.out.println("correct 6");
        }
        else {
            System.out.println("error 6");
        }
    }
}
