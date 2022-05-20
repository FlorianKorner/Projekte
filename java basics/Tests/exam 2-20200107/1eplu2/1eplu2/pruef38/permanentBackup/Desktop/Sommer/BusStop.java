public class BusStop {
    private Bus b0;
    private Bus b1;
    private Bus b2;
    
    public BusStop() {
        b0 = new Bus(20, 0, "MA73 EHI");
        //b1 = null;
        b2 = new Bus(40, 12, "YD34 HIF");
    }
    
    public Bus maxSeats() {
        int seatsB0 = 0;
        int seatsB1 = 0;
        int seatsB2 = 0;
        if (b0 != null)
            seatsB0 = b0.getSeats();
        if (b1 != null)
            seatsB1 = b1.getSeats();
        if (b2 != null)
            seatsB2 = b2.getSeats();
            
        if (seatsB0 >= seatsB1 && seatsB0 >= seatsB2)
            return b0;
        if (seatsB1 >= seatsB0 && seatsB1 >= seatsB2)
            return b1;
        return b2;
    }
    
    public int registrationStartsWith (String s) {
        int numberOfBus = 0;
        if (b0 != null && b0.getRegistration().startsWith(s))
            numberOfBus++;
        if (b1 != null && b1.getRegistration().startsWith(s))
            numberOfBus++;
        if (b2 != null && b2.getRegistration().startsWith(s))
            numberOfBus++;
        return numberOfBus;
    }
    
    public int enter(int passengers) {
        int entered = 0;
        if (b0 != null)
            entered = b0.enter(passengers);
        if (b1 != null)
            entered += b1.enter(passengers - entered);
        if (b2 != null)
            entered += b2.enter(passengers - entered);
        return entered;
    }
    
    public Bus getBus(int position) {
        if (position == 0)
            return b0;
        if (position == 1)
            return b1;
        if (position == 2)
            return b2;
        return null;
    }
    
    public boolean addBus(Bus b) {
        if (b == null) {
            System.out.println("Invalid parameter at addBus");
            return false;
        }
        if (b.equals(b0) || b.equals(b1) || b.equals(b2)) {
            System.out.println("Bus has already been added");
            return false;
        }
        if (b0 == null) {
            b0 = b;
            return true;
        }
        if (b1 == null) {
            b1 = b;
            return true;
        }
        if (b2 == null) {
            b2 = b;
            return true;
        }
        return false;
    }
    
    public boolean addBus(Bus b, int position) {
        if (b == null) {
            System.out.println("Invalid parameter at addBus");
            return false;
        }
        if (b.equals(b0) || b.equals(b1) || b.equals(b2)) {
            System.out.println("Bus has already been added");
            return false;
        }
        if (position == 0 && b0 == null) {
            b0 = b;
            return true;
        }
        if (position == 1 && b1 == null) {
            b1 = b;
            return true;
        }
        if (position == 2 && b2 == null) {
            b2 = b;
            return true;
        }
        return false;
    }
    
    public Bus removeBus() {
        Bus localBus;
        if (b0 != null) {
            localBus = b0;
            b0 = null;
            return localBus;
        }
        if (b1 != null) {
            localBus = b1;
            b1 = null;
            return localBus;
        }
        if (b2 != null) {
            localBus = b2;
            b2 = null;
            return localBus;
        }
        return null;
    }
    
    public Bus removeBus(int position) {
        Bus localBus = null;
        if (position == 0 && b0 != null) {
            localBus = b0;
            b0 = null;
        }
        if (position == 1 && b1 != null) {
            localBus = b1;
            b1 = null;
        }
        if (position == 2 && b2 != null) {
            localBus = b2;
            b2 = null;
        }
        return localBus;
    }
    
    public void print() {
        if (b0 != null) {
            System.out.println("+++++++++++++++ First Bus: +++++++++++++++");
            b0.print();
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        }
        else
            System.out.println("There is no first bus!");
        if (b1 != null) {
            System.out.println("+++++++++++++++ Second Bus: +++++++++++++++");
            b1.print();
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        }
        else
            System.out.println("There is no second bus!");
        if (b2 != null) {
            System.out.println("+++++++++++++++ Third Bus: +++++++++++++++");
            b2.print();
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        }
        else
            System.out.println("There is no third bus!");
    }
}
