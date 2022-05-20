
/**
 * Beschreiben Sie hier die Klasse Testship.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Testship
{
  public void test(){
      Ship myShip = new Ship();
      if (myShip.getNumberOfMasts() ==2) {
          System.out.println("correct");
          
          
        }
      else{
          System.out.println("Error");
          
          
          
        }
      myShip.setSpeed(15);
      if (myShip.getSpeed() ==15) {
          System.out.println("correct1");
          
          
        }
      else{
          System.out.println("Error1");
          
          
          
        }
      myShip.speedup();
      if (myShip.getSpeed() ==16) {
          System.out.println("correct2");
          
          
        }
      else{
          System.out.println("Error2");
          
          
          
        }
      Ship aShip = new Ship(3,"Bounty",0.5,true);
      aShip.Print();
      if (aShip.getHasGuns()){
          System.out.println("has Guns");
          
        }
      else{
          
          System.out.println("No Guns");
          
          
        }
      aShip.setNumberOfMasts(4);
       if (aShip.getNumberOfMasts() == 4){
          System.out.println("Correct3");
          
        }
      else{
          
          System.out.println("Correct4");
          
          
        }
      
    
    
    
    
    }
}
