public class Bus 
{
    private int passanger;
    private int seats;
    private String registrartion;

    public Bus(int newPassanger, String newRegistrartion, int newSeats) {
        this.passanger = newPassanger;
        this.registrartion = newRegistrartion;
        this.seats = newSeats;
    }

    public Bus()
    {
        this.passanger = 0;
        this.registrartion = "AB00 ABC";
        this.seats = 50;
    }

    public void setPassanger(int newPassanger)
    {
        if(newPassanger>= 0)
        {
            this.passanger = passanger;
        }
        else
        {
            System.out.println("there cant be 0 negative passangers");
        }
    }

    public void setRegistrartion(String newRegistrartion)
    {
        this.registrartion = registrartion;
    }

    public void setSeats(int newSeats)
    {
        if(newSeats>= 0)
        {
            this.seats = seats;
        }
        else
        {
            System.out.println("there cant be 0 seats");
        }
    }

    public int getSeats()
    {
        return seats;
    }

    public int getPassanger()
    {
        return passanger;
    }

    public String getRegistrartion()
    {
        return registrartion;
    }

    public boolean checkConsistency(String newRegistrartion) {
        if(newRegistrartion == null && newRegistrartion.charAt(0) == lowerCase() && newRegistrartion.charAt(0) == lowerCase(1) &&
        newRegistrartion.charAt(5).contains(lowerCase()) && newRegistrartion.charAt(6) == lowerCase() && newRegistrartion.charAt(7) == lowerCase()
        && newRegistrartion.charAt(4).contains(" ")&& newRegistrartion.substring(2,3) !="an int")
        {
            System.out.println("not valid rgistration");           
        }
        else{
            return true;
        }
    }

    public int enter(int newEnter)
    {
        if(newEnter+this.passanger > this.seats && newEnter <0)
        {
            System.out.println("there are not enough chairs for the amount of people or the value cant be minus");
        }
        else
        {
            this.passanger = newEnter + this.passanger;
        }
    }

    public int exit(int newExit)
    {
        if(newExit > this.passanger)
        {
            System.out.println("more people walking out then there are inside the bus");            
        }
        else 
        {
            this.passanger = this.passanger - newExit;
        }
    }

    public void print() 
    {
        System.out.println("the amount of Seats is:"+ getSeats());
        System.out.println("the amount of Passangers is:"+ getPassanger());
        System.out.println("the registration is:"+ getRegistrartion());
    }
}