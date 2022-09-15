using System;
using System.Collections.Generic;
using System.Diagnostics;

namespace OopDemo.App
{

    class Program
    {
        static void Main(string[] args)
        {
            var lotteryTipp = new LotteryTip(new int[] { 1, 2, 3, 4, 5, 6 });
            var correctNumbers = lotteryTipp.NumbersCorrect(LotteryTip.GenerateNumbers());
            Console.WriteLine($"{correctNumbers} numbers are correct.");

            var students = new List<Student>
            {
                new Student("Firstname1", "Lastname1"),
                new Student("Firstname2", "Lastname2")
            };
            var schoolclass = new Schoolclass("3EHIF", students);
            schoolclass.AddStudent(new Student("Firstname3", "Lastname3"));
        }
    }
}
