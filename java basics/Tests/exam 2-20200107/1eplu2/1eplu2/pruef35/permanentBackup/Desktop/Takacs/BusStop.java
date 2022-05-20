
public class BusStop{
    
    private Bus b0;
    private Bus b1;
    private Bus b2;
    
    public BusStop()
    {
         b0 = new Bus (20,0,"MA73 EHI");
         b1 = new Bus ();
         b2 = new Bus (40,0,"YD34 HIF");
         
         b1 = null;
    } 
        
    public String maxSeat()
    {
        String ac;
        if(b0.getSeats() * 2 > b1.getSeats() + b2.getSeats())
             ac = "b0 has the most seats";
        else if(b1.getSeats() * 2 > b0.getSeats() + b2.getSeats())
          ac = "b1 has the most seats";
        else if(b2.getSeats() * 2 > b0.getSeats() + b1.getSeats())
          ac = "b1 has the most seats";
        else return "error";
        
        return ac;
    }
        
    public String getBus(int position){
        String stat;
        if(b0 != null && position == 0){
            
            stat = b0.getSeats() + b0.getPassengers() + b0.getRegistration();
            
        }
        else if(b1 != null && position == 1){
            
            stat = b1.getSeats() + b1.getPassengers() + b1.getRegistration();
            
        }
        else if(b2 != null && position == 2){
            
            stat = b2.getSeats() + b2.getPassengers() + b2.getRegistration();
        }else{   
           stat = "error"; 
        }
        return stat;
    }
    
    public boolean addBus(Bus b)
    {
         if(b0 == null && b0 != b1 && b0 != b2){
            b0 =  b;
            return true;
        }
        else if(b1 == null && b1 != b0 && b1 != b2){
            b1 =  b;
            return true;
        }
        else if(b2 == null && b2 != b0 && b2 != b1){
            b2 = b;
            return true;
        }
        else {
        return false;
        }
    }   
      
    public boolean addBus(Bus b , int position){
        if(position == 0) 
        {
            if(b0 == null && b0 != b1 && b0 != b2){
            b0 =  b;
            return true;
            }
        }
        if(position == 1)
        {
            if(b1 == null && b1 != b0 && b1 != b2)
            {
            b1 =  b;
            return true;
            }
        }
        if(position == 2)
        {
            if(b2 == null && b2 != b0 && b2 != b1){
            b2 = b;
            return true;
            }
        }
        return false;
    }   
        
    public void enter(int passenger)
    {
        int eee;
        int eddd;
        eee = b0.getSeats() - b0.getPassengers();
       
        passenger = passenger - eee;
        
    }
    
    public boolean removeBus(){
        if(b0 != null){
            b0 = null;
            return true;
        }
        else if(b1 != null){
            b1 = null;
            return true;
        }
        else if(b2 != null){
            b2 = null;
            return true;
        }
        else
        return false;
    }
    
    public boolean removeBus(int position){
        
        if(position == 0 && b0 != null){
            b0 = null;
            return true;
        }
        else if(position == 1 && b1 != null){
            b1 = null;
            return true;
        }
        else if(position == 2 && b2 != null){
            b2 = null;
            return true;
        }
        else
        return false;
    }
    
    
    
    
    
    
}