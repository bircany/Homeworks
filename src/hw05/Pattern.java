package hw05;

//will be fixing
public class Pattern
{
    public static void main(String[] args)
    {
        run();
    }
    public static void run()
    {

        String newChar = "";
        String patern =  "";
        display(newChar,patern);
    }
    public static void display(String newChar ,String patern)
    {
        String c = patternDesign(newChar,patern);
        if(c.length() == 5)
            System.out.println("Your Pattern is " + c );
        else
            System.out.println("Your Pattern is not defined.");
    }
    public static String patternDesign(String newChar, String patern)
    {
        for (int i = 0; i < 5; i++)
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);


            String preChar = newChar;
            System.out.println("Enter a color :");
            newChar = kb.next();
            if (!(newChar.equalsIgnoreCase("R") || newChar.equalsIgnoreCase("G") || newChar.equalsIgnoreCase("B"))) {
                System.out.println("You cannot enter a value other than Red , Green , Blue .. Try Again");
                continue;
            }
            if (preChar.equalsIgnoreCase(newChar))
            {
                System.out.println("You cannot enter two same colors in a row");
                continue;
            }

            patern += newChar;
        }
        return patern;
    }
}

