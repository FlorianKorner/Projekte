/**
 * It is good for getting drunk late at night.
 * made by Florian Körner 1EHIF
 */
public class ComplexWineCask
{
    //capacity given in liters//
    private double capacity;
    //content given in liters//
    private double content;
    public ComplexWineCask()
    {
        setCapacity(200.0);
        setContent(0.0);
    }

    public ComplexWineCask(double newContent, double newCapacity)
    {
        if (checkConsistency(content, capacity))
        {
            this.capacity = capacity;
            this.content = content;
        }
        else
        {
            System.out.println("Error in constructor ComplexWineCask");
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

    public double getCapacity()
    {
        return capacity;
    }

    public double getContent()
    {
        return content;
    }

    public void draw()
    {
        double a;
        a = content - 1.0;
        if (content>=1.0)
        {  
            System.out.println(a);
        }else{
            System.out.println("Error 505 there is not "
                +"enought Wine in the WineCask"); 
        }
    }

    public void fill()
    {
        System.out.println((getCapacity()-getContent())+
            "was needed to fill up the Cask");
        setContent(getCapacity());        
    }

    public void print()
    {
        System.out.println("the capacity is "+getCapacity());
        System.out.println("the content is "+getContent());
    }

}