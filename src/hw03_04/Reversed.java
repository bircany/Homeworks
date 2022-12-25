package hw03_04;

public class Reversed
{
     /*
Write a method named reversed that will take an int argument and returns reverse of argument.
        123 -> 3 -> 3 * 10 + 2 = 32 -> 32 * 10 + 1 = 321
     */
    public static void main(String[] args)
    {
        test();
    }
    public static void test()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Number:");
        for (int val ; (val = kb.nextInt()) != 0;)
        {
            System.out.printf("%d -> reversed: %d%n", val, reversed(val));
            System.out.println("Number:");
        }
    }
    public static int reversed(int val) // 123
    {
        int result;
        for (result = 0;val != 0; val /= 10) // 123 12 1
        {
            result = result * 10 + val % 10 ; // 3 32 321
        }
        return result;
    }
}

