
/**
 * Beschreiben Sie hier die Klasse Tree.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Tree
{
    private boolean hasFruits;
    private String type;
    private char size; //`m´ medium thick,`s´,`l´
    private int age;
    private double height;//in meters

    public Tree(String type, char size, int age, double height){
        setAge(age);
        setSize(size);
        setType(type);
        setHeight(height);
    }

    public void setAge(int age){
        if(age>=0){
            this.age = age;
        }else{
            System.out.println("Age is 3");
            this.age =3;
        }
    }

    public int getAge(){
        return age;
    }

    public void setSize(char size){
        if(size =='m' || size == 's' || size == 'l'){
            this.size=size;
        }else{
            System.out.println("Wrong size: "+size);
            this.size='m';
        }
    }

    public char getSize()
    {
        return size;
    }

    public void setHeight(double height)
    {
        if(height<=0){
            System.out.println("Wrong height!!!"+height);
            height=1;
        }
        this.height=height;
    }

    public double getHeight()
    {
        return height;
    }
    public void setType(String type)
    {
        if(type==""){
            this.type = type;
    }else{
        System.out.println("Wrong type!!! "+type);
        this.type = "Birnenbaum";
    }
    }
    public String getType()
    {
        return type;
    }
    public String toString()
    {
        String newHasFruits="";
        if(hasFruits)
        {
            newHasFruits="the tree has fruits";
        }else{
            newHasFruits="the tree has no fruits";
        }
        if(size=='m')
        {
            newHasFruits=newHasFruits+"It is medium.";
        }else if(size=='s')
        {
            newHasFruits=newHasFruits+"It is small.";
        }else if(size=='l')
        {
            newHasFruits=newHasFruits+"It is large.";
        }
        newHasFruits=newHasFruits+"The tree is "+age+" years old";
        newHasFruits=newHasFruits+"The tree is a "+type;
        newHasFruits=newHasFruits+"the tree is "+height+"m height";
        return newHasFruits;
    }
    public void ausgeben()
    {
        System.out.println(toString());
    }
    public void waterTree(double liter){
        //height=height+liter/10
        setHeight(getHeight()+liter/10);
        
    }
}