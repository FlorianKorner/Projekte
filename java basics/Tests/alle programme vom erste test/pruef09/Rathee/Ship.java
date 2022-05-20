public class Ship {

    private String name;
    private double speed;
    private int numberOfMasts;
    private boolean hasGuns;
    private String yesNo;

    public Ship (){
        setName("Mary Celeste");
        setSpeed(0.0);
        setNumberOfMasts(2);
        setHasGuns(false);

    }

    public Ship (String newName, int newNumberOfMasts){
        setName(newName);
        setSpeed(0.0);
        setNumberOfMasts(newNumberOfMasts);
        setHasGuns(false);

    }


    public Ship (String newName,double newSpeed, int newNumberOfMasts,
    boolean newHasGuns){

        setName(newName);
        setSpeed(newSpeed);
        setNumberOfMasts(newNumberOfMasts);
        setHasGuns(newHasGuns);

    }

    public void setName(String newName){
        if(newName != null && newName.length()>0)

        {name = newName;}
        else {System.out.println("Wrong input in setName: " + newName);
            name = "Mary Celeste";

        }
    }

    public String getName(){
        return name ;
    }

    public void setSpeed(double newSpeed){
        if(newSpeed>= 0.0)
        {speed= newSpeed;}
        else{System.out.println("Wrong input in setSpeed: " + newSpeed);
            speed=0.0;

        }
    }

    public double getSpeed(){

        return speed;}

    public void setNumberOfMasts(int newNumberOfMasts){
        if(newNumberOfMasts>0 && newNumberOfMasts <= 4)
        {numberOfMasts=newNumberOfMasts;}
        else{System.out.println("Wrong input in setNumberOfMasts: " + newNumberOfMasts);
            numberOfMasts=2;

        }
    }

    public int getNumberOfMasts(){

        return numberOfMasts;}

    public void setHasGuns(boolean newHasGuns)
    {if (newHasGuns== true){
               hasGuns = newHasGuns;
            yesNo = "Yes";
        }
        else{
            hasGuns= false;
           yesNo = "No";
            

        }}


    public boolean getHasGuns(){
        return hasGuns;
    }

    public void speedup(){
        speed =getSpeed() + 1;

    }

    public void slowdown(){
        if(speed>0.0)
        {speed = getSpeed() -1;}
        
        else if
            (getSpeed()-1<0.0){
            speed = 0.0;
            
            }
            

        }
        
   
        
        
    public void print(){
 System.out.println("***********************");
        System.out.println("Name of Ship: " + getName());
        System.out.println("Speed of Ship: "+ getSpeed() + " knots");
        System.out.println("Number of masts: " + getNumberOfMasts());
        System.out.println ("Guns: " +yesNo);
    }
}









