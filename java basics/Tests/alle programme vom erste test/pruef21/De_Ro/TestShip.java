public class TestShip{

    Ship s1 = new Ship("Big Berta", 15.0, 3, true);
    Ship s2 = new Ship("Bounty", 0.5, 3, true);
    
    public void test() {
        
        //ship 1
        if(s1.numberOfMast == 3) {
                
            System.out.println("numberOfMast = correct");
        }
        else {
            
            System.out.println("numberOfMast = incorrect");
        }
        
        if(s1.speed == 15.0) {
            
            System.out.println("speed = correct");
        }
        else {
            
            System.out.println("speed = incorrect");
        }
        
        //ship 2
        if(s2.numberOfMast == 3) {
                
            System.out.println("numberOfMast = correct");
        }
        else {
            
            System.out.println("numberOfMast = incorrect");
        }
        
        if(s2.speed == 0.5) {
            
            System.out.println("speed = correct");
        }
        else {
            
            System.out.println("speed = incorrect");
        }
    }



}