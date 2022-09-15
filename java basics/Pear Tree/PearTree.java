/**
 * this is the bare bone of the simulation of a Pear Tree
 * @Florian Körner
 */
public class PearTree
{
    private int numberOfPears;
    private double numberOfLeaves;
    private double height;
    private double diameterOfTheStem;
    public void PearTee(int numberOfPears, double numberOfLeaves, double height, double diameterOfTheStem)
    {
        setNumberOfPears(numberOfPears);
        setNumberOfLeaves(numberOfLeaves);
        setHeight(height);
        setDiameterOfTheStem(diameterOfTheStem);
    }
    public PearTree()
    {
        
    }
    public void setNumberOfPears(int newNumberOfPears)
    {
        if(newNumberOfPears<0)
        {
            numberOfPears = 1;
        }else{
            numberOfPears = newNumberOfPears;
        }
    }
    public int getNumberOfPears()
    {
        return numberOfPears;
    }
    public void setNumberOfLeaves(double newNumberOfLeaves)
    {
        if(newNumberOfLeaves<0.0)
        {
            numberOfLeaves = 1000.0;
        }else{
            numberOfLeaves = newNumberOfLeaves;
        }
    }
    public double getNumberOfLeaves()
    {
        return numberOfLeaves;
    }
    public void setHeight(double newHeight)
    {
        if(newHeight>=0.0)
        {
            height = newHeight;
        }else{
            height = 1;
        }        
    }
    public double getHeight()
    {
        return height;
    }
    public void setDiameterOfTheStem(double newDiameterOfTheStem)
    {
        if(newDiameterOfTheStem >=0.0)
        {
           diameterOfTheStem = newDiameterOfTheStem; 
        }else{
            diameterOfTheStem = 0.2;
        }
    }
    public double getDiameterOfTheStem()
    {
        return diameterOfTheStem;
    }
    public double harvest(double amount)
    {
        double pears;
        pears = numberOfPears;
        numberOfPears =0;
        return pears;
    }
    public void water(double amount)
    {
        numberOfLeaves= numberOfLeaves+amount;
        diameterOfTheStem=diameterOfTheStem+((amount/50)*0.001);
        height=height+((amount/200)*0.1);
        if(getHeight()<2.0)
        {
            numberOfPears=numberOfPears;
        }else{
            numberOfPears=numberOfPears+(int)(amount/100);
        }
    }
    public void print()
    {
        System.out.println("--------------------------------------------------------");
        System.out.println("the tree has "+getNumberOfPears()+".");
        System.out.println("the tree is "+getDiameterOfTheStem()+" meters thick.");
        System.out.println("the tree is "+getHeight()+"meters hight");
        System.out.println("the tree has "+getNumberOfLeaves()+"leaves");
        System.out.println("--------------------------------------------------------");
    }
}