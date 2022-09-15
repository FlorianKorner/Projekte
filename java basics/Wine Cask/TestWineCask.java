/*
 * this class tests the funktionality of the Wine Cask
 * made by 
 * @Florian Körner
 */
public class TestWineCask{
    public void test()
    {
        WineCask w= new WineCask();
        w.setCapacity(500);
        if(w.getCapacity()!=500)
        {System.out.println("Error 1");
        }else{
            System.out.println("correct 1");
        }
        w.fill();
        if(w.getContent()!=500)
        {System.out.println("Error 2");
        }else{
            System.out.println("correrct 2");
        }
        w.draw();
        if(w.getContent()!=499)
        {System.out.println("Error 3");
        }else{
            System.out.println("correct 3");
        }
        WineCask e = new WineCask();
        e.setCapacity(300);
        if(w.getCapacity()!=300)
        {System.out.println("Error 4");
        }else{
            System.out.println("correct 4");
        }
        w.fill();
        if(w.getContent()!=300)
        {System.out.println("Error 5");
        }else{
            System.out.println("correrct 5");
        }
        w.draw();
        if(w.getContent()!=299)
        {System.out.println("Error 6");
        }else{
            System.out.println("correct 6");
        }
    }
}