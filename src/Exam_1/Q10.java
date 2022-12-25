package Exam_1;

public class Q10
{
    public static void main(String[] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("e sayısının üs değeri : ");
        double x = kb.nextDouble();
        double sum = 0;
        for(int j = 0; j <= x; j++)
        {
            sum += pow(x,j) / factorial(j);
        }
        System.out.printf("Exponential değeri %.2f ",sum);
    }
    public static double pow(double a, double b)
    {
        double result = 1;
        for (int i = 0; i < b; i++)
        {
            result *= a;
        }
        return result;
    }
    public static double factorial(double a)
    {
        double fact = 1;
        for(int i = 1; i <= a; i++)
        {
            fact *= i;
        }
        return fact;
    }
}

