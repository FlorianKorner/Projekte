using Microsoft.EntityFrameworkCore;
using System.Linq;
using TeamsManager.Application.Infrastructure;
using Xunit;

namespace TeamsManager.Test
{
    [Collection("Sequential")]
    public class TeamsContextTests
    {
        private TeamsContext GetDatabase(bool deleteDb = false)
        {
            var db = new TeamsContext(new DbContextOptionsBuilder()
                 .UseSqlite("Data Source=Teams.db")
                 .Options);
            if (deleteDb)
            {
                db.Database.EnsureDeleted();
                db.Database.EnsureCreated();
            }
            return db;
        }
        [Fact]
        public void CreateDatabaseSuccessTest()
        {
            using var db = GetDatabase(deleteDb: true);
        }

        [Fact]
        public void SeedDatabaseTest()
        {
            using var db = GetDatabase(deleteDb: true);
            db.Seed();
            // Multiple assert statements should be avoided in real unit tests, but in this case
            // the database is tested, not the program logic.
            Assert.True(db.Students.Count() == 10);
            Assert.True(db.Teams.Count() == 10);
            Assert.True(db.Teachers.Count() == 10);
            Assert.True(db.HandIns.Count() == 20);
            Assert.True(db.Tasks.Count() == 10);
        }
    }
}
