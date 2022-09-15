
/**
 * Beschreiben Sie hier die Klasse Lokomotive.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Lokomotive
{
    private double weight;
    private double power;
    public Lokomotive(double weight, double power){
        if(weight >0.0 && power>0.0){
            this.weight=weight;
            this.power=power;
        }
        else{
            System.out.println("Error in setting variables");
            System.out.println("(they are not consistent)");
            System.out.println("Next time try some above 0.0");
        }
    }

    private Lokomotive(){}
    public void setWeight(double weight){
        if(weight>0.0) this.weight=weight;
    }
    public void setPower(double power){
        if(power>0.0) this.power=power;
    }
    public double getWeight(){
        return this.weight;
    }
    public double getPower(){
        return this.power;
    }
    public void print(){
        System.out.println("The weight of the Lokomotive is: "+getWeight());
        System.out.println("The power of the Lokomotive is: "+getPower());
    }
    
}
