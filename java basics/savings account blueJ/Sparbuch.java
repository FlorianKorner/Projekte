public class Sparbuch
{
    private String besitzer;
    private double betrag;
    private double zinssatz;
    private boolean gesperrt;
    
    public Sparbuch()
    {
    }
    
    public Sparbuch(String besitzer, double zinssatz)
    {
        setBesitzer(besitzer); 
        setZinssatz(zinssatz);
    }
    
    public Sparbuch(String besitzer, double zinssatz,double Betrag, boolean gesperrt)
    {
        setBesitzer(besitzer); 
        setZinssatz(zinssatz);
        if(Betrag >= 0)
        {
            betrag =Betrag;
        }
        else
        {
            betrag = 0.0;
        }
        setGesperrt(gesperrt);
    }
    
    public void setBesitzer(String newBesitzer)
    {
        if(newBesitzer==null)
        {
            System.out.println("Error 506");
            besitzer = "anonym";
        }
        else
        {
            besitzer = newBesitzer;
        }
    }
    
    public String getBesitzer()
    {
        return besitzer;
    }
    
    public void setZinssatz(double newZinssatz)
    {
        if (newZinssatz<0.0 && newZinssatz >10.0)
        {
            System.out.println("Error 505");
            zinssatz = 0.1;
        }
        else
        {
            zinssatz = newZinssatz;
        }
    }
    
    public double getZinssatz()
    {
        return zinssatz;
    }

    public void setGesperrt(boolean newGesperrt)
    {
        gesperrt = newGesperrt;
    }
    
    public boolean getGesperrt()
    {
        return gesperrt;
    }
    
    public void setBetrag(double newBetrag)
    {
        betrag=betrag;
    }
    
    public double getBetrag()
    {
        return betrag;
    }
    
    public void auszahlen(double newAuszahlen)
    {
        if (newAuszahlen<= getBetrag() && 
        newAuszahlen > 0.0 &&
        getGesperrt() == false)
        {
            setBetrag(betrag - newAuszahlen);
            System.out.println("Auszahlung: "+newAuszahlen);
        }
        else
        {
            setBetrag(betrag);
        }
    }
    
    public void einzahlen(double newEinzahlen)
    {
        setBetrag(betrag + newEinzahlen);
    }
    
    public double zinsen()
    {
        return betrag/100*(100+(zinssatz/100*75));
    }
    
    public double getAddZinsenZuBetrag()
    {
        return zinsen()+getBetrag();
    }
    
    public void print()
    {
        String JaNein;
        if(getGesperrt() == true)
        {
            JaNein = "Ja";
        }
        else
        {
            JaNein = "Nein";
        }
        System.out.println("Sparbuch für "+getBesitzer()+" gesparter Betrag: "
        +getBetrag()+"€ aktueller Zinssatz: "
        +getZinssatz()+" gesperrt: "+JaNein);
    }
}