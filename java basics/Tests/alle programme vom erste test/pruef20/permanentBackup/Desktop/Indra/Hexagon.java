
/**
 * Beschreiben Sie hier die Klasse Hexagon.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Hexagon
{
   private double sideLength;
   public Hexagon(){
       this.sideLength = 1.0;
       
    }
   public Hexagon(double sideLength){
       getSideLength(sideLength);
       
    }
   public void getSideLength(double s){
       if (s > 0.0){
           this.sideLength = s;
       
       
        }
       else{ 
           this.sideLength = 1.0;
    
       } 
    }
   public double getSideLength(){
       return this.sideLength;
       
       
    }
   public double getHeigthOfComponenteTriangel(){
       return Math.sqrt(3.0)*getSideLength()/2.0;
       
       
    }
   public double getAreaOfComponenteTriangel(){
       return getHeigthOfComponenteTriangel()*getSideLength()/2.0 ;
       
       
    }
   public double getArea(){
       return getAreaOfComponenteTriangel()*6.0;

      }
   public double getCircumference(){
       return getSideLength() * 6.0;
       
       
    }
   public void Print(){
       
       System.out.println("sideLengths:"+getSideLength());
       System.out.println("AreaOfComponenteTriangel:"+getAreaOfComponenteTriangel());
       System.out.println("HeigthOfComponenteTriangel:"+getHeigthOfComponenteTriangel());
       System.out.println("Area:"+ getArea());
       System.out.println("Circumference:"+getCircumference());
    }
    
    



}
