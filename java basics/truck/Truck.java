/**
 * Beschreiben Sie hier die Klasse Truck.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Truck
{
    private int wheels;
    private double payload;
    private boolean trailer;
    private String licencePlateNumber;

    public Truck()
    {
        this(4,0,false, "W 0001");
    }
    
    public boolean check(int wheels, double payload,   
    boolean trailer, String licencePlateNumber)
    {
        if(payload >1000*wheels)return false;
        if(trailer==true && payload > 1000*wheels+3000)return false;
        if(wheels % 2 != 0)return false;
        if(wheels > 10 ) return false;
        if(trailer && wheels <6)return false;
        if(!trailer&&wheels<4) return false;
        if(licencePlateNumber == null) return false;
        if(licencePlateNumber.length()<6) return false;
        char c = licencePlateNumber.charAt(0);
        String s = "" +c;
        if (s.equals(s.toUpperCase()))return false;
        if("ABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜ".indexOf(c)== -1) return false;
        if("ABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜ".contains(""+c)) return false;
        c = licencePlateNumber.charAt(licencePlateNumber.length()-1);
        if(!"ABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜ".contains (""+c)) return false;
        return true;
    }

    public Truck (int wheels, double payload, 
    boolean trailer, String licencePlateNumber)
    {
        if(check(wheels, payload, trailer,licencePlateNumber))
        {
            this.wheels = wheels;
            this.payload = payload;
            this.trailer = trailer;
            this.licencePlateNumber = licencePlateNumber;
        }else{
            this.wheels = 4;
            this.payload = 0;
            this.trailer = false;
            this.licencePlateNumber = "W 0000";
        }
    }

    public void setWheels(int wheels)
    {
        if(check(wheels, payload, trailer,licencePlateNumber))
        {
            this.wheels=wheels;
        }
        else{
            System.out.println("wrong Value "+wheels);
        }
    }
}
