package hw05;

public class WeightOfMoon
{
    /**
     * Weight on earth = (1 kg) * (9.81 m/s2) = 9.81 N
     * Weight on moon = Weight on Earth / 6 = 1.64 N
     */

    public static void main(String[] args)
    {
        test();
    }
    public static void test()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        while(true){
            System.
                    out.println("Enter mass of a car in kilograms : ");
            double mass = kb.nextDouble();
            System.out.println("Choose the option (moon, earth , exit)");
            String option = kb.next();
            if (!option.equalsIgnoreCase("moon") && !option.equalsIgnoreCase("earth") || option.equalsIgnoreCase("exit"))
                break;

            System.out.printf("mass of your car: %fN %n", calculateWeight(mass, option) );
        }
    }
    public static double calculateWeight(double mass, String option)
    {
        double result = mass * (9.81);
        if (option.equalsIgnoreCase("moon"))
            result = result / 6;
        return result;
    }
}
