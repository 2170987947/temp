package test0601;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int pYear = in.nextInt();
            int pMonth = in.nextInt();
            int pDay = in.nextInt();
            int nYear = in.nextInt();
            int nMonth = in.nextInt();
            int nDay = in.nextInt();
            int profit = 0;
            if (pYear == nYear) {
                profit = year(nYear, nMonth, nDay, months) - year(pYear, pMonth, pDay - 1, months);
            } else if (pYear != nYear) {
                profit = year(nYear, nMonth, nDay, months) + year(pYear, 12, 31, months) - year(pYear, pMonth, pDay - 1, months);
                for (int i = pYear + 1; i < nYear; i++) {
                    profit += year(i, 12, 31, months);
                }
            }
            System.out.println(profit);
        }
    }

    private static int money(int month) {
        switch (month) {
            case 1: case 4: case 6: case 8: case 9: case 10: case 12:
                return 2;
            case 2: case 3: case 5: case 7: case 11:
                return 1;
            default: return 0;
        }
    }
    private static int year(int year, int month, int day, int[] months) {
        int day1 = 0;
        for (int i = 0; i< month - 1; i++) {
            int money = money(i + 1);
            day1 += months[i] * money;
        }
        day1 += day * money(month);
        if (month >= 2 && isRunYear(year)) {
            day1 += 1;
        }
        return day1;
    }

    private static boolean isRunYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            }
            if (year % 400 == 0) {
                return true;
            }
        }
        return false;
    }
}
