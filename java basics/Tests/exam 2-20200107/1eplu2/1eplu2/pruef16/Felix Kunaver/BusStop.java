public class BusStop{
    private Bus b0;
    private Bus b1;
    private Bus b2;

    public BusStop(){
        b0 = new Bus(0, 20, "MA73 EHI");
        b1 = null;
        b2 = new Bus(12, 40, "YD34 HIF");
    }

    public Bus maxSeats(){
        /*if(b0 != null ){
            if(b0.getSeats() > b1.getSeats() && b0.getSeats() >b2.getSeats())
                return b0;
        }
        if(b1 != null ){
            if(b1.getSeats() > b0.getSeats() && b1.getSeats() >b2.getSeats())
                return b1;
        }
        if(b2 != null ){
            if(b2.getSeats() > b0.getSeats() && b2.getSeats() >b1.getSeats())
                return b0;
        }
        return null;*/
        int x = 0;
        int y = 0;
        int z = 0;
        if(b0 != null) {
            x = b0.getSeats();
        }
        else x = 0;
        if(b1 != null) {
            y = b1.getSeats();
        }
        else y = 0;
        if(b2 != null) {
            z = b2.getSeats();
        }
        else z = 0;
        if(x == 0 && y == 0 && z == 0) return null;
        if(x > y && x > z) return b0;
        else if(y > x && y > z) return b1;
        else if(z > x && z > y) return b2;
        else return b0;
    }   

    public int enter(int passengers){
        if(passengers <0 ) return 0;
        int x = 0; 
        int y = 0;
        if(b0 != null ){
            y = b0.enter(passengers);
            passengers = passengers - y;
            x += y;
            y = 0;
        }
        
        if(b1 != null ){
            y = b1.enter(passengers);
            passengers = passengers - y;
            x += y;
            y = 0;
        }
        
        if(b2 != null ){
            y = b2.enter(passengers);
            passengers = passengers - y;
            x += y;
            y = 0;
        }
        return x;
    }   

    public Bus getBus(int position){
        if(!(position == 0 || position == 1 || position == 2 )) return null;
        if(position == 0) return b0;
        if(position == 1) return b1;
        else return b2;

    }

    public boolean addBus(Bus b){
        if(b0 == null ){
            if(b == b1 || b == b2){
            System.out.println("Error bus already exists");    
            return false;}
            b0 = b;
            return true;
        }
        else if(b1 == null ){
            if(b == b0 || b == b2){
            System.out.println("Error bus already exists");    
            return false;}
            b1 = b;
            return true;
        }
        else if(b2 == null ){
            if(b == b0 || b == b1){
            System.out.println("Error bus already exists");    
            return false;}
            b2 = b;
            return true;
        }
        else return false;
    }

    public boolean addBus(Bus b, int position){
        if(!(position ==0 || position == 1 || position == 2)) return false;
        if (position == 0){
            if(b0 == null ){
                if(b == b1 || b == b2){
                    System.out.println("Error bus already exists");    
                    return false;}
                b0 = b;
                return true;
            }
            else return false;
        }
        else if (position == 1){
            if(b1 == null ){
               if(b == b0 || b == b2){
                   System.out.println("Error bus already exists");    
                   return false;}
                b1 = b;
                return true;
            }
            else return false;
        }
        else {
            if(b2 == null ){
                if(b == b0 || b == b1){
                    System.out.println("Error bus already exists");    
                    return false;}
                b2 = b;
                return true;
            }
            else return false;
        }
    }
    
    public Bus removeBus(){
        Bus save;
        if(b0 != null ){
                save = b0;
                b0 = null;
                return save;
            }
        else if(b1 != null ){
                save = b1;
                b1 = null;
                return save;
            }
        else if(b2 != null ){
                save = b2;
                b2 = null;
                return save;
            }    
        else return null;
    }
    
    public Bus removeBus(int position){
        Bus save;
        if(!(position ==0 || position == 1 || position == 2)) return null;
        if (position == 0){
            if(b0 != null ){
                
                save = b0;
                b0 = null;
                return save;
            }
            else return null;
        }
        else if (position == 1){
            if(b1 != null ){
                
                save = b1;
                b1 = null;
                return save;
            }
            else return null;
        }
        else {
            if(b2 != null ){
                
                save = b2;
                b2 = null;
                return save;
            }
            else return null;
        }
    }
    
    public int registrationStartsWith(String s){
        int save = 0;
        if(b0 != null ){
            if(b0.getRegistration().startsWith(s)) 
                save += 1;
        }
        if(b1 != null ){
            if(b1.getRegistration().startsWith(s)) 
                save += 1;
        }
        if(b2 != null ){
            if(b2.getRegistration().startsWith(s)) 
                save += 1;
        }
        return save;
    }

}