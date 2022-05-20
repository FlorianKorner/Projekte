public class Person
{
    private String name;
    private int age ;
    private boolean isStudent;

    public Person(String newName, int newAge, boolean newIsStudent)
    {
        setName(newName);
        setAge(newAge);
        setIsStudent(newIsStudent);
    }
    
    public Person()
    {
        
    }
    
    public void setName(String newName)
    {
        name= newName;
        if(name != null)
        {
            System.out.println("correct 1");
        }
        else
        {
            System.out.println("error 1");
        }
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int newAge)
    {
        age= newAge;
        if(age >0.0)
        {
            System.out.println("correct 2");
        }
        else
        {
            System.out.println("error 2");
        }
    }

    public int getAge()
    {
        return age;
    }

    public void setIsStudent(boolean newIsStudent)
    {
        isStudent= newIsStudent;
    }

    public boolean getIsStudent()
    {
        return isStudent;
    }

    public void print()
    {
        System.out.println("Name:" + getName());
        System.out.println("Age:" + getAge());
        System.out.println("Student:" + getIsStudent());
        if(isStudent == true)
        {
            System.out.println("correct 4 ");
        }
        else
        {
            System.out.println("error 4 ");
        }
    }
}