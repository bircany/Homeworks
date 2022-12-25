package hw01_02;

public class Q10
{
    public static void main(String[] args)
    {
        test();
    }
    public static void test()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double mgOfCafeinToDie = 10000;
        System.out.print("Enter the caffeine(mg) of 12 ounce of coke : ");
        int caffeinOfCoke = input.nextInt();
        System.out.print("Enter the caffeine(mg) of 16 ounce cup of coffee : ");
        int caffeinOfCoffee = input.nextInt();
        findLimit(mgOfCafeinToDie,caffeinOfCoke,caffeinOfCoffee);
    }
    public static void findLimit(double mgOfCafeinToDie,int caffeinOfCoke,int caffeinOfCoffee)
    {
        double cokeToDie = mgOfCafeinToDie / caffeinOfCoke;
        double coffeToDie = mgOfCafeinToDie / caffeinOfCoffee;
        System.out.println("Your drink of coke limit is : " + cokeToDie);
        System.out.println("Your cup of coffee limit is : " + coffeToDie);
    }
}