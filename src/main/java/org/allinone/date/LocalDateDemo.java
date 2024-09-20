package org.allinone.date;

import java.time.LocalDate;

public class LocalDateDemo {

    public static void main(String[] args) {

        // LocalDate
        // LocalDate is an immutable class that represents a date without a time zone in the ISO-8601 calendar system.
        // LocalDate is a part of the java.time package.
        // LocalDate class provides various methods to perform operations on dates.

        // Creating a LocalDate
        // We can create a LocalDate using the now() method, of() method, and parse() method.

        // now() method
        // We can create a LocalDate object representing the current date using the now() method.

         LocalDate now = LocalDate.now();
         System.out.println("Current Date: " + now);

        // of() method
        // We can create a LocalDate object using the of() method.

        // LocalDate date = LocalDate.of(2021, 12, 31);
        // System.out.println("Date: " + date);

        // parse() method
        // We can create a LocalDate object using the parse() method.

        // LocalDate date = LocalDate.parse("2021-12-31");
        // System.out.println("Date: " + date);

        // Retrieving the current date
        // We can retrieve the current date using the now() method.

        // LocalDate now = LocalDate.now();
        // System.out.println("Current Date: " + now);

        // Retrieving the year, month, and day
        // We can retrieve the year, month, and day from a LocalDate object using the getYear(), getMonth(), and getDayOfMonth() methods.

        // LocalDate date = LocalDate.now();
        // int year = date.getYear();
        // int month = date.getMonthValue();
        // int day = date.getDayOfMonth();

        // System.out.println("Year: " + year);
        // System.out.println("Month: " + month);
        // System.out.println("Day: " + day);

        // Adding days, months, and years
        // We can add days, months, and years to a LocalDate object using the plusDays(), plusMonths(), and plusYears() methods.

        // LocalDate date = LocalDate.now();

        // LocalDate newDate = date.plusDays(10);
        // System.out.println("Date after adding 10 days: " + newDate);

        // LocalDate newDate = date.plusMonths(2);
        // System.out.println("Date after adding 2 months: " + newDate);

        // LocalDate newDate = date.plusYears(1);
        // System.out.println("Date after adding 1 year: " + newDate);

        // Subtracting days, months, and years
        // We can subtract days, months, and years from a LocalDate object using the minusDays(), minusMonths(), and minusYears() methods.

        // LocalDate date = LocalDate.now();

    }
}
