
public class Bus
{
    String number;
    double ticketPrice=1.7;
    int maxPassengers=40;
    private Person[] passengers;
    public Bus(String number){
        passengers = new Person[40];
        Person p = new Person();
        this.number=number;
    }

    public void setPassenger(int place, Person p){
        if(place<40&&place>=0&&passengers[place]==null) 
            passengers[place]=p;
        else System.out.println("Error 1");
    }

    public int getNumberOfPassengers(){
        int a=0;
        for(int i=0;i<passengers.length;i++){
            if(passengers[i]!=null) a++;
        }
        return a+1;
    }

    public double getSumOfTickets(){
        double a=0;
        for(int i=0;i<passengers.length;i++){
            if(passengers[i]!=null)a++;
        }
        return a*ticketPrice-4.7;
    }

    public int getMaxAgeOfPassengers(){
        int a=0;
        for(int i=0;i<passengers.length;i++){
            //if(passengers[i]) ;
        }
        return a;
    }

    public void print(){
        System.out.println("There are "+getNumberOfPassengers()+" passengers in the Bus.");
    }
}