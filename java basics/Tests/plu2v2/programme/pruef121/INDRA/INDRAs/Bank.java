
/**
 * Beschreiben Sie hier die Klasse Bank.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bank
{
   private Account a0;
   private Account a1;
   private Account a2;
   public Account getAccount(int number){
       if(number>= 0 && number <= 2){
           if (a0 != null && number == 0){
               return this.a0;
            }
           else if (a1 != null && number == 1){
               return this.a1;
              
           } 
          
           else if (a2 != null && number == 2){
               return this.a2;
           }
           else{
               return null;
            }
        }
       else return null;
   }
   public Account addAccount(Account a){
       if (a != null && a != a0 && a != a1 && a != a2){
           if(a0 == null){
               this.a0 = a;
               return a;
            }
       
           if(a1 == null){
               this.a1 = a;
               return a;
            }
       
           if(a2 == null){
               this.a2 = a;
               return a;
            }
           else return null;
        }
       else return null;
    }
   public Account removeAccount(int a){
       if (a0 != null){
       if(a0.getNumber() == a){
           this.a0 = null;
           Account x = a0;
           return x;
       }
       }
       if (a1 != null){
       if(a1.getNumber() == a){
           this.a1 = null;
           Account x = a1;
           return x;
       }
       }
       if (a2 != null){
       if(a2.getNumber() == a){
           this.a2 = null;
           Account x = a2;
           return x;
       }
       else return null;
       }
       else return null;
    }
   public int numberOfAccounts(){
       int all = 0;
       if (a0 != null){
          all++;
        }
       if (a1 != null){
          all++;
        }
        if (a2 != null){
          all++;
       }
       return all;
    }
   public int sumAccounts(){
       int all = 0;
     
       if (a0 != null){
          all= all + a0.getBalance();
        }
       if (a1 != null){
          all= all + a1.getBalance();
        }
       if (a2 != null){
          all= all + a2.getBalance();
        }
       
       return all;
       
    }
   public void print(){
       if (a0 != null)a0.Print();
       else System.out.println("Acccount empty a0");
        if (a1 != null)a1.Print();
       else System.out.println("Acccount empty a1");
        if (a2 != null)a2.Print();
       else System.out.println("Acccount empty a2");
       System.out.println(this.numberOfAccounts());
       System.out.println(this.sumAccounts());
    }
   public int accoutWith(String a){
       int all = 0;
       if (a0!= null){
           a0.getDatabase();
           if(a.indexOf(a0.getOwner()) != -1)all++;
       }
       if (a1!= null){
           a1.getDatabase();
           if(a.indexOf(a1.getOwner()) != -1)all++;
       }
       if (a2!= null){
           a2.getDatabase();
           if(a.indexOf(a2.getOwner()) != -1)all++;
       }
       return all;
    }
}
