public class Plane
{
    private String color;
    private int speed;
    private boolean hasPassengerseats;

    public Plane(String newColor, int newSpeed, boolean newHasPassengerseats)
    {
        setColor(newColor);
        setSpeed(newSpeed);
        setHasPassengerseats(true);
    }

    public Plane()
    {

    }

    public void setColor(String newColor)
    {
        color= newColor;
        if(getColor()== newColor)
        {
            System.out.println("correct 1");
        }
        else
        {
            System.out.println("error 1 please try again -> color is :"+getColor());
        }
    }

    public String getColor()
    {
        return color;
    }

    public void setSpeed(int newSpeed)
    {
        speed= newSpeed;
        if(getSpeed() == speed)
        {
            System.out.println("correct 2");
        }
        else
        {
            System.out.println("error2");
        }
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setHasPassengerseats(boolean newHasPassengerseats)
    {
        hasPassengerseats = newHasPassengerseats;
        if(getHasPassengerseats() == hasPassengerseats)
        {
            System.out.println("correct 3");
        }
        else
        {
            System.out.println("error 3 please try again-> hasPassengerseats is : "+getHasPassengerseats());
        }
    }

    public boolean getHasPassengerseats()
    {
        return hasPassengerseats;
    }

    public void print()
    {
        System.out.println("Color:" + getColor());
        System.out.println("Speed:" + getSpeed());
        System.out.println("hasPassengerseats:" + getHasPassengerseats());
    }

}