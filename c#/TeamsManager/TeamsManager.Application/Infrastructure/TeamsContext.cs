using Bogus;
using TeamsManager.Application.Model;
using Microsoft.EntityFrameworkCore;
using System;
using System.Linq;
using Task = TeamsManager.Application.Model.Task;

namespace TeamsManager.Application.Infrastructure
{
    public class TeamsContext : DbContext
    {
        public TeamsContext(DbContextOptions opt) : base(opt) { }
        /* TODO: Add your DbSets here */

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.Entity<HandIn>()
                .HasIndex(o => new { o.StudentId, o.TaskId })
                .IsUnique();
        }
        public DbSet<Teacher> Teachers => Set<Teacher>();
        public DbSet<Team> Teams => Set<Team>();
        public DbSet<Student> Students => Set<Student>();
        public DbSet<Task> Tasks => Set<Task>();
        public DbSet<HandIn> HandIns => Set<HandIn>();

        public void Seed()
        {
            Randomizer.Seed = new Random(2145);

            var teachers = new Faker<Teacher>("de").CustomInstantiator(f => new Teacher(
                firstname: f.Name.FirstName(),
                lastname: f.Name.LastName(),
                email: f.Internet.Email()))
                .Generate(10)
                .ToList();
            Teachers.AddRange(teachers); SaveChanges();

            var students = new Faker<Student>("de").CustomInstantiator(f => new Student(
                firstname: f.Name.FirstName(),
                lastname: f.Name.LastName(),
                email: f.Internet.Email()))
                .Generate(10)
                .ToList();
            Students.AddRange(students); SaveChanges();

            var teams = new Faker<Team>("de").CustomInstantiator(f => new Team(
                name: f.Commerce.ProductName(),
                schoolclass: $"{f.Random.Int(1, 5)}{f.Random.String2(1, "ABC")}HIF"))
                .Generate(10)
                .ToList();
            Teams.AddRange(teams); SaveChanges();

            var tasks = new Faker<Task>("de").CustomInstantiator(f => new Task(
                subject: f.Commerce.ProductMaterial(),
                title: f.Commerce.ProductAdjective(),
                team: f.Random.ListItem(teams),
                teacher: f.Random.ListItem(teachers),
                expirationDate: new DateTime(2021, 1, 1).AddDays(f.Random.Int(0, 4 * 30))))
                .Rules((f, t) => t.MaxPoints = f.Random.Int(16, 48).OrNull(f, 0.5f))
                .Generate(10)
                .ToList();
            Tasks.AddRange(tasks); SaveChanges();


            var handIns = new Faker<HandIn>("de").CustomInstantiator(f => new HandIn(
                    task: f.Random.ListItem(tasks),
                    student: f.Random.ListItem(students),
                    date: new DateTime(2021, 1, 1).AddDays(f.Random.Int(0, 4 * 30))))
                .Rules((f, h) =>
                {
                    var reviewDate = h.Date.AddDays(f.Random.Int(1, 7)).OrNull(f, 0.5f);
                    h.ReviewDate = reviewDate;
                    h.Points = reviewDate.HasValue && h.Task.MaxPoints.HasValue ? 
                        f.Random.Int(0, h.Task.MaxPoints.Value) : null;
                })
                .Generate(40)
                .GroupBy(h => new { h.TaskId, h.StudentId })
                .Select(g => g.First())
                .Take(20)
                .ToList();
            HandIns.AddRange(handIns); SaveChanges();
        }
        
    }

}
