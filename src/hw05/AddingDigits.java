package hw05;

public class AddingDigits
{
        public static void main(String[] args)
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);
            System.out.println("Sayı Girin : ");
            int a = kb.nextInt();
            System.out.printf("Girdiğiniz %d sayısının , rakamları toplamı = %d", a, addDigits(a));
        }
        public static int addDigits(int a)
        {
            int sum = 0;
            for (int i = 0; i < countDigits(a); i++)
            {
                int digit = a % 10;
                sum += digit;
                a /= 10;
            }
            return sum;
        }
        public static int countDigits(int a)
        {
            int count = 0;
            do
            {
                a /= 10;
                count++;
            } while (a > 0);
            System.out.println(count);
            return count;
        }
    }

