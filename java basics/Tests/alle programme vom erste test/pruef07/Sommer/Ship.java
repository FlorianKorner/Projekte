class Ship {
    public String name;
    public double speed;
    public int numberOfMasts;
    public boolean hasGuns;
    
    public Ship() {
        setName("Mary Celeste");
        setSpeed(0.0);
        setNumberOfMasts(2);
        setHasGuns(false);
    }
    
    public Ship(String newName, double newSpeed, int newNumberOfMasts, boolean newHasGuns) {
        setName(newName);
        setSpeed(newSpeed);
        setNumberOfMasts(newNumberOfMasts);
        setHasGuns(newHasGuns);
    }
    
    public Ship(String newName, int newNumberOfMasts) {
        setName(newName);
        setSpeed(0.0);
        setNumberOfMasts(newNumberOfMasts);
        setHasGuns(false);
    }
    
    public void setName(String newName) {
        if (newName != null && newName.length() > 0) {
            name = newName;
        }
        else {
            System.err.println("Error at newName");
            name = "Mary Celeste";
        }
    }
    
    public void setSpeed(double newSpeed) {
        if (newSpeed >= 0.0) {
            speed = newSpeed;
        }
        else {
            System.err.println("Error at newSpeed");
            speed = 0.0;
        }
    }
    
    public void setNumberOfMasts(int newNumberOfMasts) {
        if (newNumberOfMasts > 0 && newNumberOfMasts <= 4) {
            numberOfMasts = newNumberOfMasts;
        }
        else {
            System.err.println("Error at newSpeed");
            numberOfMasts = 2;
        }
    }
    
    public void setHasGuns(boolean newHasGuns) {
        hasGuns = newHasGuns;
    }
    
    public String getName() {
        return name;
    }
    
    public double getSpeed() {
        return speed;
    }
    
    public int getNumberOfMasts() {
        return numberOfMasts;
    }
    
    public boolean getHasGuns() {
        return hasGuns;
    }
    
    public void speedup() {
        setSpeed(getSpeed() + 1); 
    }
    
    public void slowdown() {
        if (getSpeed() >= 1.0)
            setSpeed(getSpeed() - 1); 
        else if (getSpeed() < 1 && getSpeed() >= 0.0) {
            setSpeed(0.0);
        }
    }
    
    public void print() {
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("Values for ship " + getName());
        System.out.println("Speed: " + getSpeed() + " knots");
        System.out.println("Number of masts: " + getNumberOfMasts());
        if (getHasGuns() == true) {
            System.out.println("Has guns: yes");
        }
        else {
            System.out.println("Has guns: no");
        }
        System.out.println("++++++++++++++++++++++++++++++");
    }
}