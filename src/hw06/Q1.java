package hw06;

public class Q1
{
    public static void main(String[] args)
    {
        test();

    }
    static void test()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("n sayısı girin :");
        int n = kb.nextInt();
        designPattern(n);
    }
    static void designPattern(int n)
    {
        for (int i = 0; i <= n; i++)
        {
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n - 1; i >= 1; i--)
        {
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
