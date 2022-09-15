public class PersonTestIf
{
    public void testPerson()
    {
        Person p1 = new Person();
        if(p1. getName()==null)
        {
            System.out.println("correct 1");
        }
        else
        {
            System.out.println("error 1"); 
        }
        p1.setAge(10);
        if(p1. getAge() !=10)
        {
            System.out.println("correct 2");
        }
        else
        {
            System.out.println("error 2 please correct the Age"); 
        }
        p1.setIsStudent(true);
        if(p1. getIsStudent() ==true)
        {
            System.out.println("correct 3");
        }
        else
        {
            System.out.println("error 3");
        }
        p1. setName("Jann");
        if(p1. getName() != "Jann")
        {
            System.out.println("error 4");
        }
        else
        {
            System.out.println("correct 4");
        }
        p1.print();

    }
}