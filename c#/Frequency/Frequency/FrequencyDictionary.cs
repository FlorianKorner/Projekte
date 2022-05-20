using System;
using System.IO;
using System.Linq;
using System.Collections.Generic;

namespace Frequency
{
    class FrequencyDictionary
    {
        static void Main()
        {
        // from: https://docs.microsoft.com/en-us/troubleshoot/dotnet/csharp/read-write-text-file
            String? line;
            var frequency = new Dictionary<string, int>();
            try
            {
                StreamReader sr = new(@"data\shakespeare.txt");
                var charsToRemove = new string[] { ".", ",", "!", "?", "'"};
                line = sr.ReadLine();
             
                while (line != null)
                {
                    foreach (var c in charsToRemove)
                    {
                        line = line.Replace(c, string.Empty);
                    }
                    string[] words = line.Split(" ");
                    for (int i = 0; i < words.Length; i++)
                    {
                        if (frequency.ContainsKey(words[i]))
                        {
                            frequency[words[i]] = frequency[words[i]] + 1;
                        } else
                        {
                            frequency.Add(words[i], 1);
                        }
                    }
                    line = sr.ReadLine();

                }
                sr.Close();
                Console.ReadLine();
            }
            catch (Exception e)
            {
                Console.WriteLine("Exception: " + e.Message);
            }
            finally
            {

                List<string> frequencyA = new List<string>(frequency.Keys);
                frequencyA.Sort(
                    );
                Console.WriteLine("Alphabetically");
                for (int i = 0; i < frequencyA.Count; i++)
                {
                    Console.WriteLine(frequencyA[i] + "  :  " + frequency[frequencyA[i]]);
                }

                var myList = frequency.ToList();

                myList.Sort((pair1, pair2) => pair1.Value.CompareTo(pair2.Value));
                Console.WriteLine("\n\n\n\n\n");
                Console.WriteLine("Frequency");
                for (int i = 0; i < myList.Count; i++)
                {
                    Console.WriteLine(myList[i].Key + "  :  " + myList[i].Value);
                }
                Console.WriteLine("Executing finally block.");
            }
        }
    }
}
