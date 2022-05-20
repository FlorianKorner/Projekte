public class Bus
{
    private int passengers;
    private int seats;
    private String registration;
    public Bus(int passengers, int seats, String registration){
        setPassengers(passengers);
        setSeats(seats);
        setRegistration(registration);
    }

    public Bus(){
        //this.Bus(0, 50, "AB00 ABC");
    }

    
    public boolean checkConsicency(){
    if(registration.contains(" ")==true
    &&registration.substring(0,1).substring(5,7).indexOf("WAESRDTFZGUHIJOKPLMNBVCXYÜÖÄ")
    &&registration.substring(2,3).indexOf(0,123456789)){
    return true;
    }
    }
     
    public void setPassengers(int passengers){
        if(passengers <= seats||passengers>=0){
            this.passengers=passengers;
        }else{
            this.passengers=0;
        }
    }

    public int getPassengers(){
        return passengers;
    }

    public void setSeats(int seats){
        if(seats >0){
            this.seats=50;
        }else{
            this.seats=seats;
        }
    }
    public int getSeats(){
        return seats;
    }
    public void setRegistration(String registration){
        if (registration.length()<=8&&registration.length()>0){
            this.registration=registration.toUpperCase();
        }else{
            this.registration="AB00 ABC";
        }
    }

    public String getRegistration(){
        return registration;
    }

    public int enter(int number){
        int sl;
        sl=seats-passengers;
        // sl=> seats left
        int e;
        e=number-sl;
        //e => number of passengers who got on the bus
        if(e>=0){
            if(number+passengers>=seats){
                System.out.println(e);
            }else{
                System.out.println(number);
            }
        }else{
            System.out.println("Error501");
        }
        return e;
    }

    public int exit(int number1){
        int sl;
        sl=seats-passengers;
        // sl=> seats left

        if(number1<=passengers){
            System.out.println(number1-passengers);
        }else{
            System.out.println(number1);
        }
        return sl;
    }
    public void print()
    {
        System.out.println("------------------------------------------------------------");
        System.out.println("there are "+getPassengers()+" passengers");
        System.out.println("there are "+getSeats()+" seats");
        System.out.println("the registration is "+getRegistration());
        System.out.println("------------------------------------------------------------");
    }
}