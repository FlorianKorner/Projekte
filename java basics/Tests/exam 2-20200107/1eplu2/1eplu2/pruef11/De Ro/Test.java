
public class Test
{
    public void test() {
        ABusStop aBusStop1 = new ABusStop();
        
        aBusStop1.registrationStartsWith("YD");
        if(aBusStop1.registrationStartsWith("YD") == 1) {
            System.out.println("registrationStartsWith works!");
        }
        else {
            System.out.println("registrationStartsWith doesnt work!");
        }
        
        aBusStop1.enter(30);
        if(aBusStop1.enter(30) == 30) {
            System.out.println("enter works!");
        }
        else {
            System.out.println("enter doesnt work!");
        }
        
        aBusStop1.getABus(2);
        if(aBusStop1.getPassengers() == 22) {
            System.out.println("getABus works!");
        }
        else {
            System.out.println("getABus doesnt work!");
        }
        
        aBusStop1.removeBus();
        if(aBusStop1.getPassengers() == 20) {
            System.out.println("removeBus works!");
        }
        else {
            System.out.println("removeBus doesnt work!");
        }
        
        ABus c = new ABus(15, 35, "LD23 JKL");
        ABus d = new ABus(18, 55, "OD76 ERT");
        
        aBusStop1.addBus(c, 0);
        
        aBusStop1.addBus(c, 0);
        
        aBusStop1.addBus(d);
        
        aBusStop1.removeBus();
        if(c == null) {
            System.out.println("removeBus works work!");
        }
        else {
            System.out.println("removeBus doesnt work!");
        }
        
        aBusStop1.removeBus(1);
        if(c == null) {
            System.out.println("removeBus with position works!");
        }
        else {
            System.out.println("removeBus  with position  doesnt work!");
        }
    }
}
