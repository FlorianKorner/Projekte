  public void Statistics(String newName, double newSpeed, int newNumberofMasts, boolean newHasGuns)
    {
         setName(newName);
         setSpeed(newSpeed);
         setNumberofMasts(newNumberofMasts);
         sethasGuns(newHasGuns);
    }
     public void speedUp()
    {   
         speed = speed + 1;
    }
    public void slowDown()
    {   
        if(speed > 0)
        speed = speed - 1;
        else
        System.out.println("Cant go below 0");
    }
    public void getName()
    {
         return name;
    }
    public void getSpeed()
    {
         return speed;
    }
    public void getNumberofMasts()
    {
         return numberofMasts;
    }
    public void getHasGuns()
    {
         return hasGuns;
    }