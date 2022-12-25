package hw05;

public class Armstrong
{
    public static void main(String[] args)
    {
        test();
    }
    public static void test() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        while(true) {
            System.out.println("Enter First Number : ");
            int firstNumber = kb.nextInt();

            System.out.println("Enter Second Number : ");
            int secondNumber = kb.nextInt();

            for (int i = firstNumber; i < secondNumber; i++) {
                isArmstrong(i);
            }
            System.out.println("If you want to exit enter 0");
            if (kb.nextInt() == 0){
                break;
            }
        }
    }
    public static void isArmstrong(int val)
    {
        if (val == algorithm(val))
        {
            System.out.printf("%d sayısı Armstrong Sayıdır.%n", val);
        }
    }
    public static int algorithm(int val)
    {
        int digit = countDigits(val);
        int temp = digit;
        int result = 0;

        while(temp > 0)
        {
            result += pow(val % 10,digit);
            val /= 10;
            temp--;
        }
        return result;
    }
    public static int countDigits(int val)
    {
        int count = 0;
        do {
            val /= 10;
            count++;
        } while (val > 0);
        return count;
    }
    public static int pow(int a, int b)
    {
        int result = 1;
        for (int i = 0; i < b; i++)
        {
            result *= a;
        }
        return result;
    }
}
