package hw06;

public class Q4
{
    public static void main(String[] args)
    {
        /////KOD HATALII!!!
        test();
    }
    static void test()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Height Girin :");
        int height = kb.nextInt();
        design(height);
    }
    static void design(int height)
    {
        for(int i = 0;i <=height;i++){
            for (int k = 0; k < height / 2; k++) {
                System.out.print("|");

                for (int j = 0; j <= 6; j++) {
                    if (j == k)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                System.out.println("|");
            }
            for (int k = 7; k < height-1; k++) {
                System.out.print("|");
                {
                    for (int j = 12; j >= 6; j--) {
                        if (j == k)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println("|");
                }
            }
        }
    }
}

