package hw01_02;

public class Q6
{
    public static void main(String[] args)
    {
        test();
    }
    static void test()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter the gearSize : ");
        double gearSize = input.nextDouble();
        System.out.println("Enter the Cadance : ");
        double cadence = input.nextDouble();
        findSpeed(gearSize,cadence);
    }
    static void findSpeed(double gearSize,double cadence)
    {
        double inchToMile =(1./12)*(1./5280);
        double speedMPH =  gearSize * 3.14 * inchToMile * cadence * 60;
        System.out.printf("Speed : %f (mph)", speedMPH);
    }
}
