class TestShip {
    public Ship myShip;
    
        public void testDefault() {
            Ship myShip = new Ship();
            
            if (myShip.getNumberOfMasts() == 2) {
                System.out.println("Default: Correct 1 at getNumberOfMasts");
            }
            else {
                System.err.println("Default: Error 1 at getNumberOfMasts");
            }
            
            myShip.setSpeed(150.0);
            if (myShip.getSpeed() == 150.0) {
                System.out.println("Default: Correct 2 at getSpeed");
            }
            else {
                System.err.println("Default: Error 2 at getSpeed");
            }
            
            myShip.speedup();
            if (myShip.getSpeed() == 151.0) {
                System.out.println("Default: Correct 3 at speedup");
            }
            else {
                System.err.println("Default: Error 3 at speedup");
            }
        }
        
        public void testBounty() {
            Ship myShip = new Ship("Bounty", 0.5, 3, true);
            myShip.print();
            
            if (myShip.getHasGuns()) {
                System.out.println("Bounty: Correct 1 at getHasGuns");
            }
            
            else {
                System.err.println("Bounty: Error 1 at getHasGuns");
            }
            
            myShip.setNumberOfMasts(4);
            if (myShip.getNumberOfMasts() == 4) {
                System.out.println("Bounty: Correct 2 at getNumberOfMasts");
            }
            
            else {
                System.err.println("Bounty: Error 2 at getNumberOfMasts");
            }
            
            myShip.slowdown();
            if (myShip.getSpeed() == 0.0) {
                System.out.println("Bounty: Correct 3 at slowdown");
            }
            else {
                System.err.println("Bounty: Error 3 at slowdown");
            }
        }
}