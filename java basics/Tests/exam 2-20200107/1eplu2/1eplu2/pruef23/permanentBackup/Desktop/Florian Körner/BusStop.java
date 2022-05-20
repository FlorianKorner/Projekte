public class BusStop
{
    private Bus b1;
    private Bus b2;
    private Bus b3;
    public BusStop()
    {
        Bus b1 =new Bus(0, 20, "MA73 EHI");
        Bus b2= new Bus();
        Bus b3 =new Bus(12, 40, "YD34 HIF");
    }

    public Bus maxSeats(){
        if(b1.getSeats()>b2.getSeats()&&b1.getSeats()>b3.getSeats()){
            return b1;
        }else if(b2.getSeats()>b1.getSeats()&&b2.getSeats()>b3.getSeats()){
            return b2;
        }else{
            return b3;
        }
    }

    public int registrationStartsWith(String s)
    {
        int i;
        i =0;
        if(b1.getRegistration().startsWith(s))i +=1;
        if(b2.getRegistration().startsWith(s))i +=1;
        if(b3.getRegistration().startsWith(s))i +=1;
        return i;
    }

    public int enter(int passengers){
        int i;
        i =0;
        if(b1.enter(passengers)>0)i +=b1.enter(passengers);
        if(b2.enter(passengers)>0)i +=b2.enter(passengers);
        if(b3.enter(passengers)>0)i +=b3.enter(passengers);
        return i;
    }

    public Bus getBus(int position){
        if(position>=0&&position<=3){
            if(position == 0)return b1;
            if(position == 2)return b2;
            if(position == 3)return b3;
        }
        return null;
    }

    public boolean addBus(Bus b){
        if(b==b){}
    }
    public boolean addBus(Bus b, int position){
        if (position <=2&&position >=0) 
        {
            if(b)
        }
    }
    public Bus removeBus()
    {
    }
}