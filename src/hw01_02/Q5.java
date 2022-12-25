package hw01_02;

public class Q5 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("enter (hate you): ");
        String string1 = input.nextLine();

        String string2 = string1.replace("hate","*****");
        System.out.println(string2);
    }
}
