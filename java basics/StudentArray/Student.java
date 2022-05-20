
/**
 * class Student: a simple class
 *
 * @author Andreas Schenk
 * @version 2020-06-08
 */
public class Student
{
    private String name;
    private int mark;
    public Student(String name, int mark)
    {
        setName(name);
        setMark(mark);
    }
    private Student()
    {
    }
    public void setName(String name)
    {
        if (name != null && name.length() > 0)
            this.name = name;
        else
        {
            this.name = "John Doe";
            System.out.println("Error: Student 001");
        }    
    }
    public String getName()
    {
        return name;
    }
    public void setMark(int mark)
    {
        if (mark >= 1 && mark <= 5)
            this.mark = mark;
        else
        {
            this.mark = 3;
            System.out.println("Error: Student 002");
        } 
    }
    public int getMark()
    {
        return mark;
    }
    public void print()
    {
        System.out.println("Name: " + getName() + "Mark: " + getMark());
    }
}
