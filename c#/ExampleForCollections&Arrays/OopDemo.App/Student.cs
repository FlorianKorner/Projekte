namespace OopDemo.App
{
    class Student
    {
        public Student(string firstname, string lastname)
        {
            Firstname = firstname;
            Lastname = lastname;
        }

        public string Firstname { get; }
        public string Lastname { get; }
    }
}
