
/**
 * Beschreiben Sie hier die Klasse Strings.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Strings
{   private String[] strings;
    public Strings(int size){
        if( size<1){
            System.out.println("Wrong size for array");

            size=100;
        }
        strings = new String[size];
    }

    public String setElement(int position, String value){
        if(position>0&&value.length()>0&&value!=null&&position<=strings.length)
            strings[position]=value;
        else {System.out.println("Wrong values for either position or value (both have to be bigger than 0)");
        }
        return null;
    }

    public String getElement(int position){
        return strings[position];
    }

    public int number(){
        int a=0;
        for(int i=0;i<strings.length;i++){
            if(strings[i]!=null) a++;
        }
        return a;
    }

    public int maxPosition(){
        int a=0;
        for(int i=0;i<strings.length;i++){
            if(strings[i].length()>a) a=i;
        }
        return a;
    }

    public int minPosition(){
        int a=0;
        for(int i=0;i<strings.length;i++){
            if(strings[i].length()<a) a=i;
        }
        return a;
    }

    public String maxValue(){
        int a=0;
        for(int i=0;i<strings.length;i++){
            if(strings[i].length()>a) a=i;
        }
        return strings[a];
    }

    public String minValue(){
        int a=0;
        for(int i=0;i<strings.length;i++){
            if(strings[i].length()<a) a=i;
        }
        return strings[a];
    }

    public int contain(String v){
        int a =0;
        for(int i=0;i<strings.length;i++){
            if(strings[i]==v)a++;
        }
        return a;
    }
    
}
