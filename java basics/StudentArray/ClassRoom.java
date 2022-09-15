
/**
 * class ClassRoom: contains an array of students == seats in the class room
 *     seats may be empty == seat[pos] is null
 *
 * @author Andreas Schenk
 * @version 2020-06-08
 */
public class ClassRoom
{
    private Student[] seats;
    public ClassRoom(int size)
    {
        if (size < 1)
        {
            size = 25;
            System.out.println("Error: ClassRoom 001");
        }
        seats = new Student[size];
    }
    public ClassRoom()
    {
        this(25);
    }
    //public boolean set(Student s, int pos)
    //public Student get(int pos)
    //public Student remove(int pos)
    //public int numStudents()
    //public int numFreeSeats()
    //public boolean isFull()
    //public void print()
    //public double avgMark()
    //public int bestMark()
    //public int worstMark()
    //public Student bestStudent()
    //public Student worstStudent()
    //public StudentList studentsWithMark(int mark)
}
