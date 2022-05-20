
public class Bus 
{
    private int passangers;
    private int seats;
    private String reg_num;
    public Bus(int se,int pass,String nam){
        if (this.check(se,pass,nam)){
            this.passangers = pass;
            this.seats = se;
            this.reg_num = nam;
        }
        else{
            this.passangers = 0;
            this.seats = 50;
            this.reg_num = "AB00 ABC";
        }
    }
    public Bus(){
        this.passangers = 0;
        this.seats = 50;
        this.reg_num = "AB00 ABC";
    }
    public boolean check(int s,int p,String ne){
        if (s < 0)return false;
        if (p < 0 && p> s) return false;
        if (ne.length() != 8) return false;
        if (ne != null) return false;
        return true;
    }
    public void setSeats(int s){
        if (this.check(s,this.passangers,this.reg_num)){
            this.seats = s;
        }
        else this.seats = 50;
    }
    public void setPass(int p){
        if (this.check(this.seats,p,this.reg_num)){
            this.passangers = p;
        }
        else this.passangers = 0;
    }
    public void setName(String nam){
        if (this.check(this.seats,this.passangers,nam)){
            this.reg_num = nam;
        }
        else this.reg_num = "AB00 ABC";
    }
    public int getSeats(){
        return this.seats;
    }
    public int getPass(){
        return this.passangers;
    }
    public String getName(){
        return this.reg_num;
    }
    public int enter(int number){
        if (number > 0){
            if (number+this.getPass()> this.getSeats()){
                int a = this.getPass();
                this.setPass(this.getSeats());
                return this.getSeats()-a;
            }
            else {
                this.setPass(this.getPass()+number);
                return number;
            }
        }
        return 0;
    }
    public int exit(int number){
         if (number > 0){
            if (this.getPass()-number< 0){
                int a = getPass();
                this.setPass(0);
                return a;
            }
            else {
                this.setPass(this.getPass()-number);
                return number;
            }
        }
        return 0;
    }
    public void Print(){
        System.out.println("Passengers"+this.passangers+"Seats"+this.seats+reg_num);
    }
}
