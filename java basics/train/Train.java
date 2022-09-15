
/**
 * Beschreiben Sie hier die Klasse train.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Train
{
    private double weight;
    private double power;
    public Lokomotive l;
    public Carriage[] list;
    public int publiceFreePos=0;
    private int privatFreePos=0;
    public Train(double weight, double power){
        if(weight>0.0&&power>0.0){
            this.weight=weight;
            this.power=power;
            list = new Carriage[20];
            this.l = new Lokomotive(this.weight,this.power);
        }else{
            System.out.println("Please enter consistent data! (the numbers entered have to be bigger than 0.0)");
        }
    }
    
    public Train(){this(100.0,100.0);}

    public void addCarriage(double weight, double payload){
        if(weight>0.0&&payload>0.0&&privatFreePos<=19){
            list[privatFreePos]= new Carriage(weight,payload);
            privatFreePos++;
            publiceFreePos++;
        }else if(privatFreePos==20) System.out.println("The train can not have more than 20 carriages!");
        else{
            System.out.println("Error in adding a carriage: Please enter consistent data (Data bigger than 0.0)");
        }
    }

    public Carriage removeCarriage(int position){
        Carriage c=list[position];
        int a=position;
        int d=position-1;
        for(int i=0;i<privatFreePos;i++){
            if(list[a]!=null){
                Carriage b=list[a];
                list[d]=b;
                d++;
                a++;
            }
        }
        if(list[position]!=null){
            privatFreePos--;
            publiceFreePos--;
        }
        return c;
    }

    public int numberOfCarriages(){
        int freePos=privatFreePos;
        return freePos;
    }

    public double totalEmptyWeightOfCarriages(){
        double sum=0;
        double s=0;
        for(int i=0;i<publiceFreePos;i++){
            s=list[i].getEmptyWeight();
            sum+=s;
            s=0;
        }
        return sum;
    }

    public double totalFullWeightOfCarriages(){
        double sum=0;
        double s=0;
        double a=0;
        double b=0;
        for(int i=0;i<publiceFreePos;i++){
            s=list[i].getEmptyWeight();
            a=list[i].getPayload();
            b=a+s;
            sum+=b;
            s=0;
            a=0;
            b=0;
        }
        return sum;
    }

    public double totalEmptyWeightOfTrain(){
        double sum=0;
        double s=0;
        for(int i=0;i<publiceFreePos;i++){
            s=list[i].getEmptyWeight();
            sum+=s;
            s=0;
        }
        sum+=l.getWeight();
        return sum;
    }

    public double totalFullWeightOfTrain(){
        double sum=0;
        double s=0;
        double a=0;
        double b=0;
        for(int i=0;i<publiceFreePos;i++){
            s=list[i].getEmptyWeight();
            a=list[i].getPayload();
            b=a+s;
            sum+=b;
            s=0;
            a=0;
            b=0;
        }
        sum+=l.getWeight();
        return sum;
    }

    public int carriageWithMinimumTotalWeight(){
        int pos=0;
        double val=9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.99999999999;
        for(int i=0;i<publiceFreePos;i++){
            if(list[i]!=null&&list[i].getTotalWeight()<val) {
                val=list[i].getTotalWeight();
                pos=i;
            }
        }
        return pos;
    }

    public int carriageWithMaximumTotalWeight(){
        int pos=0;
        double val=0;
        for(int i=0;i<publiceFreePos;i++){
            if(list[i]!=null&&list[i].getTotalWeight()>val) {
                val=list[i].getTotalWeight();
                pos=i;
            }
        }
        return pos;
    }

    public boolean canTheTrainDrive(){
        if(totalFullWeightOfTrain()<=l.getPower()) return true;
        else return false;
    }

    public void makeTrainMovable(){
        System.out.println("Removed Carriage(s):");
        for(int i=0;canTheTrainDrive()==false;i++){
            int carriageWithMinimumTotalWeight=carriageWithMinimumTotalWeight();
            double b=list[carriageWithMinimumTotalWeight()].getEmptyWeight();
            double c=list[carriageWithMinimumTotalWeight()].getPayload();
            removeCarriage(carriageWithMinimumTotalWeight());
            System.out.println("Carriage at position "+carriageWithMinimumTotalWeight());
            System.out.println("The removed carriage had an empty weight of "+b+" tons");
            System.out.println("The removed carriage had an payload of "+c+" tons");
        }
    }

    public void printTheTrain(){
        System.out.println("Lokomotive:");
        System.out.println("The weight is: "+l.getWeight());
        System.out.println("The power is: "+l.getPower());
        for(int i=0;i<privatFreePos;i++){
            System.out.println("Carriage number "+i);
            System.out.println(list[i].getEmptyWeight());
            System.out.println(list[i].getPayload());
        }
        System.out.println("The train has "+numberOfCarriages()+" carriages.");
        System.out.println("The total empty weight of the carriages is: "+totalEmptyWeightOfCarriages());
        System.out.println("The total full weight of the carriages is: "+totalFullWeightOfCarriages()+"(with cargo)");
        System.out.println("The total empty weight of the train is: "+totalEmptyWeightOfTrain());
        System.out.println("The total full weight of the train is: "+totalFullWeightOfTrain());
        System.out.println("The carriage with the least amount of weight is to be found at position "+carriageWithMinimumTotalWeight());
        System.out.println("The heviest carriage is to be found at position "+carriageWithMaximumTotalWeight());
        if(canTheTrainDrive()==true) System.out.println("The weight of the train is smaller or equal to the power which means that the train can drive!");
        else System.out.println("The train is to heavy to drive. You can make it lighter by either removing some cargo of a carriage.");
    }
}