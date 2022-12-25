package hw03_04;

public class NLoop
{
    public static void main(String[] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("How many times you want to loop through:");
        int n = kb.nextInt();
        System.out.println("----------");
        for (int i = 0; i < n--;)
        {
            System.out.println(n);
        }
        System.out.printf("n = %d", n);
    }
}

