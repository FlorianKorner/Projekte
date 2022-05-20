public class WineCellar
{
    private WineCask w0;
    private WineCask w1;
    private WineCask w2;
    public WineCellar()
    {   w0 = new WineCask();
        w1 = new WineCask(250, 0);
        w2 = new WineCask(300, 150);
    }
    public double getContent()
    {
        double result =0.0;
        if(w0!= null) result +=w0.getContent();
        if(w1!= null) result +=w1.getContent();
        if(w2!= null) result +=w2.getContent();
        return result;
    }
    public double getCapacity()
    {
        double result =0.0;
        if(w0!= null) result +=w0.getCapacity();
        if(w1!= null) result +=w1.getCapacity();
        if(w2!= null) result +=w2.getCapacity();
        return result;
    }
    public double fill()
    {
        double result=0;
        if(w0!= null) result += w0.fill();
        if(w1!= null) result +=w1.fill();
        if(w2!= null) result +=w2.fill();
        return result;
    }
}