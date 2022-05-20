
public class Ship
{
    private String name;
    private double speed;
    private int numberOfMasts;
    private boolean hasGuns;
    public Ship(){
        this.name = "Mary Chestal";
        this.speed = 0.0;
        this.numberOfMasts = 2;
        this.hasGuns = false;

    }
    public Ship(int numberOfMasts ,String name,double speed,boolean hasGuns){
        setName(name);
        setSpeed(speed);
        setNumberOfMasts(numberOfMasts);
        sethasGuns(hasGuns);
        
        
        
    }
    public Ship(String name ,int numberOfMast){
        setName(name);
        setNumberOfMasts( numberOfMast);
        this.hasGuns = false;
        this.speed = 0.0;
        
    }
    public void setName(String name ){
        if (name != null && name != ""){
            this.name = name; 

        }
        else{

            System.out.println("error"+name);
            this.name = "MarryChestal";

        }

    }
    public void setSpeed(double speed ){
        if (speed >= 0.0 ){
            this.speed = speed; 

        }
        else{

            System.out.println("error"+ speed);
            this.speed = 0.0;

        }

    }
    public void setNumberOfMasts(int masts ){
        if (masts > 0 && masts<=4 ){
            this.numberOfMasts = masts; 

        }
        else{

            System.out.println("error"+ masts);
            this.numberOfMasts = 2;

        }

    }
    public void sethasGuns(boolean hasGuns ){
        this.hasGuns = hasGuns;
    }  
    public String getName(){
        return this.name;

    } 
    public double getSpeed(){
        return this.speed;    
    } 
    public int getNumberOfMasts(){
        return this.numberOfMasts;

        
        
        
    } 
    public boolean getHasGuns(){
       return this.hasGuns;

        
        
        
    } 
    public void speedup(){
        setSpeed(this.speed +1);
        
        
    }
    public void speeddown(){
        setSpeed(this.speed-1);
        



    } 
    public void Print(){
        System.out.println("Speed:"+getSpeed());
        System.out.println("NumberOfMasts:"+getNumberOfMasts());
        System.out.println("hasGuns:"+getHasGuns());
        System.out.println("Name:"+getName());
        
        
        
        
    }
}     