
/**
 * Beschreiben Sie hier die Klasse Test.
 * 
 * @author Dominik Fluch
 */
public class Test {
    
    /**
     * There in order to make the class runnable.
     * @param args
     */
    public static void main(String[] args){
        Test.test();
    }
    
    /**
     * Tests the ship class.
     */
    public static void test(){
        //Ship with default values.
        final Ship ship = new Ship();
    
        //In order to check default values (including number of masts)
        ship.print();
        
        ship.setSpeed(15D);
        
        if(ship.getSpeed() == 15D){
            System.out.println("Speed has been set succesfully.");
        }else System.out.println("Unable to set speed.");
        
        
        ship.speedup();
        
        System.out.println("Speed after speeding up: "+ship.getSpeed()+". (Valid: "+ (ship.getSpeed() == 16D ? "Yes" : "No") +")");
       
        final Ship bounty = new Ship("Bounty", 0.5D, 3, true);
        
        //In order to check default values (including if it has guns or not)
        bounty.print();
        bounty.setNumberOfMasts(4);
        
        if(bounty.getNumberOfMasts() == 4){
            System.out.println("Number of masts has been set succesfully.");
        }else System.out.println("Unable to set number of masts.");
        
        ship.slowdown();                                                                //Only then valid because -1 would be <0
        System.out.println("Speed after slowing down: "+bounty.getSpeed()+". (Valid: "+ (bounty.getSpeed() == 0.5D ? "Yes" : "No") +")");
       
    }
}
