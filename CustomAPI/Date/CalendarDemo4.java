package Date;

import java.time.LocalDate;
import java.time.Month;

public class CalendarDemo4 {
    public static void main(String[] args) {

        // Current
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);
        // Directly
        LocalDate ldDate = LocalDate.of(2025, 1, 1);
        System.out.println(ldDate);

        int year = ldDate.getYear();
        System.out.println(year);

        Month month = ldDate.getMonth();
        System.out.println(month);
        int monthValue = ldDate.getMonthValue();
        System.out.println(monthValue);

        System.out.println(ldDate.isBefore(nowDate));
        System.out.println(ldDate.isAfter(nowDate));

        LocalDate withLocalDate = ldDate.withYear(2004);

        LocalDate minusLocalDate = ldDate.minusYears(1);

        LocalDate plusLocalDate = ldDate.plusYears(1);

        // LocalTime: Usage the same as LocalDate
        // LocalDate -> yyyyMMdd
        // LocalTime -> HHmmss

    }
}
