
/**
 * Beschreiben Sie hier die Klasse Person.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Person
{
    String name;
    int age;
    double weight;
    public Person(String name, int age, double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    public Person(){}
    public void print(){
        System.out.println(this.name+" "+this.age+" "+this.weight);
    }
}
