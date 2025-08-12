package Date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class CalendarDemo2 {
    public static void main(String[] args) {
        timeZoneDemo();
        instantDemo();
        zonedDateTimeDemo();
    }

    private static void zonedDateTimeDemo() {

        // Directly by definition
        ZonedDateTime time1 = ZonedDateTime.of(2003, 12, 24, 04, 11, 21, 0, ZoneId.of("Asia/Taipei"));
        System.out.println(time1);

        // Instant + zone -> time
        Instant instant = Instant.ofEpochMilli(0L);
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime time2 = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(time2);

        // Change Time
        ZonedDateTime time3 = time2.withYear(2003);
        System.out.println(time3);

        // Minus time
        ZonedDateTime time4 = time3.minusYears(1);
        System.out.println(time4);

        // Plus time
        ZonedDateTime time5 = time3.plusYears(1);
        System.out.println(time5);

    }

    private static void instantDemo() {
        // Return Instant Object of Current Time
        Instant now = Instant.now();
        System.out.println(now);

        // Return Instant Object based on s/ms/ns
        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);

        Instant instant3 = Instant.ofEpochSecond(1L, 1000000000L);
        System.out.println(instant3);

        // Specific Time Zone
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        // isXXX Judgement
        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochMilli(1000L);

        boolean result1 = instant4.isBefore(instant5);
        System.out.println(result1);

        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result2);

        // minus Instant
        Instant instant6 = Instant.ofEpochMilli(3000L);
        System.out.println(instant6);
        Instant instant7 = instant6.minusSeconds(1);
        System.out.println(instant7);
        Instant instant8 = instant6.plusSeconds(1);
        System.out.println(instant8);
    }

    private static void timeZoneDemo() {

        // Return names of all time zones
        Set<String> zoneIDs = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIDs.size());
        System.out.println(zoneIDs);

        // Return default time zone
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        // Return specific time zone
        ZoneId zoneId1 = ZoneId.of("Asia/Shanghai");
        System.out.println(zoneId1);
    }


}
