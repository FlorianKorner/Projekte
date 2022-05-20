
/**
 * class StudentList: a list of students
 *     list item may not be null
 *     freePos is the first empty position in the list
 *       initially 0, has to be checked and updated with every insert/delete method
 *
 * @author Andreas Schenk
 * @version 2020-06-08
 */
public class StudentList
{
    private Student[] list;
    private int freePos;
    public StudentList(int size)
    {
        if (size < 1)
        {
            size = 25;
            System.out.println("Error: StudentList 001");
        }
        list = new Student[size];
        freePos = 0;
    }
    public StudentList()
    {
        this(25);
    }
    //public int size()
    //public boolean isFull()
    //public int get(int pos)
    //public boolean add(Student s)
    //public Student remove()
    //public void print();
    //public boolean insert(Student s, int pos)
    //public boolean remove(int pos, int num)
    //public boolean add(StudentList s)
    //public boolean insert(StudentList s, int pos)
    //public double avgMark()
    //public int bestMark()
    //public int worstMark()
    //public Student bestStudent()
    //public Student worstStudent()
    //public StudentList studentsWithMark(int mark)

}
