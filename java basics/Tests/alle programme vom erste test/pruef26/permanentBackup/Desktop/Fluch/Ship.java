import java.io.OutputStream;
import java.io.PrintStream;


/**
 * Beschreiben Sie hier die Klasse Ship.
 * 
 * @author Dominik Fluch
 */
public class Ship {
   
    private String name;
    private Double speed;
    private Integer numberOfMasts;
    private Boolean hasGuns;
    
    /**
     * Creates a ship with the following values:
     * - name      Mary Celeste
     * - speed     0
     * - num...    2
     * - hasGuns   false
     */
    public Ship(){
        this("Mary Celeste", 2);
        
    }
    
    /**
     * @param name
     * @param numberOfMasts
     * The missing information will be replaced with:
     * - speed       0
     * - hasGuns     false
     */
    public Ship(String name, Integer numberOfMasts){
        this(name, 0D, numberOfMasts, false);
    }
    
    /**
     * @param name
     * @param speed
     * @param numberOfMasts
     * @param hasGuns
     */
    public Ship(String name, Double speed, Integer numberOfMasts, Boolean hasGuns){
        this.setName(name);
        this.setSpeed(speed);
        this.setNumberOfMasts(numberOfMasts);
        this.setHavingGuns(hasGuns);
    }
    
    /**
     * Increases the speed of the ship by 1.
     */
    public void speedup(){
        this.setSpeed(this.getSpeed()+1D);
    }
    
    /**
     * Prints the ships data into the systems outputStream.
     */
    public final void print(){
        this.print(System.out);
    }
    
     /**
     * Prints the ships data.
     * @param outputStream
     */
    public final void print(OutputStream outputStream){
        this.print(new PrintStream(outputStream));
    }
    
    /**
     * Prints the ships data.
     * @param printStream
     */
    public final void print(PrintStream printStream){
        printStream.println(this.toString());
    }
    
    @Override
    public String toString(){
        final String divider = "+----------------------------+";
        return divider+"\n"+this.getName()+":\n\nSpeed:\t\t"+this.getSpeed()+"\nMasts:\t\t"+this.getNumberOfMasts()+"\nHas Guns:\t"+ (this.hasGuns() ? "Yes" : "No") +"\n"+divider;
    }
    
    /**
     * Slows down the speed of the ship by 1.
     */
    public void slowdown(){
        if(this.getSpeed()-1>=0D)this.setSpeed(this.getSpeed()-1D);
        //Checked with an if again in order to avaid an exception.
    }
    
    /**
     * Decided to go without the "get" because it sounds better.
     * @return true if the ship has guns.
     */
    public Boolean /*get*/hasGuns(){
        return hasGuns;
    }
    
    /**
     * Decided to not go with "setHasGuns" because this way it sounds better.
     * Sets the ship to having guns or not.
     */
    public void setHavingGuns(Boolean havingGuns){
        this.hasGuns = havingGuns;
    }
    
    /**
     * Sets the number of masts of the ship.
     * @param numberOfMasts
     */
    public void setNumberOfMasts(Integer numberOfMasts){
        //Decided to check if speed is not null since I used the Double object.
        //Also decided to not use "assert" since an exception is much cleaner.
        if(numberOfMasts!=null&&numberOfMasts>0&&numberOfMasts<=4){
            this.numberOfMasts = numberOfMasts;
        }else throw new IllegalArgumentException("Number of masts must not be null nor smaller than 0 nor bigger than 4.");
    }
    
    /**
     * @return the number of masts.
     */
    public Integer getNumberOfMasts(){
        return numberOfMasts;
    }
    
    /**
     * Sets the speed of the ship.
     * @param speed
     */
    public void setSpeed(Double speed){
        //Decided to check if speed is not null since I used the Double object.
        //Also decided to not use "assert" since an exception is much cleaner.
        if(speed!=null&&speed>=0D){
            this.speed = speed;
        }else throw new IllegalArgumentException("Speed must not be null or smaller than 0.");
    }
    
    /**
     * @return the speed of the ship in knots.
     */
    public Double getSpeed(){
        return speed;
    }
    
    /**
     * @return the name of the ship.
     */
    public String getName(){
        return name;
    }
    
    /**
     * Sets the name of the ship.
     * @param name
     */
    public void setName(String name){
        if(name!=null&&!name.isEmpty()){
            this.name = name;
        }else throw new IllegalArgumentException("Name must not be null or empty.");
        
    }
}
