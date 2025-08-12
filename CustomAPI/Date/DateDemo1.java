package Date;

import java.util.Date;

public class DateDemo1 {

    public static void main(String[] args) {

        // Create an object that represents a time
        Date date1 = new Date();
        System.out.println(date1);

        // Create an object that represents a specific time
        Date date2 = new Date(0L);
        System.out.println(date2);

        // setTime() -> Change the time, 1000ms -> 1s
        date2.setTime(1000L);
        System.out.println(date2);

        // getTime() -> Get current time in ms
        long time = date2.getTime();
        System.out.println(time);

    }

}
