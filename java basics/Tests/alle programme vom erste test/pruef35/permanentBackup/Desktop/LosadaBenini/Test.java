public class Test
{
    public void test()
    {
        Ship a=new Ship();
        if (a.getMasts() == 2)
            System.out.println(" 1 test is correct");
        else 
            System.out.println(" 1 test is incorrect");
        a.setSpeed(15.0);
        if(a.getSpeed() == 15.0)
            System.out.println(" 2 test is correct");
        else
            System.out.println(" 2 test is incorrect");
        a.setName("Mary Celeste");
        if(a.getName() == "Mary Celeste")
        System.out.println(" 3 test is correct");
        else
        System.out.println(" 3 test is incorrect");
        a.setGuns(false);
        if(a.getGuns() == false)
        System.out.println(" 4 test is correct");
        else
        System.out.println(" 4 test is incorrect");
    }
}