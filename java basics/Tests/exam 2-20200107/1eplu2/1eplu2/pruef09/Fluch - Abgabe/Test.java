import lang.stride.*;

/**
 * Tests all my classes.
 * @author Dominik Fluch @version 1.0
 */
public class Test
{

    /**
     * Added this to so the class can be used as main/program @param args
     */
    static public void main(String[] args)
    {
        Test.test();
    }

    /**
     * Tests the class.
     */
    static public void test()
    {
        final BusStop stop =  new  BusStop();
        final Integer maxSeats = stop.maxSeats().getSeats();
        Boolean status = true;
        status = (maxSeats == 40 && stop.registrationStartsWith("YD") == 1 && stop.enter(30) == 30 && stop.getBus(2).getPassengers() == 22 && stop.removeBus().getPassengers() == 20);
        System.out.println("Tests status: " + status + " (#1)");
        status = true;
        final Bus c =  new  Bus(15, 35, "LD23 JKL");
        final Bus d =  new  Bus(18, 55, "OD76 ERT");
        if ( ! stop.addBus(c, 0)) {
            System.out.println("Mid error 0");
        }
        if (stop.addBus(c, 0)) {
            System.out.println("Mid error 1");
        }
        status = (stop.addBus(d) && stop.removeBus() == c && stop.removeBus(1) == d);
        System.out.println("Tests status: " + status + " (#2)");
    }
}
