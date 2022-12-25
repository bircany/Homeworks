package hw01_02;

public class Q3 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("İsminiz Girin(Bircan): ");
        String first = input.nextLine();
        System.out.println("İsminiz Girin(Yılmaz): ");
        String last = input.nextLine();
        // to CanBir IlmazY
        String pigLatinFirst = first.substring(3,4).toUpperCase() + first.substring(4) + first.substring(0,3);
        String pigLatinLast = last.substring(1,2).toUpperCase() + last.substring(2) + last.charAt(0);


        //substring , toUpperCASE,equalsIgnoreCase,replace some string methods.

        System.out.println(pigLatinFirst + " " + pigLatinLast);
    }
}
