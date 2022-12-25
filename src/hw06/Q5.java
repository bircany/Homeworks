package hw06;

public class Q5
{
    public static void main(String[] args)
    {
        test();
    }
    static void test()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("2 den büyük bir çift sayı girin : ");
        int number = kb.nextInt();
        display(number);
    }
    public static void display(int number)
    {
        if(number % 2 == 0){
            for (int i = 2; i < number / 2; i++)
            {
                if (isPrime(i) && isPrime(number - i))
                    System.out.println(i + "+" + (number - i));
            }
        }
        else
            System.out.println("Girdiğiniz Sayı Tek Sayı ..");
    }

    public static boolean isPrime(long val)
    {
        if (val <= 1)
            return false;
        if (val % 2 == 0)
            return val == 2;
        if (val % 3 == 0)
            return val == 3;
        if (val % 5 == 0)
            return val == 5;
        if (val % 7 == 0)
            return val == 7;
        for (long i = 11; i * i < val; i += 2)
        {
            if (val % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}

