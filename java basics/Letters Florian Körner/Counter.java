
public class Counter
{
    private int arr[];
    public Counter(){
        arr= new int[256];
    }

    public void countLetters(){
        Reader r=new Reader();
        r.open("shaks12.txt");
        int x = r.read();
        while (x != -1)
        {
            arr[x]++;
            x = r.read();
        }
        print();
        r.close();
    }

    public void print(){
        for(int i=97;i<123;i++){
            System.out.print(""+(char)i+": "+arr[i]+", ");
        }
        System.out.println();
    }
}