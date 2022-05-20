public class Car
{
    private String color;
    private int speed;
    private boolean hasLeftHandDrive;

    public Car(String newColor, int newSpeed, boolean newHasLeftHandDrive)
    {
        setColor(newColor);
        setSpeed(newSpeed);
        setHasLeftHandDrive(newHasLeftHandDrive);
    }

    public Car()
    {
    }

    public void setColor(String newColor)
    {
        color= newColor;
        if (getColor() == color)
        {
            System.out.println("correct 1");
        }
        else
        {
            System.out.println("error 1");
            setColor(null);
        }
    }

    public String getColor()
    {
        return color;
    }

    public void setSpeed(int newSpeed)
    {
        speed= newSpeed;
        if (getSpeed() == speed)
        {
            System.out.println("correct 2");
        }
        else
        {
            System.out.println("error 2");
            setSpeed(0);
        }
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setHasLeftHandDrive(boolean newHasLeftHandDrive)
    {
        hasLeftHandDrive= newHasLeftHandDrive;

    }

    public boolean getHasLeftHandDrive()
    {
        return hasLeftHandDrive;
    }

    public void print()
    {
        System.out.println("Color:" + getColor());
        System.out.println("Speed:" + getSpeed());
        System.out.println("hasLeftHandDrive:" + getHasLeftHandDrive());
        if (getHasLeftHandDrive() == hasLeftHandDrive)
        {
            System.out.println("correct 3");
        }
        else
        {
            System.out.println("error 3");
            setHasLeftHandDrive(true);
        }
    }

}