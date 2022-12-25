package hw01_02;

public class Q8
{
    public static void main(String[] args)
    {
        test();
    }
    static void test()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter the distance : ");
        double DISTANCE = input.nextDouble();
        System.out.println("This program calculates your pace given a time" + "and distance traveled.");
        System.out.println("Enter the Time : ");
        double time = input.nextDouble();
        findPace(time,DISTANCE);
    }
    static void findPace(double time , double DISTANCE)
    {
        double pace = time / DISTANCE;
        System.out.printf("Your pace is %f miles per hour.", pace);
    }
}