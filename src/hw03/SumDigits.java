package hw03;

public class SumDigits
    {
    /*
         Write a method named sumDigits that will take an int argument and returns sum of all digits.
    */
        public static void main(String[] args)
        {
            test();
        }

        public static void test() {
            java.util.Scanner kb = new java.util.Scanner(System.in);
            System.out.println("Number:");
            int val = kb.nextInt();
            System.out.printf("%d -> sum of digits = %d%n", val, sumDigits(val));
        }
        public static int sumDigits(int val)  // 1123
        {
            int sum;
            for (sum = 0 ; val > 0 ; val /= 10)
            {
                sum += val % 10; // 3 + 2 + 1 + 1 = 7
            }
            return sum;
        }
    }

