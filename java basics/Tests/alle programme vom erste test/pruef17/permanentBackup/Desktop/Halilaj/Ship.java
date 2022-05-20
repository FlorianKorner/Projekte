
/**
 * Beschreiben Sie hier die Klasse Ship.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Ship
{
    private String Name;
    private double Speed;
    private int numberofMasts;
    private boolean hasGuns;
    
    public Ship(){
        Name="Mary Celeste";
        Speed=0.0;  //in knots
        numberofMasts=2;
        hasGuns=false;
    }
    public Ship(String newName, int newnumberofMasts){
        setName(newName);
        setnumberofMasts(newnumberofMasts);
    }
    
    public void setName(String newName){
      Name=newName;
      newName="Ben";
      
    }
    public String getName(){
     return  Name;
      
    }  
    public void setSpeed (double newSpeed){
        Speed=newSpeed;
        newSpeed=0.5;
    }
    public double getSpeed(){
        return Speed;
        
    }
    public void setnumberofMasts(int newnumberofMasts){
        numberofMasts=newnumberofMasts;
        newnumberofMasts=3;
    }
    public int getnumberofMasts(){
        return numberofMasts;
        
    }   
    public void sethasGuns(boolean hasnoGuns){
        hasGuns=hasnoGuns;
    }
    public boolean gethasGuns(){
        return hasGuns;
        
    }
    public void speedup(double Speed ){
        Speed=1.0;
        
    
    }
    public void slowdown(double Speed){
        Speed=0.0;
        
    }
    public void print(){
        System.out.println("The Name is Ben");
        System.out.println("The Speed is 0.0");
        System.out.println("There are 3 Masts");
        System.out.println("It doesn't have no guns");
        
        
    }
    
        
        
        
}
