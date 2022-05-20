
/**
 * Beschreiben Sie hier die Klasse BusStop.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class BusStop
{
   private Bus b0 = new Bus (20,0,"MA73 EHI");
   private Bus b1 = null;
   private Bus b2 = new Bus(40,12,"YD34 HIF");
   public Bus maxSeats(){
       if (b0 != null){
           int a = 0;
           int b = 0;
           if (b1 != null){
               a = b1.getSeats();
           }
           if (b2 != null){
               b = b2.getSeats();
           }
           if (b0.getSeats() > a&&b0.getSeats() > b){
           return this.b0;
           }
        }
       if (b1 != null){
           int a = 0;
           int b = 0;
           if (b0 != null){
               a = b0.getSeats();
           }
           if (b2 != null){
               b = b2.getSeats();
           }
           if(b1.getSeats() > a&&b1.getSeats() > b){
           return this.b1;
           }
       }
       if (b2 != null){
           int a = 0;
           int b = 0;
           if (b0 != null){
               a = b0.getSeats();
           }
           if (b1 != null){
               b = b1.getSeats();
           }
           if(b2.getSeats() > a&&b2.getSeats() > b){
           return this.b1;
           }
        }
       return null;
       }
   public int registrationStartsWith(String s){
       int total = 0;
       if (b0 != null&&b0.getName().startsWith(s)) total += 1;
       if (b1 != null&&b1.getName().startsWith(s)) total += 1;
       if (b2 != null&&b2.getName().startsWith(s)) total += 1;
       return total;
    }
   public int enter(int pass){
       int all = 0;
       if (b0 != null){
           all += b0.enter(pass);
           pass = pass-all;
       }
       if (b1 != null){
           all += b1.enter(pass);
           pass = pass-all;
       }
       if (b2 != null){
           all += b2.enter(pass);
           pass = pass-all;
       }
       return all;
    }
   public Bus getBus(int pos){
       if (pos >=0&&pos<= 2){
           if (b0 != null && pos == 0)return b0;
           if (b1 != null && pos == 1)return b1;
           if (b2 != null && pos == 2)return b2;
           return null;
        }
       return null;
    }
   public boolean addBus(Bus b){
       if (b0 != b||b1!= b||b2 != b){
        if (b0 == null){
            b0 = b;
            return true;
        }
        if (b1 == null){
            b1 = b;
            return true;
        }
        if (b2 == null){
            b2 = b;
            return true;
        }
       return false;
        }
       return false;
   }
    public boolean addBus(Bus b,int pos){
       if (b0 != b||b1!= b||b2 != b||pos >=0&&pos<= 2){
        if (b0 == null&&pos ==0){
            b0 = b;
            return true;
        }
        if (b1 == null&&pos ==1){
            b1 = b;
            return true;
        }
        if (b2 == null&&pos ==2){
            b2 = b;
            return true;
        }
       return false;
        }
       return false;
   }
   public Bus removeBus(){
       if(b0 != null){
           Bus a = b0;
           b0 = null;
           return a;
        }
       if(b1 != null){
           Bus a = b1;
           b1 = null;
           return a;
        }
       if(b2 != null){
           Bus a = b2;
           b2= null;
           return a;
        }
       return null;
    }
   public Bus removeBus(int pos){
       if(pos >=0&&pos<= 2){
       if(b0 != null&&pos==0){
           Bus a = b0;
           b0 = null;
           return a;
        }
       if(b1 != null&&pos==1){
           Bus a = b1;
           b1 = null;
           return a;
        }
       if(b2 != null&&pos==2){
           Bus a = b2;
           b2= null;
           return a;
        }
       return null;
    }
    return null;
}
   
}