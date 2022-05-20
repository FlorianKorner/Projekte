public class PersonTest
{
    public void test()
    {
        Person p = new Person("Mark", 1 , true);
        p. print();
        p. setName("Florian");
        p. print();
        p. setAge(18);
        p. print();
        p. setIsStudent(false);
}
}