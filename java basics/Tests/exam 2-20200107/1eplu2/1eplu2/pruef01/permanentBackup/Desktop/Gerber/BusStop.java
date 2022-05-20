public class BusStop
{  Bus b0;
     Bus b1;
     Bus b2;

    public BusStop()
    {
        this.b0= new Bus(0,20,"MA73 EHI");
        this.b1= null;
        this.b2= new Bus(12,40,"YD34 HIF");
    }

    public Bus maxSeats()
    { Bus maxSeat=null;
        if(this.b0.getSeats()<this.b1.getSeats())
        {
            maxSeat=this.b1;
            if( this.b1.getSeats()>this.b2.getSeats())
            {  maxSeat=this.b1;}
            else
            { maxSeat=this.b2;}
        }
        else{ maxSeat=this.b0;}
        return maxSeat;
    }

    public int registrationStartsWith(String s)
    { int startWithS = 0;
        if(b0.getRegistration().startsWith(s)==true) startWithS+=1;
        if(b1.getRegistration().startsWith(s)==true) startWithS+=1;
        if(b2.getRegistration().startsWith(s)==true) startWithS+=1;
        return startWithS;
    }

    public int enter( int passengers)
    { 
        int result=0;
        if(passengers>0)
        {
            if(b0!=null){ result+= b0.enter(passengers);}
            if(b1!=null){ result+= b1.enter(passengers-result);}
            if(b2!=null){ result+= b2.enter(passengers-result);}
        }
        return result;
    }

    public Bus getBus(int pos)
    { if(pos==0||pos==1||pos==2)
        {
            if(pos==0) {return this.b0;}
            if(pos==1) { return this.b1;}
            if(pos==2) { return this.b2;}
        }
        return null;
    }

    public boolean addBus( Bus b)
    { if(b!=null && b!=b0 && b!=b1 && b!=b2)
        {
            if(b0==null){this.b0=b;return true;}
            else if(b1==null){this.b1=b;return true;}
            else if(b2==null){this.b2=b;return true;}
        }
        return false;
    }

    public boolean addBus( Bus b, int pos)
    { if(b!=null && b!=b0 && b!=b1 && b!=b2 && (pos==0||pos==1||pos==2))
        {
            if(b0==null && pos==0){this.b0=b;return true;}
            if(b1==null && pos==1){this.b1=b;return true;}
            if(b2==null && pos==2){this.b2=b;return true;}
        }
        return false;
    }

    public Bus removeBus()
    {
        Bus removed=null;
        if(b0!=null){removed=b0;b0=null;}
        else if(b1!=null){removed=b1;b1=null;}
        else if(b2!=null){removed=b2;b2=null;}
        return removed;
    }

    public Bus removeBus(int pos)
    {
        Bus removed=null;
        if(pos==0||pos==1||pos==2)
        {
            if(b0!=null && pos==0){removed=b0;b0=null;}
            if(b1!=null && pos==1){removed=b1;b1=null;}
            if(b2!=null && pos==2){removed=b2;b2=null;}
        }
        return removed;
    }
}

