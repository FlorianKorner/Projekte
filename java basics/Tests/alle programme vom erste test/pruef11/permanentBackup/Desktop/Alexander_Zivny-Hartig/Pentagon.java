public class Pentagon
{
    private double length;
    
    public void setLength(double newLength)
    {
        if (newLength > 0)
            length = newLength;
        else
        {
            System.out.println("Invalid Length: " + newLength);
            length = 1.0;
        }
    }
    public void getLength()
    {
        
    }
}