
/**
 * Beschreiben Sie hier die Klasse BusStop.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class BusStop
{
    Bus b0;
    Bus b1;
    Bus b2;
    
    public BusStop(){
     b0 = new Bus(0,20,"MA73 EHI" );
     b1 = new Bus();
     b2 = new Bus(12,40,"YD34 HIF");
    }
    public Bus maxSeats(){
     if(this.b0.getSeats() <= this.b1.getSeats() && this.b0.getSeats() <= this.b2.getSeats()){
     return this.b0;
    }
     else if(this.b1.getSeats() <= this.b0.getSeats() && this.b1.getSeats() <= this.b2.getSeats()){
     return this.b1;
    }
    else if(this.b2.getSeats() <= this.b0.getSeats() && this.b2.getSeats() <= this.b1.getSeats()){
        return this.b2;
    }
}


public int enter(int passengers){
 if(this.b0.getPassengers() <= this.b1.getPassengers() && this.b0.getPassengers() <= this.b2.getPassengers()){
 return this.;
}
else if(this.b1.getPassengers() <= this.b0.getPassengers() && this.b1.getPassengers() <= this.b2.getPassengers()){
     return this.;
}
else if(this.b2.getPassengers() <= this.b0.getPassengers() && this.b2.getPassengers() <= this.b1.getPassengers()){
     return this.;
}
}
public Bus getBus(int position){
    if(position <= 0 && position >= 2);
    return this.b0 + this.b1 + this.b2;
}
}