package hw05;

public class Debt
{
    public static void main(String[] args)
    {
        test();
    }
    public static void test()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("What is the price of the product you bought (the price you owe the bank) ? : ");
        double debt = kb.nextDouble();
        calculatePayment(debt);
    }
    public static void calculatePayment(double debt)
    {
        double monthlyInterest = 0.015;
        double monthlyPay = 50;
        double totalInterested = 0;
        int monthCount;
        for (monthCount = 0; debt > 0; monthCount++)
        {
            totalInterested += debt * monthlyInterest;
            debt = debt - (monthlyPay - (debt * monthlyInterest));
            if (debt <= 50)
                monthlyPay = debt + debt * monthlyInterest;
        }
        System.out.printf("Sum Of Interests: %.2f%n", totalInterested);
        System.out.printf("Total months: %d", monthCount);
    }
}
