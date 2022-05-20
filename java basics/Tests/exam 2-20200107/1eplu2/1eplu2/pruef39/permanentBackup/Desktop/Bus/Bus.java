public class Bus{

private int passengers;
private int seats;
private String registration;

public Bus(int passengers,int seats, String registration){
if(check(passengers,seats,registration)){
this.passengers= passengers;
this.seats=seats;
this.registration=registration;
}
}

public Bus(){


}

public boolean check(int passengers, int seats, String registration){
if(registration == null && registration.length()<7){
return false;

}
if(registration.substring(0).toUpperCase()!=true&&registration.substring(1).toUpperCase()!=true&&registration.substring(5).toUpperCase()!=true&& registration.substring(6).toUpperCase()!=true &&
 registration.substring(7).toUpperCase()!=true){
    return false;
    
    }

if(passengers<=0 && passengers> seats)
{return false;}
 if(seats< 0 ){
    return false;}
    else {return true;}
}

public void setPassengers(int passengers){
if(check(passengers, seats, registration)){
this.passengers=passengers;

}

else{System.out.println("Error");
passengers= 0;}
}


public int getPassengers(){
return passengers;


}

public void setSeats(int seats){
if(check(passengers, seats, registration)){
this.seats=seats;

}

else{System.out.println("Error");
seats= 50;}
}


public int getSeats(){
return seats;


}

public void setRegistration(String registration){
if(check(passengers, seats, registration)){
this.registration=registration;

}

else{System.out.println("Error");
registration= "Ab00 ABC";}
}


public String getRegistration(){
return registration;


}

public void print(){

System.out.println("Bus1"+ b0.getPassengers() + b0.getSeats());

System.out.println("Bus2"+ b1.getPassengers() + b1.getSeats());

System.out.println("Bus2"+ b2.getPassengers() + b2.getSeats());

}

}
