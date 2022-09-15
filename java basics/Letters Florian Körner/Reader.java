import java.io.*;
/**
 * Write a description of class Reader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reader
{
    BufferedReader reader;
    public void open(String fn)
    {
        try
        {
            FileReader file = new FileReader(fn);
            reader = new BufferedReader(file);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public int read()
    {
        int c = -1;
        if (reader == null) System.out.println("Error: File not opened!");
        try
        {
            c =  reader.read();
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        finally
        {
            return c;
        }
    }

    public void close()
    {
        if (reader == null) System.out.println("Error: File not opened!");
        try
        {
            reader.close();
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
            System.exit(-13);
        }
    }
    
}