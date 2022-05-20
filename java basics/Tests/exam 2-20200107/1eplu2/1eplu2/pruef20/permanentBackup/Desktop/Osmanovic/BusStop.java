public class BusStop
{
    private Bus b0;
    private Bus b1;
    private Bus b2;
    
    public BusStop()
    {
        b0 = new Bus(0, 20, "MA73 EHI");
        b1 = new Bus(0, 0, "JE73 MEH");
        b2 = new Bus(12, 40, "YD34 HIF");
        
    }
    public Bus maxSeats()
    {   
        if(b0.getSeats() > b1.getSeats() && b0.getSeats() > b2.getSeats()){
          int a;
        a = b0.getSeats();
          System.out.println("Bus 0 has most seats: " + b0.getSeats());
          return b0;
        }
        else if(b1.getSeats() > b0.getSeats() && b1.getSeats() > b2.getSeats()){
         int a;
         a = b1.getSeats();
          System.out.println("Bus 1 has most seats: " + b1.getSeats());
          return b1;
        }
        else if(b2.getSeats() > b0.getSeats() && b2.getSeats() > b1.getSeats()){
        int a;
        a = b2.getSeats();
        System.out.println("Bus 2 has most seats: " + b2.getSeats());
        return b2;
        }
        else
          System.out.println("Error");
        return null;
    }
    public int registrationStartsWith(String s)
    {   
        int result = 0; 
        if((b0.getRegistration()).startsWith(s) && b0 != null)
          result += 1;
        if((b1.getRegistration()).startsWith(s) && b1 != null)  
          result += 1;
        if((b1.getRegistration()).startsWith(s) && b2 != null)
          result += 1;
        return result;  
    }
    public int enter(int p)
    {   
        int result = 0;
        if(p < 0) return p;
         if(b0 != null && p <= b0.getPassengers() && b0.getPassengers() != b0.getSeats()){ 
             result += b0.getPassengers() + p;
             
            }
         if(b1 != null && p <= b1.getPassengers() && b1.getPassengers() != b1.getSeats()) result += b1.getPassengers() + p;
         if(b2 != null && p <= b2.getPassengers() && b2.getPassengers() != b2.getSeats()) result += b2.getPassengers() + p;
        return result; 
    }
    public Bus getBus(int position)
    {
        if(position < 0) return null;
         if(position == 0) return b0;
         else if(position == 1) return b1;
         else if(position == 2) return b2;
        else
         return null;
    }
    public boolean addBus(Bus b)
    {
        if(b0 == null){
            Bus ba = b0;
            ba = b;
            b0 = b;
            return true;
        }
        else if(b1 == null){
            Bus ba = b1;
            ba = b;
            b1 = b;
            return true;
        }
        else if(b2 == null){
            Bus ba = b2;
            ba = b;
            b2 = b;
            return true;
        }
        else
         return false;
    }
     public boolean addBus(Bus b, int position)
    {   
        if(position < 0) return false;
        if(b0 == null && position == 0){
            Bus ba = b0;
            ba = b;
            return true;
        }
        else if(b1 == null && position == 1){
            Bus ba = b1;
            ba = b;
            return true;
        }
        else if(b2 == null && position == 2){
            Bus ba = b2;
            ba = b;
            return true;
        }
        else
         return false;
    }
    public Bus removeBus()
    {
        if(b0 != null){
         Bus ba = b0;
         ba = null;
         return ba;
        }
        else if(b1 != null){
         Bus ba = b1;
         ba = null;
         return ba;
        }
        else if(b2 != null){
         Bus ba = b2;
         ba = null;
         return ba;
        }
        else
         return null;
    }
    public Bus removeBus(int position)
    {   if(position < 0) return null;
        if(b0 != null && position == 0){
         Bus ba = b0;
         ba = null;
         return ba;
        }
        else if(b1 != null && position == 1){
         Bus ba = b1;
         ba = null;
         return ba;
        }
        else if(b2 != null && position == 2){
         Bus ba = b2;
         ba = null;
         return ba;
        }
        else
         return null;
    }
    
}
