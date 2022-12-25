package hw01_02;

public class Q7
{
    public static void main(String[] args)
    {
        test();
    }
    static void test()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Enter Second :");
        findTime(kb.nextInt());
    }
    static void findTime(int seconds)
    {
        int hours = seconds / 3600;
        seconds %= 3600;
        int minutes = seconds / 60;
        seconds %= 60;
        System.out.printf("%d:%d:%d%n",hours,minutes,seconds);
        System.out.printf("%d hours , %d minutes , %d seconds ",hours,minutes,seconds);

    }
}