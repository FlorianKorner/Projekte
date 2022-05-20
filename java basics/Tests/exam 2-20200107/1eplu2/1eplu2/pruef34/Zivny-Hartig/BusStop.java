public class BusStop {

    private Bus b0;
    private Bus b1;
    private Bus b2;

    public BusStop() {
        b0 = new Bus(0, 20, "MA73 EHI"); // i gotcha EHIF
        b1 = null;
        b2 = new Bus(12, 40, "YD34 HIF");
    }

    public Bus maxSeats() {
        Bus max = null;
        if (b0 != null) max = b0;
        if (b1 != null && b1.getSeats() > max.getSeats()) max = b1;
        if (b2 != null && b2.getSeats() > max.getSeats()) max = b2;
        return max;
    }

    public int registrationStartsWith(String s) {
        int amount = 0;
        if (b0 != null && b0.getRegistration().startsWith(s)) amount += 1;
        if (b1 != null && b1.getRegistration().startsWith(s)) amount += 1;
        if (b2 != null && b2.getRegistration().startsWith(s)) amount += 1;
        return amount;
    }

    public Bus getBus(int pos) {
        if (pos == 0) return b0;
        if (pos == 1) return b1;
        if (pos == 2) return b2;
        return null;
    }

    public int enter(int amount) {
        int result = 0;
        if (b0 != null) result = b0.enter(amount);
        if (b1 != null) result += b1.enter(amount - result);
        if (b2 != null) result += b2.enter(amount - result);
        return result;
    }

    public boolean addBus(Bus b) {
        if (b == null || (b == b0 && b != null) || (b == b1 && b != null) || (b == b2 && b != null)) {
            System.out.println("ERROR\nInvalid Bus. Bus is either null or already exists.");
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

    public boolean addBus(Bus b, int pos) {
        if (b == null || b == b0 || b == b1 || b == b2) {
            System.out.println("ERROR\nInvalid Bus. Bus is either null or already exists.");
            return false;
        }
        if (pos < 0 && pos > 2) {
            System.out.println("ERROR\nInvalid position. The position is not 0, 1 or 2.");
            return false;
        }
        if (pos == 0 && b0 == null) {
            b0 = b;
            return true;
        }
        if (pos == 1 && b1 == null) {
            b1 = b;
            return true;
        }
        if (pos == 2 && b2 == null) {
            b2 = b;
            return true;
        }
        return false;
    }

    public Bus removeBus() {
        Bus c = null;
        if (b0 != null) {
            c = b0;
            b0 = null;
            return c;
        }
        if (b1 != null) {
            c = b1;
            b1 = null;
            return c;
        }
        if (b2 != null) {
            c = b2;
            b2 = null;
            return c;
        }
        return c;
    }

    public Bus removeBus(int pos) {
        Bus c = null;
        if (pos < 0 && pos > 2) {
            System.out.println("ERROR\nInvalid position. The position is not 0, 1 or 2.");
            return null;
        }
        if (pos == 0 && b0 != null) {
            c = b0;
            b0 = null;
            return c;
        }
        if (pos == 1 && b1 != null) {
            c = b1;
            b1 = null;
            return c;
        }
        if (pos == 2 && b2 != null) {
            c = b2;
            b2 = null;
            return c;
        }
        return c;
    }
}
