
/**
 * Beschreiben Sie hier die Klasse Testhex.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Testhex
{
    public void testing(){
        Hexagon myhex = new Hexagon();
        myhex.Print();
        System.out.println("correct");
        if (Math.abs(myhex.getCircumference()-6.0 )<Math.abs(0.0001 )){
            System.out.println("correct");
    
        
        }
        else{
            System.out.println("inncorrect1");
            
        }
    
        if (Math.abs(myhex.getArea()-2.598076211353316)  <(0.0001)){
            System.out.println("correct2");
    
        
        }
        else{
            System.out.println("inncorrect2");
            
        }
        Hexagon ahex = new Hexagon(3.0);
        ahex.Print();
         if (Math.abs(ahex.getCircumference()-18.0) <Math.abs(0.0001 )){
            System.out.println("correct4");
    
        
        }
        else{
            System.out.println("inncorrect4");
            
        }
         if (Math.abs(ahex.getArea()- 23.382685902179844)  <Math.abs(0.0001)){
            System.out.println("correct5");
    
        
        }
        else{
            System.out.println("inncorrect5");
            
        }
        
        
    }
    
    
        
    
}
