public class WineCask1
{
    public double content;
    public double capacity;
    public WineCask1(double content, double capacity)
    {
        setContent(content);
        setCapacity(capacity);
    }
    public void setContent(double content)
    {
        if (content <= capacity && content >= 0.0)
            this.content = content;
        else
        {
            System.out.println("error in setContent");
            content = 0.0;
        }
    }
    public void setCapacity(double capacity)
    {
        if (capacity >= 0.0)
            this.capacity = capacity;
        else
        {
            System.out.println("error in setCapacity");
            capacity = 200;
        }
    }
}
