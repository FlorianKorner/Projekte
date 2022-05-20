public class Ship
{
    public String name;
    public double speed;
    public int numberOfMasts;
    public boolean hasGuns;

    public Ship() {
        name = "Mary Celeste";
        speed = 0.0;
        numberOfMasts = 2;
        hasGuns = false; 
    }

    public void setname(String newName) {
        name = newName;
    }

    public void setspeed(double newSpeed) {
        speed = newSpeed;
    }

    public void setnumberOfMasts(int newnumberOfMasts) {
        numberOfMasts = newnumberOfMasts;
    }

    public void sethasGuns(boolean newhasGuns) {
        hasGuns = newhasGuns;
    }

    public String getname()  {
        return name; 
    }

    public double getspeed()  {
        return speed; 
    }

    public int getnumberOfMasts()  {
        return numberOfMasts; 
    }

    public boolean gethasGuns()  {
        return hasGuns; 
    }

    public Ship(String newName, int newNumberOfMasts) {
        name = "Mary Celeste";
        numberOfMasts = 2;
    }

    public void speedup(double newspeed) {

        speed = 1.0;

    }

    public void slowdown(double newspeed) {

        speed = -1.0;

    }

    public void print() {
        System.out.println("The name of this Ship is " + name);
        System.out.println("It's speed is " + speed);
        System.out.println("It has " + numberOfMasts + " Masts ");
        System.out.println("It " + hasGuns + " have guns ");
    }
}