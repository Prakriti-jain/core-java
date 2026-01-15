package JAVA8;

/*
The Date and Time API introduced in Java 8 is a modern way to handle dates, times, duration and
time zones. It replaced the old java.util.Date and java.util.Calender classes. Key classes in
java.time are LocalDate, LocalTime, LocalDateTime, ZonedDateTime, Instant, Duration, Period etc
 */

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateTime {
    static void main() {
        LocalDate now = LocalDate.now();
        System.out.println("Current Date - " + now);

        LocalDate newDay = LocalDate.of(1888, 12, 12);
        System.out.println("Date created - " + newDay);

        //Local Time
        LocalTime curr = LocalTime.now();
        System.out.println("Current Time - " + curr);
        System.out.println("Current Hour - " + curr.getHour());
        System.out.println("Current Minute - " + curr.getMinute());
        System.out.println("Current Second - " + curr.getSecond());

        //Local Date Time
        LocalDateTime loc = LocalDateTime.now();
        System.out.println("Local Date Time - " + loc);

        //Date Time Formatter
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatted = loc.format(format);
        System.out.println("Formatted Current Date Time - "+ formatted);

        //Instant
        long l = System.currentTimeMillis(); //give current time in milliseconds
        System.out.println("Current milliseconds - " + l);
        Instant ins = Instant.now();
        System.out.println("Current Time with Instant - " + ins);

        //Zoned Date and Time
        ZonedDateTime zone = ZonedDateTime.now();
        System.out.println("Zoned Date Time - " + zone);

        // printing different available time zones
        Set<String> available = ZoneId.getAvailableZoneIds();
        System.out.println(available);


        //Duration
        Instant start = Instant.now();
        int sum = 0;
        for(int i=0 ; i<2_000_000 ; i++) {
            sum += i;
        }
        Instant end = Instant.now();
        Duration dur = Duration.between(start, end);
        System.out.println(dur.toMillis());

    }
}
