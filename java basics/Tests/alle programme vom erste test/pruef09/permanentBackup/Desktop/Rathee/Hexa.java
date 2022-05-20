public class Hexa{


    private double side;


    public Hexa(){
        setSide(1.0);


    }

    public Hexa(double newSide ){
        setSide(newSide);

    }
    public void setSide(double newSide){
        if (newSide>0.0){
            side = newSide;
        }
        else {
            System.out.println("Error in setSide : " + newSide);
            side=1.0;
        }}
    public double getSide(){
        return side;
    }

    public double getHeightOfComponentTriangle(){
        return (Math.sqrt(3))*getSide()/2;
    }
    
    public double getAreaOfComponentTriangle(){
    
    return getSide()* getHeightOfComponentTriangle() /2;
    
    }
    
    public double getCircumference(){
    
    return getSide()* 6;
    }
    
    public double getArea(){
    
    return getAreaOfComponentTriangle() * 6;
    
    }
    
    public void print (){
    System.out.println("***********************");
        System.out.println("Side Length: " + getSide());
        System.out.println("Height of Triangle: "+ getHeightOfComponentTriangle() );
        System.out.println("Area of Component triangle " + getAreaOfComponentTriangle());
        System.out.println ("Circumference Hexagon " + getCircumference());
        System.out.println ("Area Hexagon " + getArea());
    }
}

