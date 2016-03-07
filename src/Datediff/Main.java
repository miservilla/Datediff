package Datediff;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter date1: ");
        String date1 = scanner.next();
        System.out.println("Please enter date2: ");
        String date2 = scanner.next();
        int dateDiff;
        dateDiff = getDateDiff(date1, date2, TimeUnit.DAYS);
    }
    public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInDays = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInDays, TimeUnit.DAYS);
    }
}
