package hw06;

public class Q2
{
    public static void main(String[] args)
    {
        test();
    }
    static void test()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Saniye Cinsinden Süreyi Girin : ");
        long second = kb.nextLong();
        displayDuration(second);
    }
    public static void displayDuration(long second)
    {
        while(true)
        {
            if(second > 3600)
            {
                long hour = second / 3600;
                second %= 3600;

                if(second > 60)
                {
                    long minutes = second / 60;
                    second %= 60;
                    System.out.println(hour + ":" + minutes + ":" + second);
                }
                else
                    break;
            }
            else
                break;
        }
    }
}
