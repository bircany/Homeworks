package Exam_1;

public class Q5
{
    public static void main(String[] args)
    {
        test();
    }
    static void test()
    {
        // y = ax^2 + bx + c
        // Delta = b^2 - 4*a*c
        // x = -b +- (delta^1/2 )/ 2a;
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("x^2 li terimin katsayısı : ");
        double a = kb.nextInt();
        System.out.println("x li terimin katsayısı : ");
        double b = kb.nextInt();
        System.out.println("sabit terim : ");
        double c = kb.nextInt();
        findRoot(a,b,c);
    }
    public static void findRoot(double a , double b , double c)
    {
        double delta = b * b - 4 * a * c;
        double x1 = -b + pow(delta, 0.5) / 2 * a;
        double x2 = -b - pow(delta, 0.5) / 2 * a;
        if (delta > 0)
            System.out.printf("Denklemin iki kökü vardır x1  = %.2f  , x2 = %.2f ", x1, x2);
        else if (delta == 0)
        {
            System.out.println("Diskrimant Tek(Eşit İki Kök) Kökü vardır , x1 = x2");
            System.out.printf("%.2f = %.2f ", x1, x2);
        }
        else
            System.out.println("Diskrimantın reel kökü yoktur.");
    }
    public static double pow(double a, double b)
    {
        double result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}

