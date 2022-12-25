package hw05;

public class Babylonian
{
    public static void main(String[] args)
    {
        display();
    }
    public static void display(){
        java.util.Scanner kb = new java.util.Scanner(System.in);

        while(true)
        {
            System.out.println("Enter a positive Number : ");
            double a = kb.nextDouble();
            if(a <= 0)            // if a doesn't a positive number this program sholdn't run.
                break;
            else
                System.out.printf("Square root of %f is %f%n", a , squareRoot(a));
        }
    }
    public static double squareRoot(double a)
    {
        double guess = a / 2;
        double newGuess;
        do
        {
            newGuess = guess;
            double r = a / guess;
            guess = (guess + r) / 2;
        } while ((newGuess - guess) >= 0.01);
        return guess;
    }
}
