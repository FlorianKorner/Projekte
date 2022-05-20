public class Bus
{
    private int passengers;
    private int seats;
    private String registration;

    public Bus( int newPassengers, int newSeats, String newRegistration)
    { if(checkConsistency(passengers, seats, registration))
         {this.passengers=newPassengers;
            this.seats=newSeats;
            this.registration=newRegistration;
        }
    }

    public Bus()
    {
        this.passengers=0;
            this.seats=50;
            this.registration="AB00 ABC";
        }

        
    

    public boolean checkConsistency( int newPassengers, int newSeats, String newRegistration)
    {   String numbers= "0123456789";
        String alpabeth="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if( newPassengers >=0 && newPassengers<=newSeats && newSeats>=0 && newRegistration!= null && newRegistration.length()==8
        && (newRegistration.substring(0).indexOf(alpabeth)==0)
        && (newRegistration.substring(1).indexOf(alpabeth,0)==1)
        && (newRegistration.substring(2).indexOf(numbers)==2) 
        && (newRegistration.substring(3).indexOf(numbers)==3)
        && newRegistration.substring(4).indexOf(" ")==4
        && (newRegistration.substring(5).indexOf(alpabeth,4)==5)
        && (newRegistration.substring(6).indexOf(alpabeth,5)==6)
        && (newRegistration.substring(7).indexOf(alpabeth,6)==7)
        )
        {
            return true;
        }
        else
        {System.out.println("Error in checkConsistency()");
            return false;
        }
    }

    public void setPassengers(int newPassengers)
    { if(checkConsistency(passengers, seats, registration))
         this.passengers=newPassengers;}

    public void setSeats(int newSeats)
    {if(checkConsistency(passengers, seats, registration))
         this.seats=newSeats;}

    public void setRegistration(String newRegistration)
    {if(checkConsistency(passengers, seats, registration))
         this.registration=newRegistration;}

    public int getPassengers()
    {return this.passengers;}

    public int getSeats()
    {return this.seats;}

    public String getRegistration()
    {return this.registration;}

    public int enter(int number)
    {int avaiableSeats=(getSeats()-getPassengers());
        if(number>0 && number<= avaiableSeats)
        {this.passengers+=number;
            return number;
        }
        if(number>0 && number>= avaiableSeats)
        {
            this.passengers+= (number-(number-avaiableSeats));
            return (number-(number-avaiableSeats));
        }
        else
        {
            System.out.println("Error in enter");
            return 0;
        }
    }

    public int exit( int number)
    {
        if(number>0&&number<=getPassengers())
        {
            this.passengers-= number;
            return number;
        }
        else
        {
            System.out.println("Error in exit");
            return 0;
        }
    }

    public void print()
    {
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println(" The Bus contains" + getSeats() + "seats");
        System.out.println("It has" + getPassengers() + "passengers in it");
        System.out.println(" And its vehicle registration number equals:" + getRegistration());
        System.out.println("++++++++++++++++++++++++++++++++++++");
    }

}

