public class CarTest extends Car
{
    public void test()
    {
        Car c = new Car("red", 50, true);
        c. print();
        c. setSpeed(500);
        c. print();
        c. setColor("green");
        c. setHasLeftHandDrive(false);
        c. print();
    }
}