using System.Collections.Generic;

namespace OopDemo.App
{
    class Schoolclass
    {
        private const int _maxStudents = 30;
        private readonly List<Student> _students = new(30);
        public string Name { get; set; }
        // Implicit typecast from List<Student> to IReadonlyList<Student>
        public IReadOnlyList<Student> Students => _students;

        public Schoolclass(string name, List<Student> students)
        {
            Name = name;
            _students = students;
        }
        public bool AddStudent(Student s)
        {
            if (_students.Count >= _maxStudents)
            {
                return false;
            }
            _students.Add(s);
            return true;
        }

        /// <summary>
        /// Returns all students with the given lastname
        /// You can use for and an indexer to access elements.
        /// </summary>
        /// <param name="lastname"></param>
        public IReadOnlyList<Student> GetStudentsByName(string lastname)
        {

        }

        /// <summary>
        /// Removes all students with the given lastname
        /// </summary>
        /// <param name="lastname"></param>
        public void RemoveStudentsByName(string lastname)
        {

        }

    }
}
