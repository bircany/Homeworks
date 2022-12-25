package Exam_1;

public class Q6
{
    //will be fixing
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Gun girin : ");
        int day = kb.nextInt();

        System.out.print("Ay girin : ");
        int month = kb.nextInt();

        System.out.print("Yıl girin: ");
        int year = kb.nextInt();

        if(isDateValid(day,month,year)){
            //yarım kaldı yetismedi
        }
    }
    public static boolean isDateValid(int day, int month, int year)
    {
        return ((1 <= day && day <= 31) && (1 <= month && month <= 12) && (day <= monthDays(month, year)));
    }
    public static int monthDays(int month, int year) {
        int day;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:  //Şubat
                if (isLeapYear(year))
                    day = 29;
                else
                    day = 28;
            default :
                day = 31;
        }
        return day;
    }
    public static boolean isLeapYear(int year)
    {
        if ((year % 4 == 0 && year % 100 == 0) || (year % 400 == 0))
        {
            return true;
        }
        return false;
    }
}

