package hw03_04;

public class CountDigits
{
    /*
    Write a method named countDigits that will take an int argument and returns total digits count.
*/
    public static void main(String[] args)
    {
        test();
    }
    public static void test()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Number:");
        int val = abs(kb.nextInt());

        if (val != 0)
            System.out.printf("%d -> total digits count: %d", val, countDigits(val));
        else
            System.out.println("Invalid input (now)");
    }

    public static int countDigits(int val)
    {
        int count;
        for (count = 0 ; val > 0 ; ++count)
        {
            val /= 10;
        }
        return count;
    }
    public static int abs(int x)
    {
        return x < 0 ? -x : x;
    }
}

