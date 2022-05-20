
/**
 * Beschreiben Sie hier die Klasse TestHexagon.
 * 
 * @author Dominik Fluch
 */
public class TestHexagon {

    /**
     * There in order to make the class runnable.
     * @param args
     */
    public static void main(String[] args){
        TestHexagon.test();
    }
    
    /**
     * Tests the hexagon class.
     */
    public static void test(){
        final RegularHexagon hexagon = new RegularHexagon();
        
        //In order to check default values (including circumference and area)
        hexagon.print();
        
        final RegularHexagon hexagon2 = new RegularHexagon(3D);
        
        //In order to check default values (including circumference and area)
        hexagon2.print();
        if(Math.abs(hexagon2.getCircumference())-18D<0.01)System.out.println("Circumference is correct");
        if(Math.abs(hexagon2.getArea())-19.09188309203678D<0.01)System.out.println("Area is correct");
    }
    
}
