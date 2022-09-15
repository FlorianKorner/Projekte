public class WineCask3
{
    public double content;
    public double capacity;
    public WineCask3(double content, double capacity)
    {
        if (checkConsistency(content, capacity))
        {
            this.capacity = capacity;
            this.content = content;
        }
        else
        {
            System.out.println("Error in constructor WineCask3");
            this.capacity = 200.0;
            this.content = 0.0;            
        }
    }
    public boolean checkConsistency(double content, double capacity)
    {
        if (content >= 0 && content <= capacity)
            return true;
        else
            return false;
        // shorter: return content >= 0 && content <= capacity;
    }
    public void setContent(double content)
    {
        if (checkConsistency(content, capacity))  // content is the parameter, capacity is the field
            this.content = content;
        else
        {
            System.out.println("error in setContent");
            content = 0.0;
        }
    }
    public void setCapacity(double capacity)
    {
        if (checkConsistency(content, capacity))  // content is the field, capacity is the parameter
            this.capacity = capacity;
        else
        {
            System.out.println("error in setCapacity");
            capacity = 200;
        }
    }
}
