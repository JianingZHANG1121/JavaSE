package Date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CalendarDemo3 {
    public static void main(String[] args) {

        // Get Time Object
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

        // Format
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");

        System.out.println(dtf.format(time));

    }
}
