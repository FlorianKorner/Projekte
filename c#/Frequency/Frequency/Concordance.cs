using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;
using System.Text.RegularExpressions;

namespace Frequency
{
    class Concordance
    {
        class WordsData
        {
            public uint Count = 1;
            public List<uint> Lines = new();
        }

        /*
         static void Main(string[] args)
        {
            // from: https://docs.microsoft.com/en-us/troubleshoot/dotnet/csharp/read-write-text-file
            try
            {
                SortedDictionary<string, WordsData> wordsDictionary = new();
                StreamReader sr = new(@"data\shakespeare.txt");
                Regex reg = new("[^a-zA-Z' ]");

                uint lineNumber = 0;
                string? line;
                while ((line = sr.ReadLine()) != null)
                {
                    var words = reg.Replace(line, string.Empty).ToLower().Split(" ");

                    foreach (var word in words)
                    {
                        if (wordsDictionary.ContainsKey(word))
                            wordsDictionary[word].Count += 1;
                        else
                            wordsDictionary[word] = new WordsData();

                        if (!wordsDictionary[word].Lines.Contains(lineNumber))
                            wordsDictionary[word].Lines.Add(lineNumber);
                    }

                    lineNumber++;
                }

                wordsDictionary.Remove("");

                Console.WriteLine(string.Join("\n", wordsDictionary.Keys));
                Console.WriteLine();

                var res = wordsDictionary
                    .OrderBy(x => x.Value.Count)
                    .Reverse()
                    .ToDictionary(x => x.Key, x => x.Value);

                var builder = new StringBuilder();
                foreach (var (key, value) in res)
                {
                    builder.Append($"{key}  {value.Count}\n");
                }
                Console.WriteLine(builder);

                builder.Clear();
                foreach (var (key, value) in wordsDictionary)
                {
                    builder.Append($"{key} {string.Join(", ", value.Lines)}\n");
                }
                Console.WriteLine(builder);
            }
            catch (Exception e)
            {
                Console.WriteLine("Exception: " + e.Message);
            }
            finally
            {
                Console.WriteLine("Executing finally block.");
            }
        }
        */
    }
}
