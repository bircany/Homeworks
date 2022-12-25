package hw01_02;

public class Q9 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int minWeight = 110;
        System.out.println("Enter your height(feet): ");
        int heightFeet = input.nextInt();
        System.out.println("Enter your Inches(feet)");
        int addInch = input.nextInt();
        findIdeal(minWeight, heightFeet, addInch);
    }

    public static void findIdeal(int minWeight, int heightFeet, int addInch) {
        int poundforFeet = minWeight / 5;   // 1 feet = 12 inches
        int poundforAddInch = minWeight / poundforFeet;
        int idealBodyWeight = (heightFeet * poundforFeet) + (addInch * poundforAddInch);
        System.out.printf("Ideal body weight for this person %d pounds ", idealBodyWeight);
    }
}
