import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

/**
 * 
 * @author Dominik Fluch
 */
public class RegularHexagon {
    
    private Double sideLength;
    
    /**
     * @param sideLength
     */
    public RegularHexagon(Double sideLength){
        this.sideLength=sideLength;
    }
    
    /**
     * Sets the side length to 1.
     */
    public RegularHexagon(){
        this(1D);
    }
    
    /**
     * Prints the ships data into the systems outputStream.
     */
    public final void print(){
        this.print(System.out);
    }
    
     /**
     * Prints the ships data.
     * @param outputStream
     */
    public final void print(OutputStream outputStream){
        this.print(new PrintStream(outputStream));
    }
    
    /**
     * Prints the ships data.
     * @param printStream
     */
    public final void print(PrintStream printStream){
        printStream.println(this.toString());
    }
    
    @Override
    public String toString(){
        final String divider = "+----------------------------+";
        String returner = divider+"\n";
        for(Method method : this.getClass().getMethods()){
            if(method.getName().startsWith("get")&&!method.getName().equals("getClass")){
                try{  
                    returner=returner+method.getName()+":\t"+method.invoke(this)+"\n";
                }catch(Exception exception){}
            }
        }
        
        return returner+divider;
    }
    
    /**
     * @return the height of one component triangle.
     */
    public Double getHeightOfComponentTriangle(){
        return Math.sqrt(3*this.getSideLength()/2);
    }
    
    /**
     * @return the height of one component triangle.
     */
    public Double getAreaOfComponentTriangle(){
        return this.getSideLength()*this.getHeightOfComponentTriangle()/2D;
    }
    
    /**
     * @return the circumference of the hexagon.
     */
    public Double getCircumference(){
        return this.getSideLength()*6D;
    }
    
    /**
     * @return the area of the hexagon.
     */
    public Double getArea(){
        return this.getAreaOfComponentTriangle()*6D;
    }
    
    /**
     * @return the side length of the hexagon.
     */
    public Double getSideLength(){
        return sideLength;
    }
    
    /**
     * Sets the hexagons side length.
     * @param sideLength
     */
    public void setSideLength(Double sideLength){
        if(sideLength>0D){
            this.sideLength = sideLength;
        }else throw new IllegalArgumentException("The length of the side must not be smaller or equal 0.");
    }
    
}
