package Datediff;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String textDate1 = in.next();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate parsedDate1 = LocalDate.parse(textDate1, DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate date1 = LocalDate.of(2015, Month.DECEMBER, 18);
        LocalDate date2 = LocalDate.of(2016, Month.MARCH, 3);

        Period p = Period.between(date1, date2);
        long p2 = ChronoUnit.DAYS.between(date1, date2);
        System.out.println(p2 + " days gone by.");
        System.out.println(parsedDate1);
    }
}
