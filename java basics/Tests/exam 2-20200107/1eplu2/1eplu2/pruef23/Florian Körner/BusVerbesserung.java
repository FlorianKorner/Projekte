/**
 * Beschreiben Sie hier die Klasse BusVerbesserung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class BusVerbesserung
{
    private int passengers;
    private int seats;
    private String registration;
    public BusVerbesserung(int passengers,
    int seats, String registration){
        if(checkConsistency(passengers,seats,registration))
        {
            this.passengers= passengers;
            this.seats=seats;
            this.registration=registration;
        }else{
            System.out.println(
                "Error: inconsistent data in constructor");
            this.passengers=0;
            this.seats=50;
            this.registration="AB00 ABC";
        }
    }

    public BusVerbesserung(){
        this(0,50, "AB00 ABC");
    }

    public boolean checkConsistency(int passengers
    , int seats, String registration){
        if(passengers<0|| passengers> seats||registration==null
        ||registration.length()!= 8)return false;
        if("ASEWYDRXFTCGZVHUBNJIMKOLP".indexOf(registration.charAt(0)) == -1 )return false;
        if("ASEWYDRXFTCGZVHUBNJIMKOLP".indexOf(registration.charAt(1)) == -1 )return false;
        if("ASEWYDRXFTCGZVHUBNJIMKOLP".indexOf(registration.charAt(5)) == -1 )return false;
        if("ASEWYDRXFTCGZVHUBNJIMKOLP".indexOf(registration.charAt(6)) == -1 )return false;
        if("ASEWYDRXFTCGZVHUBNJIMKOLP".indexOf(registration.charAt(7)) == -1 )return false;
        if("1234567890".indexOf(registration.charAt(2)) == -1 )return false;
        if("1234567890".indexOf(registration.charAt(3)) == -1 )return false;
        if((registration.charAt(4)+"").equals(" ")) return false;
        return true;
    }

    public void setPassengers(int passengers){
        if(checkConsistency(passengers,seats,registration)) {
            this.passengers=passengers;
        }
        else System.out.println("Please insert consistent data!");
    }

    public int getPassengers(){
        return this.passengers;
    }

    public void setSeats(int seats){
        if(checkConsistency(passengers,seats,registration)) {
            this.seats=seats;
        }
    }

    public int getSeats(){
        return this.seats;
    }

    public void setRegistration(String registration){
        if(checkConsistency(passengers,seats,registration)) {
            this.registration=registration;
        }
    }

    public String getRegistration(){
        return this.registration;
    }
    public int enter(int number){
        if(number<0) return 0;
        if(number<=seats-passengers){
            passengers+= number;
            return number;
        }else{
            int freeSeats=seats-passengers;
            passengers+= freeSeats;
            return freeSeats;
        }
    }
    public int exit(int number)
    {
        if(number<0) return 0;
        else if(number<=passengers)
        {
            passengers -= number;
            return number;
        }else
        {
            int result = passengers;
            passengers =0;
            return result;
        }
    }
    public void print()
    {
        System.out.println("There are "+getPassengers()+" passengers.");
        System.out.println("There are "+getSeats()+" seats.");
        System.out.println("The registration is: "+getRegistration()+".");
    }
}