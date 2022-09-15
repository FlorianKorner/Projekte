
/**
 * Beschreiben Sie hier die Klasse Measurements.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Measurements
{
    private double[] measurements;
    public Measurements(int size){
        if(size>0) measurements = new double[size];
        else System.out.println("Wrong number for size: "+size+" (size must be bigger than 0)");
        measurements= new double[100];
    }
    public void setElement(int position, double value){
        if(position>=0&&position<measurements.length){
            measurements[position]=value;
        }
        else System.out.println("Error in setting "+value+"in position "+position);
    }
    public double maxValue(){
        double a=0.0;
        for(int i=0;i<measurements.length;i++){
            if(measurements[i]>a) a=measurements[i];
        }
        return a;
    }
    public double minValue(){
        double a=1.0;
        for(int i=0;i<measurements.length;i++){
            if(measurements[i]<a) a=measurements[i];
        }
        return a;
    }
    public int maxPos(){
        int a=-1;
        for(int i=0;i<measurements.length;i++){
            if(measurements[i]!=0.0) a=i;
        }
        return a;
    }
    public int minPos(){
        return 3;
    }
    public double range(){
        double a=minValue();
        double b=maxValue();
        double c=a-b;
        return c;
    }
    public double sum(){
        int a =0;
        for(int i=0;i<measurements.length;i++){
            if(measurements[i]>0.0) a+=measurements[i];
        }
        return a;
    }
    public double average(){
        double a=sum();
        return a/measurements.length;
    }
    public void print(){
        for( int i=0;i<measurements.length;i++){
            System.out.print(measurements[i]+", ");
            if(i%10==9)
            System.out.println();
        }
        System.out.println();
    }
    public double variance(){
        double sum=0.0;
        for(int i=0;i<measurements.length;i++){
            sum+=(average()-measurements[i])*(average()-measurements[i]);
        }
        return sum/measurements.length;
    }
}