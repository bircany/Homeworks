package hw03;

public class IsPrime {
    public static void main(String[] args)
    {
        test();
    }

    public static void test()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Sayi giriniz:");
        int val = kb.nextInt();
        if(isPrime(val))
            System.out.printf("%d. Asal Sayidir.",getPrimeIndex(val));
        else
            System.out.printf("%d Asal Sayı Değildir.",getPrimeIndex(val));
    }

    public static int getPrimeIndex(int val)
    {
        int count = 1;
        for (int i = 0; i <= val; i += 2)
        {
            if (isPrime(i))
                count++;
        }
        return count;
    }
    public static boolean isPrime(long val) {
        if(val <= 1)
            return false;
        if(val % 2 == 0)
            return val == 2;
        for(long i = 3; i*i < val; i += 2)
        {
            if(val % i == 0)
                return false;

        }
        return true;
    }
}

