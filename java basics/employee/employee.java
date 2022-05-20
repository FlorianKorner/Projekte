public class employee
{
    private String name;
    private double salary;
    private int ybirth;
    private int age;
    private double Percentage;

    public employee()
    {
        setName("unknown");
        setSalary(0.0);
        setYbirth(1970);
    }

    public employee(String newName, double newSalary, int newYbirth, int newAge, double newPercentage)
    {
        setName(newName);
        setSalary(newSalary);
        setYbirth(newYbirth);
        setPercentage(newPercentage);
    }

    public void print()
    {
        System.out.println("The name is " + getName());
        System.out.println("Your salary is " + getSalary());
        System.out.println("The birt year " + getYbirth());
        System.out.println("He is " + getAge() + " years old");
    }

    public void setName(String newName)
    {
        if (newName != null && newName.length() >0)
        {
            name = newName;

        }
        else
        {

            System.out.println("Error 505");
            name = "Mustermann";
        }
    }

    public void setSalary(double newSalary)
    {
        if (newSalary >0.0)
        {
            salary = newSalary;
        }
        else
        {
            System.out.println("Error 504");
            salary = 1.5;
        }
    }
    public void setAge(int newAge)
    {
        if (newAge >0.0)
        {
            age = newAge;
        }
        else
        {
            System.out.println("Error 504");
            age = 20;
        }
    }
    public void setYbirth(int newYbirth)
    {
        if(newYbirth > 0)
        {
            ybirth = newYbirth;
        }
        else
        {
            System.out.println("Error 503");
            ybirth = 2000;
        }

    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getYbirth()
    {
        return ybirth;
    }

    public int getAge()
    {
        return 2019 - ybirth;
    }

    public void setPercentage(double newPercentage)
    {
        if(newPercentage >0)
        {
            Percentage = newPercentage;
        }
        else
        {
            System.out.println("Error 502 " + newPercentage + " is not valid");
            Percentage = 100;
        }
    }

    public double getPercentage()
    {
        return salary / 100 * (Percentage + 100);
    }
}