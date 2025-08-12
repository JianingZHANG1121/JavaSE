package Date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CalendarDemo5 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthDate = LocalDate.of(2004, 11, 21);
        System.out.println(birthDate);

        // Period: yyyy, MM, dd
        Period period = Period.between(birthDate, today);

        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println(period.toTotalMonths());

        // ----------------------------------------------
        LocalDateTime today1 = LocalDateTime.now();
        System.out.println(today1);

        LocalDateTime birthDate1 = LocalDateTime.of(2004, 11, 21, 0, 0, 0);
        System.out.println(birthDate1);

        // Duration: dd, HH, mm, ss
        Duration duration = Duration.between(birthDate1, today1);

        System.out.println(duration);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());

        // ChronoUnit: all
        System.out.println(ChronoUnit.YEARS.between(birthDate1,today1));
        System.out.println(ChronoUnit.MONTHS.between(birthDate1,today1));
        System.out.println(ChronoUnit.WEEKS.between(birthDate1,today1));
        System.out.println(ChronoUnit.DAYS.between(birthDate1,today1));
        System.out.println(ChronoUnit.HOURS.between(birthDate1,today1));
        System.out.println(ChronoUnit.MINUTES.between(birthDate1,today1));
        System.out.println(ChronoUnit.SECONDS.between(birthDate1,today1));
        System.out.println(ChronoUnit.MILLIS.between(birthDate1,today1));
        System.out.println(ChronoUnit.MICROS.between(birthDate1,today1));
        System.out.println(ChronoUnit.NANOS.between(birthDate1,today1));
        System.out.println(ChronoUnit.HALF_DAYS.between(birthDate1,today1));
        System.out.println(ChronoUnit.DECADES.between(birthDate1,today1));
        System.out.println(ChronoUnit.CENTURIES.between(birthDate1,today1));
        System.out.println(ChronoUnit.MILLENNIA.between(birthDate1,today1));
        System.out.println(ChronoUnit.ERAS.between(birthDate1,today1));



    }
}
