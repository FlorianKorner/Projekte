using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace TeamsManager.Application.Model
{
    [Table("Task")]       // EF Core Annotation for a specific table name.
    public class Task
    {
        public Task(string subject, string title, Team team, Teacher teacher,
                    DateTime expirationDate)
        {
            Subject = subject;
            Title = title;
            TeamName = team.Name;
            Team = team;
            TeacherId = teacher.Id;
            Teacher = teacher;
            ExpirationDate = expirationDate;
        }
#pragma warning disable CS8618 // Non-nullable field must contain a non-null value when exiting constructor. Consider declaring as nullable.
        protected Task() { }
#pragma warning restore CS8618 // Non-nullable field must contain a non-null value when exiting constructor. Consider declaring as nullable.
        public int Id { get; private set; }

        [MaxLength(255)]                                // Produces NVARCHAR(255) in SQL Server
        public string Subject { get; set; }

        [MaxLength(255)]                                // Produces NVARCHAR(255) in SQL Server
        public string Title { get; set; }

        [MaxLength(255)]                                // Produces NVARCHAR(255) in SQL Server
        public string TeamName { get; set; }
        public Team Team { get; set; }
        public int TeacherId { get; set; }
        public Teacher Teacher { get; set; }
        public DateTime ExpirationDate { get; set; }
        public int? MaxPoints { get; set; }
    }
}