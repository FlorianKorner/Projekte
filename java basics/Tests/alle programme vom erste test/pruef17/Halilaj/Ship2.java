
/**
 * Beschreiben Sie hier die Klasse Ship2.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Ship2{
    private String Name;
    private double Speed;
    private int numberofMasts;
    private boolean hasGuns;

    public Ship2(){
        Name="Bounty";
        Speed=0.5;  //in knots
        numberofMasts=3;
        hasGuns=true;
    }

    public void print(){
        System.out.println("The Name is Bounty");
        System.out.println("The Speed is 0.5");
        System.out.println("There are 3 Masts");
        System.out.println("It does have Guns");
    }

    public Ship2(int newnumberofMasts){
        setnumberofMasts(newnumberofMasts);
        newnumberofMasts=4;
        
        
        

    }
    public void setnumberofMasts(int newnumberofMasts){
        numberofMasts=newnumberofMasts;
    }
    
        
        
    
    
}

 
    