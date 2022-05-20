public class BusStop
{
    private Bus b0;
    private Bus b1;
    private Bus b2;

    public BusStop(){
        Bus b0 = new Bus(0, 20, "MA73 EHI");
        Bus b1 = null;
        Bus b2 = new Bus(12, 40, "YD34 HIF");

    }

    public Bus maxSeats(){
        if(b0 != null && b2 != null){
            if(b0.getSeats() > b2.getSeats())
                return b0;
            if(b0.getSeats() < b2.getSeats())
                return b2;
        }
        return null;
    }

    public int registrationStartsWith(String s){
        int a = 0;
        if(b0 != null && b2 != null){
            if((b0.getRegistration()).startsWith(s))
                a = a + 1;
            if((b2.getRegistration()).startsWith(s))
                a = a + 1;
        }
        return a;
    }

    public int enter(int passengers){
        int amount = passengers;
        if(b0 != null)
            b0.enter(passengers);
        if(b0.getPassengers() == b0.getSeats())
            b2.enter(b1.getPassengers() - passengers);
        if(b2.getPassengers() == b2.getSeats());
        return amount- passengers;
    }

    public Bus getBus(int position){
        if(position >= 0 && position <= 2){
            if(position == 0)
                return b0;
            if(position == 1)
                return b1;
            if(position == 2)
                return b2;
        }

        return null;
    }

    public boolean addBus(Bus b){
        if(b != null && b0 == null || b1 == null || b2 == null){
            if(b0 == null){
                b0 = b;
                return true;
            }
            if(b1 == null){
                b1 = b;
                return true;
            }
            if(b2 == null){
                b2 = b;
                return true;
            }
        }
        return false;
    }

    public boolean removeBus(Bus b){
        if(b != null && b0 != null || b1 != null || b2 != null){
            if(b0 != null){
                b0 = null;
                return true;
            }
            if(b1 != null){
                b1 = null;
                return true;
            }
            if(b2 != null){
                b2 = null;
                return true;
            }
        }
        return false;
    }

    public boolean addBusPosition(Bus b, int position){
        if(b != null && position >= 0 && position <= 2 && b0 == null || b1 == null || b2 == null){
            if(b0 == null && position == 0){
                b0 = b;
                return true;
            }
            if(b1 == null && position == 1){
                b1 = b;
                return true;
            }
            if(b2 == null && position == 2){
                b2 = b;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeBusPosition(Bus b, int position){
        if(b != null && position >= 0 && position <= 2 && b0 != null || b1 != null || b2 != null){
            if(b0 != null && position == 0){
                b0 = b;
                return true;
            }
            if(b1 != null && position == 1){
                b1 = b;
                return true;
            }
            if(b2 != null && position == 2){
                b2 = b;
                return true;
            }
        }
        return false;
    }
}