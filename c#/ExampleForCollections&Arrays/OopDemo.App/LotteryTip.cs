using System;
using System.Security.Cryptography;

namespace OopDemo.App
{
    class LotteryTip
    {
        private readonly int[] _numbers;
        private const int _numberCount = 6;
        public LotteryTip(int[] numbers)
        {
            if (numbers.Length != _numberCount)
            {
                // nameof(numbers) -> "numbers"
                throw new ArgumentException("Not 6 numbers", nameof(numbers));
            }
            _numbers = numbers;
        }
        public int NumbersCorrect(int[] drawnNumbers)
        {
            int correctNumbers = 0;
            // 36 compare operations
            for (int i = 0; i < _numberCount; i++)
                for (int j = 0; j < _numberCount; j++)
                {
                    if (_numbers[i] == drawnNumbers[j])
                    {
                        correctNumbers++;
                        break;
                    }
                }
            return correctNumbers;
        }
        public static int[] GenerateNumbers()
        {
            var generator = RandomNumberGenerator.Create();
            var bytes = new byte[1];
            var result = new int[_numberCount];

            for (int i = 0; i < result.Length; i++)
            {
                generator.GetBytes(bytes);
                if (bytes[0] >= 225) { i--; continue; }
                result[i] = (bytes[0] % 45) + 1;  // 0 ... 44
            }
            return result;
        }
    }
}
