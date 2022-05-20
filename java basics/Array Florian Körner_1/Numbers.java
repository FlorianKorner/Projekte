/**
 * part of the class Numbers: ArrayExercises 1
 *
 * @author Andreas Schenk
 * @version 2020-04-19
 */
public class Numbers
{
    private int[] numbers;  // declaration of the field numbers
    public Numbers(int size)
    {
        if (size < 1) // check for the array size: it must not be smaller than 0
                        //  0 would be allowed but it doesn't make much sense here
        {
            System.out.println("Wrong array size: " + size);
            size = 100;
        }
        numbers = new int[size];  // initialization of the field numbers
    }
    public int getElement(int position)
    {
        if (position < 0 || position >= numbers.length)
        {
            System.out.println("position out of bounds: " + position);
            return 0;
        }
        return numbers[position]; // access the array numbers at the given position,
                                    // returns the value of the element at this position
    }
    public void setElement(int position, int value)
    {
        if (position >= 0 && position < numbers.length)
        {
            numbers[position] = value;  // sets the array element at the position to the value
        }
        else
        {
            System.out.println("position out of bounds: " + position);
        }
    }
    public void fillWithOddNumbers()
    {
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i * 2 + 1;
    }
    public void fillWithEvenNumbers(){
        for( int i=1; i<numbers.length; i++)
            numbers[i] = i*2+1;
    }
    public int sum()
    {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum += numbers[i];
        return sum;
    }
    public void print(){
        for( int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+", ");
            if(i%10==9)
            System.out.println();
        }
        System.out.println();
    }
    public void maxValue(){
        int a=0;
        for(int i=0;i<numbers.length;i++){
            if(a<numbers[i]) numbers[i]+= a;
        }
        System.out.println("The max Value is: "+a);
    }
    public void minValue(){
        int a=0;
        for(int i=0;i<numbers.length;i++){
            if(a>numbers[i]) numbers[i]+= a;
        }
        System.out.println("The min Value is: "+a);
    }
    public void maxPosition(){
        int a=numbers.length-1;
        System.out.println(numbers[a]);
    }
    public void minPosition(){
        System.out.println(numbers[0]);
    }
}