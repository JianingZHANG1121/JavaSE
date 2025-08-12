package Date;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {

        // Print 1 year after zero point of time
        printOneYearAfterZeroTimePoint();

        // Compare Date Object
        compareDate();

    }

    private static void compareDate() {
        Random random = new Random();

        Date d1 = new Date(Math.abs(random.nextInt()));
        Date d2 = new Date(Math.abs(random.nextInt()));

        System.out.println(d1);
        System.out.println(d2);

        if (d1.getTime() > d2.getTime()) {
            System.out.println("Date1 > Date2");
        } else if (d1.getTime() < d2.getTime()) {
            System.out.println("Date1 < Date2");
        } else {
            System.out.println("Date1 = Date2");
        }
    }

    public static void printOneYearAfterZeroTimePoint() {
        Date d1 = new Date(0L);

        long time = d1.getTime();

        time += 1000L * 60 * 60 * 24 * 365;

        d1.setTime(time);

        System.out.println(d1);
    }
}
