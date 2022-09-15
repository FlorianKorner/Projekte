
using System;
using System.Collections.Generic;
using System.Linq;
using static TestHelpers.ProgramChecker;

namespace RegistrationSystem.Application { 
    interface  IGradeChecker
    {
    bool CanBeAccepted(IReadOnlyDictionary<string, int> grades);
    }

    public class HtlGradeChecker : IGradeChecker
    {
        bool IGradeChecker.CanBeAccepted(IReadOnlyDictionary<string, int> grades)
        {
            foreach(KeyValuePair<string, int> x in grades){
                if (x.Value >= 1 || x.Value <= 3) { }
                else return false;
            }
            return true;
        }

    }

    public class FsGradeChecker : IGradeChecker
    {
        bool IGradeChecker.CanBeAccepted(IReadOnlyDictionary<string, int> grades)
        {
            foreach (KeyValuePair<string, int> x in grades)
            {
                if (x.Value >= 1 || x.Value <= 4) { }
                else return false;
            }
            return true;
        }

    }

    public class Applicant
    {
        string Firstname{get;}
        string Lastname {get;}
        string Email {get;}
        string Department {get;}
        private readonly Dictionary<string, int> _grades = new Dictionary<string, int>();

        public IReadOnlyDictionary<string, int> Grades => _grades;

        public Applicant(string firstname, string lastname, string email, string department)
        {
            Firstname = firstname;
            Lastname = lastname;
            Email = email;
            Department = department;
        }
        protected Applicant(Applicant other)
        {
            Firstname = other.Firstname;
            Lastname = other.Lastname;
            Email = other.Email;
            Department = other.Department;
        }
        bool AddGrade(string subject, int value)
        {
            if(
                foreach(KeyValuePair<string, int> x in _grades)
            {

            })
            _grades.Add(subject, value);
            return false;
        }
    }
}