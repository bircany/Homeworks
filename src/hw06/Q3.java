package hw06;

public class Q3
{
    public static void main(String[] args)
    {
        test();
    }
    static void test()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Bir Çift Sayı Girin : ");
        int number = kb.nextInt();
        findPrimes(number);

    }
    static void findPrimes(int number)
    {
        while (number > 1)
        {
            while (number % 2 == 0)
            {
                number /= 2;
                System.out.print(2 + " ");
            }
            while (number % 3 == 0)
            {
                number /= 3;
                System.out.print(3 + " ");
            }
            while (number % 5 == 0)
            {
                number /= 5;
                System.out.print(5 + " ");
            }
            while (number % 7 == 0)
            {
                number /= 7;
                System.out.println(7 + " ");
            }
            for (int i = 11; i > number / 2; i += 2)
            {
                if (number % i == 0)
                {
                    number /= i;
                    System.out.println(i + " ");
                    break;
                }
            }
        }
    }
}
