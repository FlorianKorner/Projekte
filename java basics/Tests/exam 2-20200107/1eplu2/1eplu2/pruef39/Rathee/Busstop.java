
public class Busstop{
    
    private Bus b0;
    private Bus b1;
    private Bus b2;
    
    
    public Busstop(){
     b0= new Bus (0,20,"MA 73 EHI");
   b1= new Bus ();
  b2= new Bus(12,40,"YD23 HIF");
    }
    
    public Bus MaxSeats(){
    
    if(b0.getSeats()>b1.getSeats() && b0.getSeats()> b1.getSeats())
    
    {System.out.println("B0 has most seats");}
     else if(b1.getSeats()>b2.getSeats() && b1.getSeats()> b2.getSeats())
    
    {System.out.println("B1 has most seats");}
    else{System.out.println("B2 has most seats");}
    
    }
    
    public int registrationStartsWith(String s){
    
    if(b0.getRegistration().startsWith( s)){
    System.out.println("B1 starts with String s");
    
    }
    else if(b1.getRegistration().startsWith( s)){
    System.out.println("B2 starts with String s");
    
    }
    else if(b2.getRegistration().startsWith( s)){
    System.out.println("B3 starts with String s");
    
    }
    
    }
    
    public int enter(int passengers){
        passengers=0;
    if(passengers>getSeats())return 0;
   int result=0;
    if(b0!=null)result= b0.passengers(passengers);
    if(b1!= null)result+=b1.passengers(passengers);
     if(b2!= null)result+=b2.passengers(passengers-result);
    retun result;
    
    }
    
    public Bus getBus(int position){
    if(position == 0){
    return b0;
    }
    if(position == 1){
    return b1;
    }
    if(position == 2){
    return b2;
    }
    
    
    }
    
    public boolean addBus(Bus b){
    
    if(b== null|| b0 == b ||b1 == b|| b2== b ){
    return false;
    }
    if(b0==null){
    b0=b;
    return true;
    }
    
      if(b1==null){
    b1=b;
    return true;
    }
    
      if(b2==null){
    b2=b;
    return true;
    }
    }
    
    public boolean addBus(Bus b, int position){
    
    if(position>3 || position < 0){
    return false;
    }
    if(b== null|| b0 == b ||b1 == b|| b2== b ){
    return false;
    }
    if(b0==null&& position==0 ){
    b0=b;
    return true;
    }
    
      if(b1==null&& position==1){
    b1=b;
    return true;
    }
    
      if(b2==null&& position==2){
    b2=b;
    return true;
    }
    
    return false;
    
    }
    
    public Bus removeBus(){
    
    
    Bus bloc= null;
    if(b0!= null){
    b0=bloc;
    bloc=null;
    return b0;
    
    }
    
      if(b1!= null){
    b1=bloc;
    bloc=null;
    return b1;
    
    }
    
      if(b2!= null){
    b2=bloc;
    bloc=null;
    return b2;
    
    }
    
    return bloc;
    }
    
    public Bus removeBus(int position){
    
    if(position>3 || position < 0){
    System.out.println("Wrong position");
    }
  Bus  bloc=null;
    if(b0!=null&& position==0 ){
    b0=bloc;
    bloc=null;
    return b0;
    }
    
      if(b1!=null&& position==1){
    b1=bloc;
    bloc=null;
    return b1;
    }
    
      if(b2!=null&& position==2){
    b2=bloc;
    bloc=null;
    return b2;
    }
    
    return bloc;
    
    
    }
}