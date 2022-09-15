    /**
     * It is good for getting drunk late at night.
     * made by Florian Körner 1EHIF
     */
    public class WineCask
    {
        //capacity given in liters//
        private double capacity;
        //content given in liters//
        private double content;
    
        public WineCask(double newCapacity, double newContent)
        {
            setCapacity(newCapacity);
            setContent(newContent);
        }
    
        public WineCask()
        {
            setCapacity(200.0);
            setContent(0.0);
        }
    
        public void setCapacity(double newCapacity)
        {
            if (newCapacity>=0.0)
            {
                capacity=newCapacity;
            }
            else
            {
                System.out.println("Error 505");
            }
        }
    
        public void setContent(double newContent)
        {
            if(newContent>=0.0 && newContent<=capacity)
            {
                content=newContent;
            }
            else
            {
                System.out.println("Error 506");
            }
        }
    
        public double getCapacity()
        {
            return capacity;
        }
    
        public double getContent()
        {
            return content;
        }
    
        public void draw()
        {
            double a;
            a = content - 1.0;
            if (content>=1.0)
            {  
                System.out.println(a);
            }else{
                System.out.println("Error 505 there has to be at"+
                    " least one l of wine"); 
            }
        }
        public double fill()
        {   
            double amountToFill;
            amountToFill= (getCapacity()-getContent());
            setContent(getCapacity());        
            return amountToFill;
        }
        public void fillWithMessage()
        {
            System.out.println((getCapacity()-getContent())+
                "was needed to fill up the Cask");
            setContent(getCapacity());        
        }
    
        public void print()
        {
            System.out.println("the capacity is "+getCapacity());
            System.out.println("the content is "+getContent());
        }
    
    }