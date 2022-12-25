package hw05;

public class Fibonacci
{
    /*
     * Fibonacci Sayı Dizisinin ilk 10 terimini bulma
     * int a = 1;
     * int b = 1;
     * int result = 0;
     * for(int i = 0; i<10;i++)
     * {
     *   a = b;
     *   b = result;
     *   result = a+b;
     *   System.out.println(result);
     * }
     */

    public static void main(String[] args)
    {
        display();
    }
    public static void display()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Hello, Welcome the calculator of population growth , (if you wanna exit enter '0')");
        while (true)
        {
            System.out.println("Which day after  do you wanna see the green crud population ? :");
            int days = kb.nextInt();

            System.out.println("Enter the pounds of the current population : ");
            int pound = kb.nextInt();

            if (days== 0 || pound == 0)
                break;
            System.out.printf("The total green crud population in %d days is : %d%n", days, poundCalculator(days, pound));
        }
    }
    public static int poundCalculator(int days, int pound)
    {
        int newPound = 0;
        int sum;
        for (int i = 0; i <= days; i++)
        {
            if (i % 5 == 0)
            {
                sum = newPound + pound;
                pound = newPound;
                newPound = sum;
            }
        }
        return newPound;
    }
}
