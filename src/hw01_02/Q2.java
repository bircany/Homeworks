package hw01_02;

public class Q2
{
    public static void main(String[] args)
    {
        test();
    }
    static void test()
    {
        int ticket;
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("How many tickets do you have: ");
        ticket = input.nextInt();
        market(ticket);
    }
    static void market(int ticket)
    {
        int candyBar , gumball;
        candyBar = ticket / 10;
        ticket = ticket % 10;
        gumball = ticket / 3;
        ticket = ticket % 3;

        System.out.printf("Number of Candy Bars you can buy: %d, Number of Gumball you can buy: %d, Remaining Tickets: %d", candyBar, gumball, ticket);
    }
}
