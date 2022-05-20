
public class BusStop
{
    private Bus b0;
    private Bus b1;
    private Bus b2;

    public BusStop(){
        b0 = new Bus(0, 20, "MA73 EHI");
        b1 = null;
        b2 = new Bus(12, 40, "YD34 HIF");
    }

    public Bus maxSeats(){
        if(b0==null&&b1==null&&b2==null) return null;

        if(b0!=null||b0.getSeats()!=0) if(b0.getSeats()>b1.getSeats()&&b0.getSeats()>b2.getSeats()&&b0!=null) return b0;
        if(b1!=null||b1.getSeats()!=0) if(b1.getSeats()>b0.getSeats()&&b1.getSeats()>b2.getSeats()&&b1!=null) return b1;

        if(b2!=null||b0.getSeats()!=0) if(b2.getSeats()>b0.getSeats()&&b2.getSeats()<b1.getSeats()&&b2!=null) return b2;
        return null;
    }

    public int registrationStartsWith(String s){
        int x = 0;
        if(b0!=null) if(b0.getRegistration()!=null&&b0.getRegistration().startsWith(s)==true) x +=1;

        if(b1!=null) if(b1.getRegistration()!=null&&b1.getRegistration().startsWith(s)==true) x +=1;
        if(b2!=null) if(b2.getRegistration()!=null&&b2.getRegistration().startsWith(s)==true) x +=1;
        return x;
    }

    public int enter(int passengers){
        int value = 0;
        if(passengers<=0) return 0;

        if(b0!=null) value = value + b0.enter(passengers);
        if(b1!=null) value += b1.enter(passengers-value);
        if(b2!=null) value += b2.enter(passengers-value);
        return value;
    }

    public Bus getBus(int position){
        if(position!=0&&position!=1&&position!=2) 
            return null;

        if(position==0) return b0;
        if(position==1) return b1;
        if(position==2) return b2;
        return null;
    }

    public boolean addBus(Bus b){
        if(b0==null||b1==null||b2==null || b==b0|| b==b1 || b==b2){
            if(b0==null) {
                b0=b;
                return true;
            }
            if(b1==null) {
                b1=b;
                return true;
            }
            if(b2==null) {
                b2=b;
                return true;
            }
        }
        return false;
    }

    public boolean addBus(Bus b, int pos){
        if(pos!=0&&pos!=1&&pos!=2) 
            return false;

        if(b0==null||b1==null||b2==null || b==b0|| b==b1 || b==b2){
            if(pos==0) {
                if(b0==null) {
                    b0=b;
                    return true;
                }
            }
            if(pos==1){
                if(b1==null) {
                    b1=b;
                    return true;
                }
            }
            if(pos==2){
                if(b2==null) {
                    b2=b;
                    return true;
                }
            }
        }
        return false;
    }
    
    public Bus removeBus(){
        Bus x = b0;
        Bus y = b1;
        Bus z = b2;
        if(b0!=null||b1!=null||b2!=null){
            if(b0!=null) {
                b0=null;
                return x;
            }
            if(b1!=null) {
                b1=null;
                return y;
            }
            if(b2!=null) {
                b2=null;
                return z;
            }
        }
        return null;
    }
    public Bus removeBus(int pos){
        if(pos!=0&&pos!=1&&pos!=2) 
            return null;
            
        Bus x=b0;
        Bus y = b1;
        Bus z = b2;
        if(b0==null||b1==null||b2==null){
            if(pos==0) {
                if(b0!=null) {
                    b0=null;
                    return x;
                }
            }
            if(pos==1){
                if(b1!=null) {
                    b1=null;
                    return y;
                }
            }
            if(pos==2){
                if(b2!=null) {
                    b2=null;
                    return z;
                }
            }
        }
        return null;
    }
    
}
