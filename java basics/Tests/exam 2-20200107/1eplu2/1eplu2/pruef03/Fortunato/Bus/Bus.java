 public class Bus
 {
   private int passenger;
   private int seats;
   
   public Bus(int newPassenger, int newSeats)
   {
       this.passenger = newPassenger;
       this.seats = newSeats;
   }
   public Bus()
   {
       this.passenger = 0;
       this.seats = 50;
   }
   public void setPassenger (int newPassenger)
   {
       if ((newPassenger >= 0) && (newPassenger <= seats))
       {
           this.passenger = newPassenger;
           this.passenger = 0;
           System.out.println("correct1");
       }
       else 
       {
           System.out.println("Error1");
       }
   }
   public int getPassenger()
   {
       return passenger;
   }
   public void setSeats (int newSeats)
   {
       if (newSeats >= 50)
       {
           this.seats = newSeats;
           this.seats = 50;
           System.out.println("correct2");
       }
       else
       {
           System.out.println("Error2");
       }
   }
   public int getSeats()
   {
       return seats;
   }
   
 }
