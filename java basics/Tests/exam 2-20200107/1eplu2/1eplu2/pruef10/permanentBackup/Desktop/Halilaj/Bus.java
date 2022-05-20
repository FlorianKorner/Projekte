
/**
 * Beschreiben Sie hier die Klasse Bus.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bus
{
    private int passengers;
    private int seats;
    private String registration;

    
   public void setPassengers(int passengers){
   if(this.passengers <= 0 && this.passengers >= seats)
   this.passengers=passengers;
   else{
       this.passengers=0;
    }
    }
   
    public void setSeats(int seats){
    if(this.seats <= 0)
    this.seats=seats;
    else{
    this.seats=50;
    }
    }
    
    public void setRegistration(String registration){
    if(this.registration.length() == 8)
    this.registration=registration;
    else{
     System.out.println(this.registration = "AB00 ABC");   
    }
    }
   
    public int getPassengers(){
        return this.passengers;
    }
        public int getSeats(){
            return this.seats;
        }
        public String getRegistration(){
            return this.registration;   
        }
   public Bus(){
           this.passengers=0;
           this.seats=50;
           this.registration="AB00 ABC";
        }
        
        public Bus(int passengers, int seats, String registration){
            this.passengers=passengers;
            this.seats=seats;
            this.registration=registration;
    }
    
    
    public int enter(int number){
    if(this.passengers < 0 && this.passengers >= this.seats)
    this.passengers=this.seats;
    else{
      if(this.passengers <= this.seats); 
      System.out.println("The passengers didn't enter the Bus");
    }
    return this.passengers;
    }
    public int exit(int number){
        if(this.passengers != seats && this.passengers <= 0)
        this.passengers=passengers;
        else{
         System.out.println("The passengers didn't exit the Bus");   
        }
        return this.passengers;
    }
    public void printInfo(){
     System.out.println("The value of passengers is" + getPassengers());   
     System.out.println("The value of seats is" + getSeats()); 
     System.out.println("The value of registration" + getRegistration()); 
    }
}      