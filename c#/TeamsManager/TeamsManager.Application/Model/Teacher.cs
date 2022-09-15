using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace TeamsManager.Application.Model
{
    [Table("Teacher")]       // EF Core Annotation for a specific table name.
    public class Teacher
    {
        public Teacher(string firstname, string lastname, string email)
        {
            Firstname = firstname;
            Lastname = lastname;
            Email = email;
        }
#pragma warning disable CS8618 // Non-nullable field must contain a non-null value when exiting constructor. Consider declaring as nullable.
        protected Teacher() { }
#pragma warning restore CS8618 // Non-nullable field must contain a non-null value when exiting constructor. Consider declaring as nullable.
        public int Id { get; private set; }             // private set, PK

        [MaxLength(255)]                                // Produces NVARCHAR(255) in SQL Server
        public string Firstname { get; set; }

        [MaxLength(255)]                                // Produces NVARCHAR(255) in SQL Server
        public string Lastname { get; set; }

        [MaxLength(255)]                                // Produces NVARCHAR(255) in SQL Server
        public string Email { get; set; }

    }
}