 public class TestHexagon{

    Hexagon x = new Hexagon(4.0);
    
    public void test() {
    
        if(Math.abs(x.getArea()) > 0.00001 && Math.abs(x.getCircumference()) > 0.00001) {
            
            System.out.println("correct");
        }
        else {
        
            System.out.println("error");
        }
    }
} 