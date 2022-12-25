package hw01_02;

public class Q4
{
    public static void main(String[] args)
    {
        test();
    }
    static void test()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter Current Weight: ");
        int nowWeight = input.nextInt();
        System.out.println("Enter Desired Weight: ");
        int desiredWeight = input.nextInt();
        drinkableSoda(nowWeight,desiredWeight);
    }
    static void drinkableSoda(int nowWeight,int desiredWeight)
    {
        double mouseWeight = 0.2; // kg
        double ToKillMouse = 0.00031; // kg
        int losePound = nowWeight - desiredWeight;

        int needSoda = 8;      //per by 1 pound (1 pound başına 8 soda içilebilir.)
        int needtoDrink = losePound * needSoda;
        double drinkable = (ToKillMouse / mouseWeight) * (desiredWeight / 0.001);

        System.out.printf("You must drink %d soda for %d lose pounds", needtoDrink, losePound);
        System.out.printf("%f soda only drinkable", drinkable);
    }
}
