using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace TeamsManager.Application.Model
{
    [Table("Team")]       // EF Core Annotation for a specific table name.
    public class Team
    {
        public Team(string name, string schoolclass)
        {
            Name = name;
            Schoolclass = schoolclass;
        }
#pragma warning disable CS8618 // Non-nullable field must contain a non-null value when exiting constructor. Consider declaring as nullable.
        protected Team() { }
#pragma warning restore CS8618 // Non-nullable field must contain a non-null value when exiting constructor. Consider declaring as nullable.
        public int Id { get; private set; }

        [MaxLength(64)]                                    // Produces NVARCHAR(255) in SQL Server
        public string Name { get; private set; }            // private set, PK (unique)

        [MaxLength(16)]                                    // Produces NVARCHAR(255) in SQL Server
        public string Schoolclass { get; set; }
    }
}