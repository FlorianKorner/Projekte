
/**
 * Beschreiben Sie hier die Klasse Carrier.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Carriage
{
    public double emptyWeight;
    public double payload;
    public Carriage(double emptyWeight, double payload){
        if(emptyWeight >0.0 && payload>0.0){
            this.emptyWeight=emptyWeight;
            this.payload=payload;
        }
        else{
            System.out.println("Error in setting variables");
            System.out.println("(they are not consistent)");
            System.out.println("Next time try some above 0.0");
        }
    }

    private Carriage(){}

    public void setEmptyWeight(double emptyWeight){
        if(emptyWeight>0.0) this.emptyWeight=emptyWeight;
    }

    public void setPayload(double payload){
        if(payload>0.0) this.payload=payload;
    }

    public double getEmptyWeight(){
        return this.emptyWeight;
    }

    public double getPayload(){
        return this.payload;
    }
    public double getTotalWeight(){
        double res;
        res= getEmptyWeight()+getPayload();
        return res;
    }
    public void print(){
        System.out.println("The emty weight of the Carriage is: "+getEmptyWeight());
        System.out.println("The payload of the Carriage is: "+getPayload());
    }
    
}
