package hw05;

//will be fixing
public class Inflation
{
    public static void main(String[] args)
    {
        display();
    }
    public static void display()
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("What is a now cost of Item: ");
        double price = scanner.nextInt();
        System.out.print("How Many Years Next Price Do You Want?: ");
        int years = scanner.nextInt();
        System.out.print("Enter the annual inflation rate(Ex.. if %20 you must write 20): ");
        double interest = scanner.nextDouble() / 100;
        System.out.printf("Your product's cost %f , inflation rate %f in %d years later.", inflator(price, years, interest), interest, years);
    }
    public static double inflator(double price, int years, double interest)
    {
        double newPrice = 0;
        for (int i = 0; i < years; i++)
        {
            newPrice = price + (price * interest);
        }
        return newPrice;
    }
}

