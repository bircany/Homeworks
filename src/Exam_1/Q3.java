package Exam_1;

public class Q3
{
    public static void main(String[] args)
    {
        isArmstrong();
    }
    static void isArmstrong()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Sayı Girin : ");
        int a = kb.nextInt();
        for (int i = factorial(a) + 1; i < 1_000_000; i++)
        {
            if (i == findArmstrong(i))
            {
                System.out.printf("Faktoriyeli alınan sayıdan sonraki ilk armstrong sayı %d ", findArmstrong(i));
                break;
            }
        }
    }
    public static int findArmstrong(int i)
    {
        int digit = countDigits(i);
        int temp = digit;
        int result = 0;
        while (temp > 0)
        {
            result += pow(i % 10, digit);
            i /= 10;
            temp--;
        }
        return result;
    }
    public static int factorial(int a)
    {
        int fact = 1;
        for (int i = 1; i <= a; i++)
        {
            fact *= i;
        }
        return fact;
    }
    public static int countDigits(int i)
    {
        int count = 0;
        do
        {
            i /= 10;
            count++;
        } while (i > 0);
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

