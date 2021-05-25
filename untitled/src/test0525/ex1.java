package test0525;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int money = 2;
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            int pYear = in.nextInt();
            int pMonth = in.nextInt();
            int pDay = in.nextInt();
            int nYear = in.nextInt();
            int nMonth = in.nextInt();
            int nDay = in.nextInt();

            int total = 0;
            if (nYear > pYear) {
                isRunYear(pYear, months);
                total += totalMonth(months, pMonth, 12, pDay, 31);
                for (int i = pYear + 1; i < nYear; i++) {
                    total += totalMonth(months, 1, 12, 1, 31);
                }
                total += totalMonth(months, 1, nMonth, 1, nDay);
                System.out.println(total);
            } else if (nYear == pYear) {
                isRunYear(nYear, months);
                total += totalMonth(months, pMonth, nMonth, pDay, nDay);
            }
            System.out.println(total);
        }
    }

    private static int totalMonth(int[] months, int startMonth, int endMonth, int starDay, int endDay) {
        int total = 0;
        if (endMonth > startMonth) {
            isRunYear(endMonth, months);
            int money = isPrimeMonth(startMonth);
            total += (months[startMonth - 1] - starDay + 1) * money;
            for (int i = startMonth + 1; i < endMonth; i++) {
                money = isPrimeMonth(i);
                total += totalDay(1, months[i - 1], money);
            }
            money = isPrimeMonth(endMonth);
            total += totalDay(1, endDay, money);
        } else if (endMonth == startMonth) {
            int money = isPrimeMonth(endMonth);
            total += totalDay(starDay, endDay, money);
        }
        return total;
    }

    private static int totalDay(int startDay, int endDay, int money) {
        return (endDay - startDay + 1) * money;
    }

    private static int isPrimeMonth(int nMonth) {
        if (nMonth == 1 || nMonth == 2) {
            return 1;
        }
        for (int i = 2; i <= Math.sqrt(nMonth); i++) {
            if (nMonth % i == 0) {
                return 1;
            }
        }
        return 2;
    }

    private static void isRunYear(int nYear, int[] months) {
        if (nYear % 100 == 0) {
            if (nYear % 400 == 0) {
                months[1] = 29;
            }
        }
        if (nYear % 4 == 0) {
            months[1] = 29;
        }
    }
}
