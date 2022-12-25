package hw01_02;

public class Q1
{
    public static void main(String[] args)
    {
        test();
    }
    static void test()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter you weight(pound,1kg = 2.2 pound ):  ");
        double weight = input.nextDouble();
        System.out.println("How many minutes did you run: ");
        int runningTime = input.nextInt();
        System.out.println("How many minutes did you play basketball: ");
        int basketballTime = input.nextInt();
        System.out.println("How many minutes did you sleep: ");
        int sleepTime = input.nextInt();
        spendingCalories(runningTime,weight,basketballTime,sleepTime);
    }

    static void spendingCalories(int runningTime ,double weight,int basketballTime,int sleepTime) {
        //Metabolic equivalents
        int running = 10;  //(6MPH)
        int basketball = 8;
        int sleeping = 1;
        double MetConstant = 0.0175;

        double totalRunningCalories = MetConstant * running * runningTime * weight;
        double totalBasketballCalories = MetConstant * basketball * basketballTime * weight;
        double totalSleepingCalories = MetConstant * sleeping * sleepTime * weight;
        display(runningTime,totalRunningCalories,basketballTime,totalBasketballCalories,sleepTime,totalSleepingCalories);
    }

    static void display(int runningTime, double totalRunningCalories, int basketballTime, double totalBasketballCalories, int sleepTime, double totalSleepingCalories) {
        System.out.println("Exercise\t\tTime(min)\tCalories(cal)");
        System.out.println("--------------------------------------");
        System.out.printf("Running%11d\t%f%n", runningTime, totalRunningCalories);
        System.out.printf("Basketball%8d\t%f%n", basketballTime, totalBasketballCalories);
        System.out.printf("Sleeping%11d\t%f%n", sleepTime, totalSleepingCalories);
        System.out.println("--------------------------------------");
        System.out.printf("Total Calories: %f%n", totalRunningCalories + totalBasketballCalories + totalSleepingCalories);
        // \t tab tuşu, \n alt satır'a geçir. %d string ifade içerisine int değer yazdırma,
        // %11d 11 boşluk atla.daha sonra %d değerini yaz. \t tabla yana geçir
        // %f  float değerleri girmesi için , %n prinf kullandığımızda alt satır.
    }
}
