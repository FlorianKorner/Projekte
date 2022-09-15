using Microsoft.EntityFrameworkCore;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace TeamsManager.Application.Model
{
    [Table("HandIn")]       // EF Core Annotation for a specific table name.
    public class HandIn
    {
        public HandIn(Task task, Student student, DateTime date)
        {
            Task = task;
            TaskId = task.Id;
            Student = student;
            StudentId = student.Id;
            Date = date;
        }
#pragma warning disable CS8618 // Non-nullable field must contain a non-null value when exiting constructor. Consider declaring as nullable.
        protected HandIn() { }
#pragma warning restore CS8618 // Non-nullable field must contain a non-null value when exiting constructor. Consider declaring as nullable.
        public int Id { get; set; }             //PK
        public int TaskId { get; set; }
        public Task Task { get; set; }
        public int StudentId { get; set; }
        public Student Student { get; set; }            // unique due to the constraint in Model.TeamsContext.cs
        public DateTime Date { get; set; }
        public DateTime? ReviewDate { get; set; }
        public int? Points { get; set; }
    }
}