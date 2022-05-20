public class BusStop
{
    private Bus b0 = new Bus();
    private Bus b1 = new Bus();
    private Bus b2 = new Bus();
    //default constructor
    public BusStop() {
        b0 = new Bus(0,20,"MA73 EHI");
        b1 = null;
        b2 = new Bus(12,40,"YD34 HIF");
    }

    public Bus maxSeats() {
        if(b0 == null && b1 == null && b2 == null) {
            return null;
        }
        if(b0 == null && b1 == null) {
            return b2;
        }
        if(b2 == null && b1 == null) {
            return b0;
        }
        if(b2 == null && b0 == null) {
            return b1;
        }
        if(b0 == null) {
            if(b1.getSeats() >= b2.getSeats()) {
                return b1;
            }
            if(b2.getSeats() >= b1.getSeats()) {
                return b2;
            }
        }
        if(b1 == null) {
            if(b0.getSeats() >= b2.getSeats()) {
                return b0;
            }
            if(b2.getSeats() >= b0.getSeats()) {
                return b2;
            }
        }
        if(b2 == null) {
            if(b1.getSeats() >= b0.getSeats()) {
                return b1;
            }
            if(b0.getSeats() >= b1.getSeats()) {
                return b0;
            }
        }
        if(b0.getSeats() >= b1.getSeats() && b0.getSeats() >= b2.getSeats()) {
            return b0;
        }
        if(b1.getSeats() >= b0.getSeats() && b1.getSeats() >= b2.getSeats()) {
            return b1;
        }
        if(b2.getSeats() >= b1.getSeats() && b2.getSeats() >= b0.getSeats()) {
            return b2;
        }
        return null;
    }

    public int registrationStartsWith(String s) {
        if(b0 == null && b1 == null) {
            if(b2.getRegistration().startsWith(s)) {
                return 1;
            }
        }
        if(b1 == null && b2 == null) {
            if(b0.getRegistration().startsWith(s)) {
                return 1;
            }
        }
        if(b0 == null && b2 == null) {
            if(b1.getRegistration().startsWith(s)) {
                return 1;
            }
        }
        if(b0 == null) {
            if(b1.getRegistration().startsWith(s) && b2.getRegistration().startsWith(s)) {
                return 2;
            }
            if(b1.getRegistration().startsWith(s) || b2.getRegistration().startsWith(s)) {
                return 1;
            }
        }
        if(b1 == null) {
            if(b0.getRegistration().startsWith(s) && b2.getRegistration().startsWith(s)) {
                return 2;
            }
            if(b0.getRegistration().startsWith(s) || b2.getRegistration().startsWith(s)) {
                return 1;
            }
        }
        if(b2 == null) {
            if(b0.getRegistration().startsWith(s) && b1.getRegistration().startsWith(s)) {
                return 2;
            }
            if(b0.getRegistration().startsWith(s) || b1.getRegistration().startsWith(s)) {
                return 1;
            }
        }
        if(b0.getRegistration().startsWith(s) && b1.getRegistration().startsWith(s) &&
        b2.getRegistration().startsWith(s)) {
            return 3;
        }
        if(b0.getRegistration().startsWith(s) && b1.getRegistration().startsWith(s) ||
        b1.getRegistration().startsWith(s) &&  b2.getRegistration().startsWith(s) ||
        b0.getRegistration().startsWith(s) && b2.getRegistration().startsWith(s)) {
            return 2;
        }
        if(b0.getRegistration().startsWith(s) || b1.getRegistration().startsWith(s) ||
        b2.getRegistration().startsWith(s)) {
            return 1;
        }
        return 0;
    }

    public int enter(int passengers) {
        int entered = passengers;
        if(b0 != null && b0.enter(passengers) <= passengers) {
            b0.setPassengers(b0.getPassengers() - passengers);
            passengers -= b0.enter(passengers);
        }
        if(b1 != null && b1.enter(passengers) <= passengers) {
            b1.setPassengers(b1.getPassengers() - passengers);
            passengers -= b1.enter(passengers);
        }
        if(b2 != null && b2.enter(passengers) <= passengers) {
            b2.setPassengers(b2.getPassengers() - passengers);
            passengers -= b2.enter(passengers);
        }
        entered -= passengers;
        System.out.println(passengers);
        return entered;
    }

    public Bus getBus(int position) {
        if(position != 0 && position != 1 && position != 2) {
            return null;
        }
        if(position == 0) {
            return b0;
        }
        if(position == 1) {
            return b1;
        }
        if(position == 2) {
            return b2;
        }
        return null;
    }

    public boolean addBus(Bus b, int position) {
        if(position == 0 && !b.equals(b1) && !b.equals(b2) && b0 == null) {
            b0 = b;
            return true;
        }
        if(position == 1 && !b.equals(b0) && !b.equals(b2)&& b1 == null) {
            b1 = b;
            return true;
        }
        if(position == 2 && !b.equals(b0) && !b.equals(b1)&& b2 == null) {
            b2 = b;
            return true;
        }
        System.out.println("adding not possible");
        return false;
    }

    public Bus removeBus() {
        Bus removed = null;
        if(b0 != null) {
            removed = b0;
            b0 = null;
            return removed;
        }
        if(b1 != null) {
            removed = b1;
            b1 = null;
            return removed;
        }
        if(b2 != null) {
            removed = b2;
            b2 = null;
            return removed;
        }
        return removed;
    }

    public Bus removeBus(int position) {
        Bus removed = null;
        if(position == 0) {
            removed = b0;
            b0 = null;
            return removed; 
        }
        if(position == 1) {
            removed = b1;
            b1 = null;
            return removed; 
        }
        if(position == 2) {
            removed = b2;
            b2 = null;
            return removed; 
        }
        return removed; 
    }
}
